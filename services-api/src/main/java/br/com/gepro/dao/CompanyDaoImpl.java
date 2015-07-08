package br.com.gepro.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import br.com.gepro.entity.CompanyEntity;
import br.com.gepro.mapper.DataConnectionFactory;

public class CompanyDaoImpl extends BaseDao implements CompanyDao {

    private SqlSessionFactory sqlSessionFactory = null;
    
    public CompanyDaoImpl(){
    	this.sqlSessionFactory = DataConnectionFactory.getSqlSessionFactory();
    }
 
    public List<CompanyEntity> selectAll(){
    	List<CompanyEntity> list = null;
        SqlSession session = sqlSessionFactory.openSession();
 
        try {
            list = session.selectList("Company.selectAll");
        } finally {
            session.close();
        }
        System.out.println("selectAll() --> "+list);
        return list;

    }

    public CompanyEntity selectById(String id){
    	CompanyEntity customer = null;
        SqlSession session = sqlSessionFactory.openSession();
        try {
        	customer = session.selectOne("Company.selectById", id);
        } finally {
            session.close();
        }
        System.out.println("selectById("+id+") --> "+customer);
        return customer;
    } 

    public String insert(CompanyEntity company){
	   @SuppressWarnings("unused")
	int id = -1;
        SqlSession session = sqlSessionFactory.openSession();

        try {
            id = session.insert("Company.insert", company);
        } finally {
            session.commit();
            session.close();
        }
        System.out.println("insert("+company+") --> "+company.getId());
        return company.getId();
    }

    public int update(CompanyEntity company){

	int id = -1;
      SqlSession session = sqlSessionFactory.openSession();

      try {
          id = session.update("Company.update", company);

      } finally {
          session.commit();
          session.close();
      }
      System.out.println("update("+company+") --> updated");
      return id;
  }
 
    public int delete(String id){
    	int ret = -1;
        SqlSession session = sqlSessionFactory.openSession();
 
        try {
            ret = session.delete("Company.delete", id);
        } finally {
            session.commit();
            session.close();
        }
        System.out.println("delete("+id+")");
        return ret;

    }	

    
}
