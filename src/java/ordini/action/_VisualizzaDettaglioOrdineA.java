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
import ordini.action_form.OrdiniAF;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

/**
 *
 * @author Enrico
 */
public class _VisualizzaDettaglioOrdineA extends Action {
     public ActionForward execute(ActionMapping actionMapping, ActionForm actionForm,
                            HttpServletRequest servletRequest, HttpServletResponse servletResponse) throws Exception{
         
         ModOrdineAF modOrdineAF = (ModOrdineAF) actionForm;
         
         Ordine ordine = (Ordine) servletRequest.getAttribute("ordine");
         OrdineProdotto[] prodottiOrdinati = (OrdineProdotto[])servletRequest.getAttribute("prodottiOrdinati");
         
         /////////
//         String prodottiOrdinati = servletRequest.getParameter("prodottiOrdinati");
//         OrdineProdotto[] prodottiOrdinati2 =   
//         modOrdineAF.setProdottiOrdinati(prodottiOrdinati);
         /////////
         
         modOrdineAF.setOrdine(ordine);
         modOrdineAF.setProdottiOrdinati(prodottiOrdinati);
         
         return actionMapping.findForward("next");
     }
    
    
}
