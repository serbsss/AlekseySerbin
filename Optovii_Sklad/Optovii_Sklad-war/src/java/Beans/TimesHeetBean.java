/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Beans;

import DAO.TsDAO;
import Models.TimesHeet;
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
@Named(value = "timesHeetBean")
@SessionScoped
public class TimesHeetBean implements Serializable {

    /**
     * Creates a new instance of TimesHeetBean
     */
    @EJB
    private TsDAO tsdao;
    
    private Object TimesHeet;
    private int editId;
    
   
    private RowStateMap stateMap;
    public RowStateMap getStateMap() {
        return stateMap;
    }
    public void setStateMap(RowStateMap stateMap) {
        this.stateMap = stateMap;
    }
    
    public TimesHeetBean() {
    }
    public void actionListener(ActionEvent event) throws Exception {
        List<TimesHeet> selectedTsList = (List<TimesHeet>) stateMap.getSelected();
        tsdao.deleteTs(selectedTsList);
        }
    public List<TimesHeet> selectTimesHeet() throws Exception {
        return tsdao.selectTimesHeet();
    }
    public String editTs(int id) {
        this.editId = id;
        return "/Edit/editTs.xhtml";
    }
    
}
