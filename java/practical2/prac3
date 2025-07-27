/*2c) Write a Java program to implement Hierarchical inheritance 
Code: */
class Calc { 
void display() { 
System.out.println("Parent class"); 
} 
} 
class Add extends Calc { 
void plus(int a, int b) { 
System.out.println("Addition is " + (a + b)); 
} 
} 
class Sub extends Calc { 
void minus(int a, int b) { 
System.out.println("Subtraction is " + (a - b)); 
} 
} 
class hierarchy { 
public static void main(String args[]) { 
Add a1 = new Add(); 
Sub s1 = new Sub(); 
a1.display();      // from Calc class 
a1.plus(5, 5);     // addition from Add class 
s1.display();      // from Calc class 
s1.minus(50, 5);   // subtraction from Sub class 
} 
} 