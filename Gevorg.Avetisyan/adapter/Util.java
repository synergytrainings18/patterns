package adapter;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Util {
    public static Classifier disaggregationToClassifier(Disaggregation disaggregation){
        return new Classifier(disaggregation.getId(), disaggregation.getName());
    }

    public static <T, U> List<T> convert(List<U> list, Function<U, T> function) {
        List<T> res = new ArrayList<>();
        for (U elem : list) {
            res.add(function.apply(elem));
        }
        return res;
    }
}
