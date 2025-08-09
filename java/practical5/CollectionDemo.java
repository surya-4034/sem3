 /*5a) Write a Java Program to demonstrate Key Collection Framework Classes 
Code: */
import java.util.*; 
public class CollectionDemo { 
public static void main(String[] args) { 
//  List Interface – ArrayList 
List<String> arrayList = new ArrayList<>(); 
arrayList.add("Apple"); 
arrayList.add("Banana"); 
arrayList.add("Cherry"); 
System.out.println("ArrayList: " + arrayList); 
//  List Interface – LinkedList 
List<String> linkedList = new LinkedList<>(); 
linkedList.add("Dog"); 
linkedList.add("Elephant"); 
linkedList.add("Frog"); 
System.out.println("LinkedList: " + linkedList); 
//  Set Interface – HashSet (No duplicates, unordered) 
Set<String> hashSet = new HashSet<>(); 
hashSet.add("Red"); 
hashSet.add("Green"); 
hashSet.add("Blue"); 
hashSet.add("Red"); // Duplicate 
System.out.println("HashSet: " + hashSet); 
//  Set Interface – TreeSet (Sorted, no duplicates) 
Set<String> treeSet = new TreeSet<>(); 
treeSet.add("Zebra"); 
treeSet.add("Monkey"); 
treeSet.add("Ant"); 
System.out.println("TreeSet (Sorted): " + treeSet); 
//  Map Interface – HashMap (Key-value pairs) 
Map<Integer, String> hashMap = new HashMap<>(); 
hashMap.put(1, "One"); 
hashMap.put(2, "Two"); 
hashMap.put(3, "Three"); 
hashMap.put(2, "Updated Two"); // Overwrites value for key 2 
System.out.println("HashMap: " + hashMap); 
// Iterating over a Map 
System.out.println("Iterating HashMap:"); 
for (Map.Entry<Integer, String> entry : hashMap.entrySet()) { 
System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue()); 
} 
} 
}