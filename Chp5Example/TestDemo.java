class Point<T>{
	private T x,y;	
	public void setXY(T x,T y){
		this.x=x;
		this.y=y;
	}	
	public T getX(){
		return x;
	}
	public T getY(){
		return y;
	}
}

public class TestDemo{
	public static void main(String[] args){		
		Point<String> p1=new Point();		
		p1.setXY("10","20");
		Point<Integer> p2=new Point();
		p2.setXY(10,20);
		add(p1);
		add(p2);
	}
	public static void add(Point<?> temp){
		System.out.println(temp.getX()+","+temp.getY());
	}
}