
public class AssembleLine
	{

		public static void main(String[] args)
			{
				returnfeet();
				changetoinches();
				inchestocentimeters();
				centimeterstometers();
				meterstofeet();
				feettoinches();
				public static double returnfeet ()
					{
						Sacnner userInput = new Scanner (System.in);
						System.out.println("please enter your height in feet");
						return userInput.nextDouble();
					}
					
					Public static double changetoinches(double x)
					{
						return x * 12
					}
					
					public static double inchestocentimeters (double x)
					{
						return x / 2.54
					}
					
					public static double centimeterstometers (double x)
					{
						return x * 0.01
					}
					
					public static double meterstofeet (double x )
					{
						return x * 3.28084
					}
					
					public static double feettoinches (double x)
					{
						return x / 12
					}
			}
		
	}
