package com.et.freemarker;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import freemarker.template.Configuration;
import freemarker.template.DefaultObjectWrapper;
import freemarker.template.Template;
import freemarker.template.TemplateException;

public class TestFreeMarker {
		public static void main(String[] args) throws IOException, TemplateException {
			
			
			Configuration cfg = new Configuration();
			//配置ftl查找目录
			cfg.setDirectoryForTemplateLoading(
			new File("template"));
			//设置数据的抓取模式
			cfg.setObjectWrapper(new DefaultObjectWrapper());
			
			Map latest = new HashMap();
			//构建数据
			latest.put("url", "products/greenmouse.html");
			latest.put("name", "green mouse");  
			// 创建一个hashMap
			Map root = new HashMap();
			// 存入值
			root.put("user", "Big Joe");
			root.put("latestProduct", latest);
			root.put("sex", "1");
			//数组list break 循环
			String[] str=new String[]{"1","2","3","4","5"};
			root.put("arr",str);
			List list=new ArrayList();
			User user=new User();
			user.setId("1");
			user.setName("张三");
			list.add(user);
			User user1=new User();
			user1.setId("2");
			user1.setName("李四");
			list.add(user1);
			root.put("userList", list);
			
			//找到模板对象 实例模板对象 
			Template temp = cfg.getTemplate("hello.ftl");
			//文件输出流
			FileOutputStream fos=new FileOutputStream("E:\\html\\hello.txt");
			//输出到目标生成html
			Writer out = new OutputStreamWriter(fos);
			temp.process(root, out);
			out.flush();  
			
		}
}
