package rna;

import java.util.List;

public class Examples {

    protected List<Example> examples;
    private boolean hasError;

    public int lenght() {
        return examples.get(0).getInputLenght();
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

    public void cleanError() {
        hasError = false;
    }

}
