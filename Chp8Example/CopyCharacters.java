//���ַ�Ϊ��λ�����ļ�����
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyCharacters {
    public static void main(String[] args) throws IOException {
        FileReader inputStream = null;
        FileWriter outputStream = null;

        try {
        	/**��Դ�ļ�*/
            inputStream = new FileReader("xanadu.txt");
            /**��Ŀ���ļ�*/
            outputStream = new FileWriter("characteroutput.txt");

            int c;
            /**���������ж������ݲ�д�뵽�������*/
            while ((c = inputStream.read()) != -1) {
                outputStream.write(c);
            }
        } finally {
        	/**�ر����������*/
            if (inputStream != null) {
                inputStream.close();
            }
            if (outputStream != null) {
                outputStream.close();
            }
        }
    }
}