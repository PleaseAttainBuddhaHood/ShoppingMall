package com.docmall.mapper;

import java.util.List;

import com.docmall.domain.OrderVO;
import com.docmall.dto.Criteria;

public interface AdOrderMapper {

	List<OrderVO> getOrderList(Criteria cri);
	
	int getOrderTotalCount(Criteria cri);
}
