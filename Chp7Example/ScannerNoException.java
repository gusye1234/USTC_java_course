import java.util.Scanner;
public class  ScannerNoException{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Please input an integer:");
		int i=s.nextInt();
		System.out.println("The number is:"+i);
	}
}
