/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package prodotti.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import prodotti.action_form.InsProdottoAF;
import service.CGestioneProdotti;

/**
 *
 * @author Enrico
 */
public class InserisciProdottoA extends Action {
    
    public ActionForward execute(ActionMapping actionMapping, ActionForm actionForm, 
                            HttpServletRequest servletRequest, HttpServletResponse servletResponse) throws Exception {
        
        
        InsProdottoAF insProdotto = (InsProdottoAF) actionForm;
        CGestioneProdotti cGestProdotti = (CGestioneProdotti) servletRequest.getSession().getAttribute("cGestProdotti");
        
        String codice = (String) insProdotto.getCodice();
        String descrizione = (String) insProdotto.getDescrizione();
        Double costoUnitario = (Double)insProdotto.getCostoUnitario();
        String unitaMisura = (String) insProdotto.getUnitaMisura();
        Integer disponibilita = (Integer)insProdotto.getDisponibilita();
        
        cGestProdotti.inserisciProdotto(codice, costoUnitario, descrizione, unitaMisura, disponibilita);
        
        return actionMapping.findForward("next");
      
    }
}
