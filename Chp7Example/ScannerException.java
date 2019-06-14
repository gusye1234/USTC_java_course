import java.util.*;
public class  ScannerException{
　　public static void main(String[] args) {
　　　　boolean pin=true;
　　　　int i;
　　　　Scanner s=new Scanner(System.in);
　　　　System.out.println("Please input an integer:");
　　　　do{
	try{
		i=s.nextInt();
		System.out.println("The number is:"+i);
		pin=false;
	}catch(InputMismatchException e){
		System.out.println("Invalid input,try again:");
		s.nextLine();
	}
　　　　}while(pin);
　　}
}
