package rna;

public class Example {

    private double[] input;
    protected Output outputObject;

    public Example(double[] input, double output) {
        this.input = input;
        this.outputObject = new Output(output);
    }

    public Example(double[] input) {
        this.input = input;
        this.outputObject = new Output();
    }

    public int getInputLenght() {
        return input.length;
    }

    public double[] getInput() {
        return input;
    }

    public double getInput(int indexInput) {
        return input[indexInput];
    }

    public Output getOutput() {
        return outputObject;
    }

}
