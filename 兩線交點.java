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
class LinearEquation{
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
        LinearEquation a=new LinearEquation();
        String m,m1;
        int x,y,x1,y1,x2,y2,x3,y3;
        Scanner A=new Scanner(System.in);
        while(A.hasNext()){
            m=A.nextLine();
            String [] n=m.split(" ");
            x=Integer.parseInt(n[0]);
            y=Integer.parseInt(n[1]);
            x1=Integer.parseInt(n[2]);
            y1=Integer.parseInt(n[3]);
            m1=A.nextLine();
            String [] n1=m1.split(" ");
            x2=Integer.parseInt(n1[0]);
            y2=Integer.parseInt(n1[1]);
            x3=Integer.parseInt(n1[2]);
            y3=Integer.parseInt(n1[3]);
            a.A=y1-y;
            a.B=x-x1;
            a.E=a.A*x+a.B*y;
            a.C=y3-y2;
            a.D=x2-x3;
            a.F=a.C*x2+a.D*y2;
            //The intersecting point is: (4.5, 7.5)
            if(a.getY()==0||a.getX()==0){
                System.out.println("The intersecting point is: ("+Math.abs(a.getX())+", "+Math.abs(a.getY())+")");
            }
            else{
                System.out.println("The intersecting point is: ("+a.getX()+", "+a.getY()+")");
            }
        }
    }
    
}
