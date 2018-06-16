package com.practice.tries.hashmap;

import java.util.HashMap;

public class TrieNode {
	Character c;
	ContactDetails cd;
	HashMap<Character, TrieNode> children = new HashMap<Character, TrieNode>();
	Boolean isleaf;
	
	public TrieNode() {
		super();
	}
	public TrieNode(Character c) {
		super();
		this.c = c;
	}
	

}
