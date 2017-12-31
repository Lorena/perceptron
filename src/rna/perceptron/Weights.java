package rna.perceptron;

import rna.Example;
import rna.Examples;

import java.util.Random;

public class Weights {

    private final ActivationFunction activationFunction;
    private double[] weights;

    public Weights(int lenght, ActivationFunction activationFunction) {
        initializeWeightsRandom(lenght);
        this.activationFunction = activationFunction;
    }

    public String show() {
        String w = "";
        for(double weight : weights) {
            w += weight + " ";
        }
        return w;
    }

    public void adjustTheCorrectWeightsAsExpectedExampleResult(Examples examples, double learningRate) {
        for (Example example : examples.get()) {
            double activationFunctionResult = activationFunction.calcule(example, weights);
            if (!activationFunction.isEqualsOutputExpected(example)) {
                loadNewValues(example, activationFunctionResult, learningRate);
                examples.existError();
            }
        }
    }

    private void loadNewValues(Example example, double activationFunctionResult, double learningRate) {
        for (int i = 0; i < weights.length; i++) {
            weights[i] = weights[i] + learningRate * (example.getOutput() - activationFunctionResult) * example.getInputX(i);
        }
    }

    private void initializeWeightsRandom(int weightNumber) {
        weights = new double[weightNumber];
        Random random = new Random(System.currentTimeMillis());
        for (int i = 0; i < weights.length; i++) {
            weights[i] = random.nextDouble();
        }
    }

    public double[] get() {
        return weights;
    }
}
