/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Beans;

import DAO.TsDAO;
import Models.TimesHeet;
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
@Named(value = "addTimesHeetBean")
@RequestScoped
public class AddTimesHeetBean {

    /**
     * Creates a new instance of AddTimesHeetBean
     */
    @EJB
    private TsDAO tsdao;
    private TimesHeet ts;
    private RowStateMap stateMap;
    
    @PostConstruct
    private void TimesHeetBean() {
        ts = new TimesHeet();
    }
    
     public RowStateMap getStateMap() {
        return stateMap;
    }

    public void setStateMap(RowStateMap stateMap) {
        this.stateMap = stateMap;
    }
    public TimesHeet getTimesHeet() {
        return ts;
    }

    public void setTimesHeet(TimesHeet ts) {
        this.ts = ts;
    }
    
    public String addNewTimesHeet() throws SQLException {
        java.sql.Date d = new java.sql.Date(ts.getDate().getTime());
        tsdao.AddTs(ts.getMaterial(), ts.getQuantity(), ts.getForm(), d);
        
        return "/index.xhtml";
    }
    public AddTimesHeetBean() {
    }
     public String editTs(int id) throws SQLException {
        java.sql.Date d = new java.sql.Date(ts.getDate().getTime());
        tsdao.editTs(id,ts.getMaterial(),ts.getQuantity(),ts.getForm(),d);
        return "/All/AllTs.xhtml";
    }
    
}
