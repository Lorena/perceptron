package rna.perceptron.logic.operator;

import rna.Example;
import rna.Perceptron;
import rna.perceptron.ActivationFunction;

public class NeuronLearningLogicOperator implements Perceptron {

    private final String SIGMOID_FUNCTION = "SIGMOID";
    private ActivationFunction activationFunction;

    @Override
    public void trainingByExamples() {
        TrainLogic train = new TrainLogic(0.3, 0.2, SIGMOID_FUNCTION);
        train.execute();
        activationFunction = new ActivationFunction(SIGMOID_FUNCTION, 0.3, train.getWeights());
    }

    @Override
    public void learningAnExample(Example example, String expected) {
        System.out.println("Executa o aprendizado por Perceptron: ");
        activationFunction.getResulted(example);
        System.out.println("Expected: " + expected);
        System.out.println("_____");
    }
}
