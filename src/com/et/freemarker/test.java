package com.et.freemarker;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
/**
 * freemarkerÀý×Ó
 * @author Administrator
 *
 */
public class test {
	public static void main(String[] args) throws IOException {
		String[] ss=new String[]{"1","2","3"};
		int i=0;
		FileOutputStream out=new FileOutputStream(new File("E:\\myImages\\index.html"));
		for(String str:ss){
		
			String name="huo yuan ping "+str;
			try {
				
				
				String temp="<a href='#'>wo jiao "+name+"</a><br/>";
				byte[] bs=temp.getBytes();
				out.write(bs);
				out.flush();
				
				
			} catch (FileNotFoundException e) {
				
				e.printStackTrace();
			}
		
		}
		out.close();

	}
}
