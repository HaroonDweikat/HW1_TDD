package najahhw;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestHW1 {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	 public void testSum_BothNumberZeros_ShouldReturnZero() {
		//Arrange
		int n1=0;
		int n2=0;
		Calculater c=new Calculater();
		
		//Act
		int result=c.sum(n1,n2);
		
		//Assert
		Assert.assertTrue(result==0);
		
		
	}
	
	@Test
	 public void testSum_BothNumberPositive_ShouldReturnPositive() {
		
		//Arrange
				int n1=10;
				int n2=5;
				Calculater c=new Calculater();
				
				//Act
				int result=c.sum(n1,n2);
				
				//Assert
				Assert.assertTrue(result>0);
				
		
		}
	
	@Test
	 public void testSum_BothNumberNegative_ShouldReturnPositive() {
		
		//Arrange
				int n1=-6;
				int n2=-7;
				Calculater c=new Calculater();
				
				//Act
				int result=c.sum(n1,n2);
				
				//Assert
				Assert.assertTrue(result<0);
				
		
	}
	
//	@Test
//	 public void testSum_DifferentSign_ShouldReturnPositive() {
//		
//		//Arrange
//				int n1=-16;
//				int n2=9;
//				Calculater c=new Calculater();
//				
//				//Act
//				int result=c.sum(n1,n2);
//				
//				//Assert
//				Assert.assertTrue((n1>n2 && result>0)||(n1<n2 && result>0));
//				
//		
//	}

}
