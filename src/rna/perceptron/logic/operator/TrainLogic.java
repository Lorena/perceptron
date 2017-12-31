package rna.perceptron.logic.operator;

import rna.perceptron.ActivationFunction;
import rna.perceptron.Train;

public class TrainLogic extends Train {

    private final String SIGMOID_FUNCTION = "SIGMOID";
    private static double LEARNING_RATE = 0.2;
    private static double THRESHOULD = 0.3;


    public TrainLogic() {
        examples = new ExamplesOfLogicOperator("or");

        initializeWeightsRandom();
        activationFunction = new ActivationFunction(SIGMOID_FUNCTION, THRESHOULD, weights);

        execute(LEARNING_RATE);
    }
}
