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
class Triangle2D{ 
          private double x1,y1,x2,y2,x3,y3,X,Y;
    Triangle2D(double x,double y,double x1,double y1,double x2,double y2){      
        this.x1=x;
        this.x2=x1;
        this.x3=x2;
        this.y1=y;
        this.y2=y1;
        this.y3=y2;
}
    Triangle2D(){
        this(2,2,2,5,6,2);
    }  
    boolean contains(){
        Mypoint a=new Mypoint();    
        if(this.y1/this.x1<=100&&this.y1/this.x1>=-0.75&&this.y2/this.x2<=100&&this.y2/this.x2>=-0.75&&this.y3/this.x3<=100&&this.y3/this.x3>=-0.75){           
            return true;
        }       
            return false;        
}
    boolean overlaps(){
        Mypoint a=new Mypoint();    
        int count=0;
        if(this.y1/this.x1<=100&&this.y1/this.x1>=-0.75){
            count++;
        }
        if(this.y2/this.x2<=100&&this.y2/this.x2>=-0.75){
            count++;
        }
        if(this.y3/this.x3<=100&&this.y3/this.x3>=-0.75){
            count++;
        }
        if(count<3){
            return true;
        }         
            return false;        
}
}
    class Mypoint{
        public double x1,y1,x2,y2,x3,y3,X,Y;
        Mypoint(){
           this(0,0,1,1,2,5);
        }
        Mypoint(double x1,double y1,double x2,double y2,double x3,double y3){
            this.x1=x1;
            this.y1=y1;
            this.x2=x2;
            this.y2=y2;
            this.x3=x3;
            this.y3=y3;            
        }
        Mypoint(double X,double Y){
            this.X=X;
            this.Y=Y;
        }
        double getArea(){
          double s,a,b,c,area;
          a=Math.pow(Math.pow(x2-x1,2)+Math.pow(y2-y1,2),0.5);
          b=Math.pow(Math.pow(x3-x2,2)+Math.pow(y3-y2,2),0.5);
          c=Math.pow(Math.pow(x1-x3,2)+Math.pow(y1-y3,2), 0.5);
          s=(a+b+c)/2;
          area=Math.pow(s*(s-a)*(s-b)*(s-c),0.5);
          return area;
        }
        double getperimeter(){
          double s,a,b,c;
          a=Math.pow(Math.pow(x2-x1,2)+Math.pow(y2-y1,2),0.5);
          b=Math.pow(Math.pow(x3-x2,2)+Math.pow(y3-y2,2),0.5);
          c=Math.pow(Math.pow(x1-x3,2)+Math.pow(y1-y3,2), 0.5);
          s=a+b+c;
          return s;
        }
        boolean contains(Mypoint point){
            double max=0,min=0;
            if((y2-y1)/(x2-x1)>=(y3-y1)/(x3-x1)){
               max=(y2-y1)/(x2-x1);
               min=(y3-y1)/(x3-x1);
            }
            else{
                max=(y3-y1)/(x3-x1);
                min=(y2-y1)/(x2-x1);
            }
            if((y2-point.Y)/(x2-point.X)<(y3-y2)/(x3-x2)){                            
                return true;
            }
            return false;
        }
        
    }
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String input,input1,input2;
        double x1,y1,x2,y2,x3,y3,X1,Y1,X2,Y2,X3,Y3,X,Y;
        Scanner a=new Scanner(System.in);
        while(a.hasNext()){
            input=a.nextLine();
            String [] n=input.split(" ");
            x1=Double.parseDouble(n[0]);
            y1=Double.parseDouble(n[1]);
            x2=Double.parseDouble(n[2]);
            y2=Double.parseDouble(n[3]);
            x3=Double.parseDouble(n[4]);
            y3=Double.parseDouble(n[5]);            
            input1=a.nextLine();
            String [] n1=input1.split(" ");
            X1=Double.parseDouble(n1[0]);
            Y1=Double.parseDouble(n1[1]);
            X2=Double.parseDouble(n1[2]);
            Y2=Double.parseDouble(n1[3]);
            X3=Double.parseDouble(n1[4]);
            Y3=Double.parseDouble(n1[5]);            
            input2=a.nextLine();
            String [] n2=input2.split(" ");
            X=Double.parseDouble(n2[0]);
            Y=Double.parseDouble(n2[1]); 
            Mypoint A=new Mypoint(x1,y1,x2,y2,x3,y3);           
            System.out.println("Triangle1");
            System.out.println("Area:"+A.getArea());
            System.out.println("Perimeter:"+A.getperimeter());
            Mypoint B=new Mypoint(X1,Y1,X2,Y2,X3,Y3);           
            System.out.println("Triangle2");
            System.out.println("Area:"+B.getArea());
            System.out.println("Perimeter:"+B.getperimeter());
            Mypoint C=new Mypoint(x1,y1,x2,y2,x3,y3);
            System.out.println("Triangle1.contains(1,1) = "+C.contains(new Mypoint(1,1)));
            Mypoint D=new Mypoint(X1,Y1,X2,Y2,X3,Y3);
            System.out.println("Triangle2.contains(1,1) = "+D.contains(new Mypoint(1,1)));      
            Triangle2D A1=new Triangle2D(x1,y1,x2,y2,x3,y3);
            System.out.println("contains(Triangle2D) = "+A1.contains());
            System.out.println("overlaps(Triangle2D) = "+A1.overlaps());
        }
    } 
}
