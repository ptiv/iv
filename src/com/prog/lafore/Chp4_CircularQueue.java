package com.prog.lafore;

/**
 * 
 * @author ptemkar
 * @date 06/22/13
 */
public class Chp4_CircularQueue{
	
	int count=0;
	int[] queue;
	int front=-1;
	int rear=-1;
	int size;
	
	public Chp4_CircularQueue(int[] queue){
		this.queue = queue;
		size = queue.length;
	}
	
	public void insert(int element) throws QueueFullException{
		if(isQueueFull()){
			throw new QueueFullException();
		}else{
			
			//if the queue was empty before inserting, increment 'front' as well
			if(isQueueEmpty()){
				front++;
			}

			//if the queue has reached the tail of the array, rotate the 'rear' and set it 
			//to 0
			if(rear == size-1){
				rear = 0;
				queue[rear] = element;
			}else{
				queue[++rear] = element;
			}
		
			count++;
			
		}
	}
	
	public int remove() throws QueueEmptyException{
		
		if(isQueueEmpty()){
			throw new QueueEmptyException();
		}else{
			int element;
			
			//if the current 'front' is at the tail of the array, rotate the 'front' and
			//set it to 0
			
			if(front == size-1){
				element = queue[front];
				front = 0;
			}else{
				element = queue[front++];
			}
					
			count--;
			
			if(isQueueEmpty()){
				front = -1;
				rear = -1;
			}
			
			return element;
		}
	
	}
	
	public int peekFront(){
		return queue[front];
	}
	
	public boolean isQueueEmpty(){
		if(count == 0){
			return true;
		}else{
			return false;
		}
	}
	
	public boolean isQueueFull(){
		if(count == size){
			return true;
		}else{
			return false;
		}
	}
	
}

class QueueFullException extends Exception{
}

class QueueEmptyException extends Exception{
}