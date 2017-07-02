package com.baeldung.string;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.baeldung.string.JoinerSplitter;

public class JoinerSplitterUnitTest {

	@Test
	public void provided_array_convert_to_stream_and_convert_to_string() {

		String[] programming_languages = {"java", "python", "nodejs", "ruby"};

		String expectation = "java,python,nodejs,ruby";
		
		String result  = JoinerSplitter.join(programming_languages);
		assertEquals(result, expectation);
	}
	
	@Test
	public void givenArray_transformedToStream_convertToPrefixPostfixString() {

		String[] programming_languages = {"java", "python", 
				"nodejs", "ruby"};
		String expectation = "[java,python,nodejs,ruby]";
		
		String result  = JoinerSplitter.joinWithPrefixPostFix(programming_languages);
		assertEquals(result, expectation);
	}
	
	@Test
	public void givenString_transformedToStream_convertToList() {

		String programming_languages = "java,python,nodejs,ruby";
		
		List<String> expectation = new ArrayList<>();
		expectation.add("java");
		expectation.add("python");
		expectation.add("nodejs");
		expectation.add("ruby");
		
		List<String> result  = JoinerSplitter.split(programming_languages);
		
		assertEquals(result, expectation);
	}
  
	@Test
	public void givenString_transformedToStream_convertToListOfChar() {

		String programming_languages = "java,python,nodejs,ruby";
		
		List<Character> expectation = new ArrayList<>();
		char[] charArray = programming_languages.toCharArray();
		for (char c : charArray) {
			expectation.add(c);
		}
		
		List<Character> result  = JoinerSplitter.splitToListOfChar(programming_languages);
		assertEquals(result, expectation);
		
	}
  
}
