package exponentCalculationWithRecursiveMethod;

import java.util.Scanner;

public class Main {
	static int power() {
		int base;
		int exp;
		int result=1; 
		Scanner input=new Scanner(System.in);
		System.out.print("Taban de�eri giriniz :");
		base=input.nextInt();
		System.out.print("�s de�erini giriniz :");
		exp=input.nextInt();
		for(int i=1; i<= exp;i++) {
			result*=base;
		}
		System.out.println("Sonu�: "+result);
		power();
		return result;
		
		
	}

	public static void main(String[] args) {
		power();
		

	}

}
