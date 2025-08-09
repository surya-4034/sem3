/* 2g) Write a java program to implement the concepts of Abstract classes and methods. 
Code: */
abstract class Calc { 
public abstract int sqr(int n1);    // abstract method for square 
public abstract int cube(int n1);   // abstract method for cube 
public void display() {    
          //
 concrete method;
System.out.println("Hello SYCS"); 
} 
} 
class Abs extends Calc { 
// Implement square method 
public int sqr(int n1) { 
return n1 * n1; 
} 
// Implement cube method 
public int cube(int n1) { 
return n1 * n1 * n1; 
} 
public static void main(String args[]) { 
Abs a1 = new Abs(); 
System.out.println("Square is: " + a1.sqr(5)); 
System.out.println("Cube is: " + a1.cube(5)); 
a1.display();    // calling concrete method from abstract class 
} 
}