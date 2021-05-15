/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg403261716;

/**
 *
 * @author Mac
 */
import java.util.Scanner;
public class Main {

    /**
     * @param args the command line arguments
     */
    static void blank(int a){
	int i;
	for(i=1;i<=a;i++){
		System.out.println(" ");
		
	}
}
 static void star(int a){
    
	int j;
	for(j=1;j<=a;j++){
		System.out.println("*");
	}
}
    public static void main(String[] args) {
        int i,n,a;
	Scanner scanner = new Scanner(System.in);
                   n=scanner.nextInt();
		
	for(i=1;i<=2*n-1;i=i+2){
		a=(2*n-i-1)/2;
		blank(a);
		star(i);
		System.out.println("\n");
	
	}
    
	


        // TODO code application logic here
    }
    
}
