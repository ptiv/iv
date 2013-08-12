package com.prog.lafore;

import java.util.Stack;

/**
 * 
 * Graph implementation from Lafore
 * 
 * @author ptemkar
 * @date : 08/11/13
 */
public class Chp13_Graph{
	
	Vertex[] vertexList;
	int vertexCount = 0;
	int[][] adjMatrix;
	Stack<Vertex> vertexStack = new Stack<Vertex>();
	
	public Chp13_Graph(int numOfVertices){
		vertexList = new Vertex[numOfVertices];
		adjMatrix = new int[numOfVertices][numOfVertices];
	}
	
	public void addVertex(char label){
		vertexList[vertexCount] = new Vertex(label, vertexCount);
		vertexCount++;
	}
	
	public void addEdge(int start, int end){
		adjMatrix[start][end] = 1;
		adjMatrix[end][start] = 1;
	}
	
	public void displayGraph(){
		System.out.println("---		Graph	---");
		for(int i=0 ; i<adjMatrix.length ; i++){
			for(int j=0 ; j<adjMatrix[i].length ; j++){
				System.out.print(adjMatrix[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public void dfs(int index){
		
		Vertex vertex = vertexList[index];
		vertex.visited = true;
		vertex.displayVertex();
		vertexStack.push(vertex);
		
		while(!vertexStack.isEmpty()){
		
			Vertex stackTop = vertexStack.peek();
			Vertex unvisitedAdjacentVertex = getUnvisitedAdjacentVertex(stackTop.index);
			if(unvisitedAdjacentVertex != null){
				unvisitedAdjacentVertex.visited = true;
				unvisitedAdjacentVertex.displayVertex();
				vertexStack.push(unvisitedAdjacentVertex);
			}else{
				vertexStack.pop();
			}
			
		}
		
	}
	
	public Vertex getUnvisitedAdjacentVertex(int index){
		for(int i=0; i < adjMatrix[index].length ; i++){
			int edge = adjMatrix[index][i];
			if(edge == 1 && vertexList[i].visited == false){
				vertexList[i].visited = true;
				return vertexList[i];
			}
		}
		return null;
	}
	
}

class Vertex{
	
	char label;
	//index in the array 'vertexList'
	int index;
	boolean visited;
	
	public Vertex(char label, int index){
		this.label = label;
		this.index = index;
		visited = false;
	}
	
	public void displayVertex(){
		System.out.println(label);
	}

	
}