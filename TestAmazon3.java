import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;


public class TestAmazon3 {

	static boolean checkDup(String st, char ch){
		System.out.println("input string in method: " + st + ", ch: " + ch);
		boolean bl =false;
		int len =st.length();
		for(int i=0; i <len; i++){
			if(ch ==st.charAt(i) )
			{	bl =true;
				break;
     		  }				
		  }
		System.out.println(bl);
		return bl;		
	}
	
	public static void main(String[] args){
		
//hashtable exp.-synchronized, no null entry, 
		Hashtable<String, Double> ht =new Hashtable<String, Double>();
		String st;
		Double index;
		ht.put("John Dodoe", new Double(3434.34));
		ht.put("Mary LeeLi", new Double(1212.12));
		ht.put("Jane Baker", new Double(137.05));
		ht.put("Todd Hally", new Double(92.14));
		ht.put("Alex LeeLi", 4400.33);             //without calling new.
		ht.put("Rali Smith", new Double(-90.34));
		ht.put("John Doe", new Double(3434.04));
  //hashtable same key value but added.		
		double inpF=0;
		if(ht.containsKey("John Doe")){
			Double dbV =ht.get("John Doe");
			System.out.println("\nDouble value: " + dbV + "\n");
			inpF =(double)dbV + 35.4;
		}
		System.out.println("\nDouble here: " + inpF + "\n");
		ht.put("John Doe", new Double(inpF));    //add a duplicate, but it takes latest key value.
		
		System.out.println("\nHash Table print as raw material: " + ht.toString() + "\n");
		System.out.println("The size of hTable: "+ht.size() + "\n");
		System.out.println("All keys in set: " + ht.keySet() + "\n");
	//use Enumeration to iterate
		Enumeration em=ht.keys();
		while(em.hasMoreElements()) {
			String keyElement=(String)em.nextElement();   //get the key first.
			Double dble=(Double)ht.get(keyElement);       //from the key, then the value.
			System.out.println("The Key-> " +keyElement + ",    its value: " +dble);
		}
		System.out.println("\nJohn doe before value change-> " +(double)ht.get("John Doe"));
		ht.put("John Doe", new Double(2000.01));
		System.out.println("\nJohn doe after  value change-> " +(double)ht.get("John Doe"));
		//ht.put("John doe", new Double(2000));
	//case sensitive for HashTable
		System.out.println("\n"+ht.toString());
		System.out.println("The size of hTable: "+ht.size() +"\n");
		
//HashSet
		//HashSet<String> hs =new HashSet<String>();
		Set<String> hs =new HashSet<String>();
		hs.add("CA");
		hs.add("CO");
		hs.add("WA");
		hs.add("NY");
		hs.add("CA");    //no duplicate in hash set.
		System.out.println(hs);
		System.out.println("The size of HashSet: " + hs.size()  +"\n");
		Iterator it=hs.iterator();
		
    //no allowed duplicate in Set.
		StringBuffer sb=new StringBuffer();
		while(it.hasNext()){
			String s=(String)it.next();
			System.out.println("HashSet Element: " + s);         //output is in random order.
			sb=sb.append(s);
		}
		System.out.println("\nPrint String Buffer directly: " +sb);
		System.out.println("\nString Buffer toString and print all: " +sb.toString() + "\n");
		
//String has duplicate Char.
		String str ="alexlee";
	
	    char[] chars = str.toCharArray();                         //1. string converting .toCharArray()
	    //for (char c : chars)
	    //{  System.out.print(c);
	    //  }
	    System.out.println("\n\nIt is before duplicate ops and after...");
	    Set<Character> charSet = new LinkedHashSet<Character>();  //2. use Set<Character> and LinkedHashSet<Character>
	    for (char c : chars) {
	    	//System.out.print(c);
	        charSet.add(c);                                       //3. use charSet.add(c), no duplicate is added here...
	    }
	    System.out.println("\nChar Set is: " + charSet );      //4. print it and it is still a sorted char array...
	    
	    //StringBuilder sbB = new StringBuilder();
	    StringBuffer sbB = new StringBuffer();
	    for (Character ch : charSet) {
	    	//System.out.print(ch); 
	        sbB.append(ch);                                       //5. use StringBuffer to append it...
	    }
	    System.out.println("\nRemoved duplicate now as string--> " +sbB);  //sbB.toString());    //print out: alex
//String no dup, simple one by calling a method ...
		System.out.println("Given string: " + str +"\n");	
		StringBuffer sbf= new StringBuffer();
		
		for(int i=0; i <str.length(); i++)       //str ="alexlee'.
		{
			System.out.println(str.charAt(i));
			char ch =str.charAt(i);
			if(checkDup(sbf.toString(), ch)==false){
				System.out.println("In main, not dup char then append it to out string: " + ch);
				sbf.append(ch);
				System.out.println("String now is: " + sbf);
			} 
		}		
		System.out.println("\nFinal String: " +sbf);
	    
//exchange first and last char in a string    
	    String out =sbB.toString();
	    char firstCh =out.charAt(0);                     //save first char and put it last position.
	    char lastCh =out.charAt(out.length() - 1);  //get last char
	    StringBuffer stB =new StringBuffer();
	    stB =stB.append(lastCh);                     //append it as first char
	    for(int i=1; i < (out.length() -1); i++ )
	    { 
	    	stB =stB.append(out.charAt(i));          //append the index 1 and following to last -1...
	    }
	    stB =stB.append(firstCh);
	    System.out.println("\nExchange first and last-> " +stB.toString());
	    
//linked list
	    LinkedList<String> lst=new LinkedList<String>();
	    //List<String> lst=new LinkedList<String>();
	    lst.add("A");
	    lst.add("b");
	    lst.add("C");
	    lst.add("A");
	    lst.add("d");
	    lst.add(2, "w");
	    lst.addLast("dL");      //undefined for List
	    lst.addFirst("aF");     //undefined for List
	    System.out.println("\nLinkedList is: " + lst);
	  //remove one.  
	    lst.remove(1);
	    lst.remove("dL");
	    System.out.println("\nLinkedList after removing position 1 and dL is: " + lst);   //no dl, must dL...
	    
//Array list
		List<String> linesList =new ArrayList<String>();
		linesList.add("\nI am the first line...");
		linesList.add("The second is here...");
		linesList.add("The last line as third...");
		
		
		String[] linesArr =linesList.toArray(new String[linesList.size()]);
		for (String s : linesArr) {
			System.out.println(s);
		}
	    
	    ArrayList<String> arrLst =new ArrayList<String>();
	    //List<String> arrLst =new ArrayList<String>();
	    arrLst.add("A");
	    arrLst.add("b");
	    arrLst.add("F");
	    arrLst.add("C");
	    arrLst.add(1, "A2");
	    System.out.println("\nArrayList is: " + arrLst);
	 //remove one element   
	    arrLst.remove(3);
	    System.out.println("\nArrayList after remove 3 now is: " + arrLst);   //print array list with [...]
	    System.out.println("\narraylist size is: " + arrLst.size());
		for (int i=0; i<arrLst.size(); i++){
			System.out.print(arrLst.get(i) +" ");
		}
	    
	} //end main

} //end class

/*
 Map m = Collections.synchronizeMap(hashMap);



 synchronized(myMap) {
    if (!myMap.containsKey("tomato")
        myMap.put("tomato", "red");
}
1) ArrayList -fast random access, not LinkedList.
2) LinkedList -fast for insertion and removal, not ArrayList causing by moving copying memory deleted.
3) 
== ArrayList provides fast random access while LinkedList does not.
== but adding and deleting is slow(have to move by copying forward and backward), performance issues when growing.
 In ArrayList, there is a slow manipulation as compared to LinkedList.
 LinkedList allows for constant-time insertions or removals, but only sequential access of elements. 
 In other words, you can walk the list forwards or backwards, but grabbing an element in the middle takes 
 time proportional to the size of the list.
== LinkedList is backed by a doubly-linked list, not an array. 
== That means it's fast to access elements at the start 
    and the end of the list, but less so in the middle. 
== On the other hand, inserting and deleting elements is fast 
    compared to ArrayList. 

== ArrayLists, on the other hand, allow random access, so you can grab any element in constant time. 
   But adding or removing from anywhere but the end requires shifting all the latter elements over, 
   either to make an opening or fill the gap. Also, if you add more elements than the capacity of the underlying array, 
   a new array (twice the size) is allocated, and the old array is copied to the new one, so adding to an ArrayList 
   is O(n) in the worst case but constant on average.
== ArrayList is not synchronized.
== LinkedList can be fast for adding and removing elements but it is slower compared to ArrayList in accessing elements.

*/

