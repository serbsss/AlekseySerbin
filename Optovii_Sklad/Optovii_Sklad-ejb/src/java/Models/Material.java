/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import java.util.Date;

public class Material {
    private int idMat;
    private String name;
    private int number;
    private int quantity;
    
public Material (int idMat, String name, int number, int quantity) {
        this.idMat = idMat;
        this.name = name;
        this.number = number;
        this.quantity = quantity;
    }

    public Material () {      
    }
    ;

    public int getIdMat() {
        return idMat;
    }
    public void setIdMat (int idMat) {
        this.idMat = idMat;
    }
    
     public String getName() {
        return name;
    }
    public void setName (String name) {
        this.name = name;
    }
    
     public int getNumber() {
        return number;
    }
    public void setNumber (int number) {
        this.number = number;
    } 
     public int getQuantity() {
        return quantity;
    }
    public void setQuantity (int quantity) {
        this.quantity = quantity;
    } 
}


  

