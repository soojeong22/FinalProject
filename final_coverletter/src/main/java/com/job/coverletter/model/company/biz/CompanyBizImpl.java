package com.job.coverletter.model.company.biz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.job.coverletter.model.company.dao.CompanyDao;

@Service
public class CompanyBizImpl implements CompanyBiz {

	@Autowired
	private CompanyDao companydao;
}
