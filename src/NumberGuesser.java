
import java.util.Scanner;

public class NumberGuesser {
	//three main variables used by method NumGuess to calculate the next guess
	static int startNum = 50;
	static int highNum =100;
	static int lowNum = 0;
	//method called after every response
	public static int NumGuess(int numIn) 
	{
		int num = numIn;
		//input
		Scanner in = new Scanner(System.in);
		System.out.println("Is your number greater than "+num+"? ");
		String tempStr = in.nextLine();
		
		//keep track of the sum highest and lowest value and divide by two to calculate the middle
		if(tempStr.equals("yes"))
			{
				if(highNum-lowNum == 2 || highNum-lowNum == 1)
					{
					num++;
					System.out.println("Is your number " +num+ "?");
					Scanner ree = new Scanner(System.in);
					if(ree.nextLine().equals("yes"))
					{
						System.out.println("Thank you for playing!");
						ree.close();
						return 0;
					}
					else
					{
						System.out.println("please try again");
						ree.close();
						return 0;
					}
			}
			lowNum = num;
			startNum = (highNum+lowNum)/2;
			return NumGuess(startNum);
			}
		else if(tempStr.equals("no"));
			{
				if(highNum-lowNum == 2 || highNum-lowNum == 1)
					{
					System.out.println("Is your number " +num+ "?");
					Scanner ree = new Scanner(System.in);
					if(ree.nextLine().equals("yes"))
					{
						System.out.println("Thank you for playing!");
						ree.close();
						return 0;
					}
					else
					{
						System.out.println("please try again");
						ree.close();
						return 0;
					}
			}
			highNum = num;
			startNum = (highNum+lowNum)/2;
			return NumGuess(startNum);
			}
	}
	//starting point
	public static void main(String[] args)
	{
		System.out.println("Hi I'm Raymond the Robot!\nLet me guess your number between 1 and 100.\nPlease answer yes or no to the following questions! :)\n");
		NumGuess(50);
	}
}
