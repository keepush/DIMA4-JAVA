package phobebook.service;

import phobebook.vo.PhoneBook;

public class PhoneBookServiceimpl implements PhoneBookService {
	PhoneBook[] list = new PhoneBook[10];
	int count = 0;
	
	public boolean insert(PhoneBook Book) {
		if (count > list.length) {
			return false;
		}
		list[count++] = Book;
		return true;
	}
	
	public PhoneBook selectOne(PhoneBook phoneNumber) {
		for(int i=0; i<count; ++i) {
			if(list[i].getPhoneNumber().equals(phoneNumber))
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
	
	public boolean delete(PhoneBook phoneNumber) {
		for(int i=0; i<count; ++i) {
			if(list[i].getPhoneNumber().equals(phoneNumber)) {
				for(int j=i; j < count-1; ++j) { // 뒤의 데이터를 앞으로 옮김
					list[j] = list[j+1];
			}
				--count;
				return true;
		}
	}
		return false;
}
	
	public int getCount() {
		return count;
	}
	
	public PhoneBook[] selectAll() {
		return list;
	}
}
