package com.lixin.controller;

import java.io.File;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.lixin.pojo.Product;
import com.lixin.service.ProductService;
import com.lixin.utlis.FastJsonUtil;

/**
 * ��Ʒ
 * 
 * @author PHF @version1.0
 *
 */
@Controller
@RequestMapping("/Product")
public class ProductController {

	@Autowired
	private ProductService productService;

	/**
	 * ������Ʒid��ѯ
	 * 
	 * @param pid
	 * @return
	 */
	@RequestMapping("/findbyid")
	@ResponseBody
	public Product findbyid(String pid) {

		Product product = productService.findbyid(pid);

		return product;
	}

	/**
	 * ģ����ѯ
	 * 
	 * @param start
	 * @return
	 */
	@RequestMapping("/selectcontent")
	@ResponseBody
	public List<Product> selectcontent(String content, int start) {

		List<Product> products = productService.selectcontent(content, start);

		return products;
	}

	/**
	 * �����ѯ
	 * 
	 * @param one_menu
	 * @param two_menu
	 * @param start
	 * @return
	 */
	@RequestMapping("/selectlassify")
	@ResponseBody
	public String selectlassify(String onemenu, String twomenu, int start) {
		List<Product> products = productService.selectlassify(onemenu,twomenu,start);
		
		String strproducts=FastJsonUtil.toJSONString(products);
		System.out.println(strproducts);
		return strproducts;

	}
	
	@RequestMapping("/addProduct")
	@ResponseBody
	public void addProduct(MultipartFile imageFile,Product product) throws Exception{
		 //1.��ȡͼƬ��������
	    String fileStr=imageFile.getOriginalFilename();
		//2. ʹ��������ɵ��ַ���+ԴͼƬ��չ������µ�ͼƬ����,��ֹͼƬ����
		String newfileName = UUID.randomUUID().toString() + fileStr.substring(fileStr.lastIndexOf("."));
		//3. ��ͼƬ���浽Ӳ��\\lixin\\WebContent\\image
		imageFile.transferTo(new File("E:\\woekspace\\lixin\\WebContent\\image\\" + newfileName));
		//4.��ͼƬ���Ʊ��浽���ݿ�
//		items.setPic(newfileName);
		product.setImage(newfileName);
//		List<Product> products = productService.selectlassify(one_menu, two_menu, start);
		productService.save(product);

	}
}
