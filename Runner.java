package com.Sorting;

public class Runner 
{
	public static void main1(String[] args){
	System.out.println("Kows");
	}

	public static void main(String[] args){
	Details[] newdetails = {
	          new Details("Banana", "Apple", 465),
	          new Details("Wolf", "Monkey", 4645),
	          new Details("Zebra", "Apple", 65),
	          new Details("Cat", "Dog", 605),
	          new Details("Integer", "Bite", 2345),
	        };
	
			
    sortting.sortAscend(newdetails);

    for(Details d:newdetails) {
	    System.out.println(d);
    }
   
    sortting.sortDescend(newdetails);
   
    for(Details d:newdetails) {
	    System.out.println(d);
    }
	}

}


