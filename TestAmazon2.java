import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.*;
//import java.util.Arrays;
//import java.util.StringTokenizer;


public class TestAmazon2 {
	
	public static void main(String[] args){
//fibonacci numbers
//sort integer by sort() built in method
//sorting integer array	
//no duplicate in an int array...
//Read file and StringTokenizer.
//number pyramid.
//multiple table...	
		
	    final int nb =5;   //starting with 5 numbers in fibonacci.
		int[ ] ar =new int[nb];
		int a =0, b=1;             //starting with 0, 1, ...
		for(int i=0; i < nb; i++){
			ar[i]=a;
			a =a + b;
			b =a - b;
		}
		for(int i=0; i < nb; i++){
			System.out.print(ar[i] + ", " );
		}
		System.out.println("\nYour fibonacci printed...\n");
//sort integer array by Array's sort() method.
		int[] intArr={3, 4, 1, 7, 5, 9, 2};
		//System.out.println("\nUsing Array to String: " + intArr.toString()); //print as [I@5e8fce95
		//System.out.println("\nUsing Array build-in methode sort()...: " + Arrays.sort(intArr));
		int temp;
		int n= intArr.length;
		//System.out.println(intArr);
		Arrays.sort(intArr);
		System.out.println("\nUsing Array build-in methode sort()...");
		for(int i=0; i<n; i++){
			System.out.print(intArr[i] + " ");
		}
//reversing the integer array.		
		System.out.println("\n\nReverse the array...\n");
		for(int i=0, j =n -1; i < j; i++, j--){
			temp =intArr[i];
			intArr[i]=intArr[j];	
			intArr[j] =temp;
		}
		for(int i=0; i < n; i++){
			System.out.print(intArr[i] + " ");
		}
		System.out.println("\n .....");
//sorting number by outer and inner loop.		
		int [] iArr ={3, 4, 1, 7, 5, 9, 2};
		int nSize=iArr.length;
		System.out.print("\nInput:  3, 4, 1, 7, 5, 9, 2 , reverse is below:\n");
//reverse first
		int tp;
		int[] outArr=new int[nSize];
		for(int i=0, j =nSize -1; i <nSize; i++, j--){
			//tp =iArr[j];
			outArr[j]=iArr[i];			
		}
		for(int i=0; i < nSize; i++){
			System.out.print(outArr[i] + " ");
		}
//sorting integer array		
		System.out.println("\nNumbers in array are: 3, 4, 1, 7, 5, 9, 2");
		System.out.println("\nInt arrary to be sorted size: " + nSize);
		System.out.println("\nFirst elmt in array: " + iArr[0] +"\n");
		for(int i=0; i < nSize; i++){
			//System.out.println("i= " +i);
			for(int j=0; j < (nSize-1); j++){
				//System.out.println("j= " + j);
				//System.out.println("iArr[" +j +"]->  " + iArr[j] + " iArr[" +(j+1) + "]-> " + iArr[(j+1)]);
				if(iArr[j] > iArr[(j+1)]){
					temp =iArr[j];
					iArr[j] =iArr[(j+1)];
					iArr[j+1] =temp;
					//System.out.println("iArr[" +j +"]->  " + iArr[j] + " iArr[" + (j+1) + "]-> " + iArr[(j+1)]);
				};
			}
		}
		for(int i=0; i<iArr.length; i++){
			System.out.print(iArr[i] + " ");
		}
		System.out.println("\n\nRead file, tokenize it and print db records it...\n");

//no duplicate in an int array...
		int[] inp ={1,6,2,6,2,3,4,2,4,5};
		System.out.println("input: 1,6,2,6,2,3,4,2,4,5\n");
		for(int i=0; i < inp.length; i++){
			//System.out.println("i= " +i);
			for(int j=0; j < (inp.length-1); j++){
				//System.out.println("j= " + j);
				//System.out.println("iArr[" +j +"]->  " + iArr[j] + " iArr[" +(j+1) + "]-> " + iArr[(j+1)]);
				if(inp[j] > inp[(j+1)]){
					temp =inp[j];
					inp[j] =inp[(j+1)];
					inp[j+1] =temp;
					//System.out.println("iArr[" +j +"]->  " + iArr[j] + " iArr[" + (j+1) + "]-> " + iArr[(j+1)]);
				};
			}
		}
		for(int i=0; i<inp.length; i++){
			System.out.print(inp[i] + " ");
		}
		System.out.println("\nsorted array...up\n");
		int[] output = new int[inp.length];
		int m =1;
		output[0] =inp[0];         //output first index 0 assigned to output array.
		for (int i=1; i<inp.length; i++){
			if(inp[i] != inp[i-1]){         //if actual one is not equal previous one, assign to output and m increase one...
				output[m]= inp[i];
				++m;
			}
		}
		int[] realOut =new int[m];
		for(int i=0; i < m; i++){
			realOut[i] =output[i];
		}
		for(int i=0; i< inp.length; i++){
			System.out.print(output[i] + " ");
		}
		System.out.println("\n");
		for(int i=0; i <realOut.length; i++){
			System.out.print(realOut[i] +" ");
		}
		System.out.println("\nm: " + m + "  length of outarray: " + output.length +"\n");
		
//Read file and StringTokenizer.
		String line;
		StringBuffer sb =new StringBuffer();
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader("/Users/alexlee/javacode/interview/src/testToken.txt"));
//String Tokenizer
			while( (line =br.readLine()) !=null){
				StringTokenizer sT=new StringTokenizer(line, "|");
				while (sT.hasMoreElements()){
					Integer inTgr=Integer.parseInt(sT.nextElement().toString());
					Double dB=Double.parseDouble(sT.nextElement().toString());
					String str=sT.nextElement().toString();
					System.out.println("\nid: " + inTgr + "; price: " + dB + "; usr: " + str +"\n");
				}
			}
		} catch (FileNotFoundException e) {
			System.out.println(e);
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println(e);
			e.printStackTrace();
		}
//number pyramid
		int len=5;
	     for(int i=1; i <= len; i++){
	         
	         for(int j=len-i; j>0; j--){    // "space" j = 4, 3, 2, 1,
	            System.out.print(" ");
	           }                                 // j=4,3,2,1  i=1;  ____1
	         for(int x=1 ; x <= i  ; x++){
	         	System.out.print(i +" ");        // print number: 1, 2 2, 3 3 3, 4 4 4 4, 5 5 5 5 5
	         }
	        System.out.println("");
	     }
	     System.out.println("\n\n");
//multiple table...	     
	     for(int i=1; i<=10; i++)
	      { for (int j=1; j<=10; j++)
	          {
	    	     if (i ==1){ System.out.print((i*j) + "   ");}
	    	     else{
	    		   System.out.print((i * j) + "  ");
	    	     }
	           }
	        System.out.println();
	       }
	     System.out.println("\n\n");
	}//end main

} //end class
