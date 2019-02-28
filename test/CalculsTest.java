

package test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;

import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@SuppressWarnings("unused")
@RunWith(Parameterized.class)

class CalculsTest {
	@ParameterizedTest(name="test numero {index}, on test les valeur {0}, {1} et on attend le resultat {2}")
	@MethodSource("changerJeuTest")
	void additionnerTest (int nombre1, int nombre2, int resultat)
	{
		Calculs calc = newCalcul( nombre1, nombre2);
		assertEquals(resultat, calc.additionner());
		
		}
	
		static Stream<Arguments> changerJeuTest() throws Throwable
	
	{
		return Stream.of (Arguments.of(2,2,4),
						  Arguments.of(4,8,12),
						  Arguments.of(8,8,16));
	}
	private Calculs newCalcul(int nombre1, int nombre2) {
		// TODO Auto-generated method stub
		return null;      
	}
	Calculs calc=null;
	Calculs calc2=null;
	
	@BeforeEach
	void setUp() throws Exception {
	
		calc=new Calculs(5,5);
		calc2=new Calculs(10,2);
	}

	@AfterEach
 	void tearDown() throws Exception {
	}
	
	@Test
	void test() {
		//fail("Not yet implemented");
		assertEquals(10,calc.additionner());
		assertEquals(12,calc2.additionner());
	}
	public void
	should_retourn_ten_when_constructionwithtwoparam5c()
	{
		
	}
	}

