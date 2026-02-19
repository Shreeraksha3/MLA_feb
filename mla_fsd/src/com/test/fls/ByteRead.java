package com.test.fls;
import java.io.FileInputStream;
import java.io.BufferedInputStream;
public class ByteRead {
	public static void main(String args[]) throws Exception
	{
		FileInputStream fis=new FileInputStream("src/bt.txt");
		BufferedInputStream bis=new BufferedInputStream(fis);
		byte[] br=new byte[1024];
		int x=0;
		while((x=bis.read(br))!=-1);
		{
			System.out.println(new String(br,0,x));
		}
	}
}
