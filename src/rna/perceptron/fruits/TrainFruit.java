package rna.perceptron.fruits;

import rna.Example;
import rna.Examples;
import rna.perceptron.Train;

public class TrainFruit extends Train {

    private static double THRESHOULD = 0;
    private static double LEARNING_RATE = 0.05;
    private static int EPOCH = 0;
    private double activationFunctionResult;

    public TrainFruit() {
        examples = new Examples();
        examples.loadInfoFruit();
    }

    public void execute() {
        System.out.println("Inicia o treinamento");
        initializeWeightsRandom();

        do {
            examples.noExistError();
            adjustTheCorrectWeights();
            EPOCH++;
        } while (examples.hasError());

        showInformations();
    }

    private void adjustTheCorrectWeights() {
        for (Example example : this.examples.get()) {
            activationFunctionResult = activationFunctionOfU(example);
            if (!isActivationFunctionResultEqualsOutputExpected(example)) {
                loadNewValueOfWeight(example);
                examples.existError();
            }
        }
    }

    private boolean isActivationFunctionResultEqualsOutputExpected(Example example) {
        return activationFunctionResult == example.getOutput();
    }

    private void loadNewValueOfWeight(Example exemple) {
        for (int i = 0; i < weights.length; i++) {
            weights[i] = newValueOfWeight(i, exemple);
        }
    }

    private double newValueOfWeight(int i, Example exemple) {
        return weights[i] + LEARNING_RATE * (exemple.getOutput() - activationFunctionResult) * exemple.getInputX(i);
    }

    private double activationFunctionOfU(Example example) {
        double u = sumOfProductByExample(example);
        if (u >= THRESHOULD) {
            return 1;
        }
        return -1;
    }

    private void showInformations() {
        System.out.println("Numero de épocas necessárias: " + EPOCH);
        System.out.println("Pesos: " + weights[0] + " " + weights[1] + " " + weights[2] + " " + weights[3]);
        System.out.println("Finaliza o treinamento");
        System.out.println("############################################################################################");
    }
}
