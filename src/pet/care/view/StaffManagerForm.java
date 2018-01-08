/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pet.care.view;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.table.DefaultTableModel;
import pet.care.control.GlobalValues;
import pet.care.control.LocaleBundle;
import pet.care.control.MyMSSQLControl;
import pet.care.model.PetModel;

/**
 *
 * @author nguye
 */
public class StaffManagerForm extends javax.swing.JFrame {
    private DefaultTableModel defaultTableModel;
    private HomeAppForm homeForm;
    private ArrayList<PetModel> pets;
    private Connection connection;
    /**
     * Creates new form PetManagerForm
     */
    public StaffManagerForm(HomeAppForm homeForm) {
        
        this.homeForm = homeForm;
        
        Locale.setDefault(LocaleBundle.getLocale());
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            Logger.getLogger(LoginDialog.class.getName()).log(Level.SEVERE, null, ex);
        }
        initDefaultTableModel();
        initComponents();
        resizeTableColumns();
        this.setLocationRelativeTo(null);
        getContentPane().setBackground(GlobalValues.formBackgroundColor);
        getConnectToDataBase();
        homeForm.setVisible(false);
        loadDataBase(connection);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCustomer = new javax.swing.JTable();
        btnAdd = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("pet/care/view/Bundle"); // NOI18N
        setTitle(bundle.getString("StaffManagerForm.title")); // NOI18N
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 153));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText(bundle.getString("StaffManagerForm.jLabel1.text")); // NOI18N
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        tblCustomer.setModel(defaultTableModel);
        jScrollPane1.setViewportView(tblCustomer);

        btnAdd.setForeground(new java.awt.Color(0, 204, 153));
        btnAdd.setText(bundle.getString("StaffManagerForm.btnAdd.text")); // NOI18N
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnEdit.setForeground(new java.awt.Color(0, 204, 153));
        btnEdit.setText(bundle.getString("StaffManagerForm.btnEdit.text")); // NOI18N
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnDelete.setForeground(new java.awt.Color(0, 204, 153));
        btnDelete.setText(bundle.getString("StaffManagerForm.btnDelete.text")); // NOI18N
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 484, Short.MAX_VALUE)
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnEdit)
                        .addGap(18, 18, 18)
                        .addComponent(btnDelete))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnAdd, btnDelete, btnEdit});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 415, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd)
                    .addComponent(btnEdit)
                    .addComponent(btnDelete))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        homeForm.setVisible(true);
        try {
            // TODO add your handling code here:
            connection.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this,"Cannot close connection to database", "Warning", JOptionPane.WARNING_MESSAGE);
        }
        this.dispose();
    }//GEN-LAST:event_formWindowClosing

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        StaffAddNewDialog dialog = new StaffAddNewDialog(this, connection);
        dialog.setVisible(true);
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        // TODO add your handling code here:
        String username = (String) defaultTableModel.getValueAt(tblCustomer.getSelectedRow(), 7);
        StaffEditDetailDialog dialog = new StaffEditDetailDialog(this, connection, username);
        dialog.setVisible(true);
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        String username = (String) defaultTableModel.getValueAt(tblCustomer.getSelectedRow(), 7);
        if(tblCustomer.getSelectedRow() != -1){
            int choose = JOptionPane.showConfirmDialog(this, "Bạn có chắc chắn muốn xóa nhân viên: " + username, "Cẩn thận!"
                    , JOptionPane.OK_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE);
            if(choose == JOptionPane.OK_OPTION){
                JOptionPane.showMessageDialog(this, MyMSSQLControl.deleteStaff(connection, username));
                loadDataBase(connection);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Chọn một nhân viên để xóa!");
        }
    }//GEN-LAST:event_btnDeleteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblCustomer;
    // End of variables declaration//GEN-END:variables

    private void initDefaultTableModel() {
        defaultTableModel = new DefaultTableModel();
        defaultTableModel.addColumn(LocaleBundle.getResourceBundle().getString("name"));
        defaultTableModel.addColumn(LocaleBundle.getResourceBundle().getString("sex"));
        defaultTableModel.addColumn(LocaleBundle.getResourceBundle().getString("age"));
        defaultTableModel.addColumn(LocaleBundle.getResourceBundle().getString("position"));
        defaultTableModel.addColumn(LocaleBundle.getResourceBundle().getString("address"));
        defaultTableModel.addColumn(LocaleBundle.getResourceBundle().getString("phone"));
        defaultTableModel.addColumn(LocaleBundle.getResourceBundle().getString("email"));
        defaultTableModel.addColumn("Tên tài khoản");
    }

    private void resizeTableColumns() {
        tblCustomer.getColumnModel().getColumn(0).setMinWidth(60);
        tblCustomer.getColumnModel().getColumn(1).setPreferredWidth(10);
        tblCustomer.getColumnModel().getColumn(2).setPreferredWidth(10);
        tblCustomer.getColumnModel().getColumn(3).setMinWidth(80);
        tblCustomer.getColumnModel().getColumn(4).setMinWidth(90);
        tblCustomer.getColumnModel().getColumn(5).setMinWidth(60);
        tblCustomer.getColumnModel().getColumn(6).setMinWidth(60);
        tblCustomer.getColumnModel().getColumn(7).setPreferredWidth(0);
    }

    private void getConnectToDataBase() {
        connection = MyMSSQLControl.getConnect(MyMSSQLControl.SERVER_NAME, MyMSSQLControl.DATABASE_NAME);
        if(connection == null){
            int choose = JOptionPane.showConfirmDialog(this, LocaleBundle.getResourceBundle().getString("connectDataBaseError") 
                    + LocaleBundle.getResourceBundle().getString("retry")
                    , LocaleBundle.getResourceBundle().getString("error"), JOptionPane.YES_NO_OPTION);
            if(choose == JOptionPane.YES_OPTION){
                getConnectToDataBase();
            } else {
                homeForm.setVisible(true);
                this.dispose();
            }
        } else {
            this.setVisible(true);
            
        }
    }

    public void loadDataBase(Connection connection) {
        try {
            Statement statement = connection.createStatement();
            String sql = "select * from StaffAccount";
            ResultSet resultSet = statement.executeQuery(sql);
            defaultTableModel.setRowCount(0);
            while(resultSet.next()){
                Vector v = new Vector();
                v.add(resultSet.getString("Name"));
                switch(resultSet.getInt("Sex")){
                    case 0:
                        v.add("Nam");
                        break;
                    case 1:
                        v.add("Nữ");
                        break;
                    case 2:
                        v.add("Khác");
                        break;
                    default:
                        v.add("Khác"); 
                }
                
                v.add(resultSet.getInt("Age"));
                v.add(resultSet.getString("Position"));
                v.add(resultSet.getString("Address"));
                v.add(resultSet.getString("Phone"));
                v.add(resultSet.getString("Email"));
                v.add(resultSet.getString("Username"));
                defaultTableModel.addRow(v);
            }
            System.out.println("Load Staff Database success!");
        } catch (SQLException ex) {
            System.out.println("SQLException: "+ ex.toString());
            Logger.getLogger(StaffManagerForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
