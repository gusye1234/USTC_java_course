//�����ڲ��������󣬿��Է����Լ���˽�б�����˽�з���
class Example5_1{
	private int books;
	Example5_1(){
		books=15;
	}
	private int getnum(){
		return books;
	}
	public static void main(String args[]){
		Example5_1 t1=new Example4_1();
		t1.books=30;
		int m=t1.getnum();
		System.out.println("books="+m);
	}
}