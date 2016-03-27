/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Models.Application;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.Stateful;

@Stateful
public class AppDAO  {


    public List<Application> selectApplication() {       //для вывода списка заявок
        ArrayList<Application> AppList = new ArrayList<>();
        Application application = new Application (1,"Fanera",25,"Serbin","420450","Получение");
        AppList.add(application);
        return AppList;  
    }
    public void AddApplication(String material, int quantity, String Fio, String Phone, String form_app) {
    
    }
    public void deleteApp(List<Application> selectApplication){
        
    }
    public void AddApp(String material, int quantity, String fio, String phone, String form_app){
        
    }
    public void editApp(int idApplication,String material, int quantity, String Fio, String Phone, String form_app) { 
        /*try {
            connect();
            PreparedStatement st = connection.prepareStatement("update application set material=?, quantity=?, fio=?, phone=?,form_app=? where idApplication=?");
            st.setString(1, material);
            st.setInt(2, quantity);
            st.setString(3, Fio);
            st.setString(4, Phone);
            st.setString(5, form_app);
            st.setInt(6, idApplication);
            st.execute();
        } catch (Exception ex) {
            Logger.getLogger(MatDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            disconnect();
        }*/
    }
}
