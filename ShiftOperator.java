import java.io.*;
public class ShiftOperator {
	public static void main(String[] args) {
		int a=12;
		int b=23;
		System.out.println(a>>b);//0
		System.out.println(b>>a);//0
		System.out.println(a<<b);//100663296
		System.out.println(b<<a);//94208
	}

}
