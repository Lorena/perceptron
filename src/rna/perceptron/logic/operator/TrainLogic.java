package rna.perceptron.logic.operator;

import rna.Example;
import rna.Examples;
import rna.perceptron.Train;

public class TrainLogic extends Train {

    private static double THRESHOULD = 0.3;
    private static double LEARNING_RATE = 0.2;
    private static int EPOCH = 0;
    private double activationFunctionResult;

    public TrainLogic() {
       examples = new Examples();
//       examples.loadAndLogicOperator();
       examples.loadOrLogicOperator();
    }

    public void execute() {
        System.out.println("Inicia o treinamento");
        initializeWeightsRandom();

        do {
            examples.noExistError();
            adjustTheCorrectWeights();
            EPOCH++;
        } while (examples.hasError());

        showInformations();
    }

    private void adjustTheCorrectWeights() {
        for (Example example : this.examples.get()) {
            activationFunctionResult = activationFunction(example);
            if (!isActivationFunctionResultEqualsOutputExpected(example)) {
                loadNewValueOfWeight(example);
                examples.existError();
            }
        }
    }

    private boolean isActivationFunctionResultEqualsOutputExpected(Example example) {
        return activationFunctionResult == example.getOutput();
    }

    private void showInformations() {
        System.out.println("Numero de épocas necessárias: " + EPOCH);
        System.out.println("Pesos: " + weights[0] + " " + weights[1]);
        System.out.println("Finaliza o treinamento");
        System.out.println("############################################################################################");
    }

    private void loadNewValueOfWeight(Example exemple) {
        for (int i = 0; i < weights.length; i++) {
            weights[i] = newValueOfWeight(i, exemple);
        }
    }

    private double newValueOfWeight(int i, Example exemple) {
        return weights[i] + LEARNING_RATE * (exemple.getOutput() - activationFunctionResult) * exemple.getInputX(i);
    }

    private int activationFunction(Example example) {
        double u = sumOfProductByExample(example);
        if (u > THRESHOULD) {
            return 1;
        }
        return 0;
    }
}
