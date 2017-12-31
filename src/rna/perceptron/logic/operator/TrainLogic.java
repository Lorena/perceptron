package rna.perceptron.logic.operator;

import rna.Examples;
import rna.perceptron.ActivationFunction;
import rna.perceptron.Train;
import rna.perceptron.Weights;

public class TrainLogic extends Train {

    private final String SIGMOID_FUNCTION = "SIGMOID";
    private final static double LEARNING_RATE = 0.2;
    private final static double THRESHOULD = 0.3;

    public TrainLogic() {
        Examples examples = new ExamplesOfLogicOperator("or");
        ActivationFunction sigmoidActivationFunction = new ActivationFunction(SIGMOID_FUNCTION, THRESHOULD);
        Weights weightsRandon = new Weights(examples.lenght(), sigmoidActivationFunction, LEARNING_RATE);
        train(examples, weightsRandon);
    }
}
