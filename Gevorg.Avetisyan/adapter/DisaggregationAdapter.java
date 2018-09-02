package adapter;

import java.util.List;

public class DisaggregationAdapter extends DisaggregationService implements ClientInterface {
    @Override
    public Classifier getClassifierById(Integer id) {
        Disaggregation disaggregation = getDisaggregationById(id);
        return Util.disaggregationToClassifier(disaggregation);
    }

    @Override
    public List<Classifier> getClassifiers() {
        return Util.convert(getDisaggregations(), Util::disaggregationToClassifier);
    }

    @Override
    public boolean deleteClassifierById(Integer id) {
        return deleteDisaggregationById(id);
    }
}
