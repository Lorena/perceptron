package rna;

public class Example {

    private double[] input;
    private double output;
    private boolean aprendeu;

    public Example(double[] input, double output, boolean treinado) {
            this.input = input;
            this.output = output;
            this.aprendeu = treinado;
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

    public void learned() {
        aprendeu = true;
    }

    public boolean isLearned() {
        return aprendeu;
    }
}
