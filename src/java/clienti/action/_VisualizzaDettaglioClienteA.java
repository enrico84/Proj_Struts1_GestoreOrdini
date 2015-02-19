/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clienti.action;

import clienti.action_form.ModClienteAF;
import entity.Cliente;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

/**
 *
 * @author Enrico
 */
public class _VisualizzaDettaglioClienteA extends Action {
    
    public ActionForward execute(ActionMapping actionMapping, ActionForm actionForm,
            HttpServletRequest servletRequest, HttpServletResponse servletResponse) throws Exception {
        
        ModClienteAF modClienteAF = (ModClienteAF) actionForm;
        Cliente cliente = (Cliente) servletRequest.getAttribute("cliente");
        modClienteAF.setCliente(cliente);
        
        return actionMapping.findForward("next");
        
    }
    
}
