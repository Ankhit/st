
import org.junit.BeforeClass;
import org.junit.Test;


import static org.junit.Assert.assertEquals;

public class Ourtests{
    public static Stesting obj;
    @BeforeClass
    public static void setup(){
        obj = new Stesting();
    }
    @Test
    public void testmerge1(){
        assertEquals("Staomy",obj.merge("Sam","toy"));
    }
    @Test
    public void testmerge2(){
        assertEquals("StAoMy",obj.merge("SAM","toy"));
    }
    @Test
    public void testmerge3(){
        assertEquals("error",obj.merge("","toy"));
    }
    @Test
    public void testpalindrome1(){
        assertEquals(true,obj.palindrome(121));
    }
    @Test
    public void testpalindrome2(){
        assertEquals(false,obj.palindrome(123));
    }
    @Test
    public void testpalindrome3(){
        assertEquals(true,obj.palindrome(111));
    }
    @Test
    public void testsearch1(){
        int arr[] = {1,2,3,4};
        assertEquals(-1,obj.search(arr,4,5));
    }
    @Test
    public void testsearch2(){
        int arr[] = {1,2,3,4};
        assertEquals(0,obj.search(arr,4,1));
    }
    @Test
    public void testsearch3(){
        int arr[] = {1,2,3,4};
        assertEquals(3,obj.search(arr,4,4));
    }





}



