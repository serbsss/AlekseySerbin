/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Beans;

import DAO.AppDAO;
import Models.Application;
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
@Named(value = "addApplicationBean")
@RequestScoped
public class AddApplicationBean {

    /**
     * Creates a new instance of AddApplicationBean
     */
    @EJB
    private AppDAO appdao;
    private Application app;
    private RowStateMap stateMap;
    
     @PostConstruct
    private void ApplicationBean(){
        app = new Application();
    }
     public RowStateMap getStateMap() {
        return stateMap;
    }

    public void setStateMap(RowStateMap stateMap) {
        this.stateMap = stateMap;
    }
    
    public Application Application() {
        return app;
    }

    public void setApplication(Application app) {
        this.app = app;
    }
    
    public String addNewApp() throws SQLException {
        appdao.AddApp(app.getMaterial(), app.getQuantity(),app.getFio(), app.getPhone(), app.getForm_app());
        
        return "/index.xhtml";
    }
    public AddApplicationBean(String material, int quantity, String fio, String phone, String form_app) {
    }
    public String editApp(int idApplication) throws SQLException {
        appdao.editApp(idApplication,app.getMaterial(), app.getQuantity(), app.getFio(), app.getPhone(), app.getForm_app() );
        return "/All/AllApp.xhtml";
    }
    
}
