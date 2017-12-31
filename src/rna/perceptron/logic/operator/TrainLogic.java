package rna.perceptron.logic.operator;

import rna.Examples;
import rna.perceptron.actvation.function.ActivationFunction;
import rna.perceptron.Train;
import rna.perceptron.Weights;

public class TrainLogic extends Train {

    private final String SIGMOID_FUNCTION = "SIGMOID";
    private final static double LEARNING_RATE = 0.2;
    private final static double THRESHOULD = 0.3;
    private final ActivationFunction activationFunction;

    public TrainLogic() {
        Examples examples = new ExamplesOfLogicOperator("or");
        activationFunction = new ActivationFunction(SIGMOID_FUNCTION, THRESHOULD);
        Weights weightsRandon = new Weights(examples.inputLenght(), activationFunction, LEARNING_RATE);
        train(examples, weightsRandon);
    }

    public ActivationFunction getActivationFunction() {
        return activationFunction;
    }
}
