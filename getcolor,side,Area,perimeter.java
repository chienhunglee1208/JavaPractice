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
  abstract class GeometricObject {
  private String color = "white";
  private boolean filled;
  private java.util.Date dateCreated;
  
  /** Construct a default geometric object */
  protected GeometricObject() {
    dateCreated = new java.util.Date();
  }

  /** Construct a geometric object with color and filled value */
  protected GeometricObject(String color, boolean filled) {
    dateCreated = new java.util.Date();
    this.color = color;
    this.filled = filled;
  }

  /** Return color */
  public String getColor() {
    return color;
  }

  /** Set a new color */
  public void setColor(String color) {
    this.color = color;
  }

  /** Return filled. Since filled is boolean,
   *  the get method is named isFilled */
  public boolean isFilled() {
    return filled;
  }

  /** Set a new filled */
  public void setFilled(boolean filled) {
    this.filled = filled;
  }

  /** Get dateCreated */
  public java.util.Date getDateCreated() {
    return dateCreated;
  }

  @Override
  public String toString() {
    return "created on " + dateCreated + "\ncolor: " + color +
      " and filled: " + filled;
  }

  /** Abstract method getArea */
  abstract double getArea();

  /** Abstract method getPerimeter */
  abstract double getPerimeter();
}
class Triangle extends GeometricObject{
    private double x,y,z;
    private String color;
    Triangle(double side1,double side2,double side3){
        this.x=side1;
        this.y=side2;
        this.z=side3;
    }
    double getside1(){
        return x;
    }
    double getside2(){
        return y;
    }
    double getside3(){
        return z;
    }
    double getArea(){
        double s,Area;
        s=(x+y+z)/2;
        Area=Math.pow(s*(s-x)*(s-y)*(s-z),0.5);
        return Area;
    }
    double getPerimeter(){
        double Perimeter;
        Perimeter=x+y+z;
        return Perimeter;
    }
    String getColor(String color){
        this.color=color;
        return this.color;
    }
    boolean isfill(boolean x){
        return x;
    }
}
public class Main {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code  application logic here
        String m,n;
        boolean p;
        double side1,side2,side3;
        Scanner a=new Scanner(System.in);  
        while(a.hasNext()){
            m=a.nextLine();
            String [] m1=m.split(" ");
            side1=Double.parseDouble(m1[0]);
            side2=Double.parseDouble(m1[1]);
            side3=Double.parseDouble(m1[2]);            
            n=a.nextLine();
            p=a.nextBoolean();
            Triangle r=new Triangle(side1,side2,side3);
            System.out.println("Triangle: side1 = "+r.getside1()+" side2 = "+r.getside2()+" side3 = "+r.getside3());
           System.out.println("The area is "+r.getArea());
            System.out.println("The perimeter is "+r.getPerimeter());
            System.out.println(r.getColor(n));
            System.out.println(r.isfill(p));           
        }
            
    }
}