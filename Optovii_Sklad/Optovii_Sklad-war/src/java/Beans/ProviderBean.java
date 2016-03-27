/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Beans;

import DAO.ProvDAO;
import Models.AppProvider;
import Models.Provider;
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
@Named(value = "providerBean")
@SessionScoped
public class ProviderBean implements Serializable {

    /**
     * Creates a new instance of ProviderBean
     */
    @EJB
    private ProvDAO provdao;
    
    private Object Provider;
    private int editId;
    private RowStateMap stateMap;
    public RowStateMap getStateMap() {
        return stateMap;
    }
    public void setStateMap(RowStateMap stateMap) {
        this.stateMap = stateMap;
    }
    
    public ProviderBean() {
    }
    public void actionListener(ActionEvent event) throws Exception {
        List<Provider> selectedProvList = (List<Provider>) stateMap.getSelected();
        provdao.deleteProv(selectedProvList);
        }
    public List<Provider> selectProvider() throws Exception {
        return provdao.selectProvider();
    }

    public String editProv(int idProv) {
        this.editId = idProv;
        return "/Edit/editProvider.xhtml";
    }
    
}
