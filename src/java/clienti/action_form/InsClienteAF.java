/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clienti.action_form;

import javax.servlet.http.HttpServletRequest;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

/**
 *
 * @author Enrico
 */
public class InsClienteAF extends InsModCliente{
    
    public ActionErrors validate (ActionMapping actionMapping, HttpServletRequest httpServletRequest) {
        
        ActionErrors actionErrors = new ActionErrors();
        if(getCf()==null || getCf().length() > 17 || getCf().length() < 1) {
            actionErrors.add("cf", new ActionMessage("error.cf.richiesto"));
        }
        
        if(getNome()==null || getNome().length() < 1) {
            actionErrors.add("nome", new ActionMessage("error.nome.richiesto"));
        }
        
        if(getCognome()==null || getCognome().length() < 1) {
            actionErrors.add("cognome", new ActionMessage("error.cognome.richiesto"));
        }
 
        return actionErrors;
        
       }
    }
