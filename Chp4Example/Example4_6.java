//ͨ������ֱ�ӵ��þ�̬����
public class Example4_6{
	public static void main(String args[])	{
		double max=Com.max(10,25);
		System.out.println(max);
	}
}
class Com{
	double x,y;
	static double max(double a,double b){
		return a>b?(a*b):(a+b);
	}
}