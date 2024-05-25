public class TrainingData {

    private int fruit_type;
    private int fruit_color;
    private int sweetness;
    private int learningRate;
    private int activationFunction;
    private int neurons;
    private int maxEpochs;
    private double goal;

    public TrainingData(int fruit_type, int fruit_color, int sweetness,
                        int learningRate, int activationFunction, int neurons,
                        int maxEpochs, double goal) {
        this.fruit_type = fruit_type;
        this.fruit_color = fruit_color;
        this.sweetness = sweetness;
        this.learningRate = learningRate;
        this.activationFunction = activationFunction;
        this.neurons = neurons;
        this.maxEpochs = maxEpochs;
        this.goal = goal;
    }

    public int getFruit_type() {
        return fruit_type;
    }

    public void setFruit_type(int fruit_type) {
        this.fruit_type = fruit_type;
    }

    public int getFruit_color() {
        return fruit_color;
    }

    public void setFruit_color(int fruit_color) {
        this.fruit_color = fruit_color;
    }

    public int getSweetness() {
        return sweetness;
    }

    public void setSweetness(int sweetness) {
        this.sweetness = sweetness;
    }

    public int getLearningRate() {
        return learningRate;
    }

    public void setLearningRate(int learningRate) {
        this.learningRate = learningRate;
    }

    public int getActivationFunction() {
        return activationFunction;
    }

    public void setActivationFunction(int activationFunction) {
        this.activationFunction = activationFunction;
    }

    public int getNeurons() {
        return neurons;
    }

    public void setNeurons(int neurons) {
        this.neurons = neurons;
    }

    public int getMaxEpochs() {
        return maxEpochs;
    }

    public void setMaxEpochs(int maxEpochs) {
        this.maxEpochs = maxEpochs;
    }

    public double getGoal() {
        return goal;
    }

    public void setGoal(double goal) {
        this.goal = goal;
    }

    @Override
    public String toString() {
        return "TrainingData{" +
                "fruit_type=" + fruit_type +
                ", fruit_color=" + fruit_color +
                ", sweetness=" + sweetness +
                ", learningRate=" + learningRate +
                ", activationFunction=" + activationFunction +
                ", neurons=" + neurons +
                ", maxEpochs=" + maxEpochs +
                ", goal=" + goal +
                '}';
    }
}











