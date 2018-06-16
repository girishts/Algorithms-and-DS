package com.practice.tries.array;

public class TrieNode {
	Character c;
	TrieNode children[];

	TrieNode() {
		children = new TrieNode[26];
	}
}
