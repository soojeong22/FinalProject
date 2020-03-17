package com.job.coverletter.model.coverletter.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CoverLetterDaoImpl implements CoverLetterDao {

	@Autowired
	private SqlSessionTemplate sqlSession;
}
