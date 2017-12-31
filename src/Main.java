import rna.Example;
import rna.perceptron.fruits.NeuronLearningCompositeChemicalOfFruit;
import rna.perceptron.logic.operator.NeuronLearningLogicOperator;

public class Main {
    public static void main (String [] args) {

        NeuronLearningLogicOperator neuroun1 = new NeuronLearningLogicOperator();
        neuroun1.trainingByExamples();
        neuroun1.learningAnExample(new Example(new double[]{0, 1}), "1");
        neuroun1.learningAnExample(new Example(new double[]{0, 0}), "0");
        neuroun1.learningAnExample(new Example(new double[]{1, 1}), "1");
        neuroun1.learningAnExample(new Example(new double[]{1, 0}), "1");

        NeuronLearningCompositeChemicalOfFruit neuroun2 = new NeuronLearningCompositeChemicalOfFruit();
        neuroun2.trainingByExamples();
        neuroun2.learningAnExample(new Example(new double[]{-1, 0.1, 0.4, 0.7}), "Tangerina");  //Tangerina
        neuroun2.learningAnExample(new Example(new double[]{-1, 0.5, 0.7, 0.1}), "Tangerina");  //Tangerina
        neuroun2.learningAnExample(new Example(new double[]{-1, 0.6, 0.9, 0.8}), "Laranja");  //Laranja
        neuroun2.learningAnExample(new Example(new double[]{-1, 0.3, 0.7, 0.2}), "Laranja");  //Laranja
        neuroun2.learningAnExample(new Example(new double[]{-1, 0.4, 0.4, 0.1}), "Tangerina");  //Tangerina
        neuroun2.learningAnExample(new Example(new double[]{-1, 0.2, 0.3, 0.2}), "Tangerina");  //Tangerina
        neuroun2.learningAnExample(new Example(new double[]{-1, 0.15, 0.8, 0.1}), "Laranja"); //Laranja
    }
}
