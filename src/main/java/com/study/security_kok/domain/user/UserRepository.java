package com.study.security_kok.domain.user;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserRepository {
	public int save(User user) throws Exception;
	public User indUserByUsername(String username) throws Exception;
}
