package com.et.freemarker;

import java.io.File;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;

import freemarker.template.Configuration;
import freemarker.template.DefaultObjectWrapper;
import freemarker.template.Template;
import freemarker.template.TemplateException;

public class MapFreeMarker {
public static void main(String[] args) throws IOException, TemplateException {
		
		
		Configuration cfg = new Configuration();
		//����ftl����Ŀ¼
		cfg.setDirectoryForTemplateLoading(
		new File("template"));
		//�������ݵ�ץȡģʽ
		cfg.setObjectWrapper(new DefaultObjectWrapper());
		Map latest = new HashMap();
		latest.put("id_1", "10");
		latest.put("id_2", "20");
		
		Map root = new HashMap();
		root.put("myId", latest);
		
		//�ҵ�ģ����� ʵ��ģ����� 
		Template temp = cfg.getTemplate("map.ftl");
	
		//�����Ŀ������html
		Writer out = new OutputStreamWriter(System.out);
		temp.process(root, out);
		out.flush();  
		
	}
}
