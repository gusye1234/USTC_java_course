import java.util.*;
public class Example3_3{
	public static void main(String args[]) {
		Scanner reader=new Scanner(System.in);
		double a,b,c,x1,x2,check;
		System.out.println("����һԪ���η���ϵ��");
		a=reader.nextDouble();
		b=reader.nextDouble();
		c=reader.nextDouble();
		check=b*b-4*a*c;
		if(check==0){
			x1=(-b)/(2*a);
			System.out.println("�������������ʵ����x1=x2="+(-b)/(2*a));
		}
		else if(check>0){
			x1=(-b+(float)Math.sqrt(check))/(2*a);
			x2=(-b-(float)Math.sqrt(check))/(2*a);
			System.out.println("x1="+x1);
			System.out.println("x2="+x2);}
		else{
			System.out.println("�÷�����ʵ����������Ϊ��");
			System.out.println("x1="+-b/(2*a)+"+"+(float)Math.sqrt(-check)/(2*a)+"*i");
			System.out.println("x2="+-b/(2*a)+"-"+(float)Math.sqrt(-check)/(2*a)+"*i");
		}
    }
}