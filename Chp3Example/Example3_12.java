//�ޱ�ŵ�break����
//Ѱ������arrayOfInts���Ƿ���12��������12��һ�γ��ֵ�λ�á�
public class Example3_12 {    
    public static void main(String[] args){
    	int[] arrayOfInts = { 32, 87, 3, 589, 12, 1076,2000, 8, 622, 127 };
    	int searchfor = 12;
    	int i;
    	boolean foundIt = false;
    	for (i = 0; i < arrayOfInts.length; i++) {
    		if (arrayOfInts[i] == searchfor) {
    			foundIt = true;
    			break;  //�������ڲ�ѭ��
    					//��ֻ��һ��ѭ������˽�����ѭ���壬��if��俪ʼִ��
    		}
    	}
		if (foundIt){
			System.out.println("Found " + searchfor + " at index " + i);
		}else{
			System.out.println(searchfor + " not in the array");
		}
	}
}