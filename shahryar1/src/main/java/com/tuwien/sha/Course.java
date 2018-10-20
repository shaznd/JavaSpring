package com.tuwien.sha;

public class Course {

	int duration;
	int id;
	String name;
	
	
	boolean access;
	
	
	public Course() {
		
	}


	public Course(int id, String name) {
		
		this.id = id;
		this.name = name;
	}




	
	public void setDuration(int duration) {
		this.duration = duration;
	}


	public void setAccess(boolean access) {
		this.access = access;
	}




	public void teach() {
		System.out.println("hello i can teach you many things");
	}


	@Override
	public String toString() {
		return "Course [duration=" + duration + ", id=" + id + ", name=" + name + ", access=" + access + "]";
	}

	
	


}

