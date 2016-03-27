/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Models.Provider;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateful;

/**
 *
 * @author Алексей
 */
@Stateful
public class ProvDAO {
     public List<Provider> selectProvider() { 
         ArrayList<Provider> ProvList = new ArrayList<>();
         Provider provider = new Provider (1,"OOOLeha","Fanera",100);
         ProvList.add(provider);
         return ProvList;
    }
    public void AddProv(String NameProvider, String Material, int Price) {
    
    }
    public void deleteProv(List<Provider> selectProvider) {
        
    }
     public void editProv(int idProv, String NameProvider, String Material, int Price) { 
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
