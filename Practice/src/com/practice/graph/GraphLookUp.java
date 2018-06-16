package com.practice.graph;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

public class GraphLookUp {

	private HashMap<Integer, Node> nodeLookup = new HashMap<Integer, Node>();

	public static class Node {
		private int id;
		LinkedList<Node> adjacent = new LinkedList<Node>();

		private Node(int id) {
			this.id = id;
		}
	}

	private Node getNode(int id) {
		return nodeLookup.get(id);
	}

	public void addEdge(int source, int destination) {
		Node s = getNode(source);
		Node d = getNode(destination);
		s.adjacent.add(d);
	}

	public boolean hasPathDFS(int source, int destination) {
		Node s = getNode(source);
		Node d = getNode(destination);
		HashSet<Integer> visited = new HashSet<Integer>();
		return hasPathDFS(s, d, visited);

	}

	public boolean hasPathDFS(Node s, Node d, HashSet<Integer> visited) {
		if (visited.contains(s.id)) {
			return false;
		}
		visited.add(s.id);
		if (s == d) {
			return true;
		}
		for(Node child : s.adjacent) {
			if(hasPathDFS(child, d, visited)) {
				return true;
			}
		}
		return false;
	}
	
	public boolean hasPathBFS(int source, int destination) {
		return hasPathBFS(getNode(source),getNode(destination));
	}

	public boolean hasPathBFS(Node s, Node d) {
		HashSet<Integer> visited = new HashSet<Integer>();
		LinkedList<Node> nextToVisit = new LinkedList<Node>();
		nextToVisit.add(s);
		while(!nextToVisit.isEmpty()) {
			Node n = nextToVisit.remove();
			if(n==d) {
				return true;
			}
			visited.add(s.id);
			for(Node child:s.adjacent) {
				nextToVisit.add(child);
			}
		}
		
		return false;
	}
}
