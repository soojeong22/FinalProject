package com.job.coverletter.model.jabcalendar.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class JabCalendarDaoImpl implements JabCalendarDao {
	@Autowired
	private SqlSessionTemplate sqlSession;
}
