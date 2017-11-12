package rna;

public class Example {

    private double[] input;
    private double output;

    public Example(double[] input, double output) {
            this.input = input;
            this.output = output;
    }

    public Example(double[] input) {
        this.input = input;
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
}
