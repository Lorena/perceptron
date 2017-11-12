package rna.perceptron.fruits;

import rna.Example;
import rna.Perceptron;
import rna.perceptron.FunctionActivation;

public class PerceptronFruit implements Perceptron{

    private static double THRESHOULD = 0.0;
    private double[] weights;
    private FunctionActivation functionActivation;

    public PerceptronFruit() {
        TrainFruit train = new TrainFruit();
        train.config(0, 0.05, "sigmoidBipolar");
        train.execute();
        weights = train.getWeights();
        functionActivation = new FunctionActivation("sigmoidBipolar", THRESHOULD, weights);
    }

    public void learningByPerceptron(Example example) {
        getResponse(example);
    }

    private void getResponse(Example example) {
        double sum = functionActivation.calcule(example);
        if (sum == 1) {
            System.out.println("Tangerina");
        } else {
            System.out.println("Laranja");
        }
    }
}
