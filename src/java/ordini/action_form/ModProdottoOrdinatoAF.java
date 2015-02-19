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
public class ModProdottoOrdinatoAF extends ActionForm {
    
    private Ordine ordine;
    private OrdineProdotto prodottoOrdinato;
    private String descrizione;
    private Integer quantita;
    private Double costoUnitario;
    
     
    public Ordine getOrdine() {
        return ordine;
    }
    
    public void setOrdine(Ordine ordine)
    {
        this.ordine=ordine;
    }
    
    
    public void setProdottoOrdinato(OrdineProdotto prodottoOrdinato)
    {
        this.prodottoOrdinato = prodottoOrdinato;
        descrizione = prodottoOrdinato.getProdotto().getDescrizione();
        quantita = prodottoOrdinato.getQuantita();
        costoUnitario = prodottoOrdinato.getCostoUnitario();
    }
    
    public OrdineProdotto getProdottoOrdinato() {
        return prodottoOrdinato;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public Integer getQuantita() {
        return quantita;
    }

    public Double getCostoUnitario() {
        return costoUnitario;
    }
    
    
    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
//        ActionErrors errors = new ActionErrors(); 
//    
//            if(getQuantita()==null || getQuantita() <= 0 || getQuantita().toString().equals("") ){
//                errors.add("quantita", new ActionMessage("error.quantita"));
//       }
//            if(getCostoUnitario() <=0 || getCostoUnitario()==null) {
//                errors.add("costoUnitario", new ActionMessage("error.costo.unitario"));
//            }
//        
//       
//        return errors;
        return null;

    }
    
    
    public void reset(ActionMapping actionMapping, HttpServletRequest servletRequest){
        costoUnitario=null;
        quantita=null;
//    
    }
}
