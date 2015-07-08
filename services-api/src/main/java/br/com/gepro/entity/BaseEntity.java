package br.com.gepro.entity;

class BaseEntity {

	protected BaseEntity() {
		super();
	}
	private String Id;
	private Boolean Active;

	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}

	public Boolean getActive() {
		return Active;
	}

	public void setActive(Boolean active) {
		Active = active;
	} 
	
}
