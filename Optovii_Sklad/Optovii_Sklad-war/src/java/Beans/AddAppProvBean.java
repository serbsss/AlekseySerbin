/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Beans;

import DAO.AppProvDAO;
import Models.AppProvider;
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
@Named(value = "addAppProvBean")
@RequestScoped
public class AddAppProvBean {

    /**
     * Creates a new instance of AddAppProvBean
     */
    @EJB
    private AppProvDAO apdao;

    private AppProvider appprov;
    private RowStateMap stateMap;

    public AddAppProvBean() {
    }

    @PostConstruct
    private void AppProvBean() {
        appprov = new AppProvider();
    }

    public RowStateMap getStateMap() {
        return stateMap;
    }

    public void setStateMap(RowStateMap stateMap) {
        this.stateMap = stateMap;
    }

    public AppProvider getAppProvider() {
        return appprov;
    }

    public void setAppProvider(AppProvider appprov) {
        this.appprov = appprov;
    }

    public String addNewAppProv() throws SQLException {
        apdao.AddAppProv(appprov.getNameProvider(), appprov.getMaterial(), appprov.getQuantity(), appprov.getSumm());
        return "/index.xhtml";
    }

    public AddAppProvBean(String NameProvider, String Material, int Quantity, int Summ) {
    }
    public String editAppProv(int idAppProv) throws SQLException {
        apdao.editAppProv(idAppProv,appprov.getNameProvider(),appprov.getMaterial(),appprov.getQuantity(),appprov.getSumm());
        return "/All/AllApp.xhtml";
    }

}
