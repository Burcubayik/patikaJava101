package primeNumberWithRecursive;

import java.util.Scanner;

public class Main {
	static boolean primeNumber() {
		Scanner input= new Scanner(System.in);
		System.out.print("Say� girin: ");
		int number=input.nextInt();
		boolean isPrime=true;
		if(number==0||number==1) {
			System.out.println(number+ " Say�s� Asal De�ildir.");
			
		}else {
			for(int i=2; i<number;i++) {
				if(number%i==0) {
					isPrime=false;
				}
			}
			if(isPrime) {
				System.out.println(number+" Say�s� Asald�r.");
			}
			else {
				System.out.println(number+" Say�s� Asal De�ildir.");
			}
		}
		primeNumber();
		return isPrime;
		
	}

	public static void main(String[] args) {
		primeNumber();
	}

}
