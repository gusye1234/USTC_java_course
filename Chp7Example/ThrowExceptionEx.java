public class ThrowExceptionEx{
	public static int Sum() throws NegativeArraySizeException{
		int s=0;
		int x[]=new int[-8];
		for(int i=0;i<4;i++){
			x[i]=2*i;
			s=s+x[i];
			}
		return s;
		}
	public static void main(String args[]){
		try{
			System.out.println(Sum());//Sum()����δ���쳣���д����ص����������ҵ�������main()�������������쳣����ʹ���
		}catch(NegativeArraySizeException e){
			System.out.println("�쳣��Ϣ:"+e.toString()+"���鸺�±��쳣");
		}
	}
}