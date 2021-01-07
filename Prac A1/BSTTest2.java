package com.a01.test;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

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
		testSetId = 1226
)

class BSTTest2 {

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
	@DisplayName("test pre-order traversal sequence")
	@SpiraTestCase (testCaseId = 19534 )
	public void preordertest() {
		bst.insert(20);
		bst.insert(25);
		bst.insert(30);
		bst.insert(15);
		bst.insert(28);
		bst.preorder();
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		System.setOut(new PrintStream(outContent));
		assertEquals("20 15 25 30 28", outContent.toString());
	}
	
	@Test
	@DisplayName("test in-order traversal sequence")
	@SpiraTestCase (testCaseId = 19535 )
		public void inordertest() {
		bst.insert(20);
		bst.insert(25);
		bst.insert(30);
		bst.insert(15);
		bst.insert(28);
		bst.inorder();
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		System.setOut(new PrintStream(outContent));
		assertEquals("15 20 25 28 30", outContent.toString());
	}
	
	@Test
	@DisplayName("test post-order traversal sequence")
	@SpiraTestCase (testCaseId = 19536 )
		public void postordertest() {
		bst.insert(20);
		bst.insert(25);
		bst.insert(30);
		bst.insert(15);
		bst.insert(28);
		bst.postorder();
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		System.setOut(new PrintStream(outContent));
		assertEquals("15 20 25 28 30", outContent.toString());
	}

}

/*
 * Reference: https://stackoverflow.com/questions/32241057/how-to-test-a-print-method-in-java-using-junit/32241101
 */ 
