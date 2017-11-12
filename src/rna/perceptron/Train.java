package rna.perceptron;

import rna.Example;
import rna.Examples;

import java.util.Random;

public class Train {

    protected static int EPOCH = 0;

    private FunctionActivation functionActivation;
    private double LEARNING_RATE;

    protected double activationFunctionResult;
    protected Examples examples;
    protected double[] weights;

    public void config(double threshould, double learningRate, String fuctionName) {
        LEARNING_RATE = learningRate;
        initializeWeightsRandom();
        functionActivation = new FunctionActivation(fuctionName, threshould, weights);
    }

    public void execute() {
        System.out.println("Inicia o treinamento");
        do {
            examples.noExistError();
            adjustTheCorrectWeights();
            EPOCH++;
        } while (examples.hasError());

        showInformations();
    }

    private void adjustTheCorrectWeights() {
        for (Example example : this.examples.get()) {
            activationFunctionResult = functionActivation.result(example);
            if (!isActivationFunctionResultEqualsOutputExpected(example)) {
                loadNewValueOfWeight(example, LEARNING_RATE);
                examples.existError();
            }
        }
    }

    protected void initializeWeightsRandom() {
        weights = new double[examples.getInputLenght()];
        Random random = new Random(System.currentTimeMillis());
        for (int i = 0; i < weights.length; i++) {
            weights[i] = random.nextDouble();
        }
    }

    protected boolean isActivationFunctionResultEqualsOutputExpected(Example example) {
        return activationFunctionResult == example.getOutput();
    }

    protected void loadNewValueOfWeight(Example exemple, double learningRate) {
        for (int i = 0; i < weights.length; i++) {
            weights[i] = weights[i] + learningRate * (exemple.getOutput() - activationFunctionResult) * exemple.getInputX(i);
        }
    }

    protected void showInformations() {
        System.out.println("Numero de épocas necessárias: " + EPOCH);
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

    public double[] getWeights() {
        return weights;
    }
}
