package one;

import java.util.Scanner;

//If you want to test any of these un comment them out and test them, they all work though

public class One {

	public static void main(String[] args) {
		//one

		 	Scanner s = new Scanner(System.in);
		//	System.out.println("Input a book num");
	//		int num = Integer.parseInt(s.nextLine());
//			
//			System.out.println("Input a book name");
//			String name = s.nextLine();
//			
//			System.out.println("Input a book author");
//			String auth = s.nextLine();
//			
//			System.out.println("Input a book price");
//			double price = s.nextDouble();
//			System.out.println("Input num of sold copies");
//			int copies = s.nextInt();
//			System.out.println("num: " + num + "\nname: " + name + "\nauthor: " + auth + "\nprice: " + price + "\nsold copies: " + copies);

		//two
//		int val = 11;
//		int rem = val % 4;
//		int quote = val / 4;
//		System.out.println(rem + " : " + quote);
		//three
//		int a,b,temp;
//		a = 1;
//		b = 2;
//		temp = a;
//		a = b;
//		b = temp;
//		System.out.println(a + " : " + b);
//		
//		//four
//		a = a + b;
//		b = a - b;
//		a = a - b;
//		System.out.println(a + " : " + b);
		
		//five
		/*
		   Scanner s = new Scanner(System.in);
			System.out.println("Input a character");
			String str = s.next();
			
			if(str == "a" || str ==  "e" || str == "i" || str == "o" || str == "u"){
			System.out.println("It's a vowel");
			}else{
			System.out.println("It's a consonant or a value that wasn't recognized");
			}
		 */
		
		
		//six
		 /*
			 * Scanner s = new Scanner(System.in);
			System.out.println("Input a character");
			String str = s.next();
			
			switch(str) {
			case "a":
			case "e":
			case "i":
			case "o":
			case "u":
				System.out.println("It's a vowel");
				break;
			default:
				System.out.println("It's a consonant or a value that wasn't recognized");
				break;
			} 
			*/
		//seven
//		int year;
//	      System.out.println("Enter an Year :: ");
//	      year = s.nextInt();
//
//	      if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0))
//	         System.out.println("Specified year is a leap year");
//	      else
//	         System.out.println("Specified year is not a leap year");
	      
		//8
//		int k = 2;
//		if( k > 0) {
//			System.out.println("yep that's positive");
//		}else if(k<0) {
//			System.out.println("whoops that's negative");
//		}else {
//			System.out.println("oh hey you found 0");
//		}
		
		//9
//		int low, high;
//		System.out.println("input lower value to check");
//		low = s.nextInt();
//		System.out.println("input higher value to check");
//		high = s.nextInt();
//        while (low < high) {
//            if(checkPrimeNumber(low))
//                System.out.print(low + " ");
//            ++low;
//        }
    
		
		//10
//		int recusive = recmult(5, 3);
//		System.out.println(recusive);
		
		//11
//	    String str;
//	    int vowel=0,cons=0,numbers=0,spaces=0;
//	     Scanner scan=new Scanner(System.in); 
//	        
//	    System.out.println("Enter the String  ");
//	    str=scan.nextLine();
//	    for(int i=0; i<=str.length()-1; i++){
//	    char ch=str.charAt(i);
//	    if(ch == 'a'|| ch == 'e'|| ch == 'i'|| ch == 'o'|| ch == 'u' 
//	        ||ch == 'A'|| ch == 'E'|| ch == 'I'|| ch == 'O'|| ch == 'U' ){
//	            vowel++;
//	        }
//	        else if((ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z' )){  
//	            cons++;
//	        }
//	        else if(ch>='0' && ch<='9') {
//	            numbers++;
//	        }
//	        else if(ch==' '){ // check spaces
//	            spaces++;
//	        }
//	    }
//	    System.out.println("\nVowels: " + vowel + "\nConsonants: " + cons + "\nDigits: " +numbers + "\nSpaces: " + spaces);

//12
//		Car ford = new Car("ford", 10.0);
//		System.out.println(ford.name);
		
			//13
//		Car ram = new Car("ram", 15.0);
//			
//		System.out.println("The most expensive car is the: " + Car.highestPriceCar(ram, ford).getName() + "\nWith a price of: " +Car.highestPriceCar(ram, ford).getPrice());
		
			// 14
//			int sum=0;
//			for(int i=1; i<=10; i++) {
//				if(i%2 == 0) {
//					sum+=i;
//				}
//			}
//			System.out.println("The sum of even numbers between 1 and 10 is: " + sum);
			
			s.close();
	}

	
	//ten func
	public static int recmult(int a,int b) {
		if(b != 0) {
			return (a * recmult(a, b-1));
		}else {
			return 1;
		}
		
	}
	
	 public static boolean checkPrimeNumber(int num) {
	        boolean flag = true;

	        for(int i = 2; i <= num/2; ++i) {
	            if(num % i == 0) {
	                flag = false;
	                break;
	            }
	        }
	        return flag;
	    }
	
}
