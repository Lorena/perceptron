package rna.perceptron;

import rna.Examples;

public class Train {

    private Weights weights;
    private int epoch = 0;

    public Weights getWeights() {
        return weights;
    }

    protected void train(Examples examples, Weights weights, double learningRate) {
        this.weights = weights;
        System.out.println("Inicia o treinamento");
        do {
            examples.noExistError();
            this.weights.adjustTheCorrectWeightsAsExpectedExampleResult(examples, learningRate);
            epoch++;
        } while (examples.hasError());

        showInformationsTrain();
    }

    private void showInformationsTrain() {
        System.out.println("Numero de épocas necessárias: " + epoch);
        System.out.println("Pesos: " + weights.show());
        System.out.println("Finaliza o treinamento");
        System.out.println("############################################################################################");
    }
}
