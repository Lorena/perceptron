import rna.perceptron.logic.operator.ExampleLogicOperator;
import rna.perceptron.logic.operator.NeuronLearningLogicOperator;

public class CallNeuronForLearningAndLogicOperator {

    public static void main (String [] args) {
        NeuronLearningLogicOperator neuroun = new NeuronLearningLogicOperator();
        neuroun.trainingByExamples();
        neuroun.learningAnExample(new ExampleLogicOperator(new double[]{0, 1}), "0");
        neuroun.learningAnExample(new ExampleLogicOperator(new double[]{0, 0}), "0");
        neuroun.learningAnExample(new ExampleLogicOperator(new double[]{1, 1}), "1");
        neuroun.learningAnExample(new ExampleLogicOperator(new double[]{1, 0}), "0");
     }
}
