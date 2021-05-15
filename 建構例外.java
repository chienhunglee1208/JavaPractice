/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author Jiang-Shiou Hwang
 */import java.lang.Math;
import java.util.Scanner;
class IllegalTriangleExpection extends Exception{
   boolean istriangle(double a,double b,double c){
       if(a+b>c&&b+c>a&&c+a>b){
           return true;
       }
       return false;
   }
   double getArea(double side1,double side2,double side3){
       double s=(side1+side2+side3)/2,Area;
       Area=Math.pow(s*(s-side1)*(s-side2)*(s-side3),0.5);
       return Area;
   }
   double getperimeter(double side1,double side2,double side3){
       double perimeter=side1+side3+side2;
       return perimeter;
   }
}
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double first,second,third,first1,second1,third1;
        String input,input1;
        int i;
        Scanner a=new Scanner(System.in);
        while(a.hasNext()){
            IllegalTriangleExpection g=new IllegalTriangleExpection();
            for(i=0;a.hasNext();i++){
                input=a.nextLine();
                String[] n=input.split(" ");
                first=Double.parseDouble(n[0]);
                second=Double.parseDouble(n[1]);
                third=Double.parseDouble(n[2]);  
                try{
                    if(g.istriangle(first,second,third)==true){
                        System.out.printf("%.3f",g.getperimeter(first, second, third));
                        System.out.print(" ");
                        System.out.printf("%.3f",g.getArea(first, second, third));
                        System.out.println();
                }
                    else{
                        throw new IllegalTriangleExpection();           
                }                     
            }
            catch(IllegalTriangleExpection e){
                System.out.println("The sum of any two sides is greater than the other side");  
                System.out.println("Side1: "+first);
                System.out.println("Side2: "+second);
                System.out.println("Side3: "+third);
                System.exit(1);
            }    
            }
        }
            }   
}