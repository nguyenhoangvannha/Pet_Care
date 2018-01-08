/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pet.care;

import javax.swing.JOptionPane;
import pet.care.control.LocaleBundle;
import pet.care.control.LoginModel;
import pet.care.model.UserModel;
import pet.care.view.HomeAppForm;
import pet.care.view.LoginDialog;

/**
 *
 * @author nguye
 */
public class PetCare {
    private static UserModel currentUser;
    private static LoginDialog loginDialog;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        loginDialog = new LoginDialog();
        loginDialog.setVisible(true);
    }
    public static boolean requestLogin(UserModel user){
        if(LoginModel.requestLogin(user)){
            currentUser = user;
            HomeAppForm homeFrm = new HomeAppForm(currentUser);
            homeFrm.setVisible(true);
            return true;
        } else {
            JOptionPane.showMessageDialog(loginDialog, LocaleBundle.getResourceBundle().getString("LoginModel.notaccept")
                    , LocaleBundle.getResourceBundle().getString("error"), JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }
}
