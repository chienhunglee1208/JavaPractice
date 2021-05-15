/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mai;

/**
 *
 * @author andrewhuang
 */
import java.util.Scanner;
public class Mai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner a=new Scanner(System.in);
        String m,s;
        while(a.hasNext()){
        m=a.next();
        s=a.next();
        if(m.indexOf(s)==-1){
            System.out.println(s+" is not a substring of "+m);
        }
        else{            
            System.out.println(s+" is a substring of "+m);  
        }
       }
    }
    
}
