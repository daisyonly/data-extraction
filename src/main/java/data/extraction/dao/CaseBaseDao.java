package data.extraction.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.RepositoryDefinition;

import data.extraction.domain.CaseBaseInfo;

@RepositoryDefinition(domainClass = CaseBaseInfo.class, idClass = Long.class) 
public interface CaseBaseDao{
    public Page<CaseBaseInfo> findAll(Pageable pageable); 
}
