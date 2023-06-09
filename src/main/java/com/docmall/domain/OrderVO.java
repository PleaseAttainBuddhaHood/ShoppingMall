package com.docmall.domain;

import java.util.Date;

import lombok.Data;


//주문자정보와 배송지정보
@Data
public class OrderVO {
		
	private Long odr_code;  // 시퀀스값 할당.
	private String mem_id;
	private String odr_name;
	private String odr_zipcode;
	private String odr_addr;
	private String odr_addr_d;
	private String odr_phone;
	private int	odr_total_price;
	private Date odr_date;
}
