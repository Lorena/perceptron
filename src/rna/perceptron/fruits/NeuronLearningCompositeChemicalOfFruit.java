package rna.perceptron.fruits;

import rna.Perceptron;

public class NeuronLearningCompositeChemicalOfFruit implements Perceptron{

    private TrainFruit trainedNeuron;

    @Override
    public void trainingByExamples() {
        trainedNeuron = new TrainFruit();
    }

    public void learningAnExample(ExampleFruit example, String expected) {
        System.out.println("Executa o aprendizado por Perceptron: ");
        example.getOutputLearned(trainedNeuron);
        System.out.println("Expected: " + expected);
        System.out.println("____");
    }
}
