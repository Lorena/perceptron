package rna.perceptron;

import rna.Example;
import rna.Examples;

import java.util.Random;

public class Train {

    protected static double LEARNING_RATE;

    protected double activationFunctionResult;
    protected double[] weights;
    protected ActivationFunction activationFunction;

    private int epoch = 0;

    protected Examples examples;

    public double[] getWeights() {
        return weights;
    }

    protected void execute(double learningRate, double[] weights) {
        LEARNING_RATE = learningRate;
        this.weights = weights;
        System.out.println("Inicia o treinamento");
        do {
            examples.noExistError();
            adjustTheCorrectWeights();
            epoch++;
        } while (examples.hasError());

        showInformations();
    }

    protected void initializeWeightsRandom(int weightNumber) {
        weights = new double[weightNumber];
        Random random = new Random(System.currentTimeMillis());
        for (int i = 0; i < weights.length; i++) {
            weights[i] = random.nextDouble();
        }
    }

    private void adjustTheCorrectWeights() {
        for (Example example : this.examples.get()) {
            activationFunctionResult = activationFunction.calcule(example);
            if (!activationFunction.isEqualsOutputExpected(example)) {
                loadNewValueOfWeight(example, LEARNING_RATE);
                examples.existError();
            }
        }
    }

    private void loadNewValueOfWeight(Example exemple, double learningRate) {
        for (int i = 0; i < weights.length; i++) {
            weights[i] = weights[i] + learningRate * (exemple.getOutput() - activationFunctionResult) * exemple.getInputX(i);
        }
    }

    private void showInformations() {
        System.out.println("Numero de épocas necessárias: " + epoch);
        System.out.println("Pesos: " + showWeights());
        System.out.println("Finaliza o treinamento");
        System.out.println("############################################################################################");
    }

    private String showWeights() {
        String w = "";
        for(double weight : weights) {
            w += weight + " ";
        }
        return w;
    }
}
