/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ag.controlo;

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author manuelpambasagejorge
 */
@Named(value = "corCDIBean")
@RequestScoped
public class CorCDIBean {

    /**
     * Creates a new instance of CorCDIBean
     */
    public CorCDIBean() {
    }
    
}
