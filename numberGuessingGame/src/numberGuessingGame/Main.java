package numberGuessingGame;

import java.util.Random;
import java.util.Scanner;

public class Main {
	static boolean isWin(int selected, int randomNumber) {
		if(selected==randomNumber) {
			
			return true;
		}
		return false;
		
	}

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		Random random=new Random();
		int randomNumber= random.nextInt(100);
		System.out.println(randomNumber);
		int selected,remain;
		boolean isWrong=false;
		for(int i=0;i<5;) {
			System.out.print("Tahmininizi giriniz: ");
			selected=input.nextInt();
			if(selected<0||selected>100) {
				if(isWrong) {
					System.out.println("�ok fazla hatal� giri� yapt�n�z! Kalan hak: "+(5-(++i)));
				}
				else {
					isWrong=true;
				System.out.println("L�tfen 0 ile 100 aras�nda bir de�er giriniz!");
				}
				continue;
			}
			if(isWin(selected,randomNumber)) {
				System.out.println("Tahmininiz Do�ru. Tahmin edilen say�: "+ selected);
				break;
			}
			else {
				remain=5-(++i);
				if(remain==0) {
					System.out.println("Kaybettiniz! Say�: "+randomNumber);
				}
				else {
					if(selected<randomNumber) {
						System.out.println("Tahmininiz say�dan k���kt�r!");
					}
					else {
						System.out.println("Tahmininiz say�dan b�y�kt�r!");
					}
					System.out.println("Yanl�� Tahmin! L�tfen tekrar deneyiz. Kalan tahmin hakk�n�z: "+remain);
				}
			}
			
		}

	}

}
