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
        int i;  
        double m;
        Scanner a=new Scanner(System.in);
        while(a.hasNext()){
            m=a.nextDouble();  
            for(i=1;i<=m;i++){              
                    if(Math.pow(m*i,0.5)==(int)Math.pow(m*i,0.5)){
                    System.out.println((int)m*i); 
                    break;
                }               
            }
    }   
}
}