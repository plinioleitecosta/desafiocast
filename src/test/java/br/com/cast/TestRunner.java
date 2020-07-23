package br.com.cast;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import br.com.cast.Controller.DocumentoControllerTest;
import org.junit.runner.notification.Failure;


public class TestRunner {
	
	 public static void main(String[] args) {
	      Result result = JUnitCore.runClasses(DocumentoControllerTest.class);
			
	      for (Failure failure : result.getFailures()) {
	         System.out.println(failure.toString());
	      }
			
	      System.out.println(result.wasSuccessful());
	   }	

}
