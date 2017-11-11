package rna.perceptron.fruits;

import rna.Example;
import rna.Perceptron;

public class PerceptronFruit implements Perceptron {

    private static double THRESHOULD = 0.0;
    private double[] weights;

    public PerceptronFruit() {
        TrainFruit train = new TrainFruit();
        train.execute();
        weights = train.getWeights();
    }

    public void learningByPerceptron(Example example) {
        activationFunctionOfU(example);
    }

    private void activationFunctionOfU(Example example) {
        double u = sumOfProductXKanWByExemplo(example);
        if (u >= THRESHOULD) {
            System.out.println("Tangerina");
        } else {
            System.out.println("Laranja");
        }
    }

    private double sumOfProductXKanWByExemplo(Example example) {
        double sum = 0.0;
        for (int i = 0; i < example.getInputLenght(); i++) {
            sum += example.getInput()[i] * weights[i];
        }
        return sum;
    }
}
