import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.util.Arrays.asList;

public class UpperBound {

    public static void main(String... arg) {

        List<?> unbounded = asList(new Object(),"", 1);
        // cannot add this.
        //unbounded.add(new Object())

    }

}
