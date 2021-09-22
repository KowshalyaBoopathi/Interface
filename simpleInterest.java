package com.Sorting;
import Package2.interest;
public class simpleInterest implements interest{
	  float principle,noofyears,rateofinterest;
	  simpleInterest(float principle,float noofyears,float rateofinterest){
	    this.principle=principle;
	    this.noofyears=noofyears;
	    this.rateofinterest=rateofinterest;
	  }
	  float simpleinterest;
	  @Override
	  public void callInterest(){
	  simpleinterest=(principle*noofyears*rateofinterest)/100;
	  System.out.println("Simple Interset is "+simpleinterest);
	  }

	public static void main(String[] args){
	  simpleInterest amount=new simpleInterest(1500,12,1);
	  amount.callInterest();
	  interest amount1=new compoundInterest(150,1,1,2);
	  amount1.callInterest();
	}
	}
	class compoundInterest implements interest{
	  float principle,noofyears,rateofinterest,timeperiod;
	  compoundInterest(float principle,float noofyears,float rateofinterest,float timeperiod){
	    this.principle=principle;
	    this.noofyears=noofyears;
	    this.rateofinterest=rateofinterest;
	    this.timeperiod=timeperiod;
	  }
	  double compoundinterest;
	  @Override
	  public void callInterest(){
	  compoundinterest=(principle*Math.pow(1+(rateofinterest/noofyears),noofyears*timeperiod))-principle;
	  System.out.println("Compound Interset is "+compoundinterest);
	  }
	}

