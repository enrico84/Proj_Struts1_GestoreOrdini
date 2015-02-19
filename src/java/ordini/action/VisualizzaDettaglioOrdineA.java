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
import ordini.action_form.OrdiniAF;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

/**
 *
 * @author Enrico
 */
public class VisualizzaDettaglioOrdineA extends Action {
    
    public ActionForward execute(ActionMapping actionMapping, ActionForm actionForm,
                            HttpServletRequest servletRequest, HttpServletResponse servletResponse) throws Exception
    {
        OrdiniAF ordiniAF = (OrdiniAF) actionForm;
        Ordine ordine = ordiniAF.getOrdine();
        
        OrdineProdotto[] prodottiOrdinati = ordiniAF.getOrdine().getProdottiAcquistati();
        
        servletRequest.setAttribute("ordine", ordine);
        servletRequest.setAttribute("prodottiOrdinati", prodottiOrdinati);
        return actionMapping.findForward("next");
    }
    
}
