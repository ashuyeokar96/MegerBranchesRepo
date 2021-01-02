package array;

public class Arrayone {
	public static void main(String[] args) {
		
		//there are four arrays having five integer in each.
		int a[][]=new int[4][5];
		a[0][0]=12345;
		System.out.println("First elemnet is "+a[0][0]);
		
		
		int elements [] = {1, 2, 3, 4, 5, 6};
		   // new larger array
		            int hold [] = {10,9,8,7,6,5,4,3,2,1};
		   // copy all members of, the elements array, to
		   //hold array, starting with the 0th  index
		    System.arraycopy(elements,0,hold,0,elements.length);
		   for(int i=0;i<hold.length;i++)
		   {
		    System.out.println(hold[i]);
		   }
		
		   DataInputStream d=new DataInputStream(System.in);
		   char[] copyFrom = { 'm', 'y', 'd', 'r', 'e', 'a', 'm','s', 'c', 'o', 'm', 'e'};
			char[] copyTo = new char[7];
			 
			System.arraycopy(copyFrom, 2, copyTo, 0, 6);
			System.out.println(new String(copyTo));
	}

}
