package findMaxMin;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int max=0, min=0;
		Scanner input=new Scanner(System.in);
		int n,number;
		System.out.print("Ka� say� gireceksiniz? ");
		n=input.nextInt();
		
		for(int i=1; i<=n;i++) {
			System.out.print(i+ ". Say�y� giriniz: ");
			number=input.nextInt();
			if(i==1) {
				max=number;
				min=number;
			}
	
			if(max<number) max=number;
			if(min>number) min=number;
		}
		 System.out.println("En b�y�k say�: "+ max);
		 System.out.println("En k���k say�: "+min);

	}

}
