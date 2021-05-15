/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author hp600G1
 */
import java.util.Scanner;
interface Cloneable{
    public abstract double getArea();
    public abstract double getPerimeter();
}
/* interface Comparable{
   // public abstract double getArea();
    //public abstract double getPerimeter();
}*/
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
  public abstract double getArea();

  /** Abstract method getPerimeter */
  public abstract double getPerimeter();
    }
  class Octagon extends GeometricObject implements Cloneable,Comparable {
      public double side;
      Octagon(double side){
          super();
          this.side=side;
      }
      public double getArea(){
      double s,area;
      s=side*3;
      area=(2+4/Math.pow(2,0.5))*side*side;
      return area;
  }
 
  public double getPerimeter(){
      return 8*side;
  }
  public Object clone(){        
   /*try{          
           return super.clone();
        }
        catch(CloneNotSupportedException e){
            System.out.println("no");   
              return this;
        }*/
   return this;
  }
  public int CompareTo(Octagon o){
      if(o.side==this.side){
          return 0;
      }
      if(o.side>this.side){
          return 1;
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
       Octagon a=new Octagon(5);
       Octagon b;
       b=(Octagon)a.clone();
       System.out.println("Area is "+b.getArea());
       System.out.println("Perimeter is "+b.getPerimeter());
       System.out.println("Compare the methods "+b.CompareTo(b));    
     }  
}