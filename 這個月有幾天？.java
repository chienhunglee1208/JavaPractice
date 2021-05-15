/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author andrewhuang
 */
package main;
import java.util.Scanner;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int s,s1;
        String m;
        Scanner a=new Scanner(System.in);
        m=a.nextLine();
        String [] n=m.split(" ");
        s=Integer.parseInt(n[0]);       
        s1=Integer.parseInt(n[1]);
        if(s1%400==0 ||( (s1%4==0)&&(s1%100!=0))){
            if(s==1){
                System.out.println("January "+s1+" had 31 Days");
            }
            if(s==2){
                System.out.println("February "+s1+" had 29 Days");
            }
            if(s==3){
                System.out.println("March "+s1+" had 31 Days");
            }
            if(s==4){
                System.out.println("April "+s1+" had 30 Days");
            }
            if(s==5){
                System.out.println("May "+s1+" had 31 Days");
            }
            if(s==6){
                System.out.println("June "+s1+" had 30 Days");
            }
            if(s==7){
                System.out.println("July "+s1+" had 31 Days");
            }
            if(s==8){
                System.out.println("August "+s1+" had 31 Days");
            }
            if(s==9){
                System.out.println("September "+s1+" had 30 Days");
            }
            if(s==10){
                System.out.println("October "+s1+" had 31 Days");
            }
            if(s==11){
                System.out.println("November "+s1+" had 30 Days");
            }
            if(s==12){
                System.out.println("December "+s1+" had 31 Days");
            }
            
        }
        else{
            if(s==1){
                System.out.println("January "+s1+" had 31 Days");
            }
            if(s==2){
                System.out.println("February "+s1+" had 28 Days");
            }
            if(s==3){
                System.out.println("March "+s1+" had 31 Days");
            }
            if(s==4){
                System.out.println("April "+s1+" had 30 Days");
            }
            if(s==5){
                System.out.println("May "+s1+" had 31 Days");
            }
            if(s==6){
                System.out.println("June "+s1+" had 30 Days");
            }
            if(s==7){
                System.out.println("July "+s1+" had 31 Days");
            }
            if(s==8){
                System.out.println("August "+s1+" had 31 Days");
            }
            if(s==9){
                System.out.println("September "+s1+" had 30 Days");
            }
            if(s==10){
                System.out.println("October "+s1+" had 31 Days");
            }
            if(s==11){
                System.out.println("November "+s1+" had 30 Days");
            }
            if(s==12){
                System.out.println("December "+s1+" had 31 Days");
            }
        }
    }
    
}
