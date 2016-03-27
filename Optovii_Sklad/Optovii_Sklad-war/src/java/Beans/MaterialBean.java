/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Beans;

import DAO.MatDAO;
import Models.Application;
import Models.Material;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.event.ActionEvent;
import org.icefaces.ace.model.table.RowStateMap;

/**
 *
 * @author Алексей
 */
@Named(value = "materialBean")
@SessionScoped
public class MaterialBean implements Serializable {

    /**
     * Creates a new instance of MaterialBean
     */
    @EJB
    private MatDAO materialDAO;

    private Object Material;
    private int editId;

    private RowStateMap stateMap;

    public RowStateMap getStateMap() {
        return stateMap;
    }

    public void setStateMap(RowStateMap stateMap) {
        this.stateMap = stateMap;
    }

    public void actionListener(ActionEvent event) throws Exception {
        List<Material> selectedMatList = (List<Material>) stateMap.getSelected();
        materialDAO.deleteMat(selectedMatList);
    }

    public List<Material> selectMaterial() throws Exception {
        return materialDAO.selectMaterial();
    }

    public String editMaterial(int idMat) {
        this.editId = idMat;
        return "/Edit/editMaterial.xhtml";
    }
}
