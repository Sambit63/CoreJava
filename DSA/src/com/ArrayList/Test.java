package com.ArrayList;

import java.util.*;

class ArrayListImp {
	Object[] arr = new Object[10];
	int index = 0;

	public void add(Object el) {
		if (index >= arr.length)
			increase();
		arr[index++] = el;
	}

	public void add(int in, Object el) {
		if (in < 0 || in >= size())
			throw new ArrayIndexOutOfBoundsException();
		if (index >= arr.length)
			increase();
		for (int i = size() - 1; i >= in; i--) {
			arr[i + 1] = arr[i];
		}
		arr[in] = el;
		index++;
	}

	private void increase() {
		Object[] temp = new Object[((arr.length * 3) / 2) + 1];
		for (int i = 0; i < arr.length; i++)
			temp[i] = arr[i];
		arr = temp;
	}

	public int size() {
		return index;
	}

	public Object get(int in) {
		return arr[in];
	}

	public void remove(int in) {
		if (in < 0 || in >= size())
			throw new ArrayIndexOutOfBoundsException();
		for (int i = in; i < size() - 1; i++)
			arr[i] = arr[i + 1];
		arr[index - 1] = null;
		index--;
	}

	public boolean isEmpty() {
		return index == 0;
	}

	public boolean contains(Object el) {
		for (int i = 0; i < size(); i++) {
			if (arr[i].equals(el))
				return true;
		}
		return false;
	}

	public void printAll() {
		for (int i = 0; i < index; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}

public class Test {
	public static void main(String[] args) {
		ArrayListImp al = new ArrayListImp();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		al.add(60);
		al.add(5, "sam");
//		al.remove(5);
//		System.out.println(al.contains(30));
		al.printAll(); // Should output: 10 20 Sambit
		System.out.println("The size of the array is= " + al.size());
	}
}
