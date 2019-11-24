package com.graph;

import java.util.Iterator;
import java.util.LinkedList;


public class DFS {
	
	private static int V;
	private static LinkedList<Integer> adjList[];
	
	@SuppressWarnings("unchecked")
	DFS(int v){
		DFS.V = v;
		adjList = new LinkedList[v];
		for(int i = 0; i < v; i++){
			adjList[i] = new LinkedList<>(); 
		}
	}
	
	void addEdge(DFS g,int src,int dest){
		DFS.adjList[src].add(dest);
	}
	
	static void DFSUtil(int v,boolean visited[]) 
    { 
        // Mark the current node as visited and print it 
        visited[v] = true; 
        System.out.print(v+" "); 
  
        // Recur for all the vertices adjacent to this vertex 
        Iterator<Integer> i = adjList[v].listIterator(); 
        while (i.hasNext()) 
        { 
            int n = i.next(); 
            if (!visited[n]) 
                DFSUtil(n, visited); 
        } 
    } 
  
    // The function to do DFS traversal. It uses recursive DFSUtil() 
    static void traverse(int v) 
    { 
        // Mark all the vertices as not visited(set as 
        // false by default in java) 
        boolean visited[] = new boolean[V]; 
  
        // Call the recursive helper function to print DFS traversal 
        DFSUtil(v, visited); 
    } 

	public static void main(String[] args) {
	
		
		DFS g = new DFS(4);
		
		g.addEdge(g, 0, 1);
		g.addEdge(g, 0, 2);
		g.addEdge(g, 1, 2);
		g.addEdge(g, 2, 0);
		g.addEdge(g, 2, 3);
		g.addEdge(g, 3, 3);
		
		traverse(0);

	}

}
