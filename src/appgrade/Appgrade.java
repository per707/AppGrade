/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package appgrade;
import java.util.Scanner;
/**
 *
 * @author 344_09
 */
public class Appgrade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int work,affective,exam,total;
       double grade = 0;
       Scanner scan = new Scanner(System.in);
       
       
       do{
        System.out.print("Enter score affective (Max 20) :");
        affective = scan.nextInt();
       }while(affective>20)  ;        
       
       do{
        System.out.print("Enter score work (Max 40) :");
        work = scan.nextInt();
       }while(work>40)  ;  
        
        do{
        System.out.print("Enter score exam (Max 40) :");
        exam = scan.nextInt();
       }while(exam>40)  ;  
       
       total = work + affective + exam;
       
       if (total < 50) {
            grade = 0;
        } else if (total <= 54) {
            grade = 1.0;
        } else if (total <= 59) {
            grade = 1.5;
        } else if (total <= 64) {
            grade = 2.0;
        } else if (total <= 69) {
            grade = 2.5;
        } else if (total <= 74) {
            grade = 3.0;
        } else if (total <= 79) {
            grade = 3.5;
        } else if (total <= 100) {
            grade = 4.0;
        }
            
        System.out.println("You have grade : "+grade+" you score : "+total);
        
        if(grade==4.0){
           System.out.println("Great");
       }else if (grade==3.5){
           System.out.println("Excellent");
       }else if (grade==3.0){
           System.out.println("Very good");
       }else if (grade==2.5){
           System.out.println("Good");
       }else if (grade==2.0){
           System.out.println("Medium");
       }else if (grade==1.5){
           System.out.println("Low");
       }else if (grade==1.0){
           System.out.println("Bad");                
       }else if (grade==0){
           System.out.println("Failed");
       }
        
    }
    
}
