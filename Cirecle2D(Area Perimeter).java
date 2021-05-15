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
class Circle2D{
    private double x,y,radius;
    Circle2D(){
    this(0,0,1);
}
     Circle2D(double x,double y,double radius){
        this.x=x;
        this.y=y;
        this.radius=radius;
    }
    double getArea(){    
        return radius*radius*Math.PI;
    }
    double getPerimeter(){
        return 2*radius*Math.PI;
    }
    boolean contains(double x1, double y1){
        double distance;
        distance=Math.pow(Math.pow(x-x1,2)+Math.pow(y-y1,2),0.5);
        if(distance<=radius){
            return true;
        }
        return false;
    }
    boolean contains(Circle2D circle){
        if(Math.sqrt(Math.pow(x-circle.x,2)+Math.pow(y-circle.y,2))<=radius){
            return true;
        }
        return false;
    }
    boolean overlaps(Circle2D circle){
        if(Math.sqrt(Math.pow(x-circle.x,2)+Math.pow(y-circle.y,2))<radius+circle.radius&&Math.sqrt(Math.pow(x-circle.x,2)+Math.pow(y-circle.y,2))>Math.abs(radius-circle.radius)){
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
        Circle2D c1=new Circle2D(2,2,2.5);       
      // c1.contains(new Circle2D(2,2,2.5));
        System.out.println("Area is "+c1.getArea()); 
        System.out.println("Perimeter is "+c1.getPerimeter());
        System.out.println("c1 contains point (3, 3)? "+c1.contains(3, 3));
        System.out.println("c1 contains circle Circle2D(4, 5, 8.5)? "+c1.contains(new Circle2D(4,5,8.5)));
        System.out.println("c1 overlaps circle Circle2D(3, 5, 0.3)? "+c1.overlaps(new Circle2D(3,5,0.3)));
        
    }
    
}
