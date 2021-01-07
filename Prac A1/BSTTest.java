package com.a01.test;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.a01.code.BT;
import com.inflectra.spiratest.addons.junitextension.SpiraTestCase;
import com.inflectra.spiratest.addons.junitextension.SpiraTestConfiguration;

@SpiraTestConfiguration (
		url = "https://rmit-university.spiraservice.net/",
		login = "LIslam",
		password = "123456",
		projectId = 726,
		releaseId = 1024,
		testSetId = 1225
)

class BSTTest {
	
	public static BT bst;
	
	@BeforeClass
	public static void beforeClassStatement() {
		System.out.println("Testing begins");
	}

	@BeforeEach
	public void bstInitialiser() {
		bst = new BT();
	}
	
	@Test
	@DisplayName("test if insert function works")
	@SpiraTestCase (testCaseId = 19521 )
	public void testInsertion() {
		bst.insert(100);
		assertFalse(bst.isEmpty());
	}
	
	@Test
	@DisplayName("test if search function works")
	@SpiraTestCase (testCaseId = 19523 )
	public void searchNodesTest() {
		bst.insert(1);
		bst.insert(2);
		bst.insert(3);
		assertAll(() -> assertTrue(bst.search(1)), () -> assertTrue(bst.search(2)),  () -> assertTrue(bst.search(3)));		
	}
	
	@Test
	@DisplayName("test if count function works")
	@SpiraTestCase (testCaseId = 19527 )
	public void countNodesTest() {
		bst.insert(1);
		bst.insert(2);
		bst.insert(3);
		bst.insert(4);
		bst.insert(5);
		bst.insert(6);
		bst.insert(7);
		bst.insert(8);
		bst.insert(9);
		assertEquals(9, bst.countNodes());		
	}
	
	@Test
	@DisplayName("test if searching for a node that does not exist returns false")
	@SpiraTestCase (testCaseId = 19529  )
	public void searchNodesTest2() {
	bst.insert(1);
	bst.insert(2);
	bst.insert(3);
	assertFalse(bst.search(4));
	}
	
	
	
	@Test
	@DisplayName("test that initial tree is empty")
	@SpiraTestCase (testCaseId = 19531 )
	public void testInitialTreeIsEmpty() {
		assertTrue(bst.isEmpty());
	}
	
	@Test
	@DisplayName("test that tree is not empty after one insertion")
	@SpiraTestCase (testCaseId = 19532 )
	public void treeNotEmpty() {
		bst.insert(1);
		assertFalse(bst.isEmpty());
	}
	
	@AfterClass
	public static void afterClassStatement() {
		System.out.println("Testing ends");
	}
	
}
