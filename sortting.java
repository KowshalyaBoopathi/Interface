package com.Sorting;

public class sortting
{

public static <E extends Comparable<Details> >void sortAscend(E[] array)
{
	int n=array.length;
	E temp;
	for(int i=0; i < n; i++){
          		for(int j=1; j < (n-i); j++){
          			if(array[j-1].compareTo((Details) array[j])>0){
          				temp = array[j-1];
          				array[j-1] = array[j];
          				array[j] = temp;
          			}
          		}
          	}
}

public static <E extends Comparable<Details> >void sortDescend(E[] array)
{
	int n=array.length;
	E temp;
	for(int i=0; i < n; i++){
          		for(int j=1; j < (n-i); j++){
          			if(array[j-1].compareTo((Details)array[j])<0){
          				temp = array[j-1];
          				array[j-1] = array[j];
          				array[j] = temp;
          			}
          		}
          	}
}
}

