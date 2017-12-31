package rna.perceptron.logic.operator;

import rna.Example;
import rna.Perceptron;

public class NeuronLearningLogicOperator implements Perceptron {

    private TrainLogic trainedNeuron;

    @Override
    public void trainingByExamples() {
        trainedNeuron = new TrainLogic();
    }

    @Override
    public void learningAnExample(Example example, String expected) {
        System.out.println("Executa o aprendizado por Perceptron: ");
        example.getOutputLogicLearned(trainedNeuron);
        System.out.println("Expected: " + expected);
        System.out.println("_____");
    }
}
