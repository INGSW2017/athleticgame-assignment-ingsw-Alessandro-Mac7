package it.unical.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;


@RunWith (value = Suite.class)
@SuiteClasses(value = {AthleticGameBasicTest.class, AthleticGameWinnersTest.class})

public class AthleticGameTestSuite {
}
