package rna.perceptron.logic.operator;

import java.util.ArrayList;

public class ExamplesOfLogicOperator extends rna.Examples {

    public ExamplesOfLogicOperator(String operator) {
        if("or".equals(operator)) {
            loadOrLogicOperatorForTrain();
        }
        if("and".equals(operator)) {
            loadAndLogicOperatorForTrain();
        }
    }

    private void loadAndLogicOperatorForTrain() {
        examples = new ArrayList<>();
        examples.add(new ExampleLogicOperator(new double[]{0, 0}, 0));
        examples.add(new ExampleLogicOperator(new double[]{0, 1}, 0));
        examples.add(new ExampleLogicOperator(new double[]{1, 0}, 0));
        examples.add(new ExampleLogicOperator(new double[]{1, 1}, 1));
    }

    private void loadOrLogicOperatorForTrain() {
        examples = new ArrayList<>();
        examples.add(new ExampleLogicOperator(new double[]{0, 0}, 0));
        examples.add(new ExampleLogicOperator(new double[]{0, 1}, 1));
        examples.add(new ExampleLogicOperator(new double[]{1, 0}, 1));
        examples.add(new ExampleLogicOperator(new double[]{1, 1}, 1));
    }

}
