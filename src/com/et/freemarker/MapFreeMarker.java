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
		//配置ftl查找目录
		cfg.setDirectoryForTemplateLoading(
		new File("template"));
		//设置数据的抓取模式
		cfg.setObjectWrapper(new DefaultObjectWrapper());
		Map latest = new HashMap();
		latest.put("id_1", "10");
		latest.put("id_2", "20");
		
		Map root = new HashMap();
		root.put("myId", latest);
		
		//找到模板对象 实例模板对象 
		Template temp = cfg.getTemplate("map.ftl");
	
		//输出到目标生成html
		Writer out = new OutputStreamWriter(System.out);
		temp.process(root, out);
		out.flush();  
		
	}
}
