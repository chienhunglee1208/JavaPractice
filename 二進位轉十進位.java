/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author hp600G1
 */import java.util.Scanner;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i,x;
        String m;
        Scanner a=new Scanner(System.in);
        while(a.hasNext()){
        m=a.nextLine();
        String [] n=m.split(" ");
       // System.out.println(n.length);
        for(i=0;i<n.length;i++){ 
        x=Integer.parseInt(n[i],2);
        System.out.println(x);
        }
        }
    }
    
}
