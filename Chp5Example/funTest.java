public class funTest{
	public static void main(String[] args){
		String s=fun("hello");
		System.out.println(s.length());
	}

	public static <T> T fun(T t){
		return t;
	}
}