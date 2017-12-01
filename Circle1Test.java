
/***
* Example JUnit testing class for Circle1 (and Circle)
*
* - must have your classpath set to include the JUnit jarfiles
* - to run the test do:
*     java org.junit.runner.JUnitCore Circle1Test
* - note that the commented out main is another way to run tests
* - note that normally you would not have print statements in
*   a JUnit testing class; they are here just so you see what is
*   happening. You should not have them in your test cases.
***/

import org.junit.*;

public class Circle1Test
{
   // Data you need for each test case
   private Circle1 circle1;
   private Circle1 circle2;
   private Circle1 circle3;

// 
// Stuff you want to do before each test case
//
@Before
public void setup()
{
   System.out.println("\nTest starting...");
   circle1 = new Circle1(1,2,3);
   circle2 = new Circle1(3,2,3);
   circle3 = new Circle1(8,2,3);
}

//
// Stuff you want to do after each test case
//
@After
public void teardown()
{
   System.out.println("\nTest finished.");
}

//
// Test a simple positive move
//
@Test
public void simpleMove()
{
   Point p;
   System.out.println("Running test simpleMove.");
   p = circle1.moveBy(1,2);
   Assert.assertTrue(p.x == 2 && p.y == 4);
}

// 
// Test a simple negative move
//
@Test
public void simpleMoveNeg()
{
   Point p;
   System.out.println("Running test simpleMoveNeg.");
   p = circle1.moveBy(-1,-1);
   Assert.assertTrue(p.x == 0 && p.y == 1);
}

// 
// Test scaling that makes the circle bigger
//
@Test
public void simpleScalingPositive()
{
   double r;
   System.out.println("Running test simpleScalingPositve that tests to see if the circle is biggger.");
   r = circle1.scale(2.0);
   Assert.assertTrue(r == 6.0);
}

//
// Test scaling that makes the circle smaller
//
@Test
public void simpleScalingNeg()
{
   double r;
   System.out.println("Running test simpleScalingNeg that tests to see if the circle is smaller.");
   r = circle1.scale(0.9);
   Assert.assertTrue(r == 2.7);
}

// 
// Tests to see if the circles intersect
//
@Test
public void intersectsTrue()
{
   boolean intersect;
   System.out.println("Running test intersectsTrue that sees if the circle intersects with another circle.");
   intersect = circle1.intersects(circle2);
   Assert.assertTrue(intersect);
}

// 
// Tests to see if the circles do not intersect
//
@Test
public void intersectsFalse()
{
   boolean intersect;
   System.out.println("Running test intersectsFalse that sees if the circle does not intersect with another circle.");
   intersect = circle1.intersects(circle3);
   Assert.assertTrue(!intersect);
}

/*** NOT USED
public static void main(String args[])
{
   try {
      org.junit.runner.JUnitCore.runClasses(
               java.lang.Class.forName("Circle1Test"));
   } catch (Exception e) {
      System.out.println("Exception: " + e);
   }
}
***/

}

