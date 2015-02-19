/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ordini.action_form;

import javax.servlet.http.HttpServletRequest;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

/**
 *
 * @author Enrico
 */
public class InsOrdineAF extends InsModOrdine {
   

    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
        ActionErrors errors = new ActionErrors();
             
        if( getNumeroOrdine() == null || getNumeroOrdine() <0) {
            errors.add("numeroOrdine", new ActionMessage("error.numero.ordine"));
        }  
        if( getAnno()<2014 || getAnno()>2100 || getAnno()==null) {
            errors.add("anno", new ActionMessage("error.anno.richiesto"));
        }
        if( getMese()<=0 || getMese()>12 || getMese().intValue() < 1) {
            errors.add("mese", new ActionMessage("error.mese.richiesto"));
        }
        if( getGiorno()<=0 || getGiorno()>31 || getGiorno().intValue() < 1)  {
            errors.add("giorno", new ActionMessage("error.giorno.richiesto"));
        }
        if( getIndirizzo().length() < 1  ) {
            errors.add("indirizzo", new ActionMessage("error.indirizzo"));
        }
        if (getIndCliente() < 0) {
            errors.add("indCliente", new ActionMessage("error.cliente.richiesto"));
        }
        return errors;
    }
    
    public void reset(ActionMapping actionMapping, HttpServletRequest servletRequest)
    {
    }
}
