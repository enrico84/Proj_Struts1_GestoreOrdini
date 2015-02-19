/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clienti.action_form;

import org.apache.struts.action.ActionForm;
import entity.Cliente;
import javax.servlet.http.HttpServletRequest;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;

/**
 *
 * @author Enrico
 */
public class ClientiAF extends ActionForm{

    private Cliente[] clienti;
    private Cliente cliente;
    
    
    public void setClienti(Cliente[] clienti)
    {
        this.clienti=clienti;
    }
    
    
    public Cliente[] getClienti()
    {
        return clienti;
    }
    
    
    public void setIndiceCliente(int iCliente)
    {
        cliente = clienti[iCliente];
    }
    
    
    public Cliente getCliente()
    {
        return cliente;
    }
    
   
    public ActionErrors validate(ActionMapping mapping, HttpServletRequest httpServletRequest) {
        return null;
    }

    
    public void reset(ActionMapping actionMapping, HttpServletRequest servletRequest) {
        cliente=null;
    }
    
    
}
