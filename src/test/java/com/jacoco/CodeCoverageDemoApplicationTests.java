package com.jacoco;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CodeCoverageDemoApplicationTests {

	DemoforCodeCoverage demo;

	@BeforeEach
	public void setup() {
		demo = new DemoforCodeCoverage();
	}

	@Test
	public void addtest() {

		assertEquals(3, demo.add(1, 2));
	}

	@Test
	public void subtest() {

		assertEquals(3, demo.sub(6, 3));
	}

	@Test
	public void multiplicationtest() {
		assertEquals(6, demo.multiplicatio(2, 3));
	}

}
