/*4a) Write a Java program to implement Exception Handling using try, catch and finally 
clause. 
Code: */
public class ExpHandl { 
public static void main(String[] args) { 
int a[] = {5, 10}; 
int b = 5; 
try { 
int x = a[1] / (b - a[0]);          
}  
catch (ArithmeticException ae)  
{ 
System.out.println(ae);        
System.out.println("Divide By Zero Error"); 
}  
catch (IndexOutOfBoundsException ab) 
{ 
System.out.println(ab); 
System.out.println("Array Error"); 
}  
finally { 
System.out.println("Rest of the Code"); 
} 
} 
} 