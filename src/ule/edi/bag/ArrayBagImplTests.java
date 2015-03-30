package ule.edi.bag;

import static org.junit.Assert.*;

import java.math.BigDecimal;
import java.util.logging.Logger;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

/**
 * JUnit ejecutará los métodos de test de {@link BagImplSharedTestSet} y
 * de esta clase, y recurrirá a la implementación de {@link #createBag()} que
 * aparece aquí.
 *
 */
public class ArrayBagImplTests{
	
	private ArrayBagImpl abi;
	private ArrayBagImpl abi2;
	private ArrayBagImpl abi3;
	
	@Before
	public void setUp() throws Exception {
		abi = new ArrayBagImpl<>();
		abi2 = new ArrayBagImpl<>();
		abi3 = new ArrayBagImpl<>();
		
		
		
	}

	
	@Test
	public void testOnlyOnArrayBags() {
		
		//	Aquí se quiere probar algo específico de la implementación con arrays de Bag<T>
		
		Bag<BigDecimal> huge = new ArrayBagImpl<BigDecimal>();
		
		Logger.getLogger("ule.edi").info("Running on " + huge.getClass().getName() + " implementation of Bag<T>");
	}
	
	
	//	Métodos de prueba JUnit con 'expected' deben ir en las clases específicas
	//	para que Web-CAT no calcule su cobertura
	
	@Test(expected = NullPointerException.class)
	public void testNullCheckOnAdd() {
//		S1.add(null);
	}
	
	@Test 
	
	public void testAdd(){
		
	
		
		
	}
		
}
