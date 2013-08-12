package com.prog.lafore;

import org.junit.Before;
import org.junit.Test;

public class Chp13_Graph_Test{
	
	Chp13_Graph chp13_Graph = new Chp13_Graph(9);
	
	@Before
	public void setupGraph(){
		
		chp13_Graph.addVertex('A');
		chp13_Graph.addVertex('B');
		chp13_Graph.addVertex('C');
		chp13_Graph.addVertex('D');
		chp13_Graph.addVertex('E');
		chp13_Graph.addVertex('F');
		chp13_Graph.addVertex('G');
		chp13_Graph.addVertex('H');
		chp13_Graph.addVertex('I');
		
		chp13_Graph.addEdge(0,1);
		chp13_Graph.addEdge(0,2);
		chp13_Graph.addEdge(0,3);
		chp13_Graph.addEdge(0,4);
		chp13_Graph.addEdge(1,5);
		chp13_Graph.addEdge(5,7);
		chp13_Graph.addEdge(3,6);
		chp13_Graph.addEdge(6,8);
		
	}
	
	@Test
	public void test_displayGraph(){
		chp13_Graph.displayGraph();
	}
	
	@Test
	public void test_dfs(){
		System.out.println("---	dfs	---");
		chp13_Graph.dfs(0);
	}
	
	@Test
	public void test_bfs(){
		System.out.println("---	bfs	---");
		chp13_Graph.bfs(0);
	}
	
	@Test
	public void test_mst(){
		System.out.println("---	mst	---");
		chp13_Graph.mst(0);
	}
	
}