package com.et.freemarker;

import java.io.File;
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

public class MacroFreeMarker {
public static void main(String[] args) throws IOException, TemplateException {
		
		
		Configuration cfg = new Configuration();
		//����ftl����Ŀ¼
		cfg.setDirectoryForTemplateLoading(
		new File("template"));
		//�������ݵ�ץȡģʽ
		cfg.setObjectWrapper(new DefaultObjectWrapper());
		
		Map root = new HashMap();
		root.put("sex", "1");
		//����list break ѭ��
		String[] str=new String[]{"1","2","3","4","5"};
		root.put("arr",str);
		List list=new ArrayList();
		User user=new User();
		user.setId("1");
		user.setName("����");
		list.add(user);
		User user1=new User();
		user1.setId("2");
		user1.setName("����");
		list.add(user1);
		root.put("userList", list);
		//�ҵ�ģ����� ʵ��ģ����� 
		Template temp = cfg.getTemplate("macro.ftl");
	
		//�����Ŀ������html
		Writer out = new OutputStreamWriter(System.out);
		temp.process(root, out);
		out.flush();  
		
	}
}
