package rna.perceptron;

import rna.Example;
import rna.Examples;

import java.util.Random;

public class Weights {

    private final ActivationFunction activationFunction;
    private double[] weights;
    private double learningRate;

    public Weights(int lenght, ActivationFunction activationFunction, double learningRate) {
        initializeWeightsRandom(lenght);
        this.activationFunction = activationFunction;
        this.learningRate = learningRate;
    }

    public double[] get() {
        return weights;
    }

    public String show() {
        String w = "";
        for(double weight : weights) {
            w += weight + " ";
        }
        return w;
    }

    public void adjustWeightsAsExpectedExampleResult(Examples examples) {
        for (Example example : examples.get()) {
            double activationFunctionResult = activationFunction.calculateByExampleAndWeights(example, this);
            if (!example.isEqualsOutput(activationFunctionResult)) {
                loadNewValues(example, activationFunctionResult);
                examples.existError();
            }
        }
    }

    private void loadNewValues(Example example, double activationFunctionResult) {
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
}
