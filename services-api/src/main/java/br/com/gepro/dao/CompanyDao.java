package br.com.gepro.dao;

import java.util.List;

import br.com.gepro.entity.CompanyEntity;

interface CompanyDao  {

    public List<CompanyEntity> selectAll();
    public CompanyEntity selectById(String id);
    public String insert(CompanyEntity event);
    public int update(CompanyEntity event);
    public int delete(String id);
    
}
