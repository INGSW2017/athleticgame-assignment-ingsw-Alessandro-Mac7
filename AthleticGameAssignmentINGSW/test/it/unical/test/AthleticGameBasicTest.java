package it.unical.test;

import java.time.Instant;

import org.junit.Assert;
import org.junit.Test;

import it.unical.asde.AthleticGame;


public class AthleticGameBasicTest {

	@Test
	public void addArrivalWorks() {
	
		AthleticGame athleticGame = new AthleticGame("Corsa");
		athleticGame.addArrival("Marco", Instant.now());
		Assert.assertEquals(1, athleticGame.getArrivals().size());
		
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void getParecipiantTimeWorks() {
		
		AthleticGame athleticGame = new AthleticGame("Corsa");
		athleticGame.addArrival("ciccio", Instant.now());
		athleticGame.getParecipiantTime("Franco");
	}
}
