package perfectNumber;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int total=0;
		Scanner input=new Scanner(System.in);
		System.out.print("Say� giriniz: ");
		int number=input.nextInt();
		
		for(int i=1; i<number; i++) {
			if(number%i==0) {
				total+=i;
			}
		}
		if(number==total) System.out.println(number+ " say�s� m�kemmmel say�d�r.");
		
		else System.out.println(number+ " say�s� m�kemmmel say� de�ildir."); 
	}

}
