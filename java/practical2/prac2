/*2b) Write a Java program to implement Multi level inheritance 
Code: */
class c1 { 
void sq(int a) { 
System.out.println("Square is " + (a * a)); 
} 
} 
class c2 extends c1 { 
void cb(int a) { 
System.out.println("Cube is " + (a * a * a)); 
} 
} 
class c3 extends c2 { 
void display() { 
System.out.println("Child/Derived/SubClass"); 
} 
} 
class multilevel { 
public static void main(String args[]) { 
c3 obj = new c3();   
  // Object of lowest subclass (c3) 
obj.sq(5);             // From class c1 
obj.cb(5);             // From class c2 
obj.display();         // From class c3 
} 
} 