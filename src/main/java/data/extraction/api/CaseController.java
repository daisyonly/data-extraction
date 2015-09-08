package data.extraction.api;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;

import data.extraction.domain.CaseBaseInfo;
import data.extraction.service.CaseService;

@Controller
public class CaseController{
	
	@Autowired
    private CaseService caseService;

	public Page<CaseBaseInfo> loadScriptContent(int page) {
				return caseService.findAll(page);		
	}

}
