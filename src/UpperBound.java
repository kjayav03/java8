import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.util.Arrays.asList;

public class UpperBound {

    public static void main(String... arg) {

        List<?> unbounded = asList(new Object(),"", 1);
        // cannot add this.
        //unbounded.add(new Object())
        //Can check if it contains an object.
        checkifContains(unbounded);
        List<? extends Number> numberList = new ArrayList<>();
        //cannot add either
        //numberList.add(1);
       List<Integer> integers = Arrays.asList(1,2,3,4);
       List<Double> doubles = Arrays.asList(1.0,2.0,3.0);
       BigDecimal x1 = new BigDecimal("1.1");
       BigDecimal x2 = new BigDecimal("2.2");
       BigDecimal[] nums = {x1,x2};
       List<BigDecimal> bigDecimals = Arrays.asList(nums);
       System.out.println(getSum(integers));
       System.out.println(getSum(doubles));
       System.out.println(getSum(bigDecimals));


    }

    private static void checkifContains(List<?> unbounded) {
        System.out.println(unbounded.contains(1));
    }

    private static double getSum(List<? extends Number> numberList) {
        return numberList.stream().mapToDouble(Number::doubleValue).sum();
    }

}
