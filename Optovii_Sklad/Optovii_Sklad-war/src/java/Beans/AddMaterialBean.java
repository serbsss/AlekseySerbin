/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Beans;

import DAO.MatDAO;
import Models.Material;
import java.sql.SQLException;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import org.icefaces.ace.model.table.RowStateMap;

/**
 *
 * @author Алексей
 */
@Named(value = "addMaterialBean")
@RequestScoped
public class AddMaterialBean {

    /**
     * Creates a new instance of AddMaterialBean
     */
    @EJB
    private MatDAO matdao;
    
    private Material material;
    private RowStateMap stateMap;
    
    @PostConstruct
    private void MaterialBean(){
    material = new Material();
    }
    
    public RowStateMap getStateMap() {
        return stateMap;
    }

    public void setStateMap(RowStateMap stateMap) {
        this.stateMap = stateMap;
    }
    public Material getMaterial(){
        return material;
    }
    public void setMaterial(Material material) {
        this.material = material;
    }
    public String addNewMaterial() throws SQLException {
        matdao.AddMat(material.getName(), material.getNumber(), material.getQuantity()); 
        return "/index.xhtml";
    }
    public AddMaterialBean() {
    }
    public String editMaterial(int idMat) throws SQLException {
        matdao.editMaterial(idMat,material.getName(), material.getNumber(),material.getQuantity());
        return "/All/AllMaterial.xhtml";
    }
    
}
