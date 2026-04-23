package day2loop;
import java.util.Scanner;
public class Evengenerator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number:");
		int n= sc.nextInt();
		while(n>=1) {
			if(n%2==0)
				System.out.println(n);
			n--;
		}
		sc.close();
	}
}
