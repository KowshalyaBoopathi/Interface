package com.Sorting;

public class Details implements Comparable <Details>{
    private String name;
	String email;
    int number;
    
    public Details(String name, String email, int number) {
		super();
		this.name = name;
		this.email = email;
		this.number = number;
	}
    
    public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

       
		@Override
	public String toString() {
		return "Details [name=" + name + ", email=" + email + ", number=" + number + "]";
	}

 
	public int compareTo(Details newdetails4) {
		if (this.getNumber() > newdetails4.getNumber())
			return 1;
		else
			return -1;
	}	
	
}  




