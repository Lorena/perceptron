package rna.perceptron.fruits;

import rna.Examples;
import rna.perceptron.ActivationFunction;
import rna.perceptron.Train;
import rna.perceptron.Weights;

public class TrainFruit extends Train {

    private final String SIGMOID_BIPOLAR_FUNCTION = "SIGMOID_BIPOLAR";
    private final static double LEARNING_RATE = 0.05;
    private final static double THRESHOULD = 0.0;

    public TrainFruit() {
        Examples examples = new ExamplesOfFruit();
        ActivationFunction activationFunction = new ActivationFunction(SIGMOID_BIPOLAR_FUNCTION, THRESHOULD);
        Weights weights = new Weights(examples.getInputLenght(), activationFunction);
        train(examples, weights, LEARNING_RATE);
    }
}
