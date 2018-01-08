/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pet.care.control;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 *
 * @author nguye
 */
public class LocaleBundle {
    public static final byte VI = 0;
    public static final byte EN = 1;
    public static byte currenLocale = 0;
    private static Locale locale = new Locale("vi", "VI");
    private static ResourceBundle resourceBundle = ResourceBundle.getBundle("pet/care/view/Bundle", LocaleBundle.getLocale());; 
    /**
     * @return the locale
     */
    public static Locale getLocale() {
        return locale;
    }

    /**
     * @param aLocale the locale to set
     */
    public static void setLocale(byte localIndex) {
        switch(localIndex){
            case VI:
                locale = new Locale("vi", "VI");
                currenLocale = 0;
                break;
            case EN:
                locale = new Locale("en", "US");
                currenLocale = 1;
                break;
        }
        resourceBundle = ResourceBundle.getBundle("pet/care/view/Bundle", LocaleBundle.getLocale());
    }

    /**
     * @return the resourceBundle
     */
    public static ResourceBundle getResourceBundle() {
        return resourceBundle;
    }
}
