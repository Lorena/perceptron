package rna.perceptron;

import rna.Examples;

public class Train {

    protected ActivationFunction activationFunction;
    private Weights weights;
    private int epoch = 0;

    public Weights getWeightsTrained() {
        return weights;
    }

    protected void train(Examples examples, Weights weights) {
        this.weights = weights;
        System.out.println("Inicia o treinamento");
        do {
            examples.cleanError();
            this.weights.adjustWeightsAsExpectedExampleResult(examples);
            epoch++;
        } while (examples.hasError());

        showInformationsTrain();
    }

    public ActivationFunction getActivationFunction() {
        return activationFunction;
    }


    private void showInformationsTrain() {
        System.out.println("Numero de épocas necessárias: " + epoch);
        System.out.println("Pesos: " + weights.show());
        System.out.println("Finaliza o treinamento");
        System.out.println("############################################################################################");
    }
}
