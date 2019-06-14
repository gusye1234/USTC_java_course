@FunctionalInterface
interface IMessage{
	public int add(int ... args);
	static int sum(int ... args){
		int sum=0;
		for(int i:args)
			sum+=i;
		return sum;
	}
}
public class InnerTestArg{
	public static void main(String[] args){
		fun((int ... param)->IMessage.sum(param));
	}
	public static void fun(IMessage msg){
		System.out.println(msg.add(10,20,30));
	}
}