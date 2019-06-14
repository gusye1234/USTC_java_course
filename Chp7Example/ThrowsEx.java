public class ThrowsEx{
	static void throwmethod() throws IllegalAccessException{
		System.out.println("throw an exception in throwmethod");
		//抛出创建的异常对象
IllegalAccessException e=new IllegalAccessException();
		throw e;
	}
	public static void main(String args[]){
		try{
			throwmethod();
		}catch(IllegalAccessException e){
			System.out.println("catch an exception:"+e+"非法访问错误异常");
		}
	}
}