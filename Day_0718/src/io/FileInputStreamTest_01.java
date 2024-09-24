package io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest_01 {

	public static void main(String[] args) {
		File file = new File("song.txt");
		FileInputStream fis = null;
		// 배열에 읽어들이는 방법
		
		try{
			fis = new FileInputStream(file);
			
			int data = 0;
			int count = 0;     // 몇 번 read 했는지 체크하는 변수
			
			while (true) {
				data = fis.read();    // 읽어드린 데이터를 반환
				count++;
				
				if(data == -1) break;
				
				System.out.print((char)data);
			}
			System.out.println();
			System.out.println("끝!! - 글자 수: " + count);
			
		} catch (Exception e) {         // io - f
			System.out.println(e.getMessage());
		}

	}

}
