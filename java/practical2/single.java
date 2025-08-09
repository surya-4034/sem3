/*2a) Write a Java program to implement Single level inheritance 
Code: */
class prac1 { 
void display() { 
System.out.println("Parent Class"); 
} 
} 
class child extends prac1 { 
void print() { 
System.out.println("Child Class"); 
} 
} 
class single { 
public static void main(String args[]) { 
child c1 = new child(); 
c1.display();  // calls the display() method from the parent class (inherited). 
c1.print(); 
} 
} 