/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lambda;

import java.util.function.BiPredicate;

/**
 *
 * @author Administrator
 */
public class StringUtils {
    public static String betterString(String str1,String str2,BiPredicate<String, String> p){
        if (p.test(str1, str2)) 
            return str1;
        else
            return str2;
    }
}
