package br.com.gepro.entity;

public class CompanyEntity extends BaseEntity  {

	public CompanyEntity() {
		super();
	}

	public String getFullName() {
		return FullName;
	}

	public void setFullName(String fullName) {
		FullName = fullName;
	}

	private String FullName;
//	private List<EventStepEntity> Steps;
	

}





