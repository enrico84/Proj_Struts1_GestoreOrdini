/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordini.action;

import entity.Ordine;
import entity.OrdineProdotto;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import ordini.action_form.ModOrdineAF;
import ordini.action_form.ModProdottoOrdinatoAF;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
import service.CGestioneOrdini;

/**
 *
 * @author Enrico
 */
public class ConfermaModificaProdottoA extends Action {
    
    public ActionForward execute(ActionMapping mapping, ActionForm actionForm,
                HttpServletRequest servletRequest, HttpServletResponse servletResponse) throws Exception, 
                NumberFormatException, NullPointerException {
        
        CGestioneOrdini cGestOrdini = (CGestioneOrdini)servletRequest.getSession().getAttribute("cGestOrdini");
        ModProdottoOrdinatoAF modProdottoOrdinatoAF = (ModProdottoOrdinatoAF) actionForm;
        
        Ordine ordine = modProdottoOrdinatoAF.getOrdine();
        String quantita = servletRequest.getParameter("quantita".trim());
        String costoUnitario = servletRequest.getParameter("costoUnitario").trim();
        if( quantita.equals("") || costoUnitario.equals(""))
        { 
             return mapping.findForward("next");     
        }
        
        Integer quant = Integer.parseInt(quantita);
        Double cost= Double.parseDouble(costoUnitario);
        if(cost <=0 || quant <=0)
        {
            return mapping.findForward("next");
        }
    
        OrdineProdotto prodottoOrdinato = modProdottoOrdinatoAF.getProdottoOrdinato();
  
        cGestOrdini.modificaOrdine(ordine, prodottoOrdinato, quant);
        cGestOrdini.modificaProdottoOrdinato(ordine, prodottoOrdinato, cost);
        return mapping.findForward("next");
            
    }
}
