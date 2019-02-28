package test;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TriTableauTest extends TriTableau {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testTrier() {
		//fail("Not yet implemented");\\ 
		
		
		int Tableau[] = {4,2,1,3};
		int ResTableau[] = {1,2,3,4};
		
	try {	
		TriTableau.trier(Tableau); 
		for(int i = 0; i < Tableau.length -1; i++)
		{
			assertTrue(Tableau[i] <= Tableau[i +1]);
		}
		
	}
	
	catch (IOException e) 
	{
	System.out.println(e);
}
	}

	@Test
	void testTriCroissant() {
		//fail("Not yet implemented");
		
		int Tableau[] = {89,23,45,1};
		int ResTableau[] = {1,23,45,89};
	
	try {
		TriTableau.triCroissant(Tableau);
		for (int i = 0; i < Tableau.length -1; i++)
		{
	assertTrue(Tableau[i] <= Tableau[i +1]);
		}
	}
		catch (IOException e) 
		{
		System.out.println(e);
	}
		
	}
	

	@Test
	void testTriDecroissant() {
		//fail("Not yet implemented");
		int Tableau[] = {89,23,45,1};
		int ResTableau[] = {89,45,23,1};
	
	try {
		TriTableau.triDecroissant(Tableau);
		for (int i = 0; i < Tableau.length -1; i++)
		{
	assertTrue(Tableau[i] <= Tableau[i +1]);
		}
	}
		catch (IOException e) 
		{
		System.out.println(e);
	}
		
	
	}

}
