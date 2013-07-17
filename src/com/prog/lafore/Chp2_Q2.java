package com.prog.lafore;

/**
 * 
 * Chapter 2. Programming project 1, page 76
 * 
 * add removeMax() method to get the max value in the array and remove it
 *
 */
////////////////////////////////////////////////////////////////
class Chp2_Q2
{
	private long[] a;                 // ref to array a
	private int nElems;               // number of data items
	//-----------------------------------------------------------
	public Chp2_Q2(int max)         // constructor
	{
		a = new long[max];                 // create the array
		nElems = 0;                        // no items yet
	}
	//-----------------------------------------------------------
	
	public long removeMax(){
		int j,k, maxIndex=0;
		long max = -1;

		//identifying the max value
		for(j=0; j<nElems; j++){
			if(a[j] > max){
				max = a[j];
				maxIndex = j;
			}
		}
		
		//If it's a non-zero-size array, remove the max value
		if(max != -1){

			for(k=maxIndex; k<nElems-1; k++){
				a[k] = a[k+1];
			}

			nElems--;
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
class HighArrayApp2
{
	//add a  Unit test class
}
