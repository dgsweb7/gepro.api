package br.com.gepro.business;

import java.util.List;

import br.com.gepro.entity.CompanyEntity;


public interface CompanyBo {

    public List<CompanyEntity> selectAll();
    public CompanyEntity selectById(String id);
    public String insert(CompanyEntity company);
    public int delete(String id);
    public int update(CompanyEntity company);
    
}
