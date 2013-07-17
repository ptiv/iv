package com.prog.lafore;

/**
 * 
 * Chapter 2. Programming project 1, page 76
 * 
 * add getMax() method to get he max value in the array
 *
 */
////////////////////////////////////////////////////////////////
class Chp2_Q1
{
	private long[] a;                 // ref to array a
	private int nElems;               // number of data items
	//-----------------------------------------------------------
	public Chp2_Q1(int max)         // constructor
	{
		a = new long[max];                 // create the array
		nElems = 0;                        // no items yet
	}
	//-----------------------------------------------------------
	
	public long getMax(){
		int j;
		long max = -1;
		for(j=0; j<nElems; j++){
			if(a[j] > max){
				max = a[j];
			}
		}
		return max;
	}

	
	//-----------------------------------------------------------
	public boolean find(long searchKey)
	{                              // find specified value
		int j;
		for(j=0; j<nElems; j++)            // for each element,
			if(a[j] == searchKey)           // found item?
				break;                       // exit loop before end
		if(j == nElems)                    // gone to end?
			return false;                   // yes, can't find it
		else
			return true;                    // no, found it
	}  // end find()
	//-----------------------------------------------------------
	public void insert(long value)    // put element into array
	{
		a[nElems] = value;             // insert it
		nElems++;                      // increment size
	}
	//-----------------------------------------------------------
	public boolean delete(long value)
	{
		int j;
		for(j=0; j<nElems; j++)        // look for it
			if( value == a[j] )
				break;
		if(j==nElems)                  // can't find it
			return false;
		else                           // found it
		{
			for(int k=j; k<nElems; k++) // move higher ones down
				a[k] = a[k+1];
			nElems--;                   // decrement size
			return true;
		}
	}  // end delete()
	//-----------------------------------------------------------
	public void display()             // displays array contents
	{
		for(int j=0; j<nElems; j++)       // for each element,
			System.out.print(a[j] + " ");  // display it
		System.out.println("");
	}
	//-----------------------------------------------------------
}  // end class HighArray
////////////////////////////////////////////////////////////////
class HighArrayApp
{
	//add a  Unit test class  
} 
