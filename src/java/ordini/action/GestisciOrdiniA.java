/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ordini.action;

import entity.Ordine;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import ordini.action_form.OrdiniAF;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import service.CGestioneOrdini;

/**
 *
 * @author Enrico
 */
public class GestisciOrdiniA extends Action {

    
    public ActionForward execute(ActionMapping actionMapping, ActionForm actionForm, 
            HttpServletRequest servletRequest, HttpServletResponse servletResponse) throws Exception {
        
        OrdiniAF ordineAF = (OrdiniAF) actionForm;
        CGestioneOrdini cGestOrdini = (CGestioneOrdini)servletRequest.getSession()
                .getAttribute("cGestOrdini");
        if(cGestOrdini == null) {
           cGestOrdini = new CGestioneOrdini();
           servletRequest.getSession().setAttribute("cGestOrdini", cGestOrdini);
        }
        
        Ordine[] ordini = cGestOrdini.getOrdini();
        ordineAF.setOrdini(ordini);
        
        return actionMapping.findForward("next");
         
    }
    
    
    
}
