// 유지민

package service;

import vo.Product;

public interface CosmeticService {
	public boolean insert(Product product);
	public boolean update(Product product);
	public boolean delete(String productNo);
	public Product selectOne(String productNo);
	public Product[] selectAll();
	public int getCount();
}
