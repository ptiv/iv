package com.prog.lafore;

public class Chp2_Q4 {
	private long[] a;                 // ref to array a
	private int nElems;               // number of data items
	//-----------------------------------------------------------
	public Chp2_Q4(int max)          // constructor
	{
		a = new long[max];             // create array
		nElems = 0;
	}
	//-----------------------------------------------------------
	public int size()
	{ return nElems; }
	//-----------------------------------------------------------
	public int find(long searchKey)
	{
		int lowerBound = 0;
		int upperBound = nElems-1;
		int curIn;

		while(true)
		{
			curIn = (lowerBound + upperBound ) / 2;
			if(a[curIn]==searchKey)
				return curIn;              // found it
				else if(lowerBound > upperBound)
					return nElems;             // can't find it
				else                          // divide range
				{
					if(a[curIn] < searchKey)
						lowerBound = curIn + 1; // it's in upper half
					else
						upperBound = curIn - 1; // it's in lower half
				}  // end else divide range
		}  // end while
	}  // end find()
	
	//-----------------------------------------------------------

	//helper method to move elements after inserting an element
	private void moveElements(long value, int position){
		
		// move bigger ones up
		for(int k=nElems; k>position; k--)    
			a[k] = a[k-1];

		
		a[position] = value;
		nElems++;
	
	}
	
	//-----------------------------------------------------------
	public void insert(long value)    // put element into array
	{

		int lowerEnd = 0;
		int upperEnd = 0;
		if(nElems != 0){
			upperEnd = nElems-1;
		}

		
		while(true){
			
			if(nElems == 0){
				a[0] = value;
				nElems++;
				break;
			}else if(nElems == 1){
				if(value < a[0] ){
					moveElements(value, 0);
				}else{
					a[1] = value;
					nElems++;
				}
				break;
			}
			
			int difference = upperEnd - lowerEnd;
			int midPoint = lowerEnd + difference/2;
			if(difference == 1 && midPoint != 0){
				midPoint = lowerEnd + 1;
			}

			if( (value==a[midPoint]) ) {
				moveElements(value, midPoint);
				break;
			}else if(value<a[midPoint] && midPoint == 0){
				moveElements(value, midPoint);
				break;
			}else if(value<a[midPoint] && value>a[midPoint-1]){
				moveElements(value, midPoint);
				break;
			}else if(value<a[midPoint]){		
				upperEnd = midPoint;
			}else{
				lowerEnd = midPoint;
			}
		}
	}  // end insert()
	//-----------------------------------------------------------
	public boolean delete(long value)
	{
		int j = find(value);
		if(j==nElems)                  // can't find it
			return false;
		else                           // found it
		{
			for(int k=j; k<nElems; k++) // move bigger ones down
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
}  // end class OrdArray
////////////////////////////////////////////////////////////////

class OrderedApp
{
	public static void main(String[] args)
	{
		int maxSize = 100;             // array size
		Chp2_Q4 arr;                  // reference to array
		arr = new Chp2_Q4(maxSize);   // create the array

		arr.insert(77);                // insert 10 items
		arr.display();
		arr.insert(99);
		arr.display();
		arr.insert(44);
		arr.display();
		arr.insert(55);
		arr.display();
		arr.insert(22);
		arr.display();
		arr.insert(88);
		arr.display();
		arr.insert(11);
		arr.display();
		arr.insert(00);
		arr.display();
		arr.insert(66);
		arr.display();
		arr.insert(33);
		arr.display();

		int searchKey = 55;            // search for item
		if( arr.find(searchKey) != arr.size() )
			System.out.println("Found " + searchKey);
		else
			System.out.println("Can't find " + searchKey);

		arr.display();                 // display items

		arr.delete(00);                // delete 3 items
		arr.delete(55);
		arr.delete(99);

		arr.display();                 // display items again
	}  // end main()

}
