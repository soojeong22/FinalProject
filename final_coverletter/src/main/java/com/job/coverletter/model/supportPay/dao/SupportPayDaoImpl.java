package com.job.coverletter.model.supportPay.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class SupportPayDaoImpl implements SupportPayDao {
	
	@Autowired
	private SqlSessionTemplate sqlSession;
}
