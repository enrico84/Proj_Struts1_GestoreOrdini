/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clienti.action;

import clienti.action_form.ClientiAF;
import entity.Cliente;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import service.CGestioneClienti;

/**
 *
 * @author Enrico
 */
public class GestisciClientiA extends Action {

    
    public ActionForward execute(ActionMapping actionMapping, ActionForm actionForm, 
            HttpServletRequest servletRequest, HttpServletResponse servletResponse) throws Exception {
        
        ClientiAF clientiAF = (ClientiAF) actionForm;
        CGestioneClienti cGestClienti = (CGestioneClienti) servletRequest.getSession().getAttribute("cGestClienti");
        if(cGestClienti == null) {
            cGestClienti = new CGestioneClienti();
            servletRequest.getSession().setAttribute("cGestClienti", cGestClienti);
        }
        
        Cliente[] clienti = cGestClienti.getClienti();
        clientiAF.setClienti(clienti);
      
        return actionMapping.findForward("next");
        
    }
    
    
    
}
