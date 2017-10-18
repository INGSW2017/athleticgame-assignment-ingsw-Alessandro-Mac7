package it.unical.test;

import java.time.Instant;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import it.unical.asde.AthleticGame;

public class AthleticGameWinnersTest {

	private static AthleticGame athleticGame;
	
	@BeforeClass
	public static void init() {
		athleticGame = new AthleticGame("Corsa");		
	}

	@After
	public void reset() {
		athleticGame.reset();
	}
	
	@Before
	public void start() {
		athleticGame.start();
	}

	@Test
	public void getWinnerWorks() {
		athleticGame.addArrival("tonno", Instant.now().plusMillis(1000));
		athleticGame.addArrival("marco", Instant.now().plusMillis(2000));
		athleticGame.addArrival("bubù", Instant.now().plusMillis(4000));
		athleticGame.addArrival("ciccio", Instant.now().plusMillis(5000));
		athleticGame.addArrival("bubu", Instant.now().plusMillis(1000));
		Assert.assertEquals("tonno", athleticGame.getWinner());	}

	@Test
	public void getWinnerWorks2() {
		athleticGame.addArrival("fra", Instant.now().plusMillis(1000));
		athleticGame.addArrival("ma", Instant.now().plusMillis(2000));
		athleticGame.addArrival("bù", Instant.now().plusMillis(4000));
		athleticGame.addArrival("ci", Instant.now().plusMillis(5000));		
		athleticGame.addArrival("bubu", Instant.now().plusMillis(500));
		System.out.println(athleticGame.getWinner());
		Assert.assertEquals("bubu", athleticGame.getWinner());
	}
	
}
