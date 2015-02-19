/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ordini.action_form;

import entity.Ordine;
import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

/**
 *
 * @author Enrico
 */
public class OrdiniAF extends ActionForm {
    
    private Ordine[] ordini;
    private Ordine ordine;
    
    
    public Ordine[] getOrdini() {
        return ordini;
    }

    
    public void setOrdini(Ordine[] ordini) {
        this.ordini = ordini;
    }
    
    
    public Ordine getOrdine()
    {
        return ordine;
    }
    
    
    public void setIndiceOrdine(int iOrdine)
    {
        ordine=ordini[iOrdine];
    }
    
        
    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
        
        return null;
    }
    
    
    public void reset(ActionMapping actionMapping, HttpServletRequest httpServletRequest) {
        
        ordine=null;
    }
      
}
