package assignment;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import testing.bank;

public class testingIP {
	@BeforeClass
	public static void beforeclass() {
		System.out.println("Before class");
	}
	@Before
	public void before() {
		System.out.println("Before");
	}

	@Test
    public void test() {
		IPaddress ip = new IPaddress();
		assertTrue(ip.ValidateIpvaddress("1.1.1.1"));
		assertTrue(ip.ValidateIpvaddress("192.168.1.1"));
		assertTrue(ip.ValidateIpvaddress("10.0.0.1"));
		assertTrue(ip.ValidateIpvaddress("127.0.0.1"));
		assertFalse(ip.ValidateIpvaddress("0.0.0.0"));
		assertFalse(ip.ValidateIpvaddress("255.255.255.255"));
		assertFalse(ip.ValidateIpvaddress("1.1.1.0"));
		assertFalse(ip.ValidateIpvaddress("10.0.1"));
		System.out.println("test case verify"); 
    }
	
	@After
	public void after() {
		System.out.println("After");
	}
	@AfterClass
	public static void afterclass() {
		System.out.println("After class");
	}
}
