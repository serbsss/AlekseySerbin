/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Beans;

import DAO.AppDAO;
import Models.Application;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.event.ActionEvent;
import org.icefaces.ace.model.table.RowStateMap;

/**
 *
 * @author Алексей
 */
@Named(value = "applicationBean")
@SessionScoped
public class ApplicationBean implements Serializable {

    /**
     * Creates a new instance of ApplicationBean
     */
    @EJB 
    private AppDAO appdao;
    
    private Object Application;
    private int editId;
    
   
    private RowStateMap stateMap;
    public RowStateMap getStateMap() {
        return stateMap;
    }
    public void setStateMap(RowStateMap stateMap) {
        this.stateMap = stateMap;
    }
    
    public ApplicationBean() {
    }
    public void actionListener(ActionEvent event) throws Exception {
        List<Application> selectedAppList = (List<Application>) stateMap.getSelected();
        appdao.deleteApp(selectedAppList);
        }
    public List<Application> selectApplication() throws Exception {
        return appdao.selectApplication();
    }
    public String editApplication(int idApplication) {
        this.editId = idApplication;
        return "/Edit/editApplication.xhtml";
    }
    
}
