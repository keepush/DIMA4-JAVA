package phobebook.service;

import phobebook.vo.PhoneBook;

public interface PhoneBookService {
	public boolean insert(PhoneBook Book);
	public PhoneBook selectOne(PhoneBook phoneNumber);
	public boolean update(PhoneBook Book);
	public boolean delete(PhoneBook phoneNumber);
	public int getCount();
}
