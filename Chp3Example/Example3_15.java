//����ŵ�continue����
//���ַ���searchMe��Ѱ���Ƿ�����ִ�substring
public class Example3_15{
	public static void main(String[] args) {
		String searchMe = "Look for a substring in me";
		String substring = "sub";
		boolean foundIt = false;
		int max = searchMe.length() - substring.length();
	test:
		for (int i = 0; i <= max; i++) {
			int n = substring.length();
			int j = i;
			int k = 0;
			while (n-- != 0) {
				if (searchMe.charAt(j++) != substring.charAt(k++)) {
					continue test;	//���ִ��ȽϹ����У������ֵ�һ������ͬ����ĸ����û�б�Ҫ�����±Ƚϣ�
									//����ĸ������һ����ĸ���¿�ʼѭ��
				}
			}
			foundIt = true;
			break test;	//��Ϊֻ�Ǽ����Ƿ�����ִ�������һ�����֣��Ͳ������±Ƚϣ�����test���顣
		}
		System.out.println(foundIt ? "Found it" : "Didn't find it");
	}
}