//��׼�������׼���
import java.io.*;
public class InputClass{
	public static void main(String args[]) throws IOException{
		byte buff[]=new byte[5];
		System.in.read(buff);
		String str=new String(buff,0);
		System.out.println(str);
	}
}