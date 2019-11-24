package com.graph;

import java.util.LinkedList;
import java.util.ListIterator;

public class BFS {
	
	private static int V;
	private static LinkedList<Integer> adjList[];
	
	@SuppressWarnings("unchecked")
	BFS(int v){
		BFS.V = v;
		adjList = new LinkedList[v];
		for(int i = 0; i < v; i++){
			adjList[i] = new LinkedList<>(); 
		}
	}
	
	static void addEdge(BFS g,int src,int dest){
		BFS.adjList[src].add(dest);
	}
	
	public static void traversal(int s){
		boolean visited[] = new boolean[V];	
		
		LinkedList<Integer> queue = new LinkedList<>();
		visited[s] = true;
		queue.add(s);
		
		while(queue.size() != 0){
			s = queue.poll();
			System.out.println(s+" ");
			
			ListIterator<Integer> i = adjList[s].listIterator();
			while(i.hasNext()){
				int n = i.next();
				if(!visited[n]){
					visited[n] = true;
					queue.add(n);
				}
			}
		}
	}

	public static void main(String[] args) {
		
		BFS g = new BFS(5);
		
		addEdge(g, 0, 1);
		addEdge(g, 0, 2);
		addEdge(g, 1, 2);
		addEdge(g, 2, 0);
		addEdge(g, 2, 3);
		addEdge(g, 3, 3);
		
		traversal(0);

	}

}
