package hn.hanselgonzalez.calcular_areas_figuras_geometricas;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AppTest {
    
	
	//CIRCULO
	@Test
	public void testCirculo1() {
		
		assertEquals(App.areaCirculo(3),28.26, .0001);
	}
	
	@Test
	public void testCirculo2() {
		
		assertEquals(App.areaCirculo(2.5),19.625, .0001);
	}
	
	@Test
	public void testCirculo3() {
		
		assertEquals(App.areaCirculo(0.0),0.0, .0001);
	}
	
	@Test
	public void testCirculo4() {
		
		assertNull(App.areaCirculo(-2));
	}
	
	
	
	//CUADRADO
	@Test
	public void testCuadrado1() {
		assertTrue(App.areaCuadrado(3) == 9);
	}
		
	@Test
	public void testCuadrado2() {
		assertTrue(App.areaCuadrado(1.5) == 2.25);
	}
		
	@Test
	public void testCuadrado3() {
	assertTrue(App.areaCuadrado(0) == 0);
	}
	
	@Test
	public void testCuadrado4() {
		
		assertNull(App.areaCuadrado(-9));
	}
		
	
	
	//RECTANGULO
	@Test
	public void testRectangulo1() {
		assertTrue(App.areaRectangulo(2,3) == 6);
	}
	
	@Test
	public void testRectangulo2() {
		assertTrue(App.areaRectangulo(1.5,3.6) == 5.4);
	}
	
	@Test
	public void testRectangulo3() {
		assertTrue(App.areaRectangulo(0,0) == 0);
	}
	
	@Test
	public void testRectangulo4() {
		
		assertNull(App.areaCuadrado(-4));
	}
	
	
	
	//TRIANGULO
	@Test
	public void testTriangulo1() {
		assertEquals(App.areaTriangulo(2,6), 6, .0001);
	}
		
	@Test
	public void tesTriangulo2() {
		assertEquals(App.areaTriangulo(6.8,10.1), 34.34, .0001);
	}
	
	@Test
	public void testTriangulo3() {
		assertEquals(App.areaTriangulo(0,0),0 , .0001);
	}
	
	@Test
	public void testTriangulo4() {
		
		assertNull(App.areaTriangulo(-4,2));
	}
	
	@Test
	public void testTriangulo5() {
		
		assertNull(App.areaTriangulo(4,-2));
	}
	
	@Test
	public void testTriangulo6() {
		
		assertNull(App.areaTriangulo(-6,-3));
	}
	
	
	
	
	
	
	
	
	
}
