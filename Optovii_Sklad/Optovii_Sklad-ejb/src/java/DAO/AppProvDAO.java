/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Models.AppProvider;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.Stateful;

/**
 *
 * @author Алексей
 */
@Stateful
public class AppProvDAO {
     public List<AppProvider> selectAppProvider() { 
         ArrayList<AppProvider> AppProvList = new ArrayList<>();
         AppProvider AplProvider = new AppProvider (1,"OOOLeha","Fanera",100,5000);
         AppProvList.add(AplProvider);
         return AppProvList;
    }
    public void AddAppProv(String NameProvider, String Material, int Quantity, int Summ) {
        
    }
    public void deleteAppProv(List<AppProvider> selectProvider) {
        
    }
    public void Save(String material, Integer quantity, String form, String Fio) { //обычное добавление 
        /*try {
            connect();
            PreparedStatement st = connection.prepareStatement("INSERT INTO timesheet (material,quantity,form,fio,date) values(?,?,?,?,curdate())");
            st.setString(1, material);
            st.setInt(2, quantity);
            st.setString(3, form);
            st.setString(4, Fio);
            st.execute();
        } catch (Exception ex) {
            Logger.getLogger(TsDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            disconnect();
        }*/
    }
    public void editAppProv(int idAppProv, String NameProvider, String Material, int Quantity, int Summ) { 
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
