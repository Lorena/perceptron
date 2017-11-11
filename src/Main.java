import rna.Example;
import rna.Perceptron;
import rna.perceptron.fruits.PerceptronFruit;

public class Main {
    public static void main (String [] args) {
        Perceptron perceptron = new PerceptronFruit();
//        perceptron.learningByPerceptron(new double[]{1, 1});
//
        System.out.println("Executa o aprendizado por Perceptron: ");
        perceptron.learningByPerceptron(new Example(new double[]{-1, 0.1, 0.4, 0.7}));
        perceptron.learningByPerceptron(new Example(new double[]{-1, 0.5, 0.7, 0.1}));
        perceptron.learningByPerceptron(new Example(new double[]{-1, 0.6, 0.9, 0.8}));
        perceptron.learningByPerceptron(new Example(new double[]{-1, 0.3, 0.7, 0.2}));
    }
}
