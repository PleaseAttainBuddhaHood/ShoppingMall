package com.docmall.service;

import java.util.List;

import com.docmall.domain.CartVO;
import com.docmall.domain.CartVOList;
import com.docmall.domain.OrderDetailVO;
import com.docmall.domain.OrderVO;
import com.docmall.domain.PaymentVO;

public interface OrderService {
	
	List<CartVOList> cart_list(String mem_id);
	
	// 장바구니 -> 주문
	void orderSave(OrderVO o_vo, PaymentVO p_vo);  // String type 제거
	
	// 바로구매 -> 주문
	void orderDirectSave(OrderVO o_vo, OrderDetailVO od_vo, PaymentVO p_vo);  // 추가
	
	CartVOList directOrder(CartVO vo);
	
	long getOrderSequence();
}
