package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class CloseNumbers {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		int[] list= {15,12,788,1,-1,-778,2,0};
		System.out.print("Say� giriniz: ");
		int number=input.nextInt();
		int min,max;
		System.out.println("Dizi: "+Arrays.toString(list));
		
		Arrays.sort(list);
		
			
		if(number<list[0]&& number>list[list.length-1]) {
			System.out.println("Girmi� oldu�unuz say� liste aral���nda de�ildir. L�tfen "+ list[0]+ " ve "+ list[list.length-1]
					+" aral���nda bir de�er giriniz!");
		}
		else {
			min=list[0];
			max=list[list.length-1];
			
			for(int i: list) {
				if(i<number) {
					min=i;
				}
			
			}
			for(int i= list.length-1; i>=0;i--) {
				if(list[i]>number) {
				max=list[i];
				}
			}
			System.out.println("Girilen Say� : "+ number);
			System.out.println("Girilen say�dan k���k en yak�n say� : "+ min);
			System.out.println("Girilen say�dan b�y�k en yak�n say� : "+max);
		}
			
		

	}

}
