/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Beans;

import DAO.AppProvDAO;
import Models.AppProvider;
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
@Named(value = "appProvBean")
@SessionScoped
public class AppProvBean implements Serializable {

    /**
     * Creates a new instance of AppProvBean
     */
    @EJB
    private AppProvDAO apdao;
    
    private Object AplProvider;
    private int editId;
    
    private RowStateMap stateMap;
    public RowStateMap getStateMap() {
        return stateMap;
    }
    public void setStateMap(RowStateMap stateMap) {
        this.stateMap = stateMap;
    }
    
    public AppProvBean() {
    }
    public void actionListener(ActionEvent event) throws Exception {
        List<AppProvider> selectedAppProvList = (List<AppProvider>) stateMap.getSelected();
        apdao.deleteAppProv(selectedAppProvList);
        }
    public List<AppProvider> selectAppProvider() throws Exception {
        return apdao.selectAppProvider();
    }
    public String editAppProv(int idApp) {
        this.editId = idApp;
        return "/Edit/editAppRov.xhtml";
    }
    public String Save(String material, int quantity, String form_app, String Fio) {
        apdao.Save(material, quantity, form_app, Fio);
        return "/All/AllAppProv.xhtml";
    }
    
}
