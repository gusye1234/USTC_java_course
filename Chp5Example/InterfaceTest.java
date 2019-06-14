interface IMessage<T>{
	public void print(T t);
}

class MessageImp implements IMessage<String>{
	public void print(String t){
		System.out.println(t);
	}
}

public class InterfaceTest{
	public static void main(String[] args){
		IMessage<String> s=new MessageImp();
		s.print("hello");
	}
}

/*
class MessageImp<S> implements IMessage<S>{
	public void print(S t){
		System.out.println(t);
	}
}

public class InterfaceTest{
	public static void main(String[] args){
		IMessage<String> s=new MessageImp<String> ();
		s.print("hello");
	}
}*/