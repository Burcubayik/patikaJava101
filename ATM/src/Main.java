import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		String userName, password;
		int right=3, select, balance=1500, price;
	
		
		while(right>0) {
			System.out.print("Kullan�c� ad�n�z: ");
			userName=input.nextLine();
			
			System.out.print("�ifreniz: ");
			password=input.nextLine();
			
			if(userName.equals("patika")&& password.equals("java101")) {
				System.out.println("Giri� Ba�ar�l� \nHo�geldiniz.");
				do {
				System.out.println("1-Para yat�rma"
						+ "\n2-Para �ekme "
						+ "\n3-Bakiye Sorgulama "
						+ "\n4-��k��");
				System.out.print("L�tfen yapmak istedi�iniz i�lemi se�iniz: ");
				select=input.nextInt();
				switch(select) {
					case 1:
						System.out.print("Yat�rmak istedi�iniz tutar: ");
						price=input.nextInt();
						balance+=price;
						break;
					case 2:
						System.out.print("�ekmek istedi�iniz tutar: ");
						price=input.nextInt();
						
						if(balance>=price)balance-=price;
						else System.out.println("Bakiyeniz yetersiz.");
						
						break;
					case 3:
						System.out.println("Bakiyeniz:  "+ balance);
						
						break;
				}
			
				}while(select!=4);
				System.out.println("Bizi tercih etti�iniz i�in te�ekk�r ederiz.");
				break;
			}
			else {
				
				right--;
				if(right==0) {
					System.out.println("Hesab�n�z bloke oldu. Banka ile ileti�ime ge�iniz.");
			}
				else System.out.println("Hatal� giri� yapt�n�z l�tfen tekrar deneyiniz. \nKalan Hak: "+ right);
				
			}
				
			
		}

	}

}
