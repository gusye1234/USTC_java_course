public class Cow
{
	private double weight;
	public Cow(){
	}
	public Cow(double weight){
		this.weight=weight;
	}
	private class CowLeg{
		//�Ƿ����Ǿ�̬�ڲ����ﲻ�����徲̬��Ա
		/* 
		static int num=4;		
		static void getNum(){
			System.out.println(num);
		}
		*/
		private double length;
		private String color;

		public CowLeg(){
		}
		public CowLeg(double length,String color){
			this.length=length;
			this.color=color;
		}
		public void info(){
			System.out.println("��ǰţ����ɫ�ǣ�"+color+",����"+length);
			System.out.println("��ţ�����ڵ���ţ�أ�"+weight);
		}	
	}
	public void test(){
//		System.out.println(color);   �Ƿ�����ʱ��δ���ڲ������������ⲿ������У�����޷�����
		CowLeg cl=new CowLeg(1.12,"��ɫ");
		cl.info();
	}
	public static void main(String[] args) {
		Cow cow=new Cow(378.9);
//		new CowLeg();  �Ƿ�����̬��Ա���ܷ��ʷǾ�̬��Ա
		cow.test();
	}
}
