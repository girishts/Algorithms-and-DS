package com.practice.hashtable;

import java.util.ArrayList;
import java.util.Iterator;

public class Map<k, v> {
	private ArrayList<HashNode<k, v>> bucketArray;
	private int numBuckets;
	private int size;

	Map() {
		bucketArray = new ArrayList<>();
		numBuckets = 10;
		size = 0;
		for (int i = 0; i < 10; i++) {
			bucketArray.add(null);
		}
	}

	public int size() {
		return size;
	}

	public int getBucketIndex(k key) {
		int hashcode = key.hashCode();
		int index = hashcode % numBuckets;
		return index;
	}

	public void add(k key, v value) {
		int index = getBucketIndex(key);
		HashNode<k, v> head = bucketArray.get(index);

		while (head != null) {
			if (head.key.equals(key)) {
				head.value = value;
				return;
			}
			head = head.next;
		}
		size++;

		HashNode<k, v> newNode = new HashNode<k, v>(key, value);
		head = bucketArray.get(index);
		newNode.next = head;
		bucketArray.set(index, newNode);

		loadFactor();

	}

	private void loadFactor() {
		if (size / numBuckets >= 0.7) {

			ArrayList<HashNode<k, v>> temp = bucketArray;
			bucketArray = new ArrayList<>();
			numBuckets = 2 * numBuckets;
			for (HashNode<k, v> head : temp) {
				while (null != head) {
					add(head.key, head.value);
					head = head.next;
				}
			}

		}
	}

	public v get(k key) {

		int index = getBucketIndex(key);
		HashNode<k, v> head = bucketArray.get(index);

		while (head != null) {
			if (head.key.equals(key)) {

				return head.value;
			}
			head = head.next;
		}
		return null;

	}

	public v remove(k key) {
		int index = getBucketIndex(key);
		HashNode<k, v> head = bucketArray.get(index);
		HashNode<k, v> previous = null;
		while (null != head) {
			if (key.equals(head.key)) {
				break;
			}
			previous = head;
			head = head.next;
		}

		if (head == null)
			return null;
		size--;
		if (previous != null) {
			previous.next = head.next;
		} else {
			bucketArray.set(index, head.next);
		}
		return head.value;
	}

	public static void main(String[] args) {

		Map<String, Integer> map = new Map<String, Integer>();
		map.add("a", 1);
		map.add("b", 2);
		map.add("c", 3);

		System.out.println(map.get("a")+"\t"+map.get("b")+"\t"+map.get("c"));
		
		System.out.println(map.size());
		System.out.println(map.get("b"));

		map.remove("b");
		System.out.println(map.size());
		
	}

}