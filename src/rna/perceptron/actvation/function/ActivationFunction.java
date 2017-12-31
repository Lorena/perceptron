package rna.perceptron.actvation.function;

import rna.Example;
import rna.perceptron.Weights;

public class ActivationFunction {

    private final String SIGMOID = "SIGMOID";

    private double threshould;
    private final String functionName;
    private Weights weights;

    public ActivationFunction(String functionName, double threshould) {
        this.functionName = functionName;
        this.threshould = threshould;
    }

    public double calculateByExampleAndWeights(Example example, Weights weights) {
        this.weights = weights;
        if(SIGMOID.equals(functionName)){
            return activationFunctionSigmoid(example);

        }
        return activationFunctionSigmoidBipolar(example);
    }

    private double activationFunctionSigmoid(Example example) {
        double u = sumOfProductInputExampleAndWeightByExample(example);
        if (u > threshould) {
            return 1;
        }
        return 0;
    }

    private double activationFunctionSigmoidBipolar(Example example) {
        double u = sumOfProductInputExampleAndWeightByExample(example);
        if (u >= threshould) {
            return 1;
        }
        return -1;
    }

    private double sumOfProductInputExampleAndWeightByExample(Example example) {
        double sum = 0.0;
        for (int i = 0; i < example.inputLenght(); i++) {
            sum += example.inputs()[i] * weights.get()[i];
        }
        return sum;
    }
}