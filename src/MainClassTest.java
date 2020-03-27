import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertTrue;

public class MainClassTest

{

    MainClass local = new MainClass();

    @Before

    public void textStartTest()

    {System.out.println("Start test");}

    @After
    public void textEndTest()

    {System.out.println("End test");}


    @Test

    public void testGetClassString ()

    {
        String a = local.getClassString();
        a=a.toLowerCase();


        assertTrue("getClassString Failed",a.contains("hello")==true );


      /*if(a.contains("hello")==true)
      {
          System.out.println("есть слово");
      }else
          System.out.println("нет слова");*/

    }


}
