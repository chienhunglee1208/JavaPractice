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
import java.util.Stack;
class Queue{
    public int size=21;
    public int[] elements=new int[size]; 
    public Stack queue=new Stack();
    void enqueue(int v){
       //stack size=8
       queue.push(v);//get can solve column problem.        
    }
    Object dequeue(){
        Object result;     
        result=queue.remove(0);      
        return result;
    }
    boolean empty(){
        return queue.empty();
    }
    
    int getsize(){       
        return size;
    }
}
public class Main {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here   
        int i;
        double q;
        Queue a=new Queue();  
        String k;
           for(i=0;i<=20;i++){
                a.enqueue(i);
                a.elements[i]=i;       
                k=a.dequeue().toString();
                String [] n=k.split(" ");
                q=Double.parseDouble(n[0]);
                if(i!=0){
                    System.out.print(" "+q);
            }
                else{
                    System.out.print(q);
                }
        }
           System.out.println();
    }
    
}
