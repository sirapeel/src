import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.TreeMap;

import javax.swing.text.html.HTMLDocument.Iterator;


public class TestAmazon1 {
	
	static final String input ="Hello World";

    public static void main(String[] args) {		
//reverse string by reverse() method.

		//String input = "Hello World !\n";
		String output;
		output =new StringBuffer(input).reverse().toString();
		System.out.println("reversed 1 using reverse() call string: " + output);
//reverse string 2.
		
		int len =input.length();
		StringBuffer sb=new StringBuffer();
		for(int i=(len-1); i>=0; i--)
		{
			sb.append(input.charAt(i));
		}
		String rev=sb.toString();
		System.out.println("reversed 2 using appending in SB append: " + rev);
//reverse string 3
		char []chaArr =input.toCharArray();
		int x =chaArr.length;
		char chh;
		  for(int i=0, j =x -1; i < j; i++, j--){
			  //System.out.println("i: " + i + "j: " + j );
			  chh =chaArr[i];
			  //System.out.println(chh);
			  chaArr[i] =chaArr[j];
			  chaArr[j] =chh;
		  }
		  System.out.println("reversed 3 using char[] array of char: "+ new String(chaArr));
		
//double number with only "two digits" after decimal.

		double numD =1001.27124;
		System.out.println("\nBig float number is---->: " + numD);
		double newNum = Math.round(numD*100.0)/100.0;
		System.out.println("rounded number with two digits after decimal num : " + newNum + "\n");
//number reversing.

		int num=12345;
		int revNum =0;
		int temp=0;
		System.out.println("Start Num: " +num);
		while(num >0) {
			temp =num % 10;                //get reminding number by % modular
			revNum =revNum * 10 + temp;    //increase revNum by *10 and add the reminding.
			num =num / 10;                 //input number divide by 10 for next computation
		}
		System.out.println("Reversed Num: " + revNum + ", plus one: " + (revNum + 1)  + "\n");
//char array

		char[] arChar={'C', 'E', 'A', 'F'};
		System.out.println("print of charArr: "+ new String(arChar));
		System.out.println("value of charArr: " + String.valueOf(arChar));
		
//stoi
		String str="123";
		System.out.println("\nInput Number is---->: " + str);
		char ch;
		int outNum =0;
		int n =str.length();
		for(int i=0; i < n; i++)
		{  //System.out.println("\nNumber is---->: " + outNum);
		   //System.out.println("\nchar is---->: " + ch);
			ch =str.charAt(i);                            //first char index 0 in string. 1 then 2, 3...
			//System.out.println("char is---->: " + ch);
		   outNum =outNum * 10  + ch - '0' ;              //use "char - '0' " to get its integer number for this char
		}
		System.out.println("\nNumber is---->: " + outNum + ", plus one is: " +(outNum +1)+ "\n");
//prime number

		int numStart =20;
		System.out.println("\nFind prim number in---->: " + numStart + "\n");
		boolean isPrime =true;
		for(int i =1; i<= numStart; i++){
			for(int j=2; j<= numStart; j++){
				if((i!=j)&&((i%j)==0)){              //can be divided, not itself, now not prime, set to false, exit loop now.
					//System.out.println("Not prime number, in inner j loop, i value is: " + i + ", j is: " + j + ", can be divided."  +"\n");
					if(i==numStart){ System.out.println("Ending the primary number finding loop...");}
					isPrime =false;
					break;
				}
				//System.out.println("Outer i loop, i is: " + i + ", j: " + j);
			} //end inner loop.
		  if(isPrime) { 
			  System.out.println("\nPrime number found in i: " + i +"\n");
		  }else { //number is true, print it, or false
			  isPrime =true;
		  }
		}
//Queue
		//Queue<String> q = new LinkedList<String>();
		LinkedList<String> q =new LinkedList<String>();  //enable addLast(), removeFirst()
        q.add("B");                                      //linked list added in adding order in the list.
        q.add("B");
        q.add("F");
        q.add("G");
        q.add("H");
        q.addLast("Z");    //Z should be the last in list.
        q.addFirst("A");
		System.out.println("\nQueue: " + q + ", Queue size: " + q.size());
		System.out.println("Queue peek : "+q.peek());
        // get first value and remove that object from queue
        System.out.println("Queue poll : "+q.poll());	            //.poll() will remove the first element in list.	
		System.out.println("Now Queue after q.poll(): A is gone... " + q + ", Queue size: " + q.size() +"\n");
		
//List to Arraylist.
		List<String> lines =new ArrayList<String>();
		lines.add("I am the first line...");
		lines.add("The second is here...");
		lines.add("The last line as third...");
		System.out.println(lines +"\n");
		
		for (String st : lines)
		{
			System.out.println(st);
		}
		System.out.println();
		
		String[] linesArr =lines.toArray(new String[lines.size()]);
		for (String s : linesArr) {
			System.out.println(s);
		}
//TreeMap- is ordered 
		
		TreeMap<String, Double> tm =new TreeMap<String, Double>();
		tm.put("John Doe", new Double(3434.34));
		tm.put("Tom Smith", new Double(123.22)); 
		tm.put("Jane Baker", new Double(1378.00)); 
		tm.put("Todd Hall", new Double(99.22)); 
		tm.put("Ralph Smith", new Double(-19.08));
		tm.put("Ral Smith", -19.08);                //with no new call.
		System.out.println(); 
		Set set = tm.entrySet();
		java.util.Iterator i = set.iterator();
		while(i.hasNext()){
			Map.Entry me = (Map.Entry)i.next(); 
			System.out.print(me.getKey() + ": "); 
			System.out.println(me.getValue()); 
		}
		System.out.println(); 
		// Deposit 1000 into John Doe's account 
		double balance = ((Double)tm.get("John Doe")).doubleValue(); 
		tm.put("John Doe", new Double(balance + 1000)); 
		System.out.println("John Doe's new balance: " + 
		tm.get("John Doe"));
		
	} //end main

} //end class


/*

Generally, both treemap & hashmap are not synchronized, but hashtable is synchronized. Meanwhile, 
hashtable does not allow null keys or values. hashMap allows one null key.
By the way, The difference between HashMap and TreeMap is that:
in a TreeMap the elements are stored in a tree.
TreeMap allows us to retrieve the elements in some sorted order defined by the user. So we can say that TreeMap is slower than HashMap.

	abstract class GraphicObject {
      int x, y;
    	//...
    	void moveTo(int newX, int newY) {
        	...
    	}
      abstract void draw();
      abstract void resize();
	}
//Overloading Methods
	public class DataArtist {
    	...
    	public void draw(String s) {
        ...
    	}
    	public void draw(int i) {
        ...
    	}
    	public void draw(double f) {
        ...
    	}
    	public void draw(int i, double f) {
        ...
    	}
	}	
//method Overriding
	public class Animal {
    	public static void testClassMethod() {
        	System.out.println("The class" + " method in Animal.");
    	}
    	public void testInstanceMethod() {
        	System.out.println("The instance " + " method in Animal.");
    	}
	}
//The second class, a subclass of Animal, is called Cat

	public class Cat extends Animal {
    	public static void testClassMethod() {
        	System.out.println("The class method" + " in Cat.");
    	}
    	public void testInstanceMethod() {
        	System.out.println("The instance method" + " in Cat.");
    	}

    	public static void main(String[] args) {
        	Cat myCat = new Cat();
        	Animal myAnimal = myCat;
        	Animal.testClassMethod();
        	myAnimal.testInstanceMethod();
    	}
	}	

*/