//����ֵ��������
public class Example4_7{
	static void swapxy(int x,int y){
		int temp;
		System.out.print("����ǰ:");
		System.out.println("x="+x+",y="+y);
		temp=x;x=y;y=temp;
		System.out.print("������");
		System.out.println("x="+x+",y="+y);
	}
	public static void main(String args[]){
		int u=30,v=50;
		System.out.print("����ǰ:");
		System.out.println("u="+u+",v="+v);
		swapxy(u,v);
		System.out.print("���ú�");
		System.out.println("u="+u+",v="+v);
	}
}