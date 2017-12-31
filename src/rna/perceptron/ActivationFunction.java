package rna.perceptron;

import rna.Example;

public class ActivationFunction {

    private final String SIGMOID = "SIGMOID";

    private double threshould;
    private final String functionName;
    private Weights weights;
    private double result;

    public ActivationFunction(String functionName, double threshould, Weights weights) {
        this.functionName = functionName;
        this.threshould = threshould;
        this.weights = weights;
    }

    public void getResultedFruit(Example example) {
        double sum = calcule(example);
        if (sum == 1) {
            System.out.println("Resulted: " + "Tangerina");
        } else {
            System.out.println("Resulted: " + "Laranja");
        }
    }

    public void getResulted(Example example) {
        double sum = calcule(example);
        if (sum == 1) {
            System.out.println("Resulted: " + "1");
        } else {
            System.out.println("Resulted: " + "0");
        }
    }

    public double calcule(Example example) {
        if(SIGMOID.equals(functionName)){
            return result = activationFunctionSigmoid(example);

        }
        return result = activationFunctionSigmoidBipolar(example);
    }

    public boolean isEqualsOutputExpected(Example example) {
        return result == example.getOutput();
    }

    private double activationFunctionSigmoid(Example example) {
        double u = sumOfProductByExample(example);
        if (u > threshould) {
            return 1;
        }
        return 0;
    }

    private double activationFunctionSigmoidBipolar(Example example) {
        double u = sumOfProductByExample(example);
        if (u >= threshould) {
            return 1;
        }
        return -1;
    }

    private double sumOfProductByExample(Example example) {
        double sum = 0.0;
        for (int i = 0; i < example.getInputLenght(); i++) {
            sum += example.getInput()[i] * weights.get()[i];
        }
        return sum;
    }
}