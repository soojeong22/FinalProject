package com.job.coverletter.model.school.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class SchoolDaoImpl implements SchoolDao {
	@Autowired
	private SqlSessionTemplate sqlSession;
}
