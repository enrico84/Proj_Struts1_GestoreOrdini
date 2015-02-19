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
import service.CGestioneOrdini;

/**
 *
 * @author Enrico
 */
public class EliminaOrdineA extends Action {
    
    public ActionForward execute(ActionMapping actionMapping, ActionForm actionForm,
                        HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        CGestioneOrdini cGestOrdini = (CGestioneOrdini) request.getSession().getAttribute("cGestOrdini");
        ModOrdineAF modOrdineAF = (ModOrdineAF) actionForm;
        
        Ordine ordine = modOrdineAF.getOrdine();
        cGestOrdini.eliminaOrdine(ordine);
        
        return actionMapping.findForward("next");
        
    }
    
}
