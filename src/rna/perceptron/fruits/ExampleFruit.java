package rna.perceptron.fruits;

import rna.Example;
import rna.perceptron.Train;

public class ExampleFruit extends Example {

    private String classType;

    public ExampleFruit(double[] input, double output, String classType) {
        super(input, output);
        this.classType = classType;
    }

    public ExampleFruit(double[] input) {
        super(input);
    }

    public void getOutputFruitLearned(Train train) {
        double sum = train.getActivationFunction().calculateByExampleAndWeights(this, train.getWeightsTrained());
        outputObject.getOutputFruitLearned(sum);
    }
}
