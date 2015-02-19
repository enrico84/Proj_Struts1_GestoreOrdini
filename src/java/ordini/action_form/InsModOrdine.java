/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ordini.action_form;

import entity.Cliente;
import entity.Ordine;
import javax.servlet.http.HttpServletRequest;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
import utility.Data;

/**
 *
 * @author Enrico
 */
public class InsModOrdine extends ActionForm { 
//    public class InsModOrdine extends InsProdottoOrdineAF {
    
//    private Ordine ordine;
    private Integer numeroOrdine;
    private Integer anno;
    private Integer mese;
    private Integer giorno;
    private String indirizzo;
    private String nome;
    private String cognome;
    private Cliente cliente;
    private Cliente[] clienti;
    private Data data;
    private Integer indCliente;

    
//    public Ordine getOrdine() {
//        return ordine;
//    }
//
//    public void setOrdine(Ordine ordine) {
//        this.ordine = ordine;
////        setData(ordine.getDataSpedizione());
////        setNumeroOrdine(ordine.getNumeroOrdine());
////        setAnno(data.getAnno());
////        setMese(data.getMese());
////        setGiorno(data.getGiorno());
////        setIndirizzo(ordine.getIndirizzo());
////        setNome(ordine.getCliente().getNome());
////        setCognome(ordine.getCliente().getCognome());
//    }
    
    
    public Cliente[] getClienti() {
        return clienti;
    }

    
    public void setClienti(Cliente[] clienti) {
        this.clienti = clienti; 
        
    }

    
    public Integer getIndCliente() {
        return indCliente;
    }

    
    public void setIndCliente(Integer iCliente) {
        this.indCliente=iCliente;
    }
    
    
    public Cliente getCliente() {
        return cliente;
    }
    
    public void setCliente(Cliente cliente) 
    {
        this.cliente=cliente;
    }
    

    public Integer getNumeroOrdine() {
        return numeroOrdine;
    }

    public void setNumeroOrdine(Integer numeroOrdine) {
        this.numeroOrdine = numeroOrdine;
    }

    public Integer getAnno() {
        return anno;
    }

    public void setAnno(Integer anno) {
        this.anno = anno;
    }

    public Integer getMese() {
        return mese;
    }

    public void setMese(Integer mese) {
        this.mese = mese;
    }

    public Integer getGiorno() {
        return giorno;
    }

    public void setGiorno(Integer giorno) {
        this.giorno = giorno;
    }

    public String getIndirizzo() {
        return indirizzo;
    }

    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }
   
    public Data getData() {
        data = new Data(anno.intValue(), mese.intValue(), giorno.intValue());
        return data;
        
    }
    
    public void setData(Data data)
    {
        this.data=data;
    }
    
    
  
    public void reset(ActionMapping actionMapping, HttpServletRequest servletRequest)
    {
    }
    
    
    public ActionErrors validate(ActionMapping actionMapping, HttpServletRequest httpServletRequest) {

       return null;   
    }
}
