/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ordini.action;

import entity.Ordine;
import entity.OrdineProdotto;

import entity.Prodotto;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import ordini.action_form.InsProdottoOrdineAF;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import service.CGestioneOrdini;

/**
 *
 * @author Enrico
 */
public class AggiungiProdottoA extends Action {
    
        public ActionForward execute(ActionMapping actionMapping, ActionForm actionForm,
            HttpServletRequest servletRequest, HttpServletResponse servletResponse) throws Exception 
        {
            
            InsProdottoOrdineAF insProdottoOrdineAF = (InsProdottoOrdineAF) actionForm;
            CGestioneOrdini cGestOrdini = (CGestioneOrdini)servletRequest.getSession().getAttribute("cGestOrdini");
            
            try {
            Ordine ordine = insProdottoOrdineAF.getOrdine();
            Integer quantita = insProdottoOrdineAF.getQuantita();
            Double costoUnitario = insProdottoOrdineAF.getCostoUnitario();
            
            Integer indProdotto = insProdottoOrdineAF.getIndProdottoOrdinato();
            
            Prodotto[] prodotti = insProdottoOrdineAF.getProdotti();

            Prodotto prodotto = prodotti[indProdotto];
            
            
            cGestOrdini.aggiungiProdottoOrdinato(quantita, costoUnitario, ordine, prodotto);
           
            Ordine[] ordini = cGestOrdini.getOrdini();
//            servletRequest.setAttribute("ordini", ordini);
            servletRequest.getSession().setAttribute("ordini", ordini);
            for(Ordine o: ordini)
            {
                if(((int)o.getId()) == ((int)ordine.getId()))
                {
                    ///Righe aggiunte dopo
                    OrdineProdotto[] prodottiOrdinati =o.getProdottiAcquistati();
                    servletRequest.setAttribute("prodottiOrdinati", prodottiOrdinati);
                    servletRequest.setAttribute("ordine", o);
                    return actionMapping.findForward("next");
                }
            }
            
            ///Righe aggiunte dopo
            OrdineProdotto[] prodottiOrdinati = insProdottoOrdineAF.getOrdine().getProdottiAcquistati();
            servletRequest.setAttribute("prodottiOrdinati", prodottiOrdinati);
            servletRequest.setAttribute("ordine", ordine);
            }
            catch(Exception ex)
            {
                System.out.println("Prodotto già presente nel db...");
                System.out.println(ex.getMessage());
            }
            
            return actionMapping.findForward("next");
            
        }
    
}
