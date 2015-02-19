/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package prodotti.action_form;

import javax.servlet.http.HttpServletRequest;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

/**
 *
 * @author Enrico
 */
public class InsProdottoAF extends ActionForm {
    
    private String codice;
    private Double costoUnitario;
    private String descrizione;
    private String unitaMisura;
    private Integer disponibilita;

    public String getCodice() {
        return codice;
    }

    public void setCodice(String codice) {
        this.codice = codice;
    }

    public Double getCostoUnitario() {
        return costoUnitario;
    }

    public void setCostoUnitario(Double costoUnitario) {
        this.costoUnitario = costoUnitario;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public String getUnitaMisura() {
        return unitaMisura;
    }

    public void setUnitaMisura(String unitaMisura) {
        this.unitaMisura = unitaMisura;
    }

    public Integer getDisponibilita() {
        return disponibilita;
    }

    public void setDisponibilita(Integer disponibilita) {
        this.disponibilita = disponibilita;
    }

    
    public void reset(ActionMapping actionMapping, HttpServletRequest servletRequest) {
       codice=null;
       costoUnitario=null;
       descrizione=null;
       unitaMisura=null;
       disponibilita=null;
    }
  
    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
        ActionErrors errors = new ActionErrors();
        if (getCodice() == null || getCodice().length() <= 0) {
            errors.add("codice", new ActionMessage("error.codice"));
        }
        if (getCostoUnitario() <=0 || getCostoUnitario().equals("")) {
            errors.add("costoUnitario", new ActionMessage("error.costo.unitario"));
        } 
        
        if(getDescrizione() == null || getDescrizione().length() <= 0) {
            errors.add("descrizione", new ActionMessage("error.descrizione"));
        }
        
        if(getUnitaMisura() == null || getUnitaMisura().length() <= 0) {
            errors.add("unitaMisura", new ActionMessage("error.unita.di.misura"));
        }
        
        if(getDisponibilita() <=0 || getDisponibilita().equals("")) {
            errors.add("disponibilita", new ActionMessage("error.disponibilita"));
        }
            
        return errors;
      }
}
