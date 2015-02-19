/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordini.action;

import entity.Ordine;
import entity.OrdineProdotto;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import ordini.action_form.ModProdottoOrdinatoAF;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

/**
 *
 * @author Enrico
 */
public class _VerificaModificaOrdineProdottoA extends Action {
    
      public ActionForward execute(ActionMapping actionMapping,
                                 ActionForm actionForm,
                                 HttpServletRequest servletRequest,
                                 HttpServletResponse servletResponse) throws Exception {
          
          ModProdottoOrdinatoAF modProdottoOrdinatoAF = (ModProdottoOrdinatoAF) actionForm;
          
//          String idProdottoOrdinato = (String) servletRequest.getAttribute("idProdottoOrdinato");
          OrdineProdotto prodottoOrdinato =(OrdineProdotto) servletRequest.getAttribute("prodottoOrdinato");
          Ordine ordine = (Ordine) servletRequest.getAttribute("ordine");
          
          modProdottoOrdinatoAF.setOrdine(ordine);
          modProdottoOrdinatoAF.setProdottoOrdinato(prodottoOrdinato);
            
          return actionMapping.findForward("next");
      }
    
}
