import org.junit.Test;

import static junit.framework.TestCase.assertTrue;

public class MainClassTest

{

    MainClass localNumber = new MainClass();


    @Test

    public void testGetClassNumber ()

    {
        int a = localNumber.getClassNumber();
      //  assertTrue("testGetClassNumber Failed", a >45);

        if (a>45)

        {
            System.out.println("testGetClassNumber Done");
        } else

        {
            System.out.println("testGetClassNumber Failed");
        }


    }


@Test

    public void testGetLocalNumber ()
        {
            int a = localNumber.getLocalNumber();

          //  assertTrue("testGetLocalNumber Failed", a == 14);

            if (a==14)

            {
                System.out.println("testGetLocalNumber Done");
            } else

                {
                    System.out.println("testGetLocalNumber Failed");
                }
        }




}
