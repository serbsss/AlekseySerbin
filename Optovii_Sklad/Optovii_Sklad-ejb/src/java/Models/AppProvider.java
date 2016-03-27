/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

/**
 *
 * @author Алексей
 */
public class AppProvider {
    private int idAppProv;
    private String nameProvider;
    private String material;
    private int quantity;
    private int summ;

public AppProvider(int idAppProv, String nameProvider, String material,int quantity, int summ) {
    this.idAppProv = idAppProv;
    this.nameProvider = nameProvider;
    this.material = material;
    this.quantity = quantity;
    this.summ = summ;
    
}
public AppProvider() {
    
}
;
public int getIdAppProv(){
    return idAppProv;
}
public void setIdAppProv (int IdAppProv) {
    this.idAppProv=IdAppProv;
}
public String getNameProvider() {
    return nameProvider;
}
public void setNameProvider (String nameProvider) {
    this.nameProvider=nameProvider;
}

public String getMaterial() {
    return material;
}
public void setMaterial(String material) {
    this.material=material;
}
public int getQuantity() {
    return quantity;
}
public void setQuantity(int quantity){
    this.quantity = quantity;
}
public int getSumm() {
    return summ;
}
public void setSumm(int summ) {
    this.summ=summ;
}
}
