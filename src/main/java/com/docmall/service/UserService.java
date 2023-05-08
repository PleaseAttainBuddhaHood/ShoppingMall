package com.docmall.service;

import com.docmall.domain.UserVO;

public interface UserService {

	void insert(UserVO vo);
	
	UserVO joininfo();
}
