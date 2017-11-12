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
       examples.loadAndLogicOperator();
//       examples.loadOrLogicOperator();
    }

    public void execute() {
        System.out.println("Inicia o treinamento");
        initializeWeightsRandom();

        while(EPOCH<200) {
            for(Example example : examples.get())  {
                activationFunctionResult = activationFunction(example);
                loadNewValueOfWeight(example);
            }
            EPOCH++;
        }
        showInformations();
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
