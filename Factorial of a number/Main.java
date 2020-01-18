import java.util.Scanner;
class Main{
	public static void main (String[] args){
        // Set the n value
      Scanner in = new Scanner(System.in);
      int num = in.nextInt();
      int fact = 1;
      // Multiplication of all numbers from 1 to given  numbers
     for(int count = 1; count <= num; count++)
     {
       fact = fact * count ;
     }
      System.out.print(fact);
	}
}