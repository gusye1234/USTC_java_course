//���췽��������
public class Example5_3 extends Employee{
	public static void main(String args[]){
		new Example5_3();
	}
	public Example5_3(){
		System.out.println("��Example5_3���޲ι��췽��");
	}
}
class Employee extends Person{
	public Employee(){
		System.out.println("��Employee���޲ι��췽��");
	}
}
class Person{
	public Person(){
		System.out.println("��Person���޲ι��췽��");
	}
}