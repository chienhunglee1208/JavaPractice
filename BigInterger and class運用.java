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
import java.math.BigInteger;
import java.util.Scanner;
import java.math.BigDecimal;
 class Rational extends Number implements Comparable<Rational> {
  // Data fields for numerator and denominator
  private BigInteger numerator =new BigInteger("0");
  private BigInteger denominator =new BigInteger("1");
  private BigInteger numerator1 =new BigInteger("0");
  private BigInteger denominator1 =new BigInteger("1");
   /** Construct a rational with default properties */
  /** Construct a rational with specified numerator and denominator */
  public Rational(BigInteger numerator, BigInteger denominator) {
    BigInteger gcd =denominator.gcd(numerator);
    int b;
    b=denominator.compareTo(numerator1);
    if(b==1){   
        this.numerator =denominator1.multiply(numerator).divide(gcd);
    }
    else if(b==0){
        this.numerator =denominator1.negate().multiply(numerator).divide(gcd);
    }
    else if (b==-1){
        this.numerator =denominator1.negate().multiply(numerator).divide(gcd);
    }   
    this.denominator =denominator.abs().divide(gcd);
  }
  public Rational() {   
     new Rational(numerator1,denominator1);
  }
  /** Find GCD of two numbers */
  /** Return numerator */
  public BigInteger getNumerator() {
    return numerator;
  }
  /** Return denominator */
  public BigInteger getDenominator() {
      return denominator;
  }
  /** Add a rational number to this rational */
  public Rational add(Rational secondRational) {      
    BigInteger n = numerator.multiply(secondRational.getDenominator()).add(
      denominator.multiply(secondRational.getNumerator()));
    BigInteger d = denominator.multiply(secondRational.getDenominator());
    return new Rational(n, d);
  }

  /** Subtract a rational number from this rational */
  public Rational subtract(Rational secondRational) {
    BigInteger n = numerator.multiply(secondRational.getDenominator()).subtract(
      denominator.multiply(secondRational.getNumerator()));
    BigInteger d = denominator.multiply(secondRational.getDenominator());
    return new Rational(n, d);
  }

  /** Multiply a rational number to this rational */
  public Rational multiply(Rational secondRational) {
    BigInteger n = numerator.multiply(secondRational.getNumerator());
    BigInteger d = denominator.multiply(secondRational.getDenominator());
    return new Rational(n, d);
  }
  /** Divide a rational number from this rational */
  public Rational divide(Rational secondRational) {
    BigInteger n = numerator.multiply(secondRational.getDenominator());
    BigInteger d = denominator.multiply(secondRational.numerator);
    return new Rational(n, d);
  }
  @Override  
  public String toString() {
      BigInteger a=new BigInteger("1");
    if (denominator == a)
      return numerator + "";   
    else 
      return numerator + "/" + denominator;
  }
  @Override // Override the equals method in the Object class 
  public boolean equals(Object other) {
       BigInteger a=new BigInteger("0");
    if ((this.subtract((Rational)(other))).getNumerator() ==a)
      return true;
    else
      return false;
  }
  @Override // Implement the abstract intValue method in Number 
  public int intValue() {
    return (int)doubleValue();
  }
  @Override // Implement the abstract floatValue method in Number 
  public float floatValue() {
    return (float)doubleValue();
  }
  @Override // Implement the doubleValue method in Number 
  public double doubleValue() {
      String b=numerator.toString(),c=denominator.toString();
      double b1=Double.parseDouble(b),c1=Double.parseDouble(c);
    return b1 *1/c1;
  }
  @Override // Implement the abstract longValue method in Number
  public long longValue() {
    return (long)doubleValue();
  }

  @Override // Implement the compareTo method in Comparable
  public int compareTo(Rational o) {
    if (this.subtract(o).getNumerator().compareTo(numerator1)==1)
      return 1;
    else if (this.subtract(o).getNumerator().compareTo(numerator1)==0)
      return -1;
    else
      return 0;
  }
}
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        String first,second;
        BigInteger a,b,c,d;
        Long g=new Long(103L);
        int first1,first2,second1,second2,count=0;
        while(input.hasNext()){
           first=input.nextLine();
           String [] n=first.split(" ");
           first1=Integer.parseInt(n[0]);
           first2=Integer.parseInt(n[1]);
           second=input.nextLine();
           String [] n1=second.split(" ");
           second1=Integer.parseInt(n1[0]);
           second2=Integer.parseInt(n1[1]);
           a=BigInteger.valueOf(first1);
           b=BigInteger.valueOf(first2);
           c=BigInteger.valueOf(second1);
           d=BigInteger.valueOf(second2);          
           Rational A=new Rational(a,b);
           Rational B=new Rational(c,d);
           if(first1%first2==0){
               if((((double)first1/(double)first2)*((double)second1/(double)second2))%1==0){
                 System.out.println(first1/first2+" + "+second1+"/"+second2+" = "+A.add(B));
                 System.out.println(first1/first2+" - "+second1+"/"+second2+" = "+A.subtract(B));
                 System.out.println(first1/first2+" * "+second1+"/"+second2+" = "+(int)(((double)first1/(double)first2)*((double)second1/(double)second2)));
                 System.out.println(first1/first2+" / "+second1+"/"+second2+" = "+A.divide(B));
               }
               else if ((((double)first1/(double)first2)/((double)second1/(double)second2))%1!=0){
                 System.out.println(first1/first2+" + "+second1+"/"+second2+" = "+A.add(B));  
                 System.out.println(first1/first2+" - "+second1+"/"+second2+" = "+A.subtract(B));  
                 System.out.println(first1/first2+" * "+second1+"/"+second2+" = "+A.multiply(B));  
                 System.out.println(first1/first2+" / "+second1+"/"+second2+" = "+A.divide(B)); 
                 count++;
               }
               if((((double)first1/(double)first2)/((double)second1/(double)second2))%1==0){
                 System.out.println(first1/first2+" + "+second1+"/"+second2+" = "+A.add(B));
                 System.out.println(first1/first2+" - "+second1+"/"+second2+" = "+A.subtract(B));
                 System.out.println(first1/first2+" * "+second1+"/"+second2+" = "+A.multiply(B));
                 System.out.println(first1/first2+" / "+second1+"/"+second2+" = "+(int)(((double)first1/(double)first2)/((double)second1/(double)second2)));
               }
               else if ((((double)first1/(double)first2)*((double)second1/(double)second2))%1!=0){
                   if(count!=1){
                 System.out.println(first1/first2+" + "+second1+"/"+second2+" = "+A.add(B));  
                 System.out.println(first1/first2+" - "+second1+"/"+second2+" = "+A.subtract(B));  
                 System.out.println(first1/first2+" * "+second1+"/"+second2+" = "+A.multiply(B));  
                 System.out.println(first1/first2+" / "+second1+"/"+second2+" = "+A.divide(B));                
                   }
                   }
           }
           else{
               if((((double)first1/(double)first2)*((double)second1/(double)second2))%1==0){
                 System.out.println(first1+"/"+first2+" + "+second1+"/"+second2+" = "+A.add(B));
                 System.out.println(first1+"/"+first2+" - "+second1+"/"+second2+" = "+A.subtract(B));
                 System.out.println(first1+"/"+first2+" * "+second1+"/"+second2+" = "+(int)(((double)first1/(double)first2)*((double)second1/(double)second2)));
                 System.out.println(first1+"/"+first2+" / "+second1+"/"+second2+" = "+A.divide(B));
               }        
               else if((((double)first1/(double)first2)/((double)second1/(double)second2))%1!=0){
                 System.out.println(first1+"/"+first2+" + "+second1+"/"+second2+" = "+A.add(B));
                 System.out.println(first1+"/"+first2+" - "+second1+"/"+second2+" = "+A.subtract(B));
                 System.out.println(first1+"/"+first2+" * "+second1+"/"+second2+" = "+A.multiply(B));
                 System.out.println(first1+"/"+first2+" / "+second1+"/"+second2+" = "+A.divide(B));
               }
               if((((double)first1/(double)first2)/((double)second1/(double)second2))%1==0){
                 System.out.println(first1/first2+" + "+second1+"/"+second2+" = "+A.add(B));
                 System.out.println(first1/first2+" - "+second1+"/"+second2+" = "+A.subtract(B));
                 System.out.println(first1/first2+" * "+second1+"/"+second2+" = "+A.multiply(B));
                 System.out.println(first1/first2+" / "+second1+"/"+second2+" = "+(int)(((double)first1/(double)first2)/((double)second1/(double)second2)));
               }
               else if((((double)first1/(double)first2)*((double)second1/(double)second2))%1!=0){
                 System.out.println(first1/first2+" + "+second1+"/"+second2+" = "+A.add(B));  
                 System.out.println(first1/first2+" - "+second1+"/"+second2+" = "+A.subtract(B));  
                 System.out.println(first1/first2+" * "+second1+"/"+second2+" = "+A.multiply(B));  
                 System.out.println(first1/first2+" / "+second1+"/"+second2+" = "+A.divide(B));                
               }
           }
           }
    }
    
}
