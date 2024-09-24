package io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest_02 {

	public static void main(String[] args) {
		File file = new File("song.txt");
		FileInputStream fis = null;
		// 배열에 읽어들이는 방법
		
		try{
			// File Open
			fis = new FileInputStream(file);
			
			// Processing
			byte[] data = new byte[50];    // 174 - 50 50 50 24
			int count = 0;     // 몇 번 read 했는지 체크하는 변수
			
			while (true) {
				count = fis.read(data);    // 몇 개를 한꺼번에 읽었는지 확인 (50)
				if(count == -1) break;
				
				for(int i =0; i<count; ++i) {
					System.out.print((char)data[i]);
				}
			}
			
			System.out.println("\n끝!!");
		} catch (Exception e) {         // io - f
			System.out.println(e.getMessage());
		} finally {
				try {
					if(fis != null) fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		}
	}

}
