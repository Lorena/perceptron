package rna.perceptron.logic.operator;

import rna.Examples;
import rna.perceptron.ActivationFunction;
import rna.perceptron.Train;

public class TrainLogic extends Train {

    public TrainLogic(double threshould, double learningRate, String fuctionName) {
        examples = new Examples();
        examples.loadOrLogicOperatorForTrain();

        LEARNING_RATE = learningRate;
        initializeWeightsRandom();
        activationFunction = new ActivationFunction(fuctionName, threshould, weights);

        execute();
    }
}
