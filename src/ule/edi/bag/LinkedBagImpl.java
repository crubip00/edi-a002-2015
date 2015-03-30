package ule.edi.bag;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Random;

import ule.edi.EmptyCollectionException;

public class LinkedBagImpl<T> implements Bag<T> {
	
	private int cont;
	private Bag <T> lista;
	private static Random r = new Random();
	

	public LinkedBagImpl() {
		
		this.cont=0;
		this.lista=null;
		
	}
	
	@Override
	public void add(T element, int times) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void add(T element) {
	
	}

	@Override
	public void remove(T element, int times) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remove(T element) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean contains(T element) {
		return false;
		
	}

	@Override
	public boolean isEmpty() {
		return (this.cont==0);
	}

	@Override
	public long size() {
		return this.cont;
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

		// TODO Ir añadiendo en buffer las cadenas para la representación de esta bolsa
		
		buffer.append(")");
		
		return buffer.toString();
	}

}
