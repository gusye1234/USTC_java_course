public class ThrowsEx{
	static void throwmethod() throws IllegalAccessException{
		System.out.println("throw an exception in throwmethod");
		//�׳��������쳣����
IllegalAccessException e=new IllegalAccessException();
		throw e;
	}
	public static void main(String args[]){
		try{
			throwmethod();
		}catch(IllegalAccessException e){
			System.out.println("catch an exception:"+e+"�Ƿ����ʴ����쳣");
		}
	}
}