package com.docmall.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.docmall.domain.OrderVO;
import com.docmall.dto.Criteria;
import com.docmall.mapper.AdOrderMapper;

import lombok.Setter;

@Service
public class AdOrderServiceImpl implements AdOrderService {

	@Setter(onMethod_ = {@Autowired})
	private AdOrderMapper adOrderMapper;

	@Override
	public List<OrderVO> getOrderList(Criteria cri) {
		// TODO Auto-generated method stub
		return adOrderMapper.getOrderList(cri);
	}

	@Override
	public int getOrderTotalCount(Criteria cri) {
		// TODO Auto-generated method stub
		return adOrderMapper.getOrderTotalCount(cri);
	}
}
