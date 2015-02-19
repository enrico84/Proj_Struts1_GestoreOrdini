/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package prodotti.action_form;

import entity.Prodotto;
import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

/**
 *
 * @author Enrico
 */
public class ModProdottoAF extends InsProdottoAF {
    
    private Prodotto prodotto;
    
    public Prodotto getProdotto(){
        return prodotto;
    }
    
    
    public void setProdotto(Prodotto prodotto)
    {
        this.prodotto=prodotto;
        setCodice(prodotto.getCodice());
        setCostoUnitario(prodotto.getCostoUnitario());
        setDescrizione(prodotto.getDescrizione());
        setDisponibilita(prodotto.getDisponibilita());
        setUnitaMisura(prodotto.getUnitaMisura());
    }
    
    
    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
        ActionErrors errors = new ActionErrors();
        if ( !prodotto.getCodice().equals(getCodice()) || !prodotto.getDescrizione().equals(getDescrizione()) ||
                !prodotto.getUnitaMisura().equals(getUnitaMisura()) ) {
              //Nell'eventualità queste proprietà si possono modificare lancio un'Eccezione
            throw new RuntimeException("Modifica del codice / descrizione / unità di misura non concessa!");
        }
        if (getCostoUnitario() <=0 || getCostoUnitario().equals("")) {
            errors.add("costoUnitario", new ActionMessage("error.costo.unitario"));
        } 
        if (getDisponibilita() <=0 || getDisponibilita().equals("")) {
            errors.add("disponibilita", new ActionMessage("error.disponibilita"));
        }

        return errors;
    }
}
