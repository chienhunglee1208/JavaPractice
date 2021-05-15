/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author 
 * Jiang-Shiou Hwang
 */
  import java.util.Scanner;
  class GeometricObject1 {
  private String color = "white";
  private boolean filled;
  private java.util.Date dateCreated;
  
  /** Construct a default geometric object */
  public GeometricObject1() {
    dateCreated = new java.util.Date();
  }

  /** Construct a geometric object with the specified color 
    *  and filled value */
  public GeometricObject1(String Color, boolean filled) {
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
     its get method is named isFilled */
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
  
  /** Return a string representation of this object */
  public String toString() {
    return "created on " + dateCreated + "\ncolor: " + color + 
      " and filled: " + filled;
  }
 double getArea(double x,double y,double z){
     double s,result;
     s=(x+y+z)/2;
     result=Math.pow(s*(s-x)*(s-y)*(s-z),0.5);
     return result;
 } 
 double getPrimeter(double x,double y,double z){
     double sum;
     sum=x+y+z;
     return sum;
 } 
}
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        boolean g;
        double m1,m2,m3;
        String input;
        Scanner a1=new Scanner(System.in);
        input=a1.nextLine();
        String [] n=input.split(" ");
        m1=Double.parseDouble(n[0]);
        m2=Double.parseDouble(n[1]);
        m3=Double.parseDouble(n[2]);
        g=Boolean.parseBoolean(n[4]);
        GeometricObject1 a=new GeometricObject1();
        a.setFilled(g);
        a.setColor(n[3]);
        System.out.printf("%.3f ",a.getArea(m1,m2,m3));
        System.out.printf("%.3f",a.getPrimeter(m1,m2,m3));
        System.out.println(" "+a.getColor()+" "+a.isFilled());  
    }
    
}
