/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lambda1;


/**
 *
 * @author Administrator
 */
public class StringUtils {
    public static void checkAlphabets(String str1,TestAlpha<String> p){
        if (p.test(str1)) 
            System.out.println("string contains only alphabets");
        else
            System.out.println("string doesn't contain only alphabets");;
    }
}
