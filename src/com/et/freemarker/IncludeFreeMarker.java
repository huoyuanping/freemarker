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

public class IncludeFreeMarker {
	public static void main(String[] args) throws IOException, TemplateException {
		
		
		Configuration cfg = new Configuration();
		//配置ftl查找目录
		cfg.setDirectoryForTemplateLoading(
		new File("template"));
		//设置数据的抓取模式
		cfg.setObjectWrapper(new DefaultObjectWrapper());
		
		Map root = new HashMap();
		
		//找到模板对象 实例模板对象 
		Template temp = cfg.getTemplate("testinclude.ftl");
	
		//输出到目标生成html
		Writer out = new OutputStreamWriter(System.out);
		temp.process(root, out);
		out.flush();  
		
	}
}
