/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ordini.action;

import entity.Ordine;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import ordini.action_form.ModOrdineAF;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

/**
 *
 * @author Enrico
 */
public class StartAggiungiProdottoA extends Action {
    
    public ActionForward execute(ActionMapping actionMapping,
                                 ActionForm actionForm,
                                 HttpServletRequest servletRequest,
                                 HttpServletResponse servletResponse) {
        
        ModOrdineAF modOrdineAF = (ModOrdineAF) actionForm;
        Ordine ordine = modOrdineAF.getOrdine();
        servletRequest.setAttribute("ordine", ordine);
        
        return actionMapping.findForward("next");
        
    }
    
}
