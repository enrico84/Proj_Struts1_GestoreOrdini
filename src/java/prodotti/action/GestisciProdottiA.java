/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package prodotti.action;

import entity.Prodotto;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import prodotti.action_form.ProdottiAF;
import service.CGestioneProdotti;

/**
 *
 * @author Enrico
 */
public class GestisciProdottiA extends Action{

     public ActionForward execute(ActionMapping actionMapping,
                                 ActionForm actionForm,
                                 HttpServletRequest servletRequest,
                                 HttpServletResponse servletResponse) throws
            Exception {
        
        ProdottiAF prodottiAF = (ProdottiAF)actionForm;
        CGestioneProdotti cGestProdotti = (CGestioneProdotti) servletRequest.getSession().getAttribute("cGestProdotti");
        if(cGestProdotti == null) {
            cGestProdotti = new CGestioneProdotti();
            servletRequest.getSession().setAttribute("cGestProdotti", cGestProdotti);
        }
        
        Prodotto[] prodotti = cGestProdotti.getProdotti();
        prodottiAF.setProdotti(prodotti);
      
        return actionMapping.findForward("next");
    
    }
     
}
