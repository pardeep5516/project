import java.util.*;
class Pract6
{
	public static void main(String args[])
	{
	    int c = fact();
		System.out.println("Factorial is " + c);					
	
}	
	static int fact(){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n == 0){
		return n;
	}   
	else{
	      return n * n - 1;       
	}
	


}
}