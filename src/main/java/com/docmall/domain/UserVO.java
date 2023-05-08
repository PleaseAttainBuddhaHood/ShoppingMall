package com.docmall.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class UserVO {

	/*
CREATE TABLE MEMBER (
    ID  VARCHAR2(15)    PRIMARY KEY,
    PW  VARCHAR2(15)    NOT NULL,
    NAME    VARCHAR2(20)    NOT NULL,
    PHONE   VARCHAR2(20)    NOT NULL,
    ADDRESS VARCHAR2(100)   NOT NULL,
    GENDER  CHAR(6) NOT NULL,
    EMAIL   VARCHAR2(30)    NOT NULL
);

id, pw, name, phone, address, gender, email
	 */
	private String id;
	private String pw;
	private String name;
	private String phone;
	private String address;
	private String gender;
	private String email;
}
