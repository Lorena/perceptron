package rna.perceptron;

import rna.Example;

public class FunctionActivation {

    private double THRESHOULD;
    private final String functionName;
    protected double[] weights;

    public FunctionActivation(String functionName, double threshould, double[] weights) {
        this.functionName = functionName;
        this.THRESHOULD = threshould;
        this.weights = weights;
    }

    public double result(Example example) {
        if("sigmoid".equals(functionName)){
            return activationFunctionSigmoid(example);
        }
        return activationFunctionSigmoidBipolar(example);
    }

    private double activationFunctionSigmoid(Example example) {
        double u = sumOfProductByExample(example);
        if (u > THRESHOULD) {
            return 1;
        }
        return 0;
    }

    private double activationFunctionSigmoidBipolar(Example example) {
        double u = sumOfProductByExample(example);
        if (u >= THRESHOULD) {
            return 1;
        }
        return -1;
    }

    protected double sumOfProductByExample(Example example) {
        double sum = 0.0;
        for (int i = 0; i < example.getInputLenght(); i++) {
            sum += example.getInput()[i] * weights[i];
        }
        return sum;
    }
}
