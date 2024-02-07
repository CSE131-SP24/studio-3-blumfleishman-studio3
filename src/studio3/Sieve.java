package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in); 
		System.out.println("Enter the highest number");
		int n = in.nextInt();
		
		boolean [] isNotPrime = new boolean[n+1];

		
		for (int i=2; i < Math.sqrt(n) ; i++)
		{
			
			if (isNotPrime[i] == false)
			{
				
				for (int j= i*2; j < isNotPrime.length; j+=i)
				{
					isNotPrime[j] = true; 
					
				}
				
			}
			
		}
		
		for (int i = 0; i<isNotPrime.length; i++)
		{
			System.out.println(i + " is not prime " + isNotPrime[i] + " ");
		}
		
		
		
		
	}

}
