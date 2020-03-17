package com.job.coverletter.model.joinUser.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class JoinUserDaoImpl implements JoinUserDao {
	@Autowired
	private SqlSessionTemplate sqlSession;
}
