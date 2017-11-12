package rna.perceptron.logic.operator;

import rna.Example;
import rna.Perceptron;

public class PerceptronLogic implements Perceptron {

    private static double THRESHOULD_OPERATOR = 0.3;
    private double[] weights;

    public PerceptronLogic() {
        TrainLogic train = new TrainLogic();
        train.execute();
        weights = train.getWeights();
    }

    public void learningByPerceptron(Example e) {

        double[] example = e.getInput();
        double sum = 0.0;
        for(int i=0;i<example.length;i++) {
            sum += weights[i]*example[i];
        }
        System.out.print("Resultado é: ");
        if(sum> THRESHOULD_OPERATOR)
            System.out.println("1");
        else
            System.out.println("0");
    }
}
