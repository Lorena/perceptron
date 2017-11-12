import rna.Example;
import rna.Perceptron;
import rna.perceptron.fruits.PerceptronFruit;
import rna.perceptron.logic.operator.PerceptronLogic;

public class Main {
    public static void main (String [] args) {

        Perceptron pl = new PerceptronLogic();
        System.out.println("Executa o aprendizado por Perceptron: ");
        pl.learningByPerceptron(new Example(new double[]{0, 1}));
        pl.learningByPerceptron(new Example(new double[]{0, 0}));
        pl.learningByPerceptron(new Example(new double[]{1, 1}));
        pl.learningByPerceptron(new Example(new double[]{1, 0}));
        System.out.println("____________________________________________________________________________________________");
        Perceptron pf = new PerceptronFruit();
        System.out.println("Executa o aprendizado por Perceptron: ");
        pf.learningByPerceptron(new Example(new double[]{-1, 0.1, 0.4, 0.7}));
        pf.learningByPerceptron(new Example(new double[]{-1, 0.5, 0.7, 0.1}));
        pf.learningByPerceptron(new Example(new double[]{-1, 0.6, 0.9, 0.8}));
        pf.learningByPerceptron(new Example(new double[]{-1, 0.3, 0.7, 0.2}));
    }
}
