package mineSweeper;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("May�n Tarlas� oyununa ho� geldiniz! ");
		System.out.print("Olu�turmak istedi�iniz may�n tarlas�n�n boyutlar�n� giriniz: ");
		System.out.println("Sat�r: ");
		int row=input.nextInt();
		System.out.println("S�tun: ");
		int column=input.nextInt();
		MineSweeper mineSweeper= new MineSweeper(row,column);
		mineSweeper.run();
		

	}

}
