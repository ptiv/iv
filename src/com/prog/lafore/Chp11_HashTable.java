package com.prog.lafore;

/**
 * Implementation of Hash Table
 * @author ptemkar
 * @date 08/06/13
 *
 */
public class Chp11_HashTable {

	int size;
	DataItem[] hashTableArr;
	
	public Chp11_HashTable(int size){
		this.size = size;
		this.hashTableArr = new DataItem[size];
	}

	public int hashFunc(int key){
		int hashValue = key % size;
		return hashValue;
	}
	
	public void insert(DataItem dataItem){
		int hashValue = hashFunc(dataItem.key);
		
		while(hashTableArr[hashValue] != null){
			hashValue++;
			hashValue = hashValue % size;
		}
		
		hashTableArr[hashValue] = dataItem;
		
	}
	
	//does not take into account the condition where the HashTable is full
	public DataItem find(int key){
		int hashValue = hashFunc(key);
		
		while(hashTableArr[hashValue] != null){
			if(hashTableArr[hashValue].key == key){
				return hashTableArr[hashValue];
			}
			hashValue++;
			hashValue = hashValue % size;
		}
		
		return null;
		
	}
	
	public void displayHashTable(){
		for(DataItem dataItem : hashTableArr){
			if(dataItem == null){
				System.out.println("key : * data : * ");
			}else{
				System.out.println("key : " + dataItem.key + " data : " + dataItem.data);
			}
			
		}
		System.out.println();
	}
	
	
	public DataItem delete(int key){
		int hashValue = hashFunc(key);
		int count = 0;
		
		while(hashTableArr[hashValue] != null){
			if(count == size){
				//not found
				break;
			}else if(hashTableArr[hashValue].key == key){
				DataItem temp = hashTableArr[hashValue];
				hashTableArr[hashValue].key = -1;
				hashTableArr[hashValue].data = "";
				return temp;
			}
			hashValue++;
			count++;
			hashValue = hashValue % size;
		}
		
		return null;
	}
	
}

class DataItem{
	int key;
	String data;
	
	public DataItem(int key, String data){
		this.key = key;
		this.data = data;
	}
}