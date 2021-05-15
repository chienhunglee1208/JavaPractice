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
class RegularPolygon{
    private double side,n,x,y;
    RegularPolygon(){
    n=3;
    side=1;
    x=0;
    y=0;
}
    RegularPolygon(double n,double side){
        this.n=n;
        this.side=side;
    }
    RegularPolygon(double n, double side,double x,double y){
        this.n=n;
        this.side=side;
        this.x=x;
        this.y=y;
    }
    double getArea(){
        double Area;
        Area=(n*Math.pow(side,2))/(4*Math.tan(Math.toRadians(180/n)));
        //=tan(180/n);
        return Area;
    }
    double getPerimeter(){
        return n*side;
    }
    
}
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        RegularPolygon a=new RegularPolygon();
        System.out.println("Polygon 1 perimeter: "+a.getPerimeter());
        System.out.println("Polygon 1 area: "+a.getArea());
        RegularPolygon a1=new RegularPolygon(8,6);
        System.out.println("Polygon 2 perimeter: "+a1.getPerimeter());
        System.out.println("Polygon 2 area: "+a1.getArea());
        RegularPolygon a2=new RegularPolygon(12,5,5.6,7.8);
        System.out.println("Polygon 3 perimeter: "+a2.getPerimeter());
        System.out.println("Polygon 3 area: "+a2.getArea());
        
        
        
    }
    
}
