package com.docmall.mapper;

import com.docmall.domain.UserVO;

public interface UserMapper {
	
	void insert(UserVO vo);
	
	UserVO joininfo();
}
