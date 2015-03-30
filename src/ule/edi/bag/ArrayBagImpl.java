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

	@SuppressWarnings("unchecked")
	public ArrayBagImpl() {

		this.cont = 0;
		this.contens = (T[]) new Object[DEFAULT_CAPACITY];

	}

	@Override
	public void add(T element, int times) {

		if (element == null) {
			throw new NullPointerException("Error ADD ELEMENT");
		}

		if (times < 0) {
			throw new IllegalArgumentException("Error ADD TIMES");
		}

		/*
		 * if( this.size()==this.contens.length){ expandCapacity(); }
		 */

		for (int i = 0; i < times; i++) {
			this.contens[this.cont] = element;
			this.cont++;
		}

	}

	@Override
	public void add(T element) {

		if (element == null) {
			throw new NullPointerException("Error ADD ");
		}
		/*
		 * if (this.size() == this.contens.length) { expandCapacity(); }
		 */
		this.contens[this.cont] = element;
		this.cont++;

	}

	@SuppressWarnings("unused")
	private void expandCapacity() {

		@SuppressWarnings("unchecked")
		T[] larger = (T[]) (new Object[this.contens.length * 2]);
		for (int i = 0; i < this.contens.length; i++) {
			larger[i] = this.contens[i];
		}
		this.contens = larger;
	}

	@Override
	public void remove(T element, int times) {

		if (element == null) {
			throw new NullPointerException("Error REMOVE ELEMENT");
		}

		if (times < 0) {
			throw new IllegalArgumentException("Error REMOVE");
		}

		for (int i = 0; i < times; i++) {
			this.contens[this.cont] = element;
			this.contens[this.cont - 1] = null;
			this.cont--;
		}

	}

	@Override
	public void remove(T element) {

		if (element == null) {
			throw new NullPointerException("Error REMOVE");
		}
		if (!this.contens.equals(element)) {
			try {
				throw new EmptyCollectionException(" asdf");
			} catch (EmptyCollectionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		this.contens[this.cont] = element;
		this.contens[this.cont - 1] = null;
		this.cont--;

	}

	@Override
	public void clear() {

	}

	@Override
	public boolean contains(T element) {

		int var = -1;

		for (int i = 0; i < this.cont && var == -1; i++) {
			if (contens[i].equals(element)) {
				var = i;
			}
		}
		return (var != -1);
	}

	@Override
	public boolean isEmpty() {
		if (this.cont == 0)
			return true;
		else
			return false;
	}

	@Override
	public long size() {

		return this.cont;

	}

	@Override
	public int count(T element) {
		
		int var = -1;

		for (int i = 0; i < this.cont && var == -1; i++) {
			if (contens[i].equals(element)) {
				var = i;
				
			}
		}
		return var;
		
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
