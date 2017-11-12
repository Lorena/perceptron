package rna.perceptron.logic.operator;

import rna.Example;
import rna.Perceptron;
import rna.perceptron.FunctionActivation;

public class PerceptronLogic implements Perceptron {

    private static double THRESHOULD = 0.3;
    private double[] weights;
    private FunctionActivation functionActivation;

    public PerceptronLogic() {
        TrainLogic train = new TrainLogic();
        train.config(0.3, 0.2, "sigmoid");
        train.execute();
        weights = train.getWeights();
        functionActivation = new FunctionActivation("sigmoid", THRESHOULD, weights);
    }

    public void learningByPerceptron(Example example) {
        activationFunctionOfU(example);
    }

    private void activationFunctionOfU(Example example) {
        double sum = functionActivation.calcule(example);
        if (sum == 1) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
    }
}
