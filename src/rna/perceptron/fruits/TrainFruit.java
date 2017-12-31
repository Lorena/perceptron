package rna.perceptron.fruits;

import rna.perceptron.ActivationFunction;
import rna.perceptron.Train;
import rna.perceptron.Weights;

public class TrainFruit extends Train {

    private final String SIGMOID_BIPOLAR_FUNCTION = "SIGMOID_BIPOLAR";
    private static double LEARNING_RATE = 0.05;
    private static double THRESHOULD = 0.0;

    public TrainFruit() {
        examples = new ExamplesOfFruit();
        Weights weights = new Weights(examples.getInputLenght());
        activationFunction = new ActivationFunction(SIGMOID_BIPOLAR_FUNCTION, THRESHOULD, weights.get());
        execute(LEARNING_RATE, weights.get());
    }
}
