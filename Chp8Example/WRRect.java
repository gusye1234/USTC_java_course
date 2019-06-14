import java.io.*;
import java.util.*;
/*
class Point implements Serializable{
    double x,y;
    public Point(double x,double y){
        this.x=x;
        this.y=y;
    }
}*/
class Rectangle implements Serializable{
    double width,height;
    transient String color="red";
   // Point center;
    /*public Rectangle(double width,double height,Point center){
        this.height=height;
        this.width=width;
        this.center=center;
    }*/
    public Rectangle(double height,double width){
        this.height=height;
        this.width=width;
    }
    private Object writeReplace() throws ObjectStreamException{
        ArrayList<Object> list=new ArrayList<Object>();
        list.add(height);
        list.add(width);
        return list;        
    }
    /*
    private void writeObject(ObjectOutputStream oos)throws IOException{
        oos.writeDouble(height*10);
        oos.writeDouble(width*10);
    }
    private void readObject(ObjectInputStream ois)throws IOException,ClassNotFoundException{
        this.height=ois.readDouble()/10;
        this.width=ois.readDouble()/10;
    }*/
}
public class WRRect{
    public static void main(String[] args){
        try(
            ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("rect.txt"));
            ObjectInputStream ois=new ObjectInputStream(new FileInputStream("rect.txt")))
        {
            //Point c=new Point(0,0);
            //Rectangle r1=new Rectangle(1.0,2.0,c);
            Rectangle r1=new Rectangle(1.0,2.0);
            oos.writeObject(r1);
            //Rectangle r2=(Rectangle)ois.readObject();
            ArrayList list=(ArrayList)ois.readObject();            
            //System.out.println("矩形对象"+(Rectangle)temp[0].height+","+(Rectangle)temp[0].width);
            System.out.println("矩形对象"+list);
        }catch(IOException ie){
            ie.printStackTrace();
        }catch(ClassNotFoundException ce){
            System.out.println("Error");
            ce.printStackTrace();
        }
    }
}