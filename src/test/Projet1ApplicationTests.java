package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class Projet1ApplicationTests {

	@Test
	void contextLoads() {
	}
	
}

class CalculsTest {
	private Calculs c1 = null;
	private Calculs c2 = null;
	private Calculs c3 = null;

	/**
	* Initialise les valeurs avant chaque test
	*/

	@BeforeEach
	void setUp() throws Exception
	{
		c1 = new Calculs(1,2);
		c2 = new Calculs(10,20);
		c3 = new Calculs(100,200);
	}

	/**
	* Test method for {@link Calculs#multiplier()}.
	*/
	@Test
	void testMultiplier()

	if(c1.multiplier() != 2){
		fail("Methode multiplier non conforme 2*1=2 ne fonctionne pas.");
	}

	assertEquals(c1.multiplier(), 2);


	/**
	* Test method for {@link Calculs#multiplier()}.
	*/
	@Test
	void testAdditionner()

	if(c1.additionner() != 3){
		fail("Methode additionner non conforme 2+1=3 ne fonctionne pas.");
	}

	assertEquals(c1.additionner(), 3);

	/**
	* Test method for {@link Calculs#diviser()}.
	*/
	@Test
	void testDiviser()

	if(c1.diviser() != 0.2){
		fail("Methode additionner non conforme 1/2=0.5 ne fonctionne pas.");
	}

	assertEquals(c1.diviser(), 2);


	/**
	* Test method for {@link Calculs#soustraire()}.
	*/
	@Test
	void testSoustraction()

	if(c1.soustraire() != (-1)){
		fail("Methode additionner non conforme 1-2=(-1) ne fonctionne pas.");
	}

	assertEquals(c1.soustraire(), 2);

}