/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ordini.action;

import entity.Ordine;
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
public class _StartAggiungiProdottoA extends Action {
    
    public ActionForward execute(ActionMapping actionMapping, ActionForm actionForm,
                                 HttpServletRequest servletRequest, HttpServletResponse servletResponse) 
            throws Exception{
        
        InsProdottoOrdineAF insProdottoOrdineAF = (InsProdottoOrdineAF) actionForm;
        CGestioneOrdini cGestOrdini = (CGestioneOrdini)servletRequest.getSession().getAttribute("cGestOrdini");
        
        Ordine ordine = (Ordine) servletRequest.getAttribute("ordine");
        Prodotto[] prodottiDisponibili = cGestOrdini.getProdotti();
        
        insProdottoOrdineAF.setOrdine(ordine);
        insProdottoOrdineAF.setProdotti(prodottiDisponibili);
        
        return actionMapping.findForward("next");
    }
    
}
