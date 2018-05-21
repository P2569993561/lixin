package com.lixin.service;

import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.lixin.mapper.ProductMapper;
import com.lixin.pojo.Product;
import com.lixin.pojo.ProductExample;

/**
 * 商品
 * 
 * @author PHF
 *
 */
@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	private ProductMapper productMapper;
	private int pagesize = 4;

	/**
	 * 根据商品id查询
	 */
	public Product findbyid(String pid) {
		Long id = (long) Integer.parseInt(pid);
		Product product = productMapper.selectByPrimaryKey(id);
		return product;
	}

	/**
	 * 模糊查询
	 */
	public List<Product> selectcontent(String content, int start) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("start", (start-1 * 4));
		map.put("pagesize", 4);
		List<Product> pList = productMapper.selectcontent(map);
		return pList;
	}

	/**
	 * 分类查询
	 */
	@Override
	public List<Product> selectlassify(String onemenu, String twomenu, int start) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("start", ((start-1) * pagesize));
		map.put("pagesize", pagesize);
		map.put("onemenu", onemenu);
		map.put("twomenu", twomenu);
		List<Product> pList = productMapper.selectlassify(map);

		return pList;
	}

	/**
	 * 增加商品
	 */
	public void save(Product product) {
		
		
		   
			//获取当前系统时间戳
			product.setCid(Calendar.getInstance().getTimeInMillis());
			product.setStatus((byte)1);
			product.setId(Calendar.getInstance().getTimeInMillis());
			product.setUpdated(new Date());
			product.setCredted(new Date());
			System.out.println("bbbbbbbbbbbbbbbbbbbb");
			int a=productMapper.insert(product);
			System.out.println(a+"AAAAAAAAAAAAAAAAAAAAAAAAAAAA");
	}

	
}
