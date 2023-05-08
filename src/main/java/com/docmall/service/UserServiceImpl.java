package com.docmall.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.docmall.domain.UserVO;
import com.docmall.mapper.UserMapper;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserMapper userMapper;

	@Override
	public void insert(UserVO vo) {
		
		userMapper.insert(vo);
	}

	@Override
	public UserVO joininfo() {
		// TODO Auto-generated method stub
		return userMapper.joininfo();
	}
}
