import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import java.io.*;

public class PracticeProblemTest {

   InputStream originalIn = System.in;
   PrintStream originalOut = System.out;
   ByteArrayOutputStream bos = new ByteArrayOutputStream();

   @BeforeEach
   public void setUp() {
      System.setOut(new PrintStream(bos));
   }

   @AfterEach
   public void tearDown() {
      System.setOut(originalOut);
      System.setIn(originalIn);
   }
   
   @Test
   public void testQ1_1()
   {
     InputStream originalIn = System.in;
      String data = "Hello";
      System.setIn(new ByteArrayInputStream(data.getBytes()));

      // action
      PracticeProblem.q1();

      // assertion
      assertEquals("In: H\n", bos.toString());
   }

    @Test
   public void testQ1_2()
   {
     InputStream originalIn = System.in;
      String data = "Bye";
      System.setIn(new ByteArrayInputStream(data.getBytes()));

      // action
      PracticeProblem.q1();

      // assertion
      assertEquals("In: B\n", bos.toString());
   }

    @Test
   public void testQ2_1()
   {
     InputStream originalIn = System.in;
      String data = "true\n";
      System.setIn(new ByteArrayInputStream(data.getBytes()));

      // action
      PracticeProblem.q2();

      // assertion
      assertEquals("In: false\n", bos.toString());
   }

    @Test
   public void testQ2_2()
   {
     InputStream originalIn = System.in;
      String data = "false\n";
      System.setIn(new ByteArrayInputStream(data.getBytes()));

      // action
      PracticeProblem.q2();

      // assertion
      assertEquals("In: true\n", bos.toString());
   }

    @Test
   public void testQ3_1()
   {
     InputStream originalIn = System.in;
      String data = "6\n";
      System.setIn(new ByteArrayInputStream(data.getBytes()));

      // action
      PracticeProblem.q3();

      // assertion
      assertEquals("In: true\n", bos.toString());
   }

    @Test
   public void testQ3_2()
   {
     InputStream originalIn = System.in;
      String data = "-5\n";
      System.setIn(new ByteArrayInputStream(data.getBytes()));

      // action
      PracticeProblem.q3();

      // assertion
      assertEquals("In: false\n", bos.toString());
   }

    @Test
   public void testQ4_1()
   {
     InputStream originalIn = System.in;
      String data = "2\n";
      System.setIn(new ByteArrayInputStream(data.getBytes()));

      // action
      PracticeProblem.q4();

      // assertion
      assertEquals("In: true\n", bos.toString());
   }

    @Test
   public void testQ4_2()
   {
     InputStream originalIn = System.in;
      String data = "-2\n";
      System.setIn(new ByteArrayInputStream(data.getBytes()));

      // action
      PracticeProblem.q4();

      // assertion
      assertEquals("In: true\n", bos.toString());
   }

    @Test
   public void testQ4_3()
   {
     InputStream originalIn = System.in;
      String data = "0\n";
      System.setIn(new ByteArrayInputStream(data.getBytes()));

      // action
      PracticeProblem.q4();

      // assertion
      assertEquals("In: true\n", bos.toString());
   }

    @Test
   public void testQ4_4()
   {
     InputStream originalIn = System.in;
      String data = "23\n";
      System.setIn(new ByteArrayInputStream(data.getBytes()));

      // action
      PracticeProblem.q4();

      // assertion
      assertEquals("In: false\n", bos.toString());
   }

    @Test
   public void testQ4_5()
   {
     InputStream originalIn = System.in;
      String data = "-4\n";
      System.setIn(new ByteArrayInputStream(data.getBytes()));

      // action
      PracticeProblem.q4();

      // assertion
      assertEquals("In: false\n", bos.toString());
   }

    @Test
   public void testQ5_1()
   {
     InputStream originalIn = System.in;
      String data = "Hello World";
      System.setIn(new ByteArrayInputStream(data.getBytes()));

      // action
      PracticeProblem.q5();

      // assertion
      assertEquals("In: true\n", bos.toString());
   }

    @Test
   public void testQ5_2()
   {
     InputStream originalIn = System.in;
      String data = "hello world";
      System.setIn(new ByteArrayInputStream(data.getBytes()));

      // action
      PracticeProblem.q5();

      // assertion
      assertEquals("In: false\n", bos.toString());
   }

    @Test
   public void testQ6_1()
   {
     InputStream originalIn = System.in;
      String data = "-2\n0\n";
      System.setIn(new ByteArrayInputStream(data.getBytes()));

      // action
      PracticeProblem.q6();

      // assertion
      assertEquals("In: In: true\n", bos.toString());
   }

    @Test
   public void testQ6_2()
   {
     InputStream originalIn = System.in;
      String data = "34\n5\n";
      System.setIn(new ByteArrayInputStream(data.getBytes()));

      // action
      PracticeProblem.q6();

      // assertion
      assertEquals("In: In: false\n", bos.toString());
   }

    @Test
   public void testQ6_3()
   {
     InputStream originalIn = System.in;
      String data = "3\n3\n";
      System.setIn(new ByteArrayInputStream(data.getBytes()));

      // action
      PracticeProblem.q6();

      // assertion
      assertEquals("In: In: true\n", bos.toString());
   }

   @Test
   public void testQ7_1()
   {
     InputStream originalIn = System.in;
      String data = "3\n3\n";
      System.setIn(new ByteArrayInputStream(data.getBytes()));

      // action
      PracticeProblem.q7();

      // assertion
      assertEquals("In: In: false\n", bos.toString());
   }

   @Test
   public void testQ7_2()
   {
     InputStream originalIn = System.in;
      String data = "4\n3\n";
      System.setIn(new ByteArrayInputStream(data.getBytes()));

      // action
      PracticeProblem.q7();

      // assertion
      assertEquals("In: In: true\n", bos.toString());
   }

   @Test
   public void testQ7_3()
   {
     InputStream originalIn = System.in;
      String data = "4\n5\n";
      System.setIn(new ByteArrayInputStream(data.getBytes()));

      // action
      PracticeProblem.q7();

      // assertion
      assertEquals("In: In: false\n", bos.toString());
   }
   
}
