//֧�ֻ����������ͺ�Stringֵ�Ķ���������������̣�

import java.io.*;
public class DataStreams{
	//�����������ļ�
	static final String dataFile = "invoicedata";
	//��Ʒ���ơ����ۡ��۳�����
	static final double[] prices = { 19.99, 9.99, 15.99, 3.99, 4.99 };
	static final int[] units = { 12, 8, 13, 29, 50 };
	static final String[] descs = { "Java T-shirt",
									"Java Mug",
									"Duke Juggling Dolls",
									"Java Pin",
									"Java Key Chain" };
	public static void main(String args[])throws IOException{
		DataOutputStream out = null;
		//�����������������ֱ�ӽ����������Զ����Ƹ�ʽд���ļ�invoicedata�У�
		try{
			out = new DataOutputStream((new FileOutputStream(dataFile)));
			for (int i = 0; i < prices.length; i ++){
				out.writeDouble(prices[i]);
				out.writeInt(units[i]);
				out.writeUTF(descs[i]);
			}				
		}finally{
			out.close();
		}
		DataInputStream in = null;
		double price;
		int unit;
		String desc;
		double total = 0.0;
		//���������������������ļ�invoicedata�ж�����ֵ�����������в�Ʒӯ����
		try{
			in = new DataInputStream(new FileInputStream(dataFile));
			while (true) {
				price = in.readDouble();
				unit = in.readInt();
				desc = in.readUTF();
				System.out.format("You ordered %d units of %s at $%.2f%n",unit, desc, price);
        		total += unit * price;
			}
		}catch(EOFException e){
			System.out.println(e.toString());
		}
		finally{
			System.out.format("For a TOTAL of: $%.2f%n",total);
			in.close();
		}
	}
}
