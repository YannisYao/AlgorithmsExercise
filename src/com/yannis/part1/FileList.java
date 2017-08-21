package com.yannis.part1;

import java.io.File;

import com.yannis.stdio.StdOut;
/**
 * ʹ�ö��еݹ�����ʽ��ӡ�ļ�������
 * @author Administrator
 *
 */
public class FileList {
	public static void main(String arg2[]) {
		display("D:\\AndroidStudio\\AppProject\\PracticeDraw5");
	}
    /**
     * �ݹ鴦���ļ����б���ʾ
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
	 * �ݹ鴦����������
	 * @param file
	 * @return
	 */
	public static String getTabs(File file) {
		if(!file.exists()) return "";
		if(file.getParentFile() == null) return "";
		else return "\t"+getTabs(file.getParentFile());
	}
}
