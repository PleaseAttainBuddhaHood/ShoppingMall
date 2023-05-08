package com.docmall.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.docmall.domain.CategoryVO;
import com.docmall.domain.ProductVO;
import com.docmall.dto.Criteria;
import com.docmall.mapper.ProductMapper;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductMapper productMapper;

	@Override
	public List<CategoryVO> getCategoryList() {
		// TODO Auto-generated method stub
		return productMapper.getCategoryList();
	}

	@Override
	public List<CategoryVO> getSubCategoryList(Integer cate_code) {
		// TODO Auto-generated method stub
		return productMapper.getSubCategoryList(cate_code);
	}

	@Override
	public List<ProductVO> getProductListbysubCategory(Integer cate_code, Criteria cri) {
		// TODO Auto-generated method stub
		return productMapper.getProductListbysubCategory(cate_code, cri);
	}

	@Override
	public int getProductCountbysubCategory(Integer cate_code, Criteria cri) {
		// TODO Auto-generated method stub
		return productMapper.getProductCountbysubCategory(cate_code, cri);
	}

	@Override
	public ProductVO getProductDetail(Integer pdt_num) {
		// TODO Auto-generated method stub
		return productMapper.getProductDetail(pdt_num);
	}
}
