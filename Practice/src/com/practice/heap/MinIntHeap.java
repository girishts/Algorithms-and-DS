package com.practice.heap;

import java.util.Arrays;

public class MinIntHeap {

	private int capacity = 10;
	private int size = 0;

	private int[] items = new int[capacity];

	private int getLeftChildIndex(int parentIndex) {
		return (2 * parentIndex + 1);
	}

	private int getRightChildIndex(int parentIndex) {
		return (2 * parentIndex + 2);
	}

	private int getParentIndex(int childIndex) {
		return (childIndex - 1 / 2);
	}

	private int leftChild(int parentIndex) {
		return (items[getLeftChildIndex(parentIndex)]);
	}

	private int rightChild(int parentIndex) {
		return (items[getRightChildIndex(parentIndex)]);
	}

	private int parent(int childIndex) {
		return (items[getParentIndex(childIndex)]);
	}

	private boolean hasleftChild(int parentIndex) {
		return (getLeftChildIndex(parentIndex) < size);
	}

	private boolean hasRightChild(int parentIndex) {
		return (getRightChildIndex(parentIndex) < size);
	}

	private boolean hasParent(int index) {
		return (getParentIndex(index) >= 0);
	}

	private void swap(int index1, int index2) {
		int t = items[index1];
		items[index1] = items[index2];
		items[index2] = t;
	}

	private void ensureSufficientCapacity() {
		if (size == capacity) {
			items = Arrays.copyOf(items, capacity * 2);
			capacity *= 2;
		}
	}

	public int peek() {
		if (size == 0)
			throw new IllegalStateException();
		return items[0];
	}

	public int poll() {
		if (size == 0)
			throw new IllegalStateException();
		int item = items[0];
		items[0] = items[size - 1];
		size--;
		heapifyDown();
		return item;
	}

	public void add(int item) {
		ensureSufficientCapacity();
		items[size] = item;
		size++;
		heapifyUp();
	}

	private void heapifyUp() {
		int index = size - 1;
		while (hasParent(index) && parent(index) > items[index]) {
			swap(getParentIndex(index), index);
			index = getParentIndex(index);
		}
	}

	private void heapifyDown() {
		int index = 0;
		while (hasleftChild(index)) {
			int smallerChildIndex=getLeftChildIndex(index);
			if (hasRightChild(index) && rightChild(index) < leftChild(index)) {
				smallerChildIndex = getRightChildIndex(index);
			}
			if(items[index]<items[smallerChildIndex]) {
				break;
			}
		}
	}
}