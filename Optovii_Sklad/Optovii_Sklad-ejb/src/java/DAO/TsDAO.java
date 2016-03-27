/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Models.TimesHeet;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.Stateful;

@Stateful
public class TsDAO  {
 
    public List<TimesHeet> selectTimesHeet() {       //для вывода списка всех остановок
      ArrayList<TimesHeet> TsList = new ArrayList<>(); 
      java.util.Date date = new java.util.Date();
      java.sql.Date d = new java.sql.Date(date.getTime());
      TimesHeet timesheet = new TimesHeet (1,"Fanera",25,"Получение",d);
      TsList.add(timesheet);
      return TsList;
    }
    public void AddTimesHeet(int id, String material, int quantity, String form, java.util.Date date){
        
    }
    public void deleteTs(List<TimesHeet> selectTimesHeet) {
        
    }
    public void AddTs(String material, int quantity, String form, Date date){
        
    }
    public void editTs(int id, String material, Integer quantity, String form, java.sql.Date date) { 
        /*try {
            connect();
            PreparedStatement st = connection.prepareStatement("update timesheet set material=?, quantity=?, form=?, date=? where id=?");
            st.setString(1, material);
            st.setInt(2, quantity);
            st.setString(3, form);
            st.setDate(4, date);
            st.setInt(5,id);
            st.execute();
        } catch (Exception ex) {
            Logger.getLogger(MatDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            disconnect();
        }*/
    }
}
