/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author Jiang-Shiou Hwang
 */
import java.util.Scanner;
class RegularPolygon{
    private int a,b,c,d,e,f; 
    public int A,B,C,D,E,F;
    int compute(){
        int a;
        a=E*D-B*F;    
        return a;
    }
    int compute1(){
        int b;
        b=A*F-E*C;
        return b;
    }
    int compute2(){
       int c1;
        c1=A*D-B*C;
        return c1;
    }
    void compute3(){
        A=a;
        B=b;
        C=c;
        D=d;
        E=e;
        F=f;      
    }
    boolean isSolvable(){
        boolean b=false;
        if(compute2()!=0){
            return true;         
        }       
        return b;
    }
    double getX(){
        double x,a,b;
        if(isSolvable()==true){
            a=compute();
            b=compute2();
            x=a/b;
            return x;
        }
      return 0;
    }
    double getY(){
        double y,a,b;
        if(isSolvable()==true){
            a=compute1();
            b=compute2();
            y=a/b;
            return y;
        }
      return 0;
    }
}
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String m;
        Scanner input=new Scanner(System.in);
        while(input.hasNext()){           
            int a1,b1,c1,d1,e1,f1;
            m=input.nextLine();
            RegularPolygon a;
            a=new RegularPolygon();
            String [] n=m.split(" ");
            a1=Integer.parseInt(n[0]);
            b1=Integer.parseInt(n[1]);
            c1=Integer.parseInt(n[2]);
            d1=Integer.parseInt(n[3]);
            e1=Integer.parseInt(n[4]);
            f1=Integer.parseInt(n[5]);
            a.A=a1;
            a.B=b1;
            a.C=c1;
            a.D=d1;
            a.E=e1;
            a.F=f1;         
            if(a.isSolvable()==false){
                System.out.println("The equation has no solution");
            }
            else{
                System.out.println("x is "+a.getX()+" and y is "+a.getY());               
            }
            
        }
    }
    
}
