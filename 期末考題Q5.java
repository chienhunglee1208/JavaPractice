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
class math{
    int isfloat(double x){
        int i,count=0;
        for(i=0;i<10;i++){
            x=x*10;
            if(x%1!=0){
                count++;
            }
        }
        return count+1;
    }
    double gcd(double x,double y){
        double result,i,max;
        if(x>y){
            max=x;
        }
        else{
            max=y;
        }
        for(i=max;i>=2;i--){
            if(x%i==0&&y%i==0){
               result=i;
               return result;
            }
        }
        return 1;
    } 
}
public class Main {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String m;//2+0.375=2+3/8
        Scanner imput=new Scanner(System.in);
        double a,b,second,first,a1,b1,answer,answer1,answer2,answer3;
        while(imput.hasNext()){
            math g=new math();
            m=imput.nextLine();
            String [] n=m.split(" ");
            first=Double.parseDouble(n[0]);
            second=Double.parseDouble(n[1]);
            a=second*Math.pow(10,g.isfloat(second));//son
            b=Math.pow(10,g.isfloat(second));//mom
            a1=a/g.gcd(a,b);
            b1=b/g.gcd(a, b);
            answer=first*b1+a1;
            answer1=first*b1-a1;
            answer2=first*a1/g.gcd(first*a1,b1);
            answer3=first*b1/g.gcd(first*b1, a1);
            System.out.println((int)first+" + "+(int)a1+"/"+(int)b1+" = "+(int)answer+"/"+(int)b1);
            System.out.println((int)first+" - "+(int)a1+"/"+(int)b1+" = "+(int)answer1+"/"+(int)b1);
            System.out.println((int)first+" * "+(int)a1+"/"+(int)b1+" = "+(int)answer2+"/"+(int)(b1/g.gcd(first*a1,b1)));
            System.out.println((int)first+" / "+(int)a1+"/"+(int)b1+" = "+(int)answer3+"/"+(int)(a1/g.gcd(first*b1, a1)));
        }
    }
}
