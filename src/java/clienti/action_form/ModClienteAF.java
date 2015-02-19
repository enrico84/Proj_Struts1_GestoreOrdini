/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clienti.action_form;

import entity.Cliente;
import javax.servlet.http.HttpServletRequest;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;

/**
 *
 * @author Enrico
 */
public class ModClienteAF extends InsModCliente {
    
    private Cliente cliente;

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
        setCf(cliente.getCf());
        setCF(cliente.getCF());
        setNome(cliente.getNome());
        setCognome(cliente.getCognome());
        setEmail(cliente.getEmail());
        setIndirizzo(cliente.getIndirizzo());     
    }
    
    public ActionErrors validate(ActionMapping actionMapping, HttpServletRequest httpServletRequest)
    {
        if(!cliente.getCf().equals(getCf()) || !cliente.getCF().equals(getCF()) || !cliente.getNome().equals(getNome()) 
                || !cliente.getCognome().equals(getCognome())){
                //Nell'eventualità che queste proprietà si possono modificare lancio un'Eccezione
                throw new RuntimeException("Errore: modifica del cf / nome / cognome non ammessa!");
        }
        
        return null;
    
    }
    
}
