import rna.perceptron.fruits.ExampleFruit;
import rna.perceptron.fruits.NeuronLearningCompositeChemicalOfFruit;

public class CallNeuronForLearningFruitChemistral {

    public static void main (String [] args) {
        NeuronLearningCompositeChemicalOfFruit neuroun = new NeuronLearningCompositeChemicalOfFruit();
        neuroun.trainingByExamples();
        neuroun.learningAnExample(new ExampleFruit(new double[]{-1, 0.1, 0.4, 0.7}), "Tangerina");  //Tangerina
        neuroun.learningAnExample(new ExampleFruit(new double[]{-1, 0.5, 0.7, 0.1}), "Tangerina");  //Tangerina
        neuroun.learningAnExample(new ExampleFruit(new double[]{-1, 0.6, 0.9, 0.8}), "Laranja");  //Laranja
        neuroun.learningAnExample(new ExampleFruit(new double[]{-1, 0.3, 0.7, 0.2}), "Laranja");  //Laranja
        neuroun.learningAnExample(new ExampleFruit(new double[]{-1, 0.4, 0.4, 0.1}), "Tangerina");  //Tangerina
        neuroun.learningAnExample(new ExampleFruit(new double[]{-1, 0.2, 0.3, 0.2}), "Tangerina");  //Tangerina
        neuroun.learningAnExample(new ExampleFruit(new double[]{-1, 0.15, 0.8, 0.1}), "Laranja"); //Laranja
    }
}
