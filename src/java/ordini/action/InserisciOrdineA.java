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
import utility.Data;

/**
 *
 * @author Enrico
 */
public class InserisciOrdineA extends Action{
    
    public ActionForward execute(ActionMapping actionMapping, ActionForm actionForm, 
            HttpServletRequest servletRequest, HttpServletResponse servletResponse) throws Exception {
            
        CGestioneOrdini cGestOrdini = (CGestioneOrdini)servletRequest.getSession().getAttribute("cGestOrdini");        
        InsModOrdine insModOrdine = (InsModOrdine) actionForm;
        
        Cliente[] clienti = cGestOrdini.getClienti();
        
        Integer idCliente = insModOrdine.getIndCliente();
        
        Cliente cliente = clienti[idCliente];
              
        Integer numeroOrdine = insModOrdine.getNumeroOrdine();
        String indirizzo = insModOrdine.getIndirizzo();
        
        Integer giorno = insModOrdine.getGiorno();
        Integer mese = insModOrdine.getMese();
        Integer anno = insModOrdine.getAnno();     
        Data data = new Data(anno, mese, giorno);
 
        cGestOrdini.inserisciOrdine(numeroOrdine, data, indirizzo, cliente);
        
        return actionMapping.findForward("next");
        
        
    }
    
}
