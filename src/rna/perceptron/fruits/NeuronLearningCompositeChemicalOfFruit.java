package rna.perceptron.fruits;

import rna.Example;
import rna.Perceptron;
import rna.perceptron.ActivationFunction;

public class NeuronLearningCompositeChemicalOfFruit implements Perceptron{

    private final String SIGMOID_BIPOLAR_FUNCTION = "SIGMOID_BIPOLAR";

    private ActivationFunction activationFunction;

    @Override
    public void trainingByExamples() {
        TrainFruit train = new TrainFruit(0, 0.05, SIGMOID_BIPOLAR_FUNCTION);
        train.execute();
        activationFunction = new ActivationFunction(SIGMOID_BIPOLAR_FUNCTION, 0.0, train.getWeights());
    }

    @Override
    public void learningAnExample(Example example, String expected) {
        System.out.println("Executa o aprendizado por Perceptron: ");
        activationFunction.getResultedFruit(example);
        System.out.println("Expected: " + expected);
        System.out.println("____");
    }
}
