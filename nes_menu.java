import java.util.Scanner;
class nes_menu
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int m,n;
		System.out.println("Nested Menu :- ");
		System.out.println("\n 1.Arithmetic operations\n2.Logical operations\n3.Relation operations\n4.Finding area");
		System.out.println("Enter your choice : ");
		m=s.nextInt();
		switch(m)
		{
			case 1:
			System.out.println("Arithmetic operations :- ");
			System.out.println("\n1.Addition \n2. Substraction \n3. Multiplication \n4. Division");
		    System.out.println("Enter your choice : ");
		    n=s.nextInt();
		    switch(n)
		    {
				case 1:
			    {
					int a,b,c;
				    System.out.println("Enter two numbers : ");
				    a=s.nextInt();
				    b=s.nextInt();
				    c=a+b;
				    System.out.println("Sum = "+c);
				    break;
			    }
			    case 2:
			    {
				    int x,y,z;
				    System.out.println("Enter two numbers : ");
				    x=s.nextInt();
				    y=s.nextInt();
				    z=x-y;
				    System.out.println("Difference = "+z);
				    break;
			    }
			    case 3:
			    {
				    int r,t,o;
				    System.out.println("Enter two numbers : ");
				    r=s.nextInt();
				    t=s.nextInt();
				    o=r*t;
				    System.out.println("Product = "+o);
				    break;
			    }
			    case 4:
			    {
				    int p,q,r;
				    System.out.println("Enter two numbers : ");
				    p=s.nextInt();
				    q=s.nextInt();
				    r=p/q;
				    System.out.println("Division = "+r);
				    break;
			    }
			    default:
			    System.out.println("Wrong choice.");
		    }
			break;
			case 2:
			{
				System.out.println("Logical calculater :- ");
		        System.out.println("\n1.Greatest among 3 numbers \n2. Character check \n3. speed check");
		        System.out.println("Enter your choice : ");
		        n=s.nextInt();
		        switch(n)
		        {
					case 1:
			        {
						int a,b,c;
						System.out.println("Enter Three Numbers : ");
						a=s.nextInt();
						b=s.nextInt();
						c=s.nextInt();
						if(a>b && a>c)
							System.out.println(a+" is greatest.");
						else if(b>a && b>c)
							System.out.println(b+" is greatest.");
						else
							System.out.println(c+" is greatest.");
					}
					break;
			        case 2:
			        {
						char c;
		                System.out.println("Enter character : ");
		                c=s.next().charAt(0);
		                if(c>='A'&&c<='Z')
			            System.out.println("Upper case character.");
		                else if(c>='a'&&c<='z')
							System.out.println("Lower case character.");
		                else if(c>='0'&&c<='9')
			                System.out.println("Digits.");
		                else
			                System.out.println("Special Character.");
			        }
					break;
			        case 3:
			        {
						int sp;
		                System.out.println("Enter the speed : ");
		                sp=s.nextInt();
		                if(sp<=20)
							System.out.println("Low speed");
		                else if(sp>20 && sp<=40)
			                System.out.println("Normal speed.");
		                else if(sp>40 && sp<=70)
			                System.out.println("High speed.");
		                else
			                System.out.println("Dangerous speed.");
					}
					break;
			        default:
			        System.out.println("Wrong choice.");
		        }
			}
			break;
			case 3:
			{
				System.out.println("Logical operations :- ");
			    System.out.println("\n1.Even odd check \n2.positive negative check \n3.leap year check");
		        System.out.println("Enter your choice : ");
		        n=s.nextInt();
				switch(n)
				{
					case 1:
					{
						int a;
						System.out.println("Enter the number : ");
						a=s.nextInt();
						if(a%2==0)
							System.out.println("Even.");
						else
							System.out.println("Odd.");
					}
					break;
					case 2:
					{
						int b;
						System.out.println("Enter the number : ");
						b=s.nextInt();
						if(b>0)
							System.out.println("Positive.");
						else
							System.out.println("Negative.");
					}
					break;
					case 3:
					{
						int y;
		                System.out.println("Enter the year : ");
		                y=s.nextInt();
		                if((y%4==0)||(y%100==0)||(y%400==0))
							System.out.println("Leap year.");
		                else
			                System.out.println("Not a leap year.");
					}
					break;
					default:
					System.out.println("Wrong choice.");
				}
			}
			case 4:
			{
				System.out.println("Area checking :- ");
			    System.out.println("\n1.Circle \n2.Square \n3.Rectangle");
		        System.out.println("Enter your choice : ");
		        n=s.nextInt();
				switch(n)
				{
					case 1:
					{
						double r,ar;
						System.out.println("Enter the radius : ");
						r=s.nextDouble();
						ar=Math.PI*r*r;
						System.out.println("Area of circle = "+ar);
					}
					break;
					case 2:
					{
						int side,ar;
						System.out.println("Enter the side : ");
						side = s.nextInt();
						ar=side*side;
						System.out.println("Area of square = "+ar);
					}
					break;
					case 3:
					{
						int l,b,ar;
						System.out.println("Enter the length and breadth : ");
						l=s.nextInt();
						b=s.nextInt();
						ar=l*b;
						System.out.println("Area of rectangle = "+ar);
					}
					break;
					default:
					System.out.println("Wrong choice.");
				}
			}
			break;
			default:
			System.out.println("Wrong choice.");
		}
	}
}