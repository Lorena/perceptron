package rna.perceptron;

import rna.Example;
import rna.Examples;

import java.util.Random;

public class Train {

    protected Examples examples;
    protected double[] weights;

    protected void initializeWeightsRandom() {
        weights = new double[examples.getInputLenght()];
        Random random = new Random(System.currentTimeMillis());
        for (int i = 0; i < weights.length; i++) {
            weights[i] = random.nextDouble();
        }
    }

    protected double sumOfProductByExample(Example example) {
        double sum = 0.0;
        for (int i = 0; i < example.getInputLenght(); i++) {
            sum += example.getInput()[i] * weights[i];
        }
        return sum;
    }

    public double[] getWeights() {
        return weights;
    }
}
