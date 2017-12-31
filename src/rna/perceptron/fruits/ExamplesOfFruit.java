package rna.perceptron.fruits;

import java.util.ArrayList;

public class ExamplesOfFruit extends rna.Examples {

    public ExamplesOfFruit() {
        loadInfoFruitForTrain();
    }

    public void loadInfoFruitForTrain() {
        examples = new ArrayList<>();
        examples.add(new ExampleFruit(new double[]{-1, 0.1, 0.4, 0.7}, 1.0, "Tangerina"));
        examples.add(new ExampleFruit(new double[]{-1, 0.3, 0.7, 0.2}, -1.0, "Laranja"));
        examples.add(new ExampleFruit(new double[]{-1, 0.6, 0.9, 0.8}, -1.0, "Laranja"));
        examples.add(new ExampleFruit(new double[]{-1, 0.5, 0.7, 0.1}, 1.0, "Tangerina"));
    }
}
