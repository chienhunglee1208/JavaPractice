/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author andrewhuang
 */
import java.util.Scanner;
public class Main {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        String m;
        double w,w1,d;
        Scanner a=new Scanner(System.in);
        while(a.hasNext()){
        m=a.nextLine();
        String [] s=m.split(" ");
        w=Double.parseDouble(s[0]);
        w1=Double.parseDouble(s[1]);
        d=Math.pow(Math.pow(w,2)+Math.pow(w1,2),0.5);
        if(d<=10){
            System.out.printf("(%.1f",w);
            System.out.print(",");
            System.out.printf("%.1f)",w1);
            System.out.print(" ");
            System.out.println("is in the circle");
        }
        else{
            
            System.out.printf("(%.1f",w);
            System.out.print(",");
            System.out.printf("%.1f)",w1);
            System.out.print(" ");
            System.out.println("is not in the circle");
        }
        
        }
    }
    
}
