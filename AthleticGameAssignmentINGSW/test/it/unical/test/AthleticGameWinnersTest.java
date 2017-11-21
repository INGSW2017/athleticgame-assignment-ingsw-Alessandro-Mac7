package it.unical.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.Instant;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import it.unical.asde.AthleticGame;

public class AthleticGameWinnersTest {
	
	private static AthleticGame ag;
	
	@BeforeClass
	public static void init() {
		ag = new AthleticGame("Nuoto");
		
		ag.addArrival("Marco", Instant.now());
		ag.addArrival("Burza", Instant.now());
		ag.addArrival("Tonno", Instant.now());
		ag.addArrival("Ciccio", Instant.now());
		
	}
	
	@After
	public void resetTest() {
		ag.reset();
	}
	
	@Before
	public void startTest() {
		ag.start();
	}
	
	@Test
	public void getWinnerTest1() {
		assertEquals("Marco", ag.getWinner());
	}
	
	@Test
	public void getWinnerTest2() {
		assertEquals(null, ag.getWinner());
	}

}
