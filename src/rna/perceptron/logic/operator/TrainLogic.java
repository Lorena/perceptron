package rna.perceptron.logic.operator;

import rna.Example;
import rna.Examples;

import java.util.Random;

public class TrainLogic {

    private static double THRESHOULD = 0.3;
    private static double LEARNING_RATE = 0.2;
    private static int EPOCH = 200;

    private Examples examples;
    double[] weights;

    public TrainLogic() {
       examples = new Examples();
       examples.loadAndLogicOperator();
//       examples.loadOrLogicOperator();
    }

    public void execute() {
        System.out.println("Inicia o treinamento");
        initializeWeightsRandom();

        int errorSum = 0;
        for(int i=0;i<EPOCH;i++) {
            for(int j = 0; j<examples.getLenght(); j++)  {
                int outputExpected = examples.getOutputExampleOfNumber(j);
                int outputResult = activationFunctionOfU(examples.get().get(j));
                int error = (outputExpected - outputResult);
                errorSum +=error;
                loadNewWeights(examples.getInput(j), error);
            }
            if(errorSum == 0)
                break;
        }
        System.out.println("Finaliza o treinamento");
    }

    private void loadNewWeights(double[] input, int error) {
        for(int i = 0;i<input.length;i++) {
            double delta = LEARNING_RATE * input[i] * error;
            weights[i] += delta;
        }
    }

    private void initializeWeightsRandom() {
        weights = new double[examples.getInputLenght()];
        Random random = new Random();
        for(int i=0;i<weights.length;i++) {
            weights[i] = random.nextDouble();
        }
    }

    private int getOutputResultByInput(double[] input) {
        double sum = 0.0;
        for(int i=0;i<input.length;i++) {
            sum += weights[i]*input[i];
        }

        if(sum> THRESHOULD)
            return 1;
        else
            return 0;
    }

    private int activationFunctionOfU(Example example) {
        double u = sumOfProductXKanWByExemplo(example);
        if (u > THRESHOULD) {
            return 1;
        }
        return 0;
    }

    private double sumOfProductXKanWByExemplo(Example example) {
        double sum = 0.0;
        for (int i = 0; i < example.getInputLenght(); i++) {
            sum += example.getInput()[i] * weights[i];
        }
        return sum;
    }

    public double[] getWeights() {
        return weights;
    }
}
