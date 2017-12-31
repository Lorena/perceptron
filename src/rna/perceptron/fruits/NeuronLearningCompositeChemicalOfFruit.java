package rna.perceptron.fruits;

import rna.Example;
import rna.Perceptron;

public class NeuronLearningCompositeChemicalOfFruit implements Perceptron{

    private TrainFruit trainedNeuron;

    @Override
    public void trainingByExamples() {
        trainedNeuron = new TrainFruit();
    }

    @Override
    public void learningAnExample(Example example, String expected) {
        System.out.println("Executa o aprendizado por Perceptron: ");
        example.getOutputFruitLearned(trainedNeuron);
        System.out.println("Expected: " + expected);
        System.out.println("____");
    }
}
