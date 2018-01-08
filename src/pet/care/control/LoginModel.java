/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pet.care.control;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import pet.care.model.UserModel;
import pet.care.view.PetManagerForm;

/**
 *
 * @author nguye
 */
public class LoginModel {
    private static Connection connection;
    public static boolean requestLogin(UserModel user){
        connection = MyMSSQLControl.getConnect("NACO", "dbPetCare");
        if(user.isAdmin()){
            try {
                Statement statement = connection.createStatement();
                String sql = "select * from AdminAccount where Username='"+user.getName()+"'";
                ResultSet resultSet = statement.executeQuery(sql);
                if(resultSet.next()){
                    if(resultSet.getString("Password").equals(user.getPassword())){
                        connection.close();
                        return true;
                    } else {
                        return false;
                    }
                } else {
                    connection.close();
                    return false;
                }
            } catch (SQLException ex) {
                System.out.println("SQLException: "+ ex.toString());
                Logger.getLogger(PetManagerForm.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            try {
                Statement statement = connection.createStatement();
                String sql = "select * from StaffAccount where Username='"+user.getName()+"'";
                ResultSet resultSet = statement.executeQuery(sql);
                if(resultSet.next()){
                    if(resultSet.getString("Password").equals(user.getPassword())){
                        connection.close();
                        return true;
                    } else {
                        return false;
                    }
                } else {
                    connection.close();
                    return false;
                }
            } catch (SQLException ex) {
                System.out.println("SQLException: "+ ex.toString());
                Logger.getLogger(PetManagerForm.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return false;
    }
}
