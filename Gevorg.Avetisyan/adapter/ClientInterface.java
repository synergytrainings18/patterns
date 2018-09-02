package adapter;

import java.util.List;

public interface ClientInterface {
    Classifier getClassifierById(Integer id);

    List<Classifier> getClassifiers();

    boolean deleteClassifierById(Integer id);
}
