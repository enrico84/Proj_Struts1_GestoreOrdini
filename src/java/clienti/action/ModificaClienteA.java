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
import service.CGestioneClienti;

/**
 *
 * @author Enrico
 */
public class ModificaClienteA extends Action {
    public ActionForward execute(ActionMapping actionMapping, ActionForm actionForm,
                                HttpServletRequest servletRequest, HttpServletResponse servletResponse) throws Exception {
     
        ModClienteAF modClienteAF = (ModClienteAF) actionForm;
        CGestioneClienti cGestClienti = (CGestioneClienti) servletRequest.getSession().getAttribute("cGestClienti");
        
        Cliente cliente = modClienteAF.getCliente();
        String email=null;
        String indirizzo=null;
        
         if(modClienteAF.getEmail()==null){
            email = "";
        }
        else{
            email = (String)modClienteAF.getEmail();
        }
        
        if(modClienteAF.getIndirizzo()==null) {
            indirizzo="";
        }
        else{
            indirizzo = (String)modClienteAF.getIndirizzo();
        }
       
        
        cGestClienti.modificaCliente(cliente, email, indirizzo);
        
        return actionMapping.findForward("next");
        
   }
}
