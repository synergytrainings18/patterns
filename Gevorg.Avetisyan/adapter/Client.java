package adapter;

import java.util.List;

public class Client {
    public static void main(String[] args) {
        ClassifierService classifierService = null;
        DisaggregationAdapter disaggregationAdapter = null;
        Client.clientMethods(disaggregationAdapter);
    }

    public static void clientMethods(ClientInterface clientInterface){
        Classifier disaggregation = clientInterface.getClassifierById(15);
        if (clientInterface.deleteClassifierById(20)){
            List<Classifier> disaggregations = clientInterface.getClassifiers();
        }
    }
}
