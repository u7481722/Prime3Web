/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ubn.prime3web.controller;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

/**
 *
 * @author kevin
 */
@Named(value = "testController")
@SessionScoped
public class TestController implements Serializable {

    
    public void processTest() throws InterruptedException{
        
        Thread.sleep(4000);
        
        System.out.println("kevin test.....");
        FacesContext context = FacesContext.getCurrentInstance();
         
        context.addMessage(null, new FacesMessage("Successful",  "Your message: 111" ) );
    }
    
    
    /**
     * Creates a new instance of TestController
     */
    public TestController() {
    }
    
}
