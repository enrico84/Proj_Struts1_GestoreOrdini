/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ordini.action;

import entity.Cliente;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import ordini.action_form.InsModOrdine;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import service.CGestioneOrdini;

/**
 *
 * @author Enrico
 */
public class ClientiOrdA extends Action {
    
    public ActionForward execute (ActionMapping actionMapping, ActionForm actionForm, 
            HttpServletRequest servletRequest, HttpServletResponse servletResponse) throws Exception
    {
        CGestioneOrdini cGestOrdini = (CGestioneOrdini)servletRequest.getSession()
                .getAttribute("cGestOrdini");
        
        InsModOrdine insModOrdine = (InsModOrdine) actionForm;
        
        Cliente[] clienti = cGestOrdini.getClienti();
        insModOrdine.setClienti(clienti);
        
        return actionMapping.findForward("next");
    }
    
}
