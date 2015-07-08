package br.com.gepro.business;

import java.util.List;

import br.com.gepro.common.IntegrityCommon;
import br.com.gepro.dao.CompanyDaoImpl;
import br.com.gepro.entity.CompanyEntity;

public class CompanyBoImpl implements CompanyBo {

	CompanyDaoImpl companyBo = new CompanyDaoImpl();
	
    public List<CompanyEntity> selectAll(){
    	return companyBo.selectAll();
    }
    
    public CompanyEntity selectById(String id){
        return companyBo.selectById(id);
    } 
    
    public String insert(CompanyEntity company){
    	company.setId(IntegrityCommon.primaryKey());
    	return companyBo.insert(company);
    }
    
    public int delete(String id){
    	return companyBo.delete(id);
    }	

    public int update(CompanyEntity customer){
    	return companyBo.update(customer);
    }    

}
