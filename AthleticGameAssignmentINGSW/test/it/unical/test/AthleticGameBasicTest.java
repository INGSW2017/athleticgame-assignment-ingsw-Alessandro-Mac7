package it.unical.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.Instant;

import org.junit.Test;

import it.unical.asde.AthleticGame;

public class AthleticGameBasicTest {

	@Test
	public void addArrivalTest() {
		AthleticGame ag = new AthleticGame("Nuoto");
		ag.addArrival("Franco", Instant.now());
		assertEquals(1, ag.getArrivals().size());
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void getParecipiantTimeTest() {
		AthleticGame ag = new AthleticGame("Nuoto");
		ag.addArrival("Franco", Instant.now());
		ag.addArrival("Marco", Instant.now());
		ag.addArrival("Giovanni", Instant.now());
		ag.getParecipiantTime("Francesco");
		
	}

}
