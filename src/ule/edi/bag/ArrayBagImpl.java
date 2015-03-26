package ule.edi.bag;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Random;

import ule.edi.EmptyCollectionException;

public class ArrayBagImpl<T> implements Bag<T> {

	private T[] contens;
	private int cont;

	private final int DEFAULT_CAPACITY = 100;
	private final int NOT_FOUND = -1;

	private static Random r = new Random();

	public ArrayBagImpl() {

		this.cont = 0;
		this.contens = (T[]) new Object[DEFAULT_CAPACITY];

	}

	@Override
	public void add(T element, int times) {

	}

	@Override
	public void add(T element) {

		if (this.size() == this.contens.length) {
			expandCapacity();
		}
		this.contens[this.cont] = element;
		this.cont++;

	}

	private void expandCapacity() {
		
		T[] larger = (T[]) (new Object[this.contens.length * 2]);
		for (int i = 0; i < this.contens.length; i++) {
			larger[i] = this.contens[i];
		}
		this.contens = larger;
	}

	@Override
	public void remove(T element, int times) {
		// TODO Auto-generated method stub

	}

	@Override
	public void remove(T element) {

		this.contens[this.cont] = element;
		this.contens[this.cont - 1] = null;
		this.cont--;

	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean contains(T element) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public long size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int count(T element) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String toString() {

		final StringBuffer buffer = new StringBuffer();

		buffer.append("(");

		// TODO Ir añadiendo en buffer las cadenas para la representación de
		// esta bolsa

		buffer.append(")");

		return buffer.toString();
	}

}
