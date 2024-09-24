// 유지민

package service;

import vo.Foundation;
import vo.Lipstick;
import vo.Product;

public class CosmeticServiceImpl implements CosmeticService {
	Product[] list = new Product[50];
	int count = 0;
	
	public boolean insert(Product product) {
		if(count >= list.length) {
			return false;
		}
		list[count++] = product;
		return true;
	}
	
	public boolean update(Product product) {
		for(int i=0; i<count; ++i) {
			if(list[i].getProductNo().equals(product.getProductNo())) {
				if (list[i] instanceof Lipstick) {
					Lipstick lipstick = (Lipstick)product;
					lipstick.setProductNo(product.getProductNo());
					list[i] = lipstick;
					return true;
				}
				else if (list[i] instanceof Foundation) {
					Foundation foundation = (Foundation)product;
					foundation.setProductNo(product.getProductNo());
					list[i] = foundation;
					return true;
				}
			}
		}
		return false;
	}
	
	public boolean delete(String productNo) {
		for (int i = 0; i<count; ++i) {
			if(list[i].getProductNo().equals(productNo)) {
				for (int j = i; j<count-1;++j) {
					list[j] = list[j+1];
				}
				--count;
				return true;
			}
		}
		return false;
	}
	
	public Product selectOne(String productNo) {
		for(int i=0; i<count; ++i) {
			if(list[i].getProductNo().equals(productNo))
				return list[i];
		}
		return null;
	}
	
	public Product[] selectAll() {
		return list;
	}
	
	public int getCount() {
		return count;
	}
}
