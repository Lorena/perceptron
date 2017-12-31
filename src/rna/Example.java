package rna;

public class Example {

    private String classType;
    private double[] input;
    private double output;

    public Example(double[] input, double output) {
            this.input = input;
            this.output = output;
    }

    public Example(double[] input) {
        this.input = input;
    }

    public Example(double[] input, double output, String classType) {
        this.input = input;
        this.output = output;
        this.classType = classType;
    }

    public int getInputLenght() {
        return input.length;
    }

    public double[] getInput() {
        return input;
    }

    public double getOutput() {
        return output;
    }

    public double getInputX(int indexInput) {
        return input[indexInput];
    }

    public boolean isEqualsOutput(double result) {
        return result == output;
    }
}
