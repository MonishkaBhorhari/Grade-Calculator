/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gradecalculator;

import java.util.Scanner;

/**
 *
 * @author hp
 */
public class GradeCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      int marks[] = new int[5];
        int i;
        float total=0, grade;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hii Guys!");	
        System.out.println("what is your name");
        String name =scanner.nextLine();
        System.out.println(name+" please enter your mark");
        for(i=0; i<5; i++) { 
           System.out.print("Enter Marks of Subject"+(i+1)+":");
           marks[i] = scanner.nextInt();
           total = total + marks[i];
        }
        scanner.close();
        //Calculating average here
        grade= total/5;
        System.out.print("The student Grade is: ");
        if(grade>=80)
        {
            System.out.print("A");
        }
        else if(grade>=60 && grade<80)
        {
           System.out.print("B");
        } 
        else if(grade>=40 &&grade<60)
        {
            System.out.print("C");
        }
        else
        {
            System.out.print("D");
        }
    }
}