import java.util.Scanner;

public class GPA {

	public static void main(String[] args) {
		//Number of classes
		int a = 1;
		double b = .5;
		int c;
		int d;
		
		String newLine = System.getProperty("line.separator");

		Scanner in = new Scanner(System.in);
		
		//1 credit(s)
		System.out.print("Number of full year classes: ");
		c = in.nextInt();
		
		//0.5 credit(s)
		System.out.print("Number of half year classes: ");
		d = in.nextInt();
		System.out.print(newLine);
		
		
		//Ouputs the number of credits earned
		System.out.print((a * c) + (b * d));
		
		System.out.print(newLine);
		System.out.print(newLine);
		
		//Grades in these classes
		int e;
		int f;
		int g;
		int h;
		int i;
		int j;
		int k;
		
		//weighted
		double l;

		//Half year classes
		System.out.print("Half Year Class 1 Grade: ");
		e = in.nextInt();
		
		System.out.print("Half Year Class 2 Grade: ");
		f = in.nextInt();
		
		//Full year classes
		System.out.print("Full Year Class 1 Grade: ");
		g = in.nextInt();
		
		System.out.print("Full Year Class 2 Grade: ");
		h = in.nextInt();
		
		System.out.print("Full Year Class 3 Grade: ");
		i = in.nextInt();
		
		System.out.print("Full Year Class 4 Grade: ");
		j = in.nextInt();
		
		System.out.print("Full Year Class 5 Grade: ");
		k = in.nextInt();
		
		System.out.print(newLine);
		System.out.print(newLine);
		
		//Outputs total of Half Year Classes
		System.out.print("Half Year Class 1: " + e * 0.5);
		System.out.print(newLine);
		System.out.print("Half Year Class 2: " + f * 0.5);
		System.out.print(newLine);
		
		//Outputs total of Full Year Classes
		System.out.print("Full Year Classes: " + ((g * 1) + (h * 1) + (i * 1) + (j * 1) + (k * 1)));
		System.out.print(newLine);
		
		//Outputs HY + FY
		System.out.print("All Together: " + (((f * 0.5) + (e * 0.5)) + ((g * 1) + (h * 1) + (i * 1) + (j * 1) + (k * 1))));
		System.out.print(newLine);
		
		//Outputs HY + FY Turned into generic numeric values
		System.out.print("0.0-4.0 Range All Together: " + (((f * 0.5) + (e * 0.5)) + ((g * 1) + (h * 1) + (i * 1) + (j * 1) + (k * 1))) / 25);
		System.out.print(newLine);
		System.out.print(newLine);
		
		//Outputs Un-Weighted GPA
		System.out.print("Un-Weighted GPA: " + (((f * 0.5) + (e * 0.5)) + ((g * 1) + (h * 1) + (i * 1) + (j * 1) + (k * 1))) / 25 / (c + d));
		
		System.out.print(newLine);
		System.out.print(newLine);
		
		System.out.print("Are there any ");
		System.out.print(newLine);
		System.out.print("CP/AP/IB/Honors classes?");
		System.out.print(newLine);
		System.out.print("If so, how many? If none, type '0': ");
		l = in.nextDouble();
		
		if (l == 0){
			System.out.print(newLine);
			System.out.print("Un-Weighted GPA: " + (((f * 0.5) + (e * 0.5)) + ((g * 1) + (h * 1) + (i * 1) + (j * 1) + (k * 1))) / 25 / (c + d));
			

		}
		else
		{
			if (l == 1){
				System.out.print(newLine);
				System.out.print("Weighted GPA (1): " + (10.5 + ((f * 0.5) + (e * 0.5)) + ((g * 1) + (h * 1) + (i * 1) + (j * 1) + (k * 1))) / 25 / (c + d));
			}
			else
			{
				if (l == 2){
					System.out.print(newLine);
					System.out.print("Weighted GPA (2): " + (18.5 + ((f * 0.5) + (e * 0.5)) + ((g * 1) + (h * 1) + (i * 1) + (j * 1) + (k * 1))) / 25 / (c + d));
				}
				else
				{
					if (l == 3){
						System.out.print(newLine);
						System.out.print("Weighted GPA (3): " + (26.5 + ((f * 0.5) + (e * 0.5)) + ((g * 1) + (h * 1) + (i * 1) + (j * 1) + (k * 1))) / 25 / (c + d));
					}
					else
					{
						if (l == 4){
							System.out.print(newLine);
							System.out.print("Weighted GPA (4): " + (34.5 + ((f * 0.5) + (e * 0.5)) + ((g * 1) + (h * 1) + (i * 1) + (j * 1) + (k * 1))) / 25 / (c + d));
						}
						else
						{
							if (l == 5){
								System.out.print(newLine);
								System.out.print("Weighted GPA (5): " + (42.5 + ((f * 0.5) + (e * 0.5)) + ((g * 1) + (h * 1) + (i * 1) + (j * 1) + (k * 1))) / 25 / (c + d));
							}
							else
							{
								if (l == 6){
									System.out.print(newLine);
									System.out.print("Weighted GPA (6): " + (50.5 + ((f * 0.5) + (e * 0.5)) + ((g * 1) + (h * 1) + (i * 1) + (j * 1) + (k * 1))) / 25 / (c + d));
								}
								else
								{
									if (l == 7){
										System.out.print(newLine);
										System.out.print("Weighted GPA (7): " + (54.5 + ((f * 0.5) + (e * 0.5)) + ((g * 1) + (h * 1) + (i * 1) + (j * 1) + (k * 1))) / 25 / (c + d));
									}
		
								
								}
							}
						}
					}
				}
			}
		}
	}
}
