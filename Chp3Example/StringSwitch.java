/**
 * @(#)StringSwitch.java
 *
 *
 * @author 
 * @version 1.00 2014/3/19
 */

import java.util.*;
public class StringSwitch {
    public static void main(String args[]){
    	Scanner s=new Scanner(System.in);
    	String name=s.next();
    	switch(name){
    		case "administrater":
    			System.out.println("���ǹ���Ա");
    			break;
    		case "guest":
    			System.out.println("���Ƿÿ�");
    			break;
    		default:
    			System.out.println("�û����Ƿ�");
    	}
    }    
}