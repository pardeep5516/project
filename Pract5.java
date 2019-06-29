import java.util.*;
class Pract5
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int a[] = new int[5];
		int sum = 0;
		for(int i = 0; i <= 4; i++){
			a[i] = sc.nextInt();
			sum += a[i];
			//sum = sum + a[1];
		}
		System.out.println("Addition is: " + sum);		
	}

}