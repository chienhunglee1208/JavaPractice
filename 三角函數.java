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
        double n,s,area;
        Scanner a=new Scanner(System.in);
        while(a.hasNext()){
        n=a.nextDouble();
        //s=a.nextDouble();
        //area=n*Math.pow(s,2)/(4*Math.tan(Math.toRadians(180/n)));
        System.out.println(Math.sin(Math.toRadians(n)));
      //  System.out.print(area);
        }
    }
    
}
