public class SwitchChallenge1
	{

		public static void main(String[] args)
			{
				int randomNumber = (int)(Math.random()*20) + 1;
				System.out.println(randomNumber);
				switch(randomNumber)
				{
					case 1:
					case 2:
					case 4:		
					case 5: 
					case 10:
					case 20:
					case 8:
					case 16:
					
							{
								System.out.println("you lose");
								break;
							}
					case 3:	
					case 7:
					case 9:
					case 11:
					case 13:
					case 15:
					case 17:
					case 19:
							{
								System.out.println("you tie");
								break;
							}
					case 6:
					case 12:
					case 14:
					case 18:
							{
								System.out.println("you win");
								break;
							}
					
				}
							

			}

	}
