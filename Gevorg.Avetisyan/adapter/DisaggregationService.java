package adapter;

import java.util.ArrayList;
import java.util.List;

public class DisaggregationService {
    public Disaggregation getDisaggregationById(Integer id){
        return new Disaggregation(id , "Disaggregation");
    }

    public List<Disaggregation> getDisaggregations(){
        return new ArrayList<>();
    }

    public boolean deleteDisaggregationById(Integer id){
        return true;
    }
}
