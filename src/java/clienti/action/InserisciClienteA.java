/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clienti.action;

import clienti.action_form.InsClienteAF;
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
public class InserisciClienteA extends Action {
    public ActionForward execute(ActionMapping actionMapping, ActionForm actionForm, 
                            HttpServletRequest servletRequest, HttpServletResponse servletResponse) throws Exception {
        
        InsClienteAF insClienteAF = (InsClienteAF) actionForm;
        CGestioneClienti cGestClienti = (CGestioneClienti) servletRequest.getSession().getAttribute("cGestClienti");
        String email=null;
        String indirizzo=null;
        
        String cf = (String)insClienteAF.getCf();
        String nome = (String)insClienteAF.getNome();
        String cognome = (String)insClienteAF.getCognome();
        
        if(insClienteAF.getEmail()==null){
            email = "";
        }
        else{
            email = (String)insClienteAF.getEmail();
        }
        
        if(insClienteAF.getIndirizzo()==null) {
            indirizzo="";
        }
        else{
            indirizzo = (String)insClienteAF.getIndirizzo();
        }
        
        cGestClienti.inserisciCliente(cf, nome, cognome, email, indirizzo);
        
        return actionMapping.findForward("next");    
    }
    
}
