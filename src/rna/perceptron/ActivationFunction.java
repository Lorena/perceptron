package rna.perceptron;

import rna.Example;

public class ActivationFunction {

    private final String SIGMOID = "SIGMOID";

    private double threshould;
    private final String functionName;
    private double[] weights;

    public ActivationFunction(String functionName, double threshould) {
        this.functionName = functionName;
        this.threshould = threshould;
    }

    public double calculateByExampleAndWeights(Example example, double[] weights) {
        this.weights = weights;
        if(SIGMOID.equals(functionName)){
            return activationFunctionSigmoid(example);

        }
        return activationFunctionSigmoidBipolar(example);
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
            sum += example.getInput()[i] * weights[i];
        }
        return sum;
    }
}