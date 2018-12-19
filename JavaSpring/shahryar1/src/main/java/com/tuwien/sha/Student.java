package com.tuwien.sha;

public class Student {
     
	private Course course;
	
	private int id;
	private String name;
	private String family;
	private int feeRef;
	private String address;

	public Student() {

	}

	public Student(int id, String family) {

		this.id = id;
		this.family = family;
	}

	
   
 

	public void setCourse(Course course) {
		this.course = course;
	}

	public void setName(String name) {
		this.name = name;
	}


	public void setFeeRef(int feeRef) {
		this.feeRef = feeRef;
	}



	public void setAddress(String address) {
		this.address = address;
	}

	

	@Override
	public String toString() {
		return "Student [course=" + course + ", id=" + id + ", name=" + name + ", family=" + family + ", feeRef="
				+ feeRef + ", address=" + address + "]";
	}

	
	 public Student onCreateStudent() {
		 System.out.println(" this is student create method  and here is the variable values by the starting time \n" + this);
		 return new Student (5 , "Ali");
		 }
	 
	 public void onDestroyStudent (){
		 System.out.println("this  student bean is destroyed and here is the values by destroying time \n"+ this );
	 }
	 
	 public static Student factoryMethodStudent() {
		 System.out.println("this is student factory method");
		return  new Student(8, "taheri");
	 }
	 
	public void speak() {

		System.out.println("this student speaks:  گیت هاب کار میکند");
		System.out.println("this student speaks: kheily khub ");
		System.out.println("this student speaks:  ye commit dige ");
	}

	public void Student(int i, String string) {
		// TODO Auto-generated method stub
		this.id =i;
		this.family = string ;
	}

}
