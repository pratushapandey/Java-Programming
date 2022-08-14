/*If -1 is shown in output then it means there is no double or triple spaces. */

import java.lang.*;
import java.util.*;

class DoubleTripleSpaces {
    public static void main(String args[])
    {
        String myString = "This string contains double and  triple spaces";
        System.out.println(myString.indexOf("  "));
        System.out.println(myString.indexOf("   "));
    }
}
