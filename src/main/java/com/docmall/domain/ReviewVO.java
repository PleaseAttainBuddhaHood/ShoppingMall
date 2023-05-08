package com.docmall.domain;

import java.util.Date;

import lombok.Data;

// 스프링에서 사용하는 VO클래스는 setter,getter, toString 메서드는 필수.

@Data
public class ReviewVO {

	// rv_num, mem_id, pdt_num, rv_content, rv_score, rv_date_reg
	private Long rv_num;
	private String mem_id;
	private Integer pdt_num;
	private String rv_content;
	private int	rv_score;
	private Date rv_date_reg;
	
}
