/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pet.care.control;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import pet.care.model.MedicineModel;
import pet.care.model.StaffModel;
import pet.care.view.StaffManagerForm;

/**
 *
 * @author nguye
 */
public class MyMSSQLControl {
    public static final String DATABASE_NAME = "dbPetCare";
    public static final String SERVER_NAME = "NACO";
    public static Connection getConnect(String serverName,String dataBaseName){
        Connection connection = null;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String connectionUrl = "jdbc:sqlserver://" + serverName + ":1433;databaseName=" + dataBaseName
                    +";integratedSecurity=true;";
            connection = DriverManager.getConnection(connectionUrl);
        } catch (ClassNotFoundException ex) {
            System.out.println("ClassNotFoundException: "+ ex.toString());
            Logger.getLogger(MyMSSQLControl.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            System.out.println("SQL Exception:" + ex.toString());
            Logger.getLogger(MyMSSQLControl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return connection;
    }
    public static String addStaff(Connection connection, StaffModel staff){
        try {
            String sql = "insert into StaffAccount values(?,?,?,?,?,?,?,?,?)";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, staff.getUsername());
            ps.setString(2, staff.getPassword());
            ps.setString(3, staff.getName());
            ps.setInt(4, staff.getSex());
            ps.setInt(5,staff.getAge());
            ps.setString(6, staff.getPosition());
            ps.setString(7, staff.getAddress());
            ps.setString(8, staff.getPhone());
            ps.setString(9, staff.getEmail());
            if(ps.executeUpdate() < 1){
                return "Cannot insert!";
            } else {
                return "Success";
            }
        } catch (SQLException ex) {
            System.out.println("SQLException: "+ ex.toString());
            Logger.getLogger(StaffManagerForm.class.getName()).log(Level.SEVERE, null, ex);
            return "Error: " + ex.toString();
        }
        
    }
    public static String editStaff(Connection connection, StaffModel staff,String oldUsername){
        try{
            String sql = "update StaffAccount set Username=?,Password=?,Name=?,Sex=?,Age=?,Position=?,Address=?,Phone=?,Email=? where Username=?";
                PreparedStatement ps = connection.prepareStatement(sql);
                ps.setString(1, staff.getUsername());
                ps.setString(2, staff.getPassword());
                ps.setString(3, staff.getName());
                ps.setInt(4, staff.getSex());
                ps.setInt(5,staff.getAge());
                ps.setString(6, staff.getPosition());
                ps.setString(7, staff.getAddress());
                ps.setString(8, staff.getPhone());
                ps.setString(9, staff.getEmail());
                ps.setString(10, oldUsername);
                if(ps.executeUpdate() < 1){
                    return "Cannot update info!";
                } else {
                    return "Success";
                }
        } catch (SQLException ex) {
            System.out.println("SQLException: "+ ex.toString());
            Logger.getLogger(StaffManagerForm.class.getName()).log(Level.SEVERE, null, ex);
            return "Error" + ex.toString();
        }
    }
    public static String deleteStaff(Connection connection, String username){
        String sql = "delete from StaffAccount where Username=?";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, username);
            if(ps.executeUpdate() > 0){
                return "Success";
            } else {
                return "Error";
            }
        } catch (SQLException ex) {
            Logger.getLogger(MyMSSQLControl.class.getName()).log(Level.SEVERE, null, ex);
            return "Error :" + ex.toString();
        }
    }
    public static String addMedicine(Connection conn, MedicineModel mem){
        try {
            String sql = "insert into Medicine values(?,?,?,?,?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, mem.getId());
            ps.setString(2, mem.getName());
            ps.setString(3, mem.getPrice());
            ps.setString(4, mem.getHsd());
            ps.setString(5,mem.getEffect());
            if(ps.executeUpdate() < 1){
                return "Cannot insert!";
            } else {
                return "Success";
            }
        } catch (SQLException ex) {
            System.out.println("SQLException: "+ ex.toString());
            Logger.getLogger(StaffManagerForm.class.getName()).log(Level.SEVERE, null, ex);
            return "Error: " + ex.toString();
        }
    }
    public static String editMedicine(Connection connection, MedicineModel mem,String oldID){
        try{
            String sql = "update Medicine set ID=?,Name=?,Price=?,HSD=?,Effect=? where ID=?";
                PreparedStatement ps = connection.prepareStatement(sql);
                ps.setString(1, mem.getId());
                ps.setString(2, mem.getName());
                ps.setString(3, mem.getPrice());
                ps.setString(4, mem.getHsd());
                ps.setString(5, mem.getEffect());
                ps.setString(6, oldID);
                if(ps.executeUpdate() < 1){
                    return "Cannot update info!";
                } else {
                    return "Success";
                }
        } catch (SQLException ex) {
            System.out.println("SQLException: "+ ex.toString());
            Logger.getLogger(StaffManagerForm.class.getName()).log(Level.SEVERE, null, ex);
            return "Error" + ex.toString();
        }
    }
    public static String deleteMedicine(Connection connection, String medicineID){
        String sql = "delete from Medicine where ID=?";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, medicineID);
            if(ps.executeUpdate() > 0){
                return "Success";
            } else {
                return "Error";
            }
        } catch (SQLException ex) {
            Logger.getLogger(MyMSSQLControl.class.getName()).log(Level.SEVERE, null, ex);
            return "Error :" + ex.toString();
        }
    }
}
