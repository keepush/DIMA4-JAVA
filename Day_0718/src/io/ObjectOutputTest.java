package io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectOutputTest {

	public static void main(String[] args) {
//		// 파일로 저장하려는 객체는 Serial 상태로 변환되어 있어야 한다.  메모리 -> 하드디스크 이동
//		// 하나의 덩어리인 객체를 밖으로 내보내려면 bit 형태로 바꾸어야 함
//		
//		FriendVO f = new FriendVO("손오공", "010-1234-5678", 25);
//		ObjectOutputStream oos = null;
//		
//		try {
//			oos = new ObjectOutputStream(new FileOutputStream("friend.dat"));
//			
//			oos.writeObject(f);
//			
//			System.out.println("저장완료!");
//		} catch(IOException e) {
//			e.printStackTrace();
//		} finally {
//			try {
//				if(oos != null) oos.close();
//			} catch (Exception e) {
//				e.printStackTrace();
//			}
//		}
		
		ObjectInputStream ois = null;
		
		try {
			ois = new ObjectInputStream(new FileInputStream("friend.dat"));
			
			FriendVO f = (FriendVO)ois.readObject();
			
			f.output();
		} catch(IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				if(ois != null) ois.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

}
