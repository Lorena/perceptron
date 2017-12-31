package rna.perceptron;

import java.util.Random;

public class Weights {

    private double[] weights;

    public Weights(int lenght) {
        initializeWeightsRandom(lenght);
    }

    public double[] get() {
        return weights;
    }

    private void initializeWeightsRandom(int weightNumber) {
        weights = new double[weightNumber];
        Random random = new Random(System.currentTimeMillis());
        for (int i = 0; i < weights.length; i++) {
            weights[i] = random.nextDouble();
        }
    }
}
