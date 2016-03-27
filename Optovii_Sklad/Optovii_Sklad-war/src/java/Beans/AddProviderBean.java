/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Beans;

import DAO.ProvDAO;
import Models.AppProvider;
import Models.Provider;
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
@Named(value = "addProviderBean")
@RequestScoped
public class AddProviderBean {

    /**
     * Creates a new instance of AddProviderBean
     */
    @EJB
    private ProvDAO provdao;

    private Provider prov;
    private RowStateMap stateMap;

    public AddProviderBean() {
    }

    @PostConstruct
    private void ProviderBean() {
        prov = new Provider();
    }

    public RowStateMap getStateMap() {
        return stateMap;
    }

    public void setStateMap(RowStateMap stateMap) {
        this.stateMap = stateMap;
    }

    public Provider getProvider() {
        return prov;
    }

    public void setProvider(Provider prov) {
        this.prov = prov;
    }

    public String addNewProv() throws SQLException {
        provdao.AddProv(prov.getNameProvider(), prov.getMaterial(), prov.getPrice());
        return "/index.xhtml";
    }

    public AddProviderBean(String NameProvider, String Material, int Price) {
    }
    public String editProv(int idProv) throws SQLException {
        provdao.editProv(idProv,prov.getNameProvider(),prov.getMaterial(),prov.getPrice());
        return "/All/AllAppProv.xhtml";
    }

}
