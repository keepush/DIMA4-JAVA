package io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Exam_34 {

	public static void main(String[] args) {
		
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		
		try {
			bis = new BufferedInputStream(new FileInputStream("cat.png"));    // low level로 되어 있는 게 전달됨
			bos = new BufferedOutputStream(new FileOutputStream("cat_copy.png"));
			byte[] buffer = new byte[1000];
			int count=0;
			
			while(true) {
				count = bis.read(buffer);
				if(count == -1) break;
			
				if (count < buffer.length) {
					for (int i=0; i<count; ++i) 
						bos.write(buffer[i]);   // 마지막에 찌꺼기가 저장되지 않도록 한 개씩 복사
					break;
				}
				bos.write(buffer);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try{
				if (bos != null) bos.close();
				if (bis != null) bis.close();
			} catch(Exception e) {
				e.printStackTrace();
			}
		}

	}

}
