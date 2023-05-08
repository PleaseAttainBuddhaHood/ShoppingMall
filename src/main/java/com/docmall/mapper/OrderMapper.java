package com.docmall.mapper;

import org.apache.ibatis.annotations.Param;

import com.docmall.domain.CartVO;
import com.docmall.domain.CartVOList;
import com.docmall.domain.OrderDetailVO;
import com.docmall.domain.OrderVO;
import com.docmall.domain.PaymentVO;

public interface OrderMapper {

	//1)주문정보 저장하기
	void orderSave(OrderVO vo);  // odr_code NULL상태
	
	//2-1)주문상세 저장하기.  장바구니테이블의 데이타를 참조해서, 주문상세테이블에 저장한다.
	void orderDetailSave(@Param("odr_code") Long odr_code, @Param("mem_id") String mem_id);
	
	//2-2)주문상세 저장하기.  바로구매에서 주문상세저장하기(장바구니 사용안함)
	void orderDirectDetailSave(OrderDetailVO vo);
	//3)결제정보 저장하기
	void paymentSave(PaymentVO vo);
	
	//바로구매에서 보여줄 주문내역
	CartVOList directOrder(CartVO vo);
	
	//시퀀스 가져오기
	long getOrderSequence();
	
}
