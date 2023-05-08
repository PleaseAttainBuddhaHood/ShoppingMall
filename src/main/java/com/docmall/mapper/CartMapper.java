package com.docmall.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.docmall.domain.CartVO;
import com.docmall.domain.CartVOList;

public interface CartMapper {

	//장바구니 추가
	void cart_add(CartVO vo);
	
	//장바구니 목록
	List<CartVOList> cart_list(String mem_id);
	
	//장바구니 수량변경
	void cart_qty_change(@Param("cart_code") Long cart_code, @Param("cart_amount") int cart_amount);
	
	//장바구니 삭제
	void cart_delete(Long cart_code);
	
	//장바구니 비우기
	void cart_empty(String mem_id);
	
	//장바구니 선택삭제. 파라미터 List컬렉션 사용.
	void cart_sel_delete(List<Long> cart_code_arr);
}
