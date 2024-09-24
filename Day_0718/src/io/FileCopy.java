package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {

	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			byte[] buffer = new byte[1000];
			int count=0;
			
			fis = new FileInputStream("hello.txt");
			fos = new FileOutputStream("hello_copy.txt");
			
			while(true) {
				count = fis.read(buffer);
				if(count == -1) break;
				
				if(count == buffer.length) {
					fos.write(buffer);   // 마지막에 잘못하면 찌꺼기가 섞일 수 있다.
					for(int i=0; i<count; ++i) {
					System.out.print((char)buffer[i]);
					}
				}
				else if (count < buffer.length) {
					for (int i=0; i<count; ++i) {
						fos.write(buffer[i]);   // 마지막에 찌꺼기가 저장되지 않도록 한 개씩 복사
						System.out.print((char)buffer[i]);
					}
				}
				
			}
			
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (fis != null) fis.close();
				if (fos != null) fos.close();
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		
		
	}

}
