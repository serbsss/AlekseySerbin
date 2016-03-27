/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import java.util.Date;

public class TimesHeet {
    private int id;
    private String material;
    private int quantity;
    private String form;
    private Date date;
    
public TimesHeet (int id, String material, int quantity, String form, Date date) {
        this.id = id;
        this.material = material;
        this.quantity = quantity;
        this.form = form;
        this.date=date;
    }

    public TimesHeet () {      
    }
    ;

    public int getId() {
        return id;
    }
    public void setId (int id) {
        this.id = id;
    }
    
    public String getMaterial() {
        return material;
    }
    public void setMaterial(String material) {
        this.material = material;
    }
    
     public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
     public String getForm() {
        return form;
    }
    public void setForm(String form) {
        this.form = form;
    }
     public Date getDate() {
        return date;
    }
    public void setDate(Date date) {
        this.date = date;
    }
}


  

