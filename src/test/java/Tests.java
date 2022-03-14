
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

    public class Tests {
        public static Calc calc;

        @BeforeClass
        public static void setup() {
            calc = new Calc();
        }

        @Test
        //Test case by Ankhit Tangella
        public void testAdd() {
            assertEquals(10, calc.add(7, 3));
        }

        @Test
        //Test case by Trayi Chaganti
        public void testSub() {
            assertEquals(1, calc.sub(4, 3));
        }
        @Test
        //Test case by Bhavya Yaddula
        public void testDiv() {assertEquals(1, calc.div(9, 9));}

        @Test
        //Test case by Shoaib Anwar
        public void testMult() {assertEquals(81,  calc.mult(9, 9));}
        @Test
        //Integration test
        public void integration_test1(){
            assertEquals(10,calc.add(calc.sub(10,4),calc.mult(2,2)));
        }

        @Test
        //Integration test
        public void integration_test2(){
            assertEquals(5,calc.div(calc.add(0,5),calc.mult(1,1)));
        }
    }







