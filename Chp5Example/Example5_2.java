class SuperClass{
	public int a=1;
	protected int b=2;
	private int c=3;
	int d=4;
}
class Example5_2 extends SuperClass{
	int a=5;   //�������������븸��ͬ���ı���
	public static void main(String args[]){
		Example5_2 o1=new Example5_2();
		System.out.println(o1.a);
	}
}