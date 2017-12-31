package rna.perceptron;

import rna.Example;
import rna.Examples;

public class Train {

    protected static double LEARNING_RATE;

    protected Examples examples;
    protected Weights weights;
    protected ActivationFunction activationFunction;

    private int epoch = 0;

    public Weights getWeights() {
        return weights;
    }

    protected void train(double learningRate) {
        LEARNING_RATE = learningRate;
        System.out.println("Inicia o treinamento");
        do {
            examples.noExistError();
            adjustTheCorrectWeights();
            epoch++;
        } while (examples.hasError());

        showInformationsTrain();
    }

    private void adjustTheCorrectWeights() {
        for (Example example : this.examples.get()) {
            double activationFunctionResult = activationFunction.calcule(example);
            if (!activationFunction.isEqualsOutputExpected(example)) {
                weights.loadNewValues(example, LEARNING_RATE, activationFunctionResult);
                examples.existError();
            }
        }
    }

    private void showInformationsTrain() {
        System.out.println("Numero de épocas necessárias: " + epoch);
        System.out.println("Pesos: " + weights.show());
        System.out.println("Finaliza o treinamento");
        System.out.println("############################################################################################");
    }
}
