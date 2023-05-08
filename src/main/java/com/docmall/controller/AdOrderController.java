package com.docmall.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.docmall.domain.OrderVO;
import com.docmall.dto.Criteria;
import com.docmall.dto.PageDTO;
import com.docmall.service.AdOrderService;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@Log4j
@RequestMapping("/admin/order/*")
@Controller
public class AdOrderController {

	@Setter(onMethod_ = {@Autowired})
	private AdOrderService adOrderService;
	
	//주문목록
	@GetMapping("/orderList")
	public void orderList(Criteria cri, Model model) {
		
		// 주문목록
		List<OrderVO> orderList = adOrderService.getOrderList(cri);
		model.addAttribute("orderList", orderList);
		
		// 페이징정보
		int totalCount = adOrderService.getOrderTotalCount(cri);
		model.addAttribute("pageMaker", new PageDTO(cri, totalCount));
	}
}
