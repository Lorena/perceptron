package rna;

import rna.perceptron.ActivationFunction;
import rna.perceptron.fruits.TrainFruit;
import rna.perceptron.logic.operator.TrainLogic;

public class Example {

    private String classType;
    private double[] input;
    private double output;

    public Example(double[] input, double output) {
            this.input = input;
            this.output = output;
    }

    public Example(double[] input) {
        this.input = input;
    }

    public Example(double[] input, double output, String classType) {
        this.input = input;
        this.output = output;
        this.classType = classType;
    }

    public int getInputLenght() {
        return input.length;
    }

    public double[] getInput() {
        return input;
    }

    public double getOutput() {
        return output;
    }

    public double getInputX(int indexInput) {
        return input[indexInput];
    }

    public boolean isEqualsOutput(double result) {
        return result == output;
    }

    public void getOutputFruitLearned(TrainFruit trainFruit) {
        double sum = trainFruit.getActivationFunction().calculateByExampleAndWeights(this, trainFruit.getWeightsTrained());
        if (sum == 1) {
            System.out.println("Resulted: " + "Tangerina");
        } else {
            System.out.println("Resulted: " + "Laranja");
        }
    }

    public void getOutputLogicLearned(TrainLogic trainLogic) {
        ActivationFunction activationFunction = trainLogic.getActivationFunction();
        double sum = activationFunction.calculateByExampleAndWeights(this, trainLogic.getWeightsTrained());
        if (sum == 1) {
            System.out.println("Resulted: " + "1");
        } else {
            System.out.println("Resulted: " + "0");
        }
    }
}
