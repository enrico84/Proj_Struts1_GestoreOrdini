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

/**
 *
 * @author Enrico
 */
public class _VisualizzaDettaglioProdottoA extends Action {
    
    public ActionForward execute(ActionMapping actionMapping, ActionForm actionForm,
            HttpServletRequest servletRequest, HttpServletResponse servletResponse) throws Exception {
        
        ModProdottoAF modProdottoAF = (ModProdottoAF) actionForm;
        Prodotto prodotto = (Prodotto) servletRequest.getAttribute("prodotto");
        modProdottoAF.setProdotto(prodotto);
        
        return actionMapping.findForward("next");
    }
    
}
