/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ordini.action_form;

import entity.Cliente;
import entity.Ordine;
import entity.OrdineProdotto;
import entity.Prodotto;
import javax.servlet.http.HttpServletRequest;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
import service.CGestioneOrdini;
import utility.Data;

/**
 *
 * @author Enrico
 */
public class ModOrdineAF extends InsModOrdine {
    private Ordine ordine;
    private OrdineProdotto[] prodottiOrdinati;
    private OrdineProdotto prodottoOrdinato;
    private Integer indProdottoOrdinato;
    private Prodotto prodotto;
    private String descrizione;
    private Integer quantita;
    private Double costoUnitario;


    public Prodotto getProdotto() {
        return prodotto;       
    }

    public void setProdotto(Prodotto prodotto) {
        this.prodotto = prodotto;
    }
    
    
    public void setOrdine(Ordine ordine)
    {
        this.ordine=ordine;      
        prodottiOrdinati = ordine.getProdottiAcquistati();
        Data data = ordine.getDataSpedizione();
        setProdottiOrdinati(prodottiOrdinati);
        //Se non funziona il cliente provare così
        //Cliente cliente = ordine.getClientePerOrdine();
        setNumeroOrdine(ordine.getNumeroOrdine());
        setAnno(data.getAnno());
        setMese(data.getMese());
        setGiorno(data.getGiorno());
        setIndirizzo(ordine.getIndirizzo());
        setNome(ordine.getCliente().getNome());
        setCognome(ordine.getCliente().getCognome());      
    }
          
    
    public Ordine getOrdine()
    {
        return ordine;
    }
    
    
    public Integer getIndProdottoOrdinato() {
        return indProdottoOrdinato;
    }

    
    public void setIndProdottoOrdinato(Integer indProdottoOrdinato) {
        this.indProdottoOrdinato = indProdottoOrdinato;
        prodottoOrdinato = prodottiOrdinati[indProdottoOrdinato];
//        prodotto = prodottoOrdinato.getProdotto();
    }
    
    
    public OrdineProdotto[] getProdottiOrdinati() {
        return prodottiOrdinati;
    }
    
    
    public OrdineProdotto getProdottoOrdinato() {
        return prodottoOrdinato;
    }
    
    
   public void setProdottiOrdinati(OrdineProdotto[] prodottiOrdinati) {
        this.prodottiOrdinati = prodottiOrdinati;
    }

    public void setProdottoOrdinato(OrdineProdotto prodottoOrdinato) {
        this.prodottoOrdinato = prodottoOrdinato;
    }
    
    
    public void setIndiceProdottoOrdinato(int iProdottoOrdinato)
    {
        prodottoOrdinato = prodottiOrdinati[iProdottoOrdinato];
    }
    
    
     public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public Integer getQuantita() {
        return quantita;
    }

    public void setQuantita(Integer quantita) {
        this.quantita = quantita;
    }

    public Double getCostoUnitario() {
        return costoUnitario;
    }

    public void setCostoUnitario(Double costoUnitario) {
        this.costoUnitario = costoUnitario;
    }
    
 
    
    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
        ActionErrors errors = new ActionErrors();
   
        if ( ordine.getNumeroOrdine() != getNumeroOrdine() || !ordine.getCliente().getNome().equals(getNome()) ||
             !ordine.getCliente().getCognome().equals(getCognome())) {
            //Nell'eventualità queste proprietà si possono modificare lancio un'Eccezione
            throw new RuntimeException("Modifica del numero ordine / cliente non concesse!");
       }
       try{
            if( getAnno()<2014 || getAnno()>2100 || getAnno()==null) {
                 errors.add("anno", new ActionMessage("error.anno.richiesto"));
             }
       }
       catch(Exception ex)
       {
            errors.add("anno", new ActionMessage("error.anno.richiesto"));
       }
        try{
            if( getMese()<=0 || getMese()>12 || getMese()==null) {
                errors.add("mese", new ActionMessage("error.mese.richiesto"));
            }
       }
       catch(Exception ex){
          errors.add("mese", new ActionMessage("error.mese.richiesto"));
       }
        try {
            
            if( getGiorno()<=0 || getGiorno()>31 || getGiorno()==null)  {
                errors.add("giorno", new ActionMessage("error.giorno.richiesto"));              
            }
       }
       catch(Exception ex) {
           errors.add("giorno", new ActionMessage("error.giorno.richiesto"));      
       }
        
        try{
           if( getIndirizzo().equals("")) {
            errors.add("indirizzo", new ActionMessage("error.indirizzo"));
           }
       }
       catch(Exception ex) {
           errors.add("indirizzo", new ActionMessage("error.indirizzo"));
       }    
        return errors;
    }
    
    
     
}
