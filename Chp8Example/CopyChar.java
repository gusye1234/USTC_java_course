//Ҫ���������з�ʽ����Դ�ļ���Ŀ���ļ������ļ�����
import java.io.*;
public class CopyChar{
	public static void main(String args[]) throws IOException{
		String sFile,dFile;
		if(args.length<2){
			System.out.println("USE:java CopyChar Դ�ļ��� Ŀ���ļ���");
			return;
		}
		else{
			sFile=args[0];
			dFile=args[1];
		}
		try{
			File inputFile=new File(sFile);
			File outputFile=new File(dFile);
			FileReader in=new FileReader(inputFile);
			BufferedReader bin=new BufferedReader(in);
			FileWriter out=new FileWriter(outputFile);
			BufferedWriter bout=new BufferedWriter(out);
			String s;
			while((s=bin.readLine())!=null){
				bout.write(s);
				bout.write("\n");
			}
			bin.close();
			bout.close();
		}catch(IOException e){
			System.out.println(e.toString());
		}
	}
}