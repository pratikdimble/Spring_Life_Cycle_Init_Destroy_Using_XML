package com.app.xml_config;

public class model_spring_bean {
	private int id;
	private String name;
	public model_spring_bean() {
		super();
		
	}
	public void init()
	{
		System.out.println("\t\t***YOU ARE IN INIT");
	}
	public void destroy() {
		
		System.out.println("\t\t***YOU ARE IN DESTROY");
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	@Override
	public String toString() {
		return "model_spring_bean [id=" + id + ", name=" + name + "]";
	}

	

}
