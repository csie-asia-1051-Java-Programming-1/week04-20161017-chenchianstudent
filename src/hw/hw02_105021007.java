package hw;
import java.util.Scanner;
//�ϥΪ̿�J����� n �P m �M��p��

public class hw02_105021007 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.print("�п�Jn");
		int n=scn.nextInt();
		System.out.print("�п�Jm");
		int m=scn.nextInt();
		
		int a=1;
		for(int i=1;i<=n;i++){a*=i;}
		int ax=a;
		
		int b=1;
		for(int f=1;f<=m;f++){b*=f;}
		int bx=b;
		
		int c=n-m;
		int c1=1;
		for(int g=1;g<=c;g++){c1*=g;}
		int cx=c1;
		
		float ans=ax/(bx*cx);
		System.out.print(ans);

	}

}
