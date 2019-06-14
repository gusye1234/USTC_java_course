//�Եݹ鷽������ȡĿ¼������Ŀ¼���ļ���Ϣ����
//�ж������ļ�������޸����ڲ���������

import java.io.*;
import java.util.Date;
import java.text.SimpleDateFormat;
public class UpdateFile{
	public static void main(String args[])throws IOException{
		String fname="xanadu.txt";
		String childdir="WaitE";
		new UpdateFile().update(fname,childdir);
	}
	public void update(String fname,String dirname)throws IOException{
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy��MM��dd��hhʱmm��");
		File f1,f2,child;
		f1=new File(fname);
		child=new File(dirname);
		if(f1.exists()){
			if(!child.exists())
				child.mkdir();
			f2=new File(child,fname);
			System.out.println(sdf.format(new Date(f1.lastModified())));
			if(!f2.exists()||f2.exists()&&(f1.lastModified()>f2.lastModified()))
				copy(f1,f2);
			getInfo(f1);
			getInfo(child);
		}
		else
			System.out.println(f1.getName()+"file not found");
	}
	public void copy(File f1,File f2) throws IOException{
		FileInputStream rf=new FileInputStream(f1);
		FileOutputStream wf=new FileOutputStream(f2);
		int count,n=512;
		byte buffer[]=new byte[n];
		count=rf.read(buffer,0,n);
		while(count!=-1){
			wf.write(buffer,0,count);
			count=rf.read(buffer,0,n);
		}
		System.out.println("CopyFile "+f2.getName()+"!");
		rf.close();
		wf.close();
	}
	public static void getInfo(File f1)throws IOException{
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy��MM��dd��hhʱmm��");
		if(f1.isFile())
			System.out.println("<FILE>\t"+f1.getAbsolutePath()+"\t"+f1.length()+"\t"+sdf.format(new Date(f1.lastModified())));
		else{
			System.out.println("\t"+f1.getAbsolutePath());
			File[] files=f1.listFiles();
			for(int i=0;i<files.length;i++)
				getInfo(files[i]);
		}
	}
}