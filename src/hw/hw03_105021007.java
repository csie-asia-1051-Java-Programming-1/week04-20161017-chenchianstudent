package hw;
import java.util.Scanner;
//�{���ӵ{�����ϥΪ̳s���J��� (���ơB�t�Ƥιs)�A����ϥΪ̿�J 999 �ɰ���A�M����ܥ��Ʀ��h�֭ӡA0 ���X�ӡA�t���`�@���X�ӡA�ϥΪ̥i�H���а��檽��ϥΪ̿�Jn


public class hw03_105021007 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scn=new Scanner(System.in);
int x=0;
int y=0;
int z=0;
while(true){
	System.out.print("�п�J���");
	int n1=scn.nextInt();
	if(n1==999){
		System.out.print("���¨ϥ�");break;}
	else{
		if(n1>0){x++;}
	else{if(n1==0){y++;}
	else{if(n1<0){z++;}}
	
}	
		System.out.println("x="+x);
		System.out.println("y="+y);
		System.out.println("z="+z);

		System.out.println("�O�_�٭n�~��(y/n)");
		char d=scn.next().charAt(0);
		if(d=='n'||d=='N'){System.out.print("���¨ϥ�");break;}
}
}
}

}
