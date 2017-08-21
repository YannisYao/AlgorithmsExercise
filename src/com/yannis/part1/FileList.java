package com.yannis.part1;

import java.io.File;

import com.yannis.stdio.StdOut;
/**
 * 使用队列递归缩进式打印文件夹内容
 * @author Administrator
 *
 */
public class FileList {
	public static void main(String arg2[]) {
		display("D:\\AndroidStudio\\AppProject\\PracticeDraw5");
	}
    /**
     * 递归处理文件夹列表显示
     * @param filename
     */
	public static void display(String filename) {
		File file = new File(filename);
		if(file.isFile())StdOut.println(getTabs(file)+"-"+file.getName());
		else if(file.isDirectory()){
			StdOut.println(getTabs(file)+"+"+file.getName());
			File[] files = file.listFiles();
			Queue<File> cur = new Queue<>();
			for(File f:files) {
				if(f != null)
				  cur.enqueue(f);
			}
			for(File f:cur) {
				if(f != null)
					display(f.getAbsolutePath());
			}
		}
	}
	/**
	 * 递归处理缩进问题
	 * @param file
	 * @return
	 */
	public static String getTabs(File file) {
		if(!file.exists()) return "";
		if(file.getParentFile() == null) return "";
		else return "\t"+getTabs(file.getParentFile());
	}
}
