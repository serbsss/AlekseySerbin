/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import java.util.Date;

public class Application {
    private int idApplication;
    private String material;
    private int quantity;
    private String fio;
    private String phone;
    private String form_app;
    
    public Application (int idApplication, String material, int quantity, String fio, String phone, String form_app) {
        this.idApplication = idApplication;
        this.material = material;
        this.quantity = quantity;
        this.fio = fio;
        this.phone = phone;
        this.form_app = form_app;
    }

    public Application () {      
    }
    

    public int getIdApplication() {
        return idApplication;
    }
    public void setIdApplication (int idApplication) {
        this.idApplication = idApplication;
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
    
     public String getFio() {
        return fio;
    }
    public void setFio(String fio) {
        this.fio = fio;
    }
    
     public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    
     public String getForm_app() {
        return form_app;
    }
    public void setForm_app(String form_app) {
        this.form_app = form_app;
    }
}


  

