class Message<T extends Number>{
	private T msg;
	public void setMsg(T msg){
		this.msg=msg;
	}
	public T getMsg(){
		return msg;
	}
}
public class NumberTest{
	public static void main(String[] args){
		Message<Integer> m1=new Message<>();
		m1.setMsg(10);
		fun(m1);
	}
	public static void fun(Message<? extends Number> temp) {
		System.out.println(temp.getMsg());
	}
}