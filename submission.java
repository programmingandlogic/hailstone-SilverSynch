/*
 * File: Hailstone.java
 * --------------------
 * This program is a stub for the Hailstone problem, which computes
 * Hailstone sequence described in Assignment #2.
 */

import acm.program.*;

public class Hailstone extends ConsoleProgram
{

	public void run()
	{
		
		// We first get our number, with a loop not only to continue
		// if it is invalid, but also so the program can be used
		// multiple times.
		while (true)
		{
			
			int number = readInt("Input Number: ");
			
			
			// We check if our number is even and not zero.
			if (Math.signum(number) == 1.0)
			{
				
				//  O/
				// /|
				// / \
				// Hail number! we call our number-evaluating
				// function.
				hail(number);
				
			}
			
			// Otherwise, we throw an error before staring again.
			else
			{
				println("Input a valid number.");
			}
			
		}
			
	}
	
	public void hail(int x)
	{
		
		// To keep count of how many loops we have gone through,
		// We use this.
		int loop_count = 0;
		
		while (true)
		{
			
			// Negative numbers and zero are outside the rules
			// we need to follow, so we make sure
			// we immediately stop to prevent an infinite
			// loop, even though we shouldn't reach this under normal
			// circumstances. However, we should never trust
			// user input.
			if (Math.signum(x) == -1.0 || Math.signum(x) == 0)
			{
				println("Error: Number reached invalid result.");
				break;
			}
			
			// If we reached 1, we are now at our exit case and stop.
			if (x == 1)
			{
				println("The process took " + loop_count + " to reach 1.");
				break;
			}
			
			// If the number is even, we must divide it by half.
			if (x % 2 == 0)
			{
				
				print(x + " is even, so I take half: ");
				
				x = x / 2;
				
				loop_count++;
				
				println(x);
				
			}
			
			// Otherwise, we multiply it by 3 and add 1.
			else
			{
				
				print(x + " is odd, so I make 3n + 1: ");
				
				x = x * 3;
				
				x = x + 1;
				
				loop_count++;
				
				println(x);
				
			}
			
			// The result is the Hailstone sequence.
			
		}
		
	}
	
}
