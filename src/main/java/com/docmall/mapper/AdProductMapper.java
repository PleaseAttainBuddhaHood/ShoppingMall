package com.docmall.mapper;

import java.util.List;

import com.docmall.domain.CategoryVO;
import com.docmall.domain.ProductVO;
import com.docmall.dto.Criteria;

public interface AdProductMapper {

	//1차카테고리 목록
	List<CategoryVO> getCategoryList();
	
	//1차카테고리를 참조하는 2차카테고리 목록
	List<CategoryVO> getSubCategoryList(Integer cate_code);
	
	//상품정보 저장
	void productInsert(ProductVO vo);
	
	//상품목록
	List<ProductVO> getProductList(Criteria cri);
	
	//상품개수
	int getProductTotalCount(Criteria cri);
	
	//상품수정정보
	ProductVO getProductByNum(Integer pdt_num);
	
	//상품수정하기
	void productModify(ProductVO vo);
	
	//상품삭제하기
	void productDelete(Integer pdt_num);

	
}
