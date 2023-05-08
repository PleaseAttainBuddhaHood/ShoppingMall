package com.docmall.service;

import java.util.List;

import com.docmall.domain.CategoryVO;
import com.docmall.domain.ProductVO;
import com.docmall.dto.Criteria;

public interface ProductService {

	List<CategoryVO> getCategoryList();
	
	List<CategoryVO> getSubCategoryList(Integer cate_code);
	
	List<ProductVO> getProductListbysubCategory(Integer cate_code, Criteria cri);
	
	int getProductCountbysubCategory(Integer cate_code, Criteria cri);
	
	ProductVO getProductDetail(Integer pdt_num);
}
