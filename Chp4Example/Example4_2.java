//�ȵ�������
import java.util.*;
public class Example4_2{
	public static void main(String args[]){	
		Scanner reader=new Scanner(System.in);
		int x,y;
		x=reader.nextInt();
		y=reader.nextInt();
		WaitE p1=new WaitE(x,y);
		p1.WTime();
		WaitE.ePoint=x;
		p1.RTime();
		WaitE.ePoint=y;
		x=reader.nextInt();
		y=reader.nextInt();
		WaitE p2=new WaitE(x,y);
		p2.WTime();
		WaitE.ePoint=x;
		p2.RTime();
		WaitE.ePoint=y;
	}
}	
class WaitE {
	static int ePoint=0; 
    final int speed=10;
    int sPoint;
    int dPoint;	
    public int getEPoint(){	return ePoint;}
    public int getSpeed(){return speed;}
    WaitE(int s,int d){
    	sPoint=s;
    	dPoint=d;}
   	public void  WTime(){
   		if(sPoint==ePoint) System.out.println("����Ҫ�ȴ�");
   		else System.out.println("��Ҫ�ȴ�"+Math.abs(ePoint-sPoint)*speed+"��");}
	public void RTime(){
		if(dPoint==ePoint) System.out.println("����ͬһ��!");
		else System.out.println("����Ŀ��¥����"+Math.abs(ePoint-dPoint)*speed+"��");}
}