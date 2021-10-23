package comboLockProj;

import java.util.Scanner;

public class ComboLockDemo 
{

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		
		boolean open = false;
		ComboLock lock = new ComboLock(30, 20, 10);
		
		while (open == false)
		{
			System.out.println("Enter the number of ticks to turn to the right 0-39. Enter an invalid number to quit.");
			int num1 = in.nextInt();
			
			if (num1 > 39 || num1 < 0)
			{
				break;	
			}
			else
			{
				lock.tickRight(num1);
			}

			System.out.println("Enter the number of ticks to turn to the left 0 - 39. Enter an invalid number to quit.");
			int num2 = in.nextInt();
			
			if (num2 > 39 || num2 < 0)
			{
				break;
			}
			else
			{
				lock.tickLeft(num2);
			}
			
			System.out.println("Enter the number of ticks to turn to the right 0 - 39. Enter an invalid number to quit.");
			int num3 = in.nextInt();
			
			if (num3 > 39 || num3 < 0)
			{
				break;
			}
			else
			{
				lock.tickRight(num3);
			}
			
			open = lock.canOpen();
			if (open == true)
			{
				System.out.println("You opened the lock!");	
			}
			else
			{
				System.out.println("You did not open the lock!");
				lock.reset();
			}
		}
	}
}