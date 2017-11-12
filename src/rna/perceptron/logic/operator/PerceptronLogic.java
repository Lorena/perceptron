package rna.perceptron.logic.operator;

import rna.Example;
import rna.Perceptron;

public class PerceptronLogic implements Perceptron {

    private static double THRESHOULD = 0.3;
    private double[] weights;

    public PerceptronLogic() {
        TrainLogic train = new TrainLogic();
        train.config(0.3, 0.2, "sigmoid");
        train.execute();
        weights = train.getWeights();
    }

    public void learningByPerceptron(Example example) {
        activationFunctionOfU(example);
    }

    private void activationFunctionOfU(Example example) {
        double sum = sumOfProductByExemplo(example);
        if (sum > THRESHOULD) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
    }

    private double sumOfProductByExemplo(Example example) {
        double sum = 0.0;
        for (int i = 0; i < example.getInputLenght(); i++) {
            sum += example.getInput()[i] * weights[i];
        }
        return sum;
    }
}
