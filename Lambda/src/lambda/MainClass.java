/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lambda;


/**
 *
 * @author Administrator
 */
public class MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String string1 = "Hanem Hegazy"; 
        String string2 = "Hanem Ibrahim Hegazy"; 
        
        //StringUtils stringUtils;
        String longer = StringUtils.betterString(string1, string2, (str1, str2) -> str1.length() > str2.length());
        String first = StringUtils.betterString(string1, string2, (s1, s2) -> true);
        
        System.out.println("Longer String : "+longer);
        System.out.println("First string: "+first);

    }
    
}
