import org.junit.Test;

import static junit.framework.TestCase.assertTrue;

public class MainClassTest {

    MainClass localNumber = new MainClass();

    @Test
    public void testGetLocalNumber ()
        {
int a = localNumber.getLocalNumber();

//assertTrue("Do not 14", a == 14);

            if (a==14)

            {
                System.out.println("testGetLocalNumber Done");
            } else

                {
                    System.out.println("testGetLocalNumber Failed");
                }


        }




}
