package com.job.coverletter.model.skill.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class SkillDaoImpl implements SkillDao {
	@Autowired
	private SqlSessionTemplate sqlSession;
}
