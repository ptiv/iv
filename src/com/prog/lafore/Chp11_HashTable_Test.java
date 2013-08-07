package com.prog.lafore;

import org.junit.Test;
import static org.junit.Assert.*;

public class Chp11_HashTable_Test{

	Chp11_HashTable chp11_HashTable = new Chp11_HashTable(3);
	
	DataItem dataItem0 = new DataItem(0, "Tom");
	DataItem dataItem1 = new DataItem(1, "John");
	DataItem dataItem2 = new DataItem(2, "Mary");
	DataItem dataItem3 = new DataItem(3, "Bob");
	DataItem dataItem4 = new DataItem(4, "Sara");
	
	@Test
	public void test_inserts(){
		
		chp11_HashTable.insert(dataItem1);
		chp11_HashTable.insert(dataItem2);
		
		System.out.println(" --- print after 2 inserts --- ");
		chp11_HashTable.displayHashTable();
		
		assertEquals(2, chp11_HashTable.find(2).key);
		assertEquals("Mary", chp11_HashTable.find(2).data);
	}
	
	@Test
	public void test_inserts_withCollision(){
		
		chp11_HashTable.insert(dataItem1);
		chp11_HashTable.insert(dataItem2);
		chp11_HashTable.insert(dataItem4);
		
		System.out.println(" --- print after inserts & collisions--- ");
		chp11_HashTable.displayHashTable();
		
		assertEquals(4, chp11_HashTable.find(4).key);
		assertEquals("Sara", chp11_HashTable.find(4).data);
	}
	
	@Test
	public void test_delete(){
		
		chp11_HashTable.insert(dataItem1);
		chp11_HashTable.insert(dataItem2);	
		assertEquals(2, chp11_HashTable.find(2).key);
		
		chp11_HashTable.delete(2);		
		System.out.println(" --- print after  deletion --- ");
		chp11_HashTable.displayHashTable();
		
		assertEquals(null, chp11_HashTable.find(2));
		
	}
	
	
}