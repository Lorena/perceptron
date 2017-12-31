package rna.perceptron.fruits;

import rna.Example;
import rna.Perceptron;
import rna.perceptron.ActivationFunction;

public class NeuronLearningCompositeChemicalOfFruit implements Perceptron{

    private final String SIGMOID_BIPOLAR_FUNCTION = "SIGMOID_BIPOLAR";
    private ActivationFunction activationFunction;
    private TrainFruit train;

    @Override
    public void trainingByExamples() {
        train = new TrainFruit();
    }

    @Override
    public void learningAnExample(Example example, String expected) {
        System.out.println("Executa o aprendizado por Perceptron: ");
        activationFunction = new ActivationFunction(SIGMOID_BIPOLAR_FUNCTION, 0.0);
        example.getOutputFruitLearned(activationFunction, train.getWeights());
        System.out.println("Expected: " + expected);
        System.out.println("____");
    }
}
