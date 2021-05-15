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
class Complex implements Cloneable{
    private double imaginary,real;
    public Complex(double a,double b){
        this.imaginary=b;
        this.real=a;
    }
    Complex(double a){            }
    Complex(){
       this(0,0);
    }
    String  getRealPart(){
        String k="(",k2;
        k2=k+real;
        return k2;
    }
     String getImaginaryPart(){
         String k,k1="i)",k2=" + ",k3=")";
         if(imaginary==0){
             k=k3;
             return k; 
         }
         k=k2+imaginary+k1;
         return k;
     }
    public String toString(double real,double imaginary){
        String r,k=" ",k1=" + ",k3="i";
        r=k+real+k1+imaginary+k3;
        return r;
}
}
public class Main {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        String m,m1;
        double first,first1,second,second1,add,add1,sub,sub1,mul,mul1,div,div1;
        Scanner input=new Scanner(System.in);
        while(input.hasNext()){
            m=input.nextLine();
            String [] n=m.split(" ");
            first=Double.parseDouble(n[0]);
            second=Double.parseDouble(n[1]);
            m1=input.nextLine();
            String [] n1=m1.split(" ");
            first1=Double.parseDouble(n1[0]);
            second1=Double.parseDouble(n1[1]);
            add=first+first1;
            add1=second1+second;
            sub=first-first1;
            sub1=second-second1;
            mul=first*first1-second1*second;
            mul1=second1*first+first1*second;
            div=(first*first1+second*second1)/(Math.pow(first1,2)+Math.pow(second1,2));
            div1=(second*first1-first*second1)/(Math.pow(first1,2)+Math.pow(second1,2));
            Complex A=new Complex(first,second);
            Complex B=new Complex(first1,second1);
           System.out.println(A.getRealPart()+""+A.getImaginaryPart()+" + "+B.getRealPart()+""+B.getImaginaryPart()+" ="+A.toString(add, add1));
           System.out.println(A.getRealPart()+""+A.getImaginaryPart()+" - "+B.getRealPart()+""+B.getImaginaryPart()+" ="+A.toString(sub,sub1));
           System.out.println(A.getRealPart()+""+A.getImaginaryPart()+" * "+B.getRealPart()+""+B.getImaginaryPart()+" ="+A.toString(mul, mul1));
           System.out.println(A.getRealPart()+""+A.getImaginaryPart()+" / "+B.getRealPart()+""+B.getImaginaryPart()+" ="+A.toString(div, div1));         
        }
    }
    
}
