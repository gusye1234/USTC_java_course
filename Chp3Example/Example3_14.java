//������ŵ�continue����
//���ַ���searchMe��ͳ����ĸp�ĸ���
public class Example3_14 {
	public static void main(String[] args) {
		String searchMe = "peter piper picked a peck of pickled peppers";
		int max = searchMe.length();
		int numPs = 0;
		for (int i = 0; i < max; i++) {
			if (searchMe.charAt(i) != 'p')
				continue;	//�����ĸ��Ϊp������������ѭ�������ಿ�֣�������һ��ѭ��
			numPs++;
		}
		System.out.println("Found " + numPs + " p's in the string.");
	}
}