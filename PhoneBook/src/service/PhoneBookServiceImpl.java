package service;

import vo.PhoneBook;

public class PhoneBookServiceImpl implements PhoneBookService {
	PhoneBook[] list = new PhoneBook[10];
	int count = 0;
	
	public boolean insert(PhoneBook Book) {
		if(count >= list.length) {  // 받을 수 있는 회원수를 초과
			return false;
		}
		list[count++] = Book;
		return true;
	}
	
	public PhoneBook selectOne(String phoneNumber) {
		for(int i=0; i<count; ++i) {
			if(list[i].getPhoneNumber().equals(phoneNumber)) // 회원을 찾음
				return list[i];
		}
		return null;
	}
	
	public boolean update(PhoneBook Book) {
		for(int i=0; i<count; ++i) {
			if(list[i].getPhoneNumber().equals(Book.getPhoneNumber())) {
				list[i].setRelation(Book.getRelation());
				list[i].setAge(Book.getAge());
				return true;
			}
		}

		return false;
	}
	

	public boolean delete(String phoneNumber) {
		for(int i=0; i<count; ++i) {
			if(list[i].getPhoneNumber().equals(phoneNumber)) {  // 탈퇴하려는 회원정보를 찾음
				for(int j=i; j < count-1; ++j) { // 뒤의 데이터를 앞으로 옮김
					list[j] = list[j+1];
				}
				--count;
				return true;
			}
		}
		return false;
	}

	public PhoneBook[] selectAll() {
		return list;
	}
	
	public int getCount() {
		return count;
	}
}
