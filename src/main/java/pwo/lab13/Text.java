/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pwo.lab13;

/**
 *
 * @author gman
 */
public class Text {

    static boolean cont5Dig(String str) {
        return str.replaceAll("[^0-9]", "").length() == 5;
    }
    
    static int numOfDigits(String str) {
        return str.replaceAll("[^0-9]", "").length();
    }
    
    static boolean notContDigits(String str) {
        return str.replaceAll("[^0-9]", "").length() == 0;
    }
    
    static boolean contOnlyDigits(String str) {
        return str.replaceAll("[^0-9]", "").length() == str.length();
    }
}
