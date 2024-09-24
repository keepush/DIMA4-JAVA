package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileRWcopy {

	public static void main(String[] args) {
		FileReader fr = null;
		FileWriter fw = null;
		
		try {
			char[] buffer = new char[1000];
			int count=0;
			
			fr = new FileReader("supernova.txt");
			fw = new FileWriter("supernovsa_copy.txt");
			
			while(true) {
				count = fr.read(buffer);
				if(count == -1) break;
				
				if(count == buffer.length) {
					fw.write(buffer);   // 마지막에 잘못하면 찌꺼기가 섞일 수 있다.
					for(int i=0; i<count; ++i) {
					System.out.print(buffer[i]);
					}
				}
				else if (count < buffer.length) {
					for (int i=0; i<count; ++i) {
						fw.write(buffer[i]);   // 마지막에 찌꺼기가 저장되지 않도록 한 개씩 복사
						System.out.print(buffer[i]);
					}
				}
				
			}
			
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (fr != null) fr.close();
				if (fw != null) fw.close();
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		
		
	}

}
