package data.extraction.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import data.extraction.dao.CaseBaseDao;
import data.extraction.domain.CaseBaseInfo;

@Service("caseService")
public class CaseService {

    @Autowired
    private CaseBaseDao caseBaseDao;

    public Page<CaseBaseInfo> findAll(int page)
    {
        return  caseBaseDao.findAll(new PageRequest(page-1, 10));
    }
}
