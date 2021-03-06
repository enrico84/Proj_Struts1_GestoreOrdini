/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package prodotti.action;

import entity.Prodotto;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import prodotti.action_form.ModProdottoAF;
import service.CGestioneProdotti;

/**
 *
 * @author Enrico
 */
public class EliminaProdottoA extends Action {
    
    public ActionForward execute(ActionMapping actionMapping, ActionForm actionForm,
                HttpServletRequest servletRequest, HttpServletResponse servletResponse) {
        
        ModProdottoAF modProdottoAF = (ModProdottoAF) actionForm;
        CGestioneProdotti cGestProdotti = (CGestioneProdotti) servletRequest.getSession().getAttribute("cGestProdotti");
        
        Prodotto prodotto = modProdottoAF.getProdotto();
        
        cGestProdotti.eliminaProdotto(prodotto);
        
        return actionMapping.findForward("next");
        
    }
    
}
