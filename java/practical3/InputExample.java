/* 3a) Write a Java program to take user input of name, age, and salary using Scanner from 
java.util package  
Code: */
import java.util.Scanner; 
class InputExample { 
public static void main(String[] args) { 
Scanner sc = new Scanner(System.in); 
System.out.print("Enter your name: "); 
String name = sc.nextLine(); 
System.out.print("Enter your age: "); 
int age = sc.nextInt(); 
System.out.print("Enter your salary: "); 
double salary = sc.nextDouble(); 
System.out.println("Name: " + name + ", Age: " + age + ", Salary: " + salary); 
} 
} 