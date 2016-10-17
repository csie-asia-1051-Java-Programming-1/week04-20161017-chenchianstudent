package hw;
import java.util.Scanner;
//使用者輸入 n 產生 n 個 費氏數列 (例 n = 5 ) 1, 1, 2, 3, 5



public class hw01_105021007 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int v1=scn.nextInt();
		int v2=0;
		int v3=0;
		
		
		for(int i=0;i<10;i++){
			v3=v2+v1;
			v1=v2;
			v2=v3;
			
			System.out.print(v3);
			
			}
		
	}

}
