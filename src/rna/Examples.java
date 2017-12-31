package rna;

import java.util.List;

public class Examples {

    protected List<Example> examples;
    private boolean hasError;

    public List<Example> get() {
        return examples;
    }

    public boolean hasError(){
        return hasError;
    }

    public void existError() {
        hasError = true;
    }

    public void cleanError() {
        hasError = false;
    }

    public int inputLenght() {
        return examples.get(0).inputLenght();
    }

}
