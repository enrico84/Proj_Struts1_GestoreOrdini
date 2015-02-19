/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package prodotti.action_form;

import entity.Prodotto;
import javax.servlet.http.HttpServletRequest;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

/**
 *
 * @author Enrico
 */
public class ProdottiAF extends ActionForm{
    
    private Prodotto[] prodotti;
    private Prodotto prodotto;

    
    public Prodotto[] getProdotti() {
        return prodotti;
    }

    
    public void setProdotti(Prodotto[] prodotti) {
        this.prodotti = prodotti;
    }
    
    
    public Prodotto getProdotto(){
        return prodotto;
    }
    
    
    public void setIndiceProdotto(int iProdotto)
    {
        prodotto = prodotti[iProdotto];
    }
    
    
    public ActionErrors validate(ActionMapping mapping, HttpServletRequest httpServletRequest) {
        return null;
    }

    
    public void reset(ActionMapping actionMapping, HttpServletRequest servletRequest) {
        prodotto=null;
    }
    

}
