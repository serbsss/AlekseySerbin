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
public class Provider {
    private int idProv;
    private String nameProvider;
    private String material;
    private int price;

public Provider(int idProv, String nameProvider, String material, int price) {
    this.idProv = idProv;
    this.nameProvider = nameProvider;
    this.material = material;
    this.price = price;
    
}
public Provider() {
    
}
;
public int getIdProv(){
    return idProv;
}
public void setIdProv (int IdProv) {
    this.idProv=IdProv;
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
public int getPrice() {
    return price;
}
public void setPrice(int price) {
    this.price=price;
}
}
