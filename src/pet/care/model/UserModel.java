/*

 */
package pet.care.model;

/**
 *
 * @author nguye
 */
public class UserModel {
    private String name;
    private String password;
    private boolean rememberPassword;
    private boolean Admin;

    public UserModel(String name, String password, boolean rememberPassword, boolean isAdmin) {
        this.name = name;
        this.password = password;
        this.rememberPassword = rememberPassword;
        this.Admin = isAdmin;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public boolean isRememberPassword() {
        return rememberPassword;
    }

    public boolean isAdmin() {
        return Admin;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @param rememberPassword the rememberPassword to set
     */
    public void setRememberPassword(boolean rememberPassword) {
        this.rememberPassword = rememberPassword;
    }

    /**
     * @param Admin the isAdmin to set
     */
    public void setAdmin(boolean Admin) {
        this.Admin = Admin;
    }

    @Override
    public String toString() {
        return "Name:" + this.getName()
                + "\nPassword:" + this.getPassword()
                + "\nAdmin:" + this.Admin
                + "\nRemember Password:" + this.rememberPassword; //To change body of generated methods, choose Tools | Templates.
    }
    
}
