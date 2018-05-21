package com.lixin.service;

import java.util.List;

import com.lixin.pojo.Product;
import com.lixin.pojo.User;

public interface ProductService {

	public Product findbyid(String pid);

	public List<Product> selectcontent(String content,int start);

	public List<Product> selectlassify(String onemenu, String twomenu, int start);
		
	public void save(Product product);
}
