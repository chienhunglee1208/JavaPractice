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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int year,day,k=0,k1;        
        Scanner imput=new Scanner(System.in);
        while(imput.hasNext()){
            year=imput.nextInt();
            day=imput.nextInt();
            String Jan="          January "+year,Feb="          Febrary "+year,Mar="          March "+year,Apr="          April "+year,May="          May "+year,Jun="          June "+year,Jul="          July "+year,Aug="          August "+year,Sep="          September "+year,Oct="          October "+year,Nov="          November "+year,Dec="          December "+year;
            String line="-----------------------------",week=" Sun Mon Tue Wed Thu Fri Sat";
            String [][]days=new String[6][7];
            int i,j,count=1;
            System.out.println(Jan);
            System.out.println(line);
            System.out.println(week);
            for(i=0;i<days.length;i++){
                for(j=0;j<days[0].length;j++){
                    if(i==0&&j<day){
                        days[i][j]="    ";
                    }
                    else{
                        if(count<10){
                    days[i][j]="   "+count;
                    count++;    
                        }
                        else{
                           days[i][j]="  "+count;
                           count++;
                           k=j;
                        }
                    }                                       
                    if(count==32){
                        break;
                    }                 
                }
                    if(count==32){
                        break;
                    }    
            }
            for(i=0;i<days.length;i++){
                for(j=0;j<days[0].length;j++){                 
                    System.out.print(days[i][j]);
                    if(days[i][j].equals("  "+31)){                          
                        count++;
                        break;
                    }                   
                }
                if(count==33){                 
                    break;
                }
                System.out.println();            
            }
            System.out.println();
            
            count=1;
            System.out.println(); 
            System.out.println(); 
            System.out.println(Feb);
            System.out.println(line);
            System.out.println(week);
            if(k==6){
                k1=1;
            }
            else{
                k1=0;
            }
               for(i=0;i<days.length;i++){
                for(j=0;j<days[0].length;j++){
                    if(i==0&&j<=k){
                        days[i][j]="    ";
                    }
                    else{
                        if(count<10){
                    days[i][j]="   "+count;
                    count++;    
                        }
                        else{
                           days[i][j]="  "+count;
                           count++;
                           k=j;
                        }
                    }
                    if(year%400==0 ||( (year%4==0)&&(year%100!=0))){
                        if(count==30){
                            break;
                    }                 
                    }
                    else{
                       if(count==29){
                            break;
                    }  
                    }
                }
                if(year%400==0 ||( (year%4==0)&&(year%100!=0))){
                    if(count==30){
                        break;
                    }    
                }
                else{
                    if(count==29){
                        break;
                    }  
                }
            }
            for(i=k1;i<days.length;i++){
                for(j=0;j<days[0].length;j++){                 
                    System.out.print(days[i][j]);
                     if(year%400==0 ||( (year%4==0)&&(year%100!=0))){
                    if(days[i][j].equals("  "+29)){                          
                        count++;
                        break;
                    }    
                     }
                     else{
                           if(days[i][j].equals("  "+28)){                          
                        count++;
                        break;
                    }   
                     }
                }
                 if(year%400==0 ||( (year%4==0)&&(year%100!=0))){
                    if(count==31){                 
                    break;
                }       
                 }
                 else{
                      if(count==30){                 
                    break;
                }       
                 }
                    System.out.println();
                }
                System.out.println();  
                count=1;
                System.out.println();
                 System.out.println(); 
                System.out.println(Mar);
            System.out.println(line);
            System.out.println(week);
            if(k==6){
                k1=1;
            }
            else{
                k1=0;
            }
            for(i=0;i<days.length;i++){
                for(j=0;j<days[0].length;j++){
                    if(i==0&&j<=k){
                        days[i][j]="    ";
                    }
                    else{
                        if(count<10){
                            days[i][j]="   "+count;
                            count++;    
                        }
                        else{
                           days[i][j]="  "+count;
                           count++;
                           k=j;
                        }
                    }                                       
                    if(count==32){
                        break;
                    }                 
                }
                    if(count==32){
                        break;
                    }    
            }
            for(i=k1;i<days.length;i++){
                for(j=0;j<days[0].length;j++){                 
                    System.out.print(days[i][j]);
                    if(days[i][j].equals("  "+31)){                          
                        count++;
                        break;
                    }                   
                }
                if(count==33){                 
                    break;
                }
                System.out.println();            
            }
            System.out.println();
            count=1;          
             System.out.println(); 
            System.out.println(Apr);
            System.out.println(line);
            System.out.println(week);                 
            if(k==6){
                k1=1;
            }
            else{
                k1=0;
            }
            for(i=0;i<days.length;i++){
                for(j=0;j<days[0].length;j++){
                    if(i==0&&j<=k){                        
                        days[i][j]="    ";
                      
                    }
                    else{
                        if(count<10){
                    days[i][j]="   "+count;
                    count++;    
                        }
                        else{
                           days[i][j]="  "+count;
                           count++;
                           k=j;
                        }
                    }                                       
                    if(count==31){
                        break;
                    }                 
                }
                    if(count==31){
                        break;
                    }    
            }     
            for(i=k1;i<days.length;i++){
                for(j=0;j<days[0].length;j++){     
                        System.out.print(days[i][j]);                   
                    if(days[i][j].equals("  "+30)){                          
                        count++;
                        break;
                    }                   
                }
                if(count==32){                 
                    break;
                }
                System.out.println();            
            }
            System.out.println();
            count=1;
            System.out.println();
             System.out.println(May);
            System.out.println(line);
            System.out.println(week);  
            if(k==6){
                k1=1;
            }
            else{
                k1=0;
            }
            for(i=0;i<days.length;i++){
                for(j=0;j<days[0].length;j++){
                    if(i==0&&j<=k){                        
                        days[i][j]="    ";
                      
                    }
                    else{
                        if(count<10){
                    days[i][j]="   "+count;
                    count++;    
                        }
                        else{
                           days[i][j]="  "+count;
                           count++;
                           k=j;
                        }
                    }                                       
                    if(count==32){
                        break;
                    }                 
                }
                    if(count==32){
                        break;
                    }    
            }     
            for(i=k1;i<days.length;i++){
                for(j=0;j<days[0].length;j++){     
                        System.out.print(days[i][j]);                   
                    if(days[i][j].equals("  "+31)){                          
                        count++;
                        break;
                    }                   
                }
                if(count==33){                 
                    break;
                }
                System.out.println();            
            }
            System.out.println();
             count=1;
             System.out.println();
             System.out.println(Jun);
            System.out.println(line);
            System.out.println(week);  
            if(k==6){
                k1=1;
            }
            else{
                k1=0;
            }
            for(i=0;i<days.length;i++){
                for(j=0;j<days[0].length;j++){
                    if(i==0&&j<=k){                        
                        days[i][j]="    ";
                      
                    }
                    else{
                        if(count<10){
                    days[i][j]="   "+count;
                    count++;    
                        }
                        else{
                           days[i][j]="  "+count;
                           count++;
                           k=j;
                        }
                    }                                       
                    if(count==31){
                        break;
                    }                 
                }
                    if(count==31){
                        break;
                    }    
            }     
            for(i=k1;i<days.length;i++){
                for(j=0;j<days[0].length;j++){     
                        System.out.print(days[i][j]);                   
                    if(days[i][j].equals("  "+30)){                          
                        count++;
                        break;
                    }                   
                }
                if(count==32){                 
                    break;
                }
                System.out.println();            
            }
            System.out.println();
            count=1;
            System.out.println();
             System.out.println(Jul);
            System.out.println(line);
            System.out.println(week);  
            if(k==6){
                k1=1;
            }
            else{
                k1=0;
            }
            for(i=0;i<days.length;i++){
                for(j=0;j<days[0].length;j++){
                    if(i==0&&j<=k){                        
                        days[i][j]="    ";
                      
                    }
                    else{
                        if(count<10){
                    days[i][j]="   "+count;
                    count++;    
                        }
                        else{
                           days[i][j]="  "+count;
                           count++;
                           k=j;
                        }
                    }                                       
                    if(count==32){
                        break;
                    }                 
                }
                    if(count==32){
                        break;
                    }    
            }     
            for(i=k1;i<days.length;i++){
                for(j=0;j<days[0].length;j++){     
                        System.out.print(days[i][j]);                   
                    if(days[i][j].equals("  "+31)){                          
                        count++;
                        break;
                    }                   
                }
                if(count==33){                 
                    break;
                }
                System.out.println();            
            }
            System.out.println();
             count=1;
             System.out.println();         
             System.out.println(Aug);
            System.out.println(line);
            System.out.println(week);  
            if(k==6){
                k1=1;
            }
            else{
                k1=0;
            }
            for(i=0;i<days.length;i++){
                for(j=0;j<days[0].length;j++){
                    if(i==0&&j<=k){                        
                        days[i][j]="    ";
                      
                    }
                    else{
                        if(count<10){
                    days[i][j]="   "+count;
                    count++;    
                        }
                        else{
                           days[i][j]="  "+count;
                           count++;
                           k=j;
                        }
                    }                                       
                    if(count==32){
                        break;
                    }                 
                }
                    if(count==32){
                        break;
                    }    
            }     
            for(i=k1;i<days.length;i++){
                for(j=0;j<days[0].length;j++){     
                        System.out.print(days[i][j]);                   
                    if(days[i][j].equals("  "+31)){                          
                        count++;
                        break;
                    }                   
                }
                if(count==33){                 
                    break;
                }
                System.out.println();            
            }
            System.out.println();
             count=1;
              System.out.println(); 
             System.out.println(Sep);
            System.out.println(line);
            System.out.println(week);  
            if(k==6){
                k1=1;
            }
            else{
                k1=0;
            }
            for(i=0;i<days.length;i++){
                for(j=0;j<days[0].length;j++){
                    if(i==0&&j<=k){                        
                        days[i][j]="    ";
                      
                    }
                    else{
                        if(count<10){
                    days[i][j]="   "+count;
                    count++;    
                        }
                        else{
                           days[i][j]="  "+count;
                           count++;
                           k=j;
                        }
                    }                                       
                    if(count==31){
                        break;
                    }                 
                }
                    if(count==31){
                        break;
                    }    
            }     
            for(i=k1;i<days.length;i++){
                for(j=0;j<days[0].length;j++){     
                        System.out.print(days[i][j]);                   
                    if(days[i][j].equals("  "+30)){                          
                        count++;
                        break;
                    }                   
                }
                if(count==32){                 
                    break;
                }
                System.out.println();            
            }
            System.out.println();
             count=1;
             System.out.println();
             System.out.println(Oct);
            System.out.println(line);
            System.out.println(week);  
            if(k==6){
                k1=1;
            }
            else{
                k1=0;
            }
            for(i=0;i<days.length;i++){
                for(j=0;j<days[0].length;j++){
                    if(i==0&&j<=k){                        
                        days[i][j]="    ";
                      
                    }
                    else{
                        if(count<10){
                    days[i][j]="   "+count;
                    count++;    
                        }
                        else{
                           days[i][j]="  "+count;
                           count++;
                           k=j;
                        }
                    }                                       
                    if(count==32){
                        break;
                    }                 
                }
                    if(count==32){
                        break;
                    }    
            }     
            for(i=k1;i<days.length;i++){
                for(j=0;j<days[0].length;j++){     
                        System.out.print(days[i][j]);                   
                    if(days[i][j].equals("  "+31)){                          
                        count++;
                        break;
                    }                   
                }
                if(count==33){                 
                    break;
                }
                System.out.println();            
            }
            System.out.println();
             count=1;
             System.out.println();
              System.out.println(); 
             System.out.println(Nov);
            System.out.println(line);
            System.out.println(week);  
            if(k==6){
                k1=1;
            }
            else{
                k1=0;
            }
            for(i=0;i<days.length;i++){
                for(j=0;j<days[0].length;j++){
                    if(i==0&&j<=k){                        
                        days[i][j]="    ";
                      
                    }
                    else{
                        if(count<10){
                    days[i][j]="   "+count;
                    count++;    
                        }
                        else{
                           days[i][j]="  "+count;
                           count++;
                           k=j;
                        }
                    }                                       
                    if(count==31){
                        break;
                    }                 
                }
                    if(count==31){
                        break;
                    }    
            }     
            for(i=k1;i<days.length;i++){
                for(j=0;j<days[0].length;j++){     
                        System.out.print(days[i][j]);                   
                    if(days[i][j].equals("  "+30)){                          
                        count++;
                        break;
                    }                   
                }
                if(count==32){                 
                    break;
                }
                System.out.println();            
            }
            System.out.println();
             count=1;
             System.out.println();
             System.out.println(Dec);
            System.out.println(line);
            System.out.println(week);  
            if(k==6){
                k1=1;
            }
            else{
                k1=0;
            }
            for(i=0;i<days.length;i++){
                for(j=0;j<days[0].length;j++){
                    if(i==0&&j<=k){                        
                        days[i][j]="    ";
                      
                    }
                    else{
                        if(count<10){
                    days[i][j]="   "+count;
                    count++;    
                        }
                        else{
                           days[i][j]="  "+count;
                           count++;
                           k=j;
                        }
                    }                                       
                    if(count==32){
                        break;
                    }                 
                }
                    if(count==32){
                        break;
                    }    
            }     
            for(i=k1;i<days.length;i++){
                for(j=0;j<days[0].length;j++){     
                        System.out.print(days[i][j]);                   
                    if(days[i][j].equals("  "+31)){                          
                        count++;
                        break;
                    }                   
                }
                if(count==33){                 
                    break;
                }
                System.out.println();            
            }
            System.out.println();
            System.out.println();         
            }
            
        }
    }   
