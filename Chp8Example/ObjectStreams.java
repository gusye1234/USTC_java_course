//��������������̣�

import java.io.*;
import java.math.*;
public class ObjectStreams{
	//�����������ļ�
	static final String dataFile = "invoicedata";
	//��Ʒ���ơ����ۡ��۳�����
	static final BigDecimal[] prices = {
									new BigDecimal("19.99"),
									new BigDecimal("9.99"),
									new BigDecimal("15.99"),
									new BigDecimal("3.99"),
									new BigDecimal("4.99"),
									};
	static final int[] units = { 12, 8, 13, 29, 50 };
	static final String[] descs = { "Java T-shirt",
									"Java Mug",
									"Duke Juggling Dolls",
									"Java Pin",
									"Java Key Chain" };
	//JVM����һ������ʱ�����ö����������໹ûװ�룬������װ����࣬�����಻���ڣ�����׳�ClassNotFoundException
	public static void main(String args[])throws IOException,ClassNotFoundException{
		ObjectOutputStream out = null;
		//���������������ֱ�ӽ����������Զ����Ƹ�ʽд���ļ�invoicedata�У�
		try{
			out = new ObjectOutputStream((new FileOutputStream(dataFile)));
			for (int i = 0; i < prices.length; i ++){
				//��BigDecimal����д�룻
				out.writeObject(prices[i]);
				out.writeInt(units[i]);
				out.writeUTF(descs[i]);
			}				
		}finally{
			out.close();
		}
		ObjectInputStream in = null;
		BigDecimal price;
		int unit;
		String desc;
		double total = 0.0;
		//�������������������ļ�invoicedata�ж�����ֵ�����������в�Ʒӯ����
		try{
			in = new ObjectInputStream(new FileInputStream(dataFile));
			while (true) {
				//��BigDecimal���������
				price =(BigDecimal)(in.readObject());
				unit = in.readInt();
				desc = in.readUTF();
				System.out.format("You ordered %d units of %s at $%.2f%n",unit, desc, price);
        		total += unit * price.doubleValue();
			}
		}catch(IOException e){
			System.out.println(e.toString());
		}
		finally{
			System.out.format("For a TOTAL of: $%.2f%n",total);
			in.close();
		}
	}
}
