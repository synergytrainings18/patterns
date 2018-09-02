package adapter;

import java.util.ArrayList;
import java.util.List;

public class ClassifierService implements ClientInterface{
    public Classifier getClassifierById(Integer id){
        return new Classifier(id , "Classifier");
    }

    public List<Classifier> getClassifiers(){
        return new ArrayList<>();
    }

    public boolean deleteClassifierById(Integer id){
        return true;
    }
}
