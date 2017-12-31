package rna.perceptron;

import rna.Example;

import java.util.Random;

public class Weights {

    private double[] weights;

    public Weights(int lenght) {
        initializeWeightsRandom(lenght);
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

    public void loadNewValues(Example exemple, double learningRate, double activationFunctionResult) {
        for (int i = 0; i < weights.length; i++) {
            weights[i] = weights[i] + learningRate * (exemple.getOutput() - activationFunctionResult) * exemple.getInputX(i);
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
