package rna.perceptron.logic.operator;

import rna.Examples;
import rna.perceptron.Train;

public class TrainLogic extends Train {
    public TrainLogic() {
       examples = new Examples();
//       examples.loadAndLogicOperator();
       examples.loadOrLogicOperator();
    }
}
