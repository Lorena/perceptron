package rna.perceptron.logic.operator;

import rna.Example;
import rna.Perceptron;
import rna.perceptron.ActivationFunction;

public class NeuronLearningLogicOperator implements Perceptron {

    private final String SIGMOID_FUNCTION = "SIGMOID";
    private ActivationFunction activationFunction;
    private TrainLogic train;

    @Override
    public void trainingByExamples() {
        train = new TrainLogic();
    }

    @Override
    public void learningAnExample(Example example, String expected) {
        System.out.println("Executa o aprendizado por Perceptron: ");
        activationFunction = new ActivationFunction(SIGMOID_FUNCTION, 0.3, train.getWeights());
        activationFunction.getResulted(example);
        System.out.println("Expected: " + expected);
        System.out.println("_____");
    }
}
