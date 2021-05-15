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
class Mypoint{
    private double X,Y;
    Mypoint(){
       X=0;
       Y=0;
    }
    Mypoint(double X,double Y){
        this.X=X;
        this.Y=Y;
    }
    void Mypoint1(double x,double y){
        X=x;
        Y=y;
    }
    double getX(double x){
        return x;
    }
    void setX(double x){
        this.X=x;
    }
    double getY(double y){
        return y;
    }
    void setY(double y){
        this.Y=y;
    }
    double distance(double point1,double point2){
        double distance;
        distance=Math.pow(Math.pow(point1-X,2)+Math.pow(point2-Y,2),0.5);
        return distance;
    }
    double distance(Mypoint point,double x,double y){
       double distance;
       distance=Math.pow(Math.pow(x-point.X,2)+Math.pow(y-point.Y,2),0.5 );
       return distance;
    }
}
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    String input,input2,input1;
    double x,x1,x2,y,y1,y2;
    Scanner a=new Scanner(System.in);
    while(a.hasNext()){
        input=a.nextLine();
        String [] n=input.split(" ");
        x=Double.parseDouble(n[0]);
        y=Double.parseDouble(n[1]);
        input1=a.nextLine();
        String[] n1=input1.split(" ");
        x1=Double.parseDouble(n1[0]);
        y1=Double.parseDouble(n1[1]);
        input2=a.nextLine();
        String [] n2=input2.split(" ");
        x2=Double.parseDouble(n2[0]);
        y2=Double.parseDouble(n2[1]);
        Mypoint result=new Mypoint(x,y);
        System.out.println(result.distance(new Mypoint(x1,y1),x,y));
        System.out.println(result.distance(x2,y2));
    }
    }
    
}
