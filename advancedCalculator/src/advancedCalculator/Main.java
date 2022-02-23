package advancedCalculator;

import java.util.Scanner;

public class Main {
	static void plus() {
		Scanner input=new Scanner(System.in);
		int number, result = 0, i = 1;
		System.out.println("Sonucu g�rmek istedi�inizde say� de�erine 0 girin!");
        while (true) {
            System.out.print(i++ + ". say� :");
            number = input.nextInt();
            if (number == 0) {
                break;
            }
            result += number;
        }
        System.out.println("Sonu� : " + result);
	}
	static void  minus() {
		Scanner input=new Scanner(System.in);
		System.out.println("Sonucu g�rmek istedi�inizde say� de�erine 0 girin!");
		System.out.print("1. Say�: ");
		int number=input.nextInt();
		int i=2, result=number;
		while(true) {
			System.out.print(i++ +". Say�: ");
			number=input.nextInt();
			if(number==0) {
				break;
			}
			
			result-=number;
			
		}
		System.out.println("Sonu� : " + result);
		
	}
	static void times() {
		Scanner input=new Scanner(System.in);
		int number, result = 1, i = 1;
		System.out.println("Sonucu g�rmek istedi�inizde say� de�erine 1 girin! ");
		while(true) {
			System.out.print(i++ +". Say�: ");
			number=input.nextInt();
			if(number==1) {
				break;
			}
			if(number==0) {
				result=0;
				break;
			}
			result*=number;
		}
		System.out.println("Sonu� : " +result);
	}
	static void divided() {
		Scanner input=new Scanner(System.in);
		System.out.println("Sonucu g�rmek istedi�inizde say� de�erine 1 girin! ");
		System.out.print("1. Say�");
		double number=input.nextDouble();
		double result=number;
		int i = 2;
		
		while(true) {
			System.out.print(i++ +". Say�: ");
			number=input.nextDouble();
			if(number==1) {
				break;
			}
			if(number==0) {
				System.out.println("B�len 0 olamaz ");
				continue;
			}
			result/=number;
		}
		System.out.println(result);
	}
	static void power() {
		Scanner input=new Scanner(System.in);
		System.out.print("Taban de�erini giriniz: ");
		int base=input.nextInt();
		System.out.print("�s de�erini giriniz: ");
		int exponent=input.nextInt();
		int result=1;
		for(int i=1; i<=exponent;i++) {
			result*=base;
		}
		System.out.println("Sonu� : " +result);
		
	}
	
	static void factorial() {
		Scanner input= new Scanner(System.in);
		System.out.print("Fakt�riyeli al�nacak say�y� girin: ");
		int number=input.nextInt();
		int  result=1;
		for(int i=1; i<=number;i++)
		{
			result*=i;
		}
		System.out.println("Sonu� : " +result);
	}
	static void mode() {
		Scanner input= new Scanner(System.in);
		int result=0;
		System.out.print("Modu al�nacak say�y� girin: ");
		int number= input.nextInt();
		
		System.out.print("Modu girin: ");
		int mode=input.nextInt();
		result=number%mode;
		System.out.println("Sonu� : " +result);
	}
	static void rectangle() {
		int perimeter=0,area=0;
		
		Scanner input= new Scanner(System.in);
		System.out.print("Uzun kenar� girin: ");
		int longEdge= input.nextInt();
		System.out.print("K�sa kenar� girin: ");
		int shortEdge= input.nextInt();
		
		perimeter=(2*(longEdge+shortEdge));
		area= longEdge*shortEdge;
		
		System.out.println("�evre: "+perimeter);
		System.out.println("Alan: "+area); 
		
		
	}

	public static void main(String[] args) {
		int select;
		Scanner input=new Scanner(System.in);
		
		String menu="1- Toplama ��lemi\n"
				+ "2- ��karma ��lemi\n"
				+ "3- �arpma ��lemi\n"
				+ "4- B�lme i�lemi\n"
				+ "5- �sl� Say� Hesaplama\n"
				+ "6- Faktoriyel Hesaplama\n"
				+ "7- Mod Alma\n"
				+ "8- Dikd�rtgen Alan ve �evre Hesab�\n"
				+ "0- ��k��";
		System.out.println(menu);
		do {
			System.out.print("Yapmak istedi�iniz i�lemi se�in: ");
			select=input.nextInt();
			
			switch(select) {
				case 1:
					plus();
					break;
				case 2:
					minus();
					break;
				case 3:
					times();
					break;
				case 4:
					divided();
					break;
				case 5:
					power();
					break;
				case 6:
					factorial();
					break;
				case 7:
					mode();
					break;
				case 8:
					rectangle();
					break;
				case 0:
					break;
				
				
			}
			
		}
		while(select!=0);
			
		
		

	}

}
