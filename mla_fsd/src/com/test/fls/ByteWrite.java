package com.test.fls;
import java.io.File;
import java.io.FileOutputStream;
import java.io.BufferedOutputStream;
public class ByteWrite {
	public static void main(String args[]) throws Exception
	{
		File file=new File("src/bt.text");
		FileOutputStream fos=new FileOutputStream(file);
		BufferedOutputStream bos=new BufferedOutputStream(fos);
		String msg="This is simple byte stream write and read";
		bos.write(msg.getBytes());
		bos.flush();
		System.out.println("Done.");
		}
}
