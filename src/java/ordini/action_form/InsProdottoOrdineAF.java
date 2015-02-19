/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ordini.action_form;

import entity.Ordine;
import entity.OrdineProdotto;
import entity.Prodotto;
import javax.servlet.http.HttpServletRequest;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

/**
 *
 * @author Enrico
 */
//public class InsProdottoOrdineAF extends ModOrdineAF {
public class InsProdottoOrdineAF extends ActionForm {
    
    private Ordine ordine;
//    private OrdineProdotto[] ordiniProdotti;
//    private OrdineProdotto ordineProdotto;
    Prodotto prodotto;
    Prodotto[] prodotti;
    private Integer indProdottoOrdinato;
    private Double costoUnitario;
    private Integer quantita;

    
//    public OrdineProdotto getProdottoOrdinato() {
//        return prodottoOrdinato;
//    }
//
//    public void setProdottoOrdinato(OrdineProdotto prodottoOrdinato) {
//        this.prodottoOrdinato = prodottoOrdinato;
//    }
//

    public Ordine getOrdine() {
        return ordine;
    }

 
    public void setOrdine(Ordine ordine) {
        this.ordine = ordine;
    }
  

    public Prodotto getProdotto() {
        return prodotto;
    }
    
//     
//     public Prodotto getProdotto(int indProdotto) {
//        return prodotti[indProdotto];
//    }

    public void setProdotto(Prodotto prodotto) {
        this.prodotto = prodotto;
    }

    public Prodotto[] getProdotti() {
        return prodotti;
    }

    public void setProdotti(Prodotto[] prodotti) {
        this.prodotti = prodotti;
    }

    public Integer getIndProdottoOrdinato() {
        return indProdottoOrdinato;
    }

    public void setIndProdottoOrdinato(Integer indProdottoOrdinato) {
        this.indProdottoOrdinato = indProdottoOrdinato;
        prodotto = prodotti[indProdottoOrdinato];
    }
    
    
    public Double getCostoUnitario() {
        return costoUnitario;
    }

    public void setCostoUnitario(Double costoUnitario) {
        this.costoUnitario = costoUnitario;
    }

    public Integer getQuantita() {
        return quantita;
    }

    public void setQuantita(Integer quantita) {
        this.quantita = quantita;
    }

    
    
    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
        ActionErrors errors = new ActionErrors();

        if(getQuantita() <=0 || getQuantita() == null)
        {
            errors.add("quantita", new ActionMessage("error.quantita"));
        }
        if(getCostoUnitario() <=0 || getCostoUnitario() == null)
        {
            errors.add("costoUnitario", new ActionMessage("error.costo.unitario"));
        }
//        
//        for(OrdineProdotto ordProd: ordiniProdotti){
//            if((ordProd.getProdotto().getId() == getProdotto().getId()) &&
//                    (ordProd.getCostoUnitario() == getCostoUnitario())){
//                errors.add("esistente", new ActionMessage("label.prodotto.esistente"));
//            }                    
//        }
        
        return errors;

    }
   
}
