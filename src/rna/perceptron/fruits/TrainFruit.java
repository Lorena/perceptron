package rna.perceptron.fruits;

import rna.Examples;
import rna.perceptron.Train;

public class TrainFruit extends Train {
    public TrainFruit() {
        examples = new Examples();
        examples.loadInfoFruit();
    }
}
