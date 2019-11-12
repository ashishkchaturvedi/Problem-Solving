package com.graph;

import java.util.LinkedList;

public class Graphrepresentation {
	
	static class Graph{
		int V;
		
		LinkedList<Integer> adjListArray[];
		
		@SuppressWarnings("unchecked")
		Graph(int V){
			this.V = V;
			adjListArray = new LinkedList[V];
			for(int i = 0 ;i < V; i++){
				this.adjListArray[i] = new LinkedList<>();
			}
		}
	}
	
	static void addEdge(Graph graph, int src, int dest){
		graph.adjListArray[src].add(dest);
		graph.adjListArray[dest].add(src);
	}
	
	static void print(Graph graph){
		for(int i = 0; i < graph.V; i++){
			System.out.println("Adjacency list for vertex: "+i);
			System.out.print("head");
			for(Integer pCrawl : graph.adjListArray[i]){
				System.out.print("->"+pCrawl);
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int V = 5;
		Graph graph = new Graph(V);
		addEdge(graph, 0, 1);
		addEdge(graph, 0, 4);
		addEdge(graph, 1, 3);
		addEdge(graph, 1, 2);
		addEdge(graph, 1, 4);
		addEdge(graph, 2, 3);
		addEdge(graph, 3, 4);
		
		print(graph);

	}

}
