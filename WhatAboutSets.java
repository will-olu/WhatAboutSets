import java.util.Scanner;

public class WhatAboutSets {

//v = value, 
//The attempt here is to creat a limited list set that accepts 3 integer values and provides if the values are unique.
//I do 
			public int countUnique( int v1, int v2, int v3)
			{
				this.v1 = v1;
				this.v2 = v2;
				this.v3 = v3;
				int condition;
				
				if (( v1 == v2) && (v2 == v3) )
					condition = 0;
				else if(( v1 != v3 ) && ( v2 != v3))
					condition = 3;
				else if ((v1 == v2) && (v2 != v3))
					condition = 2;
				else if ((v1 != v2) && (v2 == v3))
					condition = 2;
				else if ((v1 != v3) && (v3 == v2))
					condition = 2;
				else
					condition = System.out.print("I think something wrong happened.");
				
				return condition;
				
		//I do acknowledge that a linked list that also took a remainder operation might have been able to accomplish this more successfully....
		
				
				
			} 
	
		
			public int getlistsIntersect(){
				
				ArrayList<Integer> listOne = new ArrayList<>(Arrays.asList(1, 2));
         
				ArrayList<Integer> listTwo = new ArrayList<>(Arrays.asList(1, 3));
         
				listOne.retainAll(listTwo);
         
				System.out.println(listOne + " are all of the common values from both lists");
				
				boolean retval = Arrays.equals(listOne, listTwo);
					
				
				return System.out.println("listOne and listTwo equal: " + retval);
			} 
			
			
			public static void main(String [] args)
			{
				WhatAboutSets obj = new WhatAboutSets();
				obj.countUnique();
				
				WhatAboutSets list = new WhatAboutSets();
				list.getlistsIntersect();
				
			}
				
}
