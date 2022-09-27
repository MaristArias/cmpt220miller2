import java.util.Scanner;
class Test{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the friction force in Newtons: ");
		double F=sc.nextDouble();
		System.out.print("Enter the object's mass in kg: ");
		double m=sc.nextDouble();
		System.out.print("Enter the object's acceleration in m/s^2: ");
		double a=sc.nextDouble();
		double g=9.8;
		//compute the coefficient of friction
		double u =(F-m*a)/(m*g);
		System.out.printf("The coefficient of friction is %.6f",u);
    }
}