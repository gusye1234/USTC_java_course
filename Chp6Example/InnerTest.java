interface IMessage{
	public void print();
}
public class InnerTest{
	public static void main(String[] args){
		fun(()->System.out.println("anonymous inner class"));
/*
		fun(new IMessage(){
			public void print(){
				System.out.println("anonymous inner class");
			}
		});*/
	}
	public static void fun(IMessage msg){
		msg.print();
	}
}