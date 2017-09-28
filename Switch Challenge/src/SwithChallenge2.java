import java.util.Scanner;

public class SwithChallenge2
	{

		public static void main(String[] args)
			{
				Scanner Answer = new Scanner(System.in);
				System.out.println("Please ask a right or wrong question.");
				String answer = Answer.nextLine();
				
				int randomNumber = (int)(Math.random()*4) + 1;
				switch(randomNumber)
				{
					case 1:
							{
								System.out.println("Yes");
								break;
							}
					case 2:
							{
								System.out.println("No");
								break;
							}
					case 3:
							{
								System.out.println("maybe");
								break;
							}
					case 4: 
							{
								System.out.println("I don't know");
								break;
							}
				}
				

			}

	}
