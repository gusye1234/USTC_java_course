public class Example5_6{
	public static void main(String args[]){
		SubClass sub=new SubClass();
		sub.doSomething();
	}
}
class SuperClass{
	int x;
	SuperClass(){
		x=3;
		System.out.println("in SuperClass:x="+x);
	}
	void doSomething(){
		System.out.println("in SuperClass.doSomething()");
	}
}
class SubClass extends SuperClass{
	int x;	//�����Ա���������˸���ĳ�Ա����
	SubClass(){
		x=5;
		System.out.println("in SubClass:x="+x);
	}
	//����ĳ�Ա���������˸���ĳ�Ա����
	void doSomething(){
		super.doSomething();	//��super�����ʸ��౻���صĳ�Ա��������ø��౻���ǵķ�����
		System.out.println("in SubClass.doSomething()");
		System.out.println("super.x="+super.x+";sub.x="+x);
	}
}