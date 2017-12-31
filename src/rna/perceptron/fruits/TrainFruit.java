package rna.perceptron.fruits;

import rna.perceptron.ActivationFunction;
import rna.perceptron.Train;

public class TrainFruit extends Train {

    private final String SIGMOID_BIPOLAR_FUNCTION = "SIGMOID_BIPOLAR";
    private static double LEARNING_RATE = 0.05;
    private static double THRESHOULD = 0.0;

    public TrainFruit() {

        examples = new ExamplesOfFruit();
        initializeWeightsRandom();
        activationFunction = new ActivationFunction(SIGMOID_BIPOLAR_FUNCTION, THRESHOULD, weights);

        execute(LEARNING_RATE);
    }
}
