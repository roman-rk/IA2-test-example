package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestJunit {

	@Test
	void testSucces() {
		assertTrue(new SimpleClass("ab", "ab").compareStrings());
	}

	@Test
	void testFail() {
		assertTrue(new SimpleClass(null, "ab").compareStrings());
	}
}
