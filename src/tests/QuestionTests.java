//Add -> JUnit Test Case

package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import cse237.Question;

class QuestionTests {

	//write a test that fails (BEFORE even coding)
	@Test
	void testQuestionCheckAnswerCorrect() {		//name this specifically
		//step1: setup: create objects i need
		Question questionUnderTest = new Question("Why did the chicken cross the road?", "bazinga");	//we now know we need object called Question and two string parameters 

		//step2: test a method (ONE method per unit test)
		boolean correct = questionUnderTest.checkAnswer("bazinga");	// we now know we need this method, return type and parameter
		
		//step3: check for correctness
		assertTrue(correct);	//"this value should be true"
		//there are other types of assert: assertEquals, ...
	}
	
	
	//make sure other tests pass:
	
	@Test	//annotation
	void testQuestionCheckAnswerIncorrect() {
		//step1: setup: create objects i need
		Question questionUnderTest = new Question("Why did the chicken cross the road?", "bazinga");

		//step2: test a method (ONE method per unit test)
		boolean incorrect = questionUnderTest.checkAnswer("bok");
		
		//step3: check for correctness
		assertFalse(incorrect);	//"i expect this to be false"
		//assertEquals, ...
	}
	
	//after writing all tests, refactor and clean up: variable name, ...
	
	
	

}
