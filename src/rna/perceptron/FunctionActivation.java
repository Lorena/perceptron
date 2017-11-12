package rna.perceptron;

import rna.Example;

public class FunctionActivation {

    private double threshould;
    private final String functionName;
    protected double[] weights;
    private double result;

    public FunctionActivation(String functionName, double threshould, double[] weights) {
        this.functionName = functionName;
        this.threshould = threshould;
        this.weights = weights;
    }

    public double calcule(Example example) {
        if("sigmoid".equals(functionName)){
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
            sum += example.getInput()[i] * weights[i];
        }
        return sum;
    }
}
