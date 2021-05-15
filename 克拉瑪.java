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
        double a,b,e,c,d,f,x=1,y=1,v,u;
        
        String S,G;
        Scanner I=new Scanner(System.in);
            while(I.hasNext()){
                S=I.nextLine();
                G=I.nextLine();
                String [] m=S.split(" ");
                String [] M=G.split(" ");
                a=Double.parseDouble(m[0]);
                b=Double.parseDouble(m[1]);
                e=Double.parseDouble(m[2]);
                c=Double.parseDouble(M[0]);
                d=Double.parseDouble(M[1]);
                f=Double.parseDouble(M[2]);
                x=(e*d-b*f)/(a*d-c*b);
                y=(e*c-f*a)/(b*c-d*a);              
                System.out.print(x);
                System.out.print(" ");
                System.out.println(y);
                String p=Double.toString(x);
                String s=Double.toString(y);
                //u=p.charAt(16)-48;
               // System.out.print(u);
               /*v=Math.floor(Math.pow(10,15)*x);  
                Math.pow(10,15);
                if(u>=5){
                System.out.printf("%.15f",v/Math.pow(10,15));
                System.out.print(" ");
                System.out.println(y);
                }
                else{
                System.out.printf("%.15f",x);
                System.out.print(" ");
                System.out.println(y);}
            }*/
    }
    
}
}

