package code_coverage_4.code_coverage_4;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class test_tringle {
	
	TraingleClassifacation triangle = new TraingleClassifacation();
	
	
	@Test
	  public void Test_1() {
	       int a = 7;
	       int b = 1;
	       int c = 15;
	       String expected = "Nottriangle";
	       String result = triangle.Triangle(a, b, c);
	       assertEquals(result , expected);
	    }
	 
	  @Test
	    public void Test_2() {
	        int a = 6;
	        int b = 10;
	        int c = 1;
	        String expected = "Nottriangle";
	        String result = triangle.Triangle(a, b, c);
	        assertEquals(result , expected);
	    }

	    @Test
	    public void Test_3() {
	        int a = 12; 
	        int b = 4;
	        int c = 7;
	        String expected = "Nottriangle";
	        String result =triangle.Triangle(a, b, c);
	        assertEquals(result , expected);
}
	@Test  
		public void Test_4(){
			int a = 5;
			int b = 5;
			int c=5;
			String expected ="equilateral";
			String result = triangle.Triangle(a, b, c);
			assertEquals(result , expected);
    }
	    @Test
	    public void Test_5() {
	        int a = 5;
	        int b = 5;
	        int c = 9;
	        String expected ="isosceles";
	        String result = triangle.Triangle(a, b, c);
	        assertEquals(result , expected);
	    }
	    @Test
	    public void Test_6() {
	        int a = 8;
	        int b = 5;
	        int c = 5;
	        String expected = "isosceles";
	        String result = triangle.Triangle(a, b, c);
	        assertEquals(result , expected);
	    }
	    @Test
	    public void Test_7() {
	        int a = 8;
	        int b = 5;
	        int c = 8;
	        String expected = "isosceles";
	        String result = triangle.Triangle(a, b, c);
	        assertEquals(result , expected);
	    }
	   
	    @Test
	    public void Test_8() {
	        int a = 8;
	        int b = 11;
	        int c = 15;
	        String expected = "Scalene";
	        String result = triangle.Triangle(a, b, c);
	        assertEquals(result , expected);
	    }

}


