package io;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputStreamTest_03 {

	public static void main(String[] args) {
		FileOutputStream fos = null;
		
		try {
			fos = new FileOutputStream("target.txt");
			for(int i='a'; i<='z'; ++i) 
				fos.write(i);
			
			System.out.println("기록 완료");
			
			
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
				try {
					if(fos != null) fos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		}
	}

}
