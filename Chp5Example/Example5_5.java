class Point{
	protected int x,y;
	public Point(){
		x=0;
		y=0;
		System.out.println("��Ĺ���"+this.toString());
	}
	public Point(int a,int b){
		x=a;
		y=b;
		System.out.println("��Ĺ���"+this.toString());
	}
	public String toString(){
		return "["+x+","+y+"]";
	}
}
class Circle extends Point{
	protected double radius;
	public Circle(){
		super();	//ʹ��super�ؼ��ֵ��ø���Ĺ��췽����
		radius=0;
		System.out.println("Բ�Ĺ���"+this.toString());
	}
	public Circle(int a,int b,int r){
		super(a,b);
		radius=r;
		System.out.println("Բ�Ĺ���"+this.toString());
	}
	public String toString(){
		return "Բ��="+super.toString()+"�뾶="+radius;
	}
}
public class Example5_5{
	public static void main(String args[]){
		Circle circle1=new Circle();
		Circle circle2=new Circle(3,4,5);
	}
}