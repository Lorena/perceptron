package rna.perceptron.logic.operator;

import rna.Example;
import rna.perceptron.Train;

public class ExampleLogicOperator extends Example {
    public ExampleLogicOperator(double[] input, int output) {
        super(input, output);
    }

    public ExampleLogicOperator(double[] input) {
        super(input);
    }

    public void getOutputLearned(Train train) {
        double sum = train.getActivationFunction().calculateByExampleAndWeights(this, train.getWeightsTrained());
        output.getLearned(sum, "operatorLogic");
    }
}
