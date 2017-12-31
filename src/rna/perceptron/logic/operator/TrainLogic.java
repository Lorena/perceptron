package rna.perceptron.logic.operator;

import rna.perceptron.ActivationFunction;
import rna.perceptron.Train;
import rna.perceptron.Weights;

public class TrainLogic extends Train {

    private final String SIGMOID_FUNCTION = "SIGMOID";
    private static double LEARNING_RATE = 0.2;
    private static double THRESHOULD = 0.3;

    public TrainLogic() {
        examples = new ExamplesOfLogicOperator("or");
        Weights weights = new Weights(examples.getInputLenght());
        activationFunction = new ActivationFunction(SIGMOID_FUNCTION, THRESHOULD, weights.get());
        execute(LEARNING_RATE, weights.get());
    }
}
