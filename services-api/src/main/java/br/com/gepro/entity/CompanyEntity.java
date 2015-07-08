package br.com.gepro.entity;

import java.util.List;

public class CompanyEntity extends BaseEntity  {

	public CompanyEntity() {
		super();
	}

	private String FullName;
	private String UrlEndpoint;
	private List<UserEntity> Users;

	public String getFullName() {
		return FullName;
	}

	public void setFullName(String fullName) {
		FullName = fullName;
	}

	public String getUrlEndpoint() {
		return UrlEndpoint;
	}

	public void setUrlEndpoint(String urlEndpoint) {
		UrlEndpoint = urlEndpoint;
	}

	public List<UserEntity> getUsers() {
		return Users;
	}

	public void setUsers(List<UserEntity> users) {
		Users = users;
	}

	

}





