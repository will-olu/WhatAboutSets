import java.util.Scanner;

public class WhatAboutSets {

//v = value, 
			public countUnique()
			{
				v1 = keyboard.nextInt();
				v2 = keyboard.nextInt();
				v3 = keyboard.nextInt();
					
				if (( v1 = v2) && (v2 = v3) )
					System.out.print("All values are the same. We have no unique values.");
				else if( v1 > v3 ) 
					System.out.print("3 unique values");
				else if ((v1 = v2) && (v2 != v3))
					System.out.print("2 unique values");
				else if ((v1 != v2) && (v2 = v3))
					System.out.print("2 unique values")};
				else if ((v1 != v3) && (v3 = v2))
					System.out.print("2 unique values");
				else
					System.out.print("I think something wrong happened.");
			}
			
			public getlistIntersect(){
				
				ArrayList<Integer> listOne = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
         
				ArrayList<Integer> listTwo = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 6));
         
				listOne.retainAll(listTwo);
         
				System.out.println(listOne + " are all of the common values from both lists");
				
				boolean retval = Arrays.equals(listOne, listTwo);
					System.out.println("listOne and listTwo equal: " + retval);
			}
			
			
			public static void main(String [] args)
			{
				WhatAboutSets obj = new WhatAboutSets();
				obj.countUnique();
				obj.listIntersect();
				
			}
				
}