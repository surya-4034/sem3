/* 2h) Write a java program to implement the concept of Interfaces (Multiple Inheritance). 
Code: */
interface A { 
void show(); 
} 
interface B { 
void display(); 
} 
class C implements A, B { 
public void show() { 
System.out.println("Show from A"); 
} 
public void display() { 
System.out.println("Display from B"); 
} 
} 
public class MultipleI { 
public static void main(String[] args) { 
C obj = new C(); 
obj.show(); 
obj.display(); 
} 
} 