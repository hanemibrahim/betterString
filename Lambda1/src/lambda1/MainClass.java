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
public class MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String string1 = "HanemHegazy"; 
        
        //StringUtils stringUtils;
        StringUtils.checkAlphabets(string1, 
                                        (str1)-> {
                                                for (int i=0;i<str1.length();i++)
                                                    if (!Character.isLetter(str1.charAt(i)))
                                                        return false;

                                                return true;
                                                });
    }
    
}
