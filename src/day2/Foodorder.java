package day2;
import java.util.Scanner;
public class Foodorder {
	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		System.out.println("Food Menu");
		System.out.println("1. Pizza");
		System.out.println("2. Pasta");
		System.out.println("3. Burger");
		System.out.println("4. Chowmein");
		System.out.println("5. Sandwich");
		
		System.out.print("Enter your choice:");
		int choice= Sc.nextInt();
		
		switch(choice) {
		 case 1:
             System.out.println("You selected Pizza");
             break;
         case 2:
             System.out.println("You selected Pasta ");
             break;
         case 3:
        	 System.out.println("You selected Burger ");
        	 break;
         case 4:
        	 System.out.println("You selected Chowmein ");
        	 break;
         case 5:
        	 System.out.println("You selected Sandwich ");
        	 break;
         default:
             System.out.println("Invalid choice. Please try again."); 
		}
		Sc.close();
	}
}
