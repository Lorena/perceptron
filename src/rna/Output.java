package rna;

public class Output {

    private double output;

    public Output(double output) {
        this.output = output;
    }

    public Output() {
    }

    public boolean isEqualsOutput(double result) {
        return result == output;
    }

    public void getLearned(double sum, String problem) {
        if ("Fruit".equals(problem)) {
            getOutputFruitLearned(sum);
        } else  {
            getOutputLogicLearned(sum);
        }
    }

    private void getOutputFruitLearned(double sum) {
        if (sum == 1) {
            System.out.println("Resulted: " + "Tangerina");
        } else {
            System.out.println("Resulted: " + "Laranja");
        }
    }

    private void getOutputLogicLearned(double sum) {
        if (sum == 1) {
            System.out.println("Resulted: " + "1");
        } else {
            System.out.println("Resulted: " + "0");
        }
    }

    public double get() {
        return output;
    }
}
