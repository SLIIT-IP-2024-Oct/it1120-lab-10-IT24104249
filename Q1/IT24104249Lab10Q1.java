import java.util.Scanner;

public class IT24104249Lab10Q1 {

 public static void main(String[] args) {
 

   Scanner input = new Scanner(System.in);
   
   System.out.println();
   
   char grade;
   System.out.print("Enter the exam marks: ");
   int marks = input.nextInt();
   
   
   System.out.println();
   
   assert(marks >=0 && marks<= 100): "Invalid marks ";
   
   System.out.print("\nMark is validated");
   
   if(marks>=75 && marks<=100) {
	   grade= 'A';
   }else if (marks>=60) {
	   grade = 'B';
   }else if (marks>=50) {
	   grade = 'C';
   }else if (marks>=40) {
	   grade = 'D';
   }else {
   grade = 'F';}
   
   
   assert ((marks>=75) && (marks<=100)&& (grade == 'A')) ||
    ((marks>=60) && (marks<75)&& (grade == 'B')) ||
    ((marks>=50) && (marks<60)&& (grade == 'C')) ||
    ((marks>=40) && (marks<50)&& (grade == 'D')) ||
    ((marks>=0) && (marks<40)&& (grade == 'F')): "Invalid Marks";
 
   System.out.println();
   
    }
   }	
   