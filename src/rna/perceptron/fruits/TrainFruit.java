package rna.perceptron.fruits;

import rna.Examples;
import rna.perceptron.ActivationFunction;
import rna.perceptron.Train;

public class TrainFruit extends Train {

    public TrainFruit(int threshould, double learningRate, String fuctionName) {

        examples = new Examples();
        examples.loadInfoFruitForTrain();

        LEARNING_RATE = learningRate;
        initializeWeightsRandom();
        activationFunction = new ActivationFunction(fuctionName, threshould, weights);
    }
}
