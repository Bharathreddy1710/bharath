import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class sampletest 
{
sample obj;
@BeforeAll
public static void beforeclass()
{
	System.out.println("Before all test cases");
}
@AfterAll
public static void afterclass()
{
	System.out.println("Before all test cases");
}
@BeforeEach

public void setup()
{
	System.out.println("before test method");
	obj=new sample();
}
@AfterEach

public void setdown()
{
	System.out.println("after test method");
	obj=null;
}
@Test
public void testadd()
{
	System.out.println("test add method");
	assertEquals(50, obj.add(30, 20));
}
@Test
public void testsub()
{
	System.out.println("test sub method");
	assertEquals(20, obj.sub(50, 30));
}
@Test
public void testmul()
{
	System.out.println("test mul method");
	assertEquals(600, obj.mul(30, 20));
}
@Test
public void testGreet()
{
	System.out.println("test greet method");
	assertEquals("hi", obj.greet("hello"));
}
}

