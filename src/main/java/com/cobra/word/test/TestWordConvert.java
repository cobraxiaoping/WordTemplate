package com.cobra.word.test;

import java.util.HashMap;
import java.util.Map;

import com.cobra.word.WordTemplateUtil;

public class TestWordConvert {
	public static void main(String[] args) throws Exception {
		String appcontextroot = System.getProperty("user.dir");
		// 一：替换Word中的普通文本
		String tempaltePath = appcontextroot + "/src/main/resources/paragraphWord.docx";
		//加载word模版
		WordTemplateUtil wordReporter = new WordTemplateUtil(tempaltePath);
		wordReporter.init();
		//准备数据
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("name", "杨小平");
		params.put("location", "大四川");
		params.put("gender", "男");
		//填充数据
		boolean export = wordReporter.export(params);
		if (export) {
			String outDocPath = appcontextroot + "/src/main/resources/paragraphWord_converted.docx";
			//word模版根据填充的数据生成新的word文档
			wordReporter.generate(outDocPath);
		}

		// 二：处理含有图片的word模版
		// String tempaltePath = appcontextroot +
		// "/src/main/resources/ImageTemplateWord.docx";
		// WordTemplateUtil wordReporter = new WordTemplateUtil(tempaltePath);
		// wordReporter.init();
		// Map<String, Object> params = new HashMap<String, Object>();
		// params.put("name", "月");
		// Map<String, String> picMap = new HashMap<String, String>();
		// picMap.put("width", "416");// 经测试416可以占一行
		// picMap.put("height", "120");
		// picMap.put("type", "jpg");
		// picMap.put("path",
		// "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1513174783971&di=3bb8721cc33ce1d5bc300d80a9666c3a&imgtype=0&src=http%3A%2F%2Fi6.download.fd.pchome.net%2Ft_960x600%2Fg1%2FM00%2F10%2F15%2FooYBAFWoUjKIJGWnAAILp4O8hGsAACmNwEu9yEAAgu_683.jpg");
		// params.put("picture", picMap);
		// boolean export = wordReporter.export(params);
		// if (export) {
		// String outDocPath = appcontextroot +
		// "/src/main/resources/ImageTemplateWord_converted.docx";
		// wordReporter.generate(outDocPath);
		// }

		// 三：替换word中表格中的占位数据
		// String tempaltePath = appcontextroot +
		// "/src/main/resources/TableTemplateWord.docx";
		// WordTemplateUtil wordReporter = new WordTemplateUtil(tempaltePath);
		// wordReporter.init();
		// Map<String, Object> params = new HashMap<String, Object>();
		// params.put("name", "月");
		// params.put("gender", "女");
		// params.put("Tel", "1326915951X");
		// params.put("email", "33751759X@qq.com");
		// params.put("address", "四川省巴中市");
		// boolean export = wordReporter.export(params, 0);
		// if (export) {
		// String outDocPath = appcontextroot +
		// "/src/main/resources/TableTemplateWord_converted.docx";
		// wordReporter.generate(outDocPath);
		// }

		// 四：向word的表格中添加列表数据
		// String tempaltePath = appcontextroot +
		// "/src/main/resources/TableTemplateWord.docx";
		// WordTemplateUtil wordReporter = new WordTemplateUtil(tempaltePath);
		// try {
		// wordReporter.init();
		// Map<String, Object> params = new HashMap<String, Object>();
		// params.put("name", "月");
		// params.put("gender", "女");
		// params.put("Tel", "1326915951X");
		// params.put("email", "33751759X@qq.com");
		// params.put("address", "四川省巴中市");
		// // 替换表格中的站位变量
		// boolean export1 = wordReporter.export(params, 0);
		//
		// List<Map<String, String>> list = new ArrayList<Map<String, String>>();
		// Map<String, String> row1 = new HashMap<String, String>();
		// row1.put("no", "1");
		// row1.put("name", "小明");
		// row1.put("gender", "男");
		// row1.put("tel", "1326915951X");
		// row1.put("email", "33751759X@qq.com");
		//
		// Map<String, String> row2 = new HashMap<String, String>();
		// row2.put("no", "2");
		// row2.put("name", "小花");
		// row2.put("gender", "男");
		// row2.put("tel", "1326915951X");
		// row2.put("email", "33751759X@qq.com");
		//
		// Map<String, String> row3 = new HashMap<String, String>();
		// row3.put("no", "3");
		// row3.put("name", "小名");
		// row3.put("gender", "男");
		// row3.put("tel", "1326915951X");
		// row3.put("email", "33751759X@qq.com");
		//
		// list.add(row1);
		// list.add(row2);
		// list.add(row3);
		//
		// boolean export2 = wordReporter.export(list, 1);
		// if (export1 && export2) {
		// String outDocPath = appcontextroot +
		// "/src/main/resources/TableTemplateWord_converted.docx";
		// boolean generate = wordReporter.generate(outDocPath);
		// }
		// } catch (Exception e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }
	}
}
