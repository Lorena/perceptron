package rna;

public class Example {

    private double[] input;
    protected Output output;

    public Example(double[] input, double output) {
        this.input = input;
        this.output = new Output(output);
    }

    public Example(double[] input) {
        this.input = input;
        this.output = new Output();
    }

    public double[] inputs() {
        return input;
    }

    public double input(int indexInput) {
        return input[indexInput];
    }

    public int inputLenght() {
        return input.length;
    }

    public Output output() {
        return output;
    }

}
