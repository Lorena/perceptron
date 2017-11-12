package rna;

import java.util.ArrayList;
import java.util.List;

public class Examples {

    private List<Example> examples;
    private boolean hasError;

    public int getInputLenght() {
        return examples.get(0).getInputLenght();
    }

    public double[] getInput(int index) {
        return examples.get(index).getInput();
    }

    public int getLenght() {
        return examples.size();
    }

    public int getOutputExampleOfNumber(int i) {
        return (int) examples.get(i).getOutput();
    }

    public List<Example> get() {
        return examples;
    }

    public boolean hasError(){
        return hasError;
    }

    public void existError() {
        hasError = true;
    }

    public void noExistError() {
        hasError = false;
    }

    public void loadInfoFruit() {
        examples = new ArrayList<>();
        examples.add(new Example(new double[]{-1, 0.1, 0.4, 0.7}, 1.0));
        examples.add(new Example(new double[]{-1, 0.3, 0.7, 0.2}, -1.0));
        examples.add(new Example(new double[]{-1, 0.6, 0.9, 0.8}, -1.0));
        examples.add(new Example(new double[]{-1, 0.5, 0.7, 0.1}, 1.0));
    }

    public void loadAndLogicOperator() {
        examples = new ArrayList<>();
        examples.add(new Example(new double[]{0, 0}, 0));
        examples.add(new Example(new double[]{0, 1}, 0));
        examples.add(new Example(new double[]{1, 0}, 0));
        examples.add(new Example(new double[]{1, 1}, 1));
    }

    public void loadOrLogicOperator() {
        examples = new ArrayList<>();
        examples.add(new Example(new double[]{0, 0}, 0));
        examples.add(new Example(new double[]{0, 1}, 0));
        examples.add(new Example(new double[]{1, 0}, 0));
        examples.add(new Example(new double[]{1, 1}, 1));
    }
}
