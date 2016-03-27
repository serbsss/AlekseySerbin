/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Beans;

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author Алексей
 */
@Named(value = "addUserBean")
@RequestScoped
public class AddUserBean {

    /**
     * Creates a new instance of AddUserBean
     */
    public AddUserBean() {
    }
    
}
