//ջ�ټ�����
class useException extends Exception{
	public useException(){
		super("�Զ����쳣");
	}
}
public class getMessage{
	public static void m1() throws useException{
		m2();
	}
	public static void m2() throws useException{
		throw new useException();
	}
	public static void main(String args[]){
		try{
			m1();
		}catch(useException e){
			System.out.println(e.getMessage());
			e.printStackTrace();
			System.out.println("�쳣����:"+e.getClass().getName());
		}
	}
}