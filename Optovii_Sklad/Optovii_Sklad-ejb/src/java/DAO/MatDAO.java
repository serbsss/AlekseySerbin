/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;


import Models.Material;
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
public class MatDAO {
     public List<Material> selectMaterial() { 
         ArrayList<Material> MatList = new ArrayList<>();
         Material material = new Material (1,"Fanera",23223,100);
         MatList.add(material);
         return MatList;
    }
    public void AddMaterial(int idMat, String name, int number, int quantity) {
    
    }
    public void deleteMat(List<Material> selectMaterial) {
        
    }
    public void AddMat( String name, int number, int quantity){
        
    }
    public void editMaterial(int idMat, String name, Integer number,Integer quantity) { 
        /*try {
            connect();
            PreparedStatement st = connection.prepareStatement("update material set name=?, number=?, quantity=? where idMat=?");
            st.setString(1, name);
            st.setInt(2, number);
            st.setInt(3, quantity);
            st.setInt(4, idMat);
            st.execute();
        } catch (Exception ex) {
            Logger.getLogger(MatDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            disconnect();
        }*/
    }
}
