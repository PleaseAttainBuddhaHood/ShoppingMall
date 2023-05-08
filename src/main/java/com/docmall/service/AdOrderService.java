package com.docmall.service;

import java.util.List;

import com.docmall.domain.OrderVO;
import com.docmall.dto.Criteria;

public interface AdOrderService {

	List<OrderVO> getOrderList(Criteria cri);
	
	int getOrderTotalCount(Criteria cri);
}
