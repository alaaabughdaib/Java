import java.util.ArrayList;
import java.util.Arrays;
import static java.util.Arrays.toString;
import java.util.List;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;


public class Main extends javax.swing.JFrame {

   List<double[]> inputList = new ArrayList<>();
   int color_test=0;
   int sweetness_test = 0;
   double[] test_element = new double[2];
  
   int[] target = new int [3]; // 0 apple  1 orange  2 bananah
   int function=1; // sigmoid
   
    private int inputSize=2;
    private int hiddenSize=0;
    private int outputSize=3;
    private double[][] weightsInputHidden;
    private double[][] weightsHiddenOutput;
    private double[] hiddenLayer;
    private double[] outputLayer;
    private double learningRate=0.0;
    int iterations=0;
    double goal=0.0;
    double[][] input;
    private double sigmoid(double x) {
        return 1 / (1 + Math.exp(-x));
    }
   
    public static double tanh(double x) {
        // tanh(x) = (2 / (1 + e^(-2x))) - 1
        double expNeg2x = Math.exp(-2 * x);
        return (2 / (1 + expNeg2x)) - 1;
    }
   
     public static double relu(double x) {
        // ReLU(x) = max(0, x)
        return Math.max(0, x);
    }
     public static double linear(double x) {
        // f(x) = x
        return x;
    }
   
       private void initializeWeights() {
            test_element[0]=0.0;
            test_element[1]=0.0;
            Random random = new Random();
            weightsInputHidden = new double[inputSize][hiddenSize];
            weightsHiddenOutput = new double[hiddenSize][outputSize];
        for (int i = 0; i < inputSize; i++) {
            for (int j = 0; j < hiddenSize; j++) {
                weightsInputHidden[i][j] = random.nextDouble();
            }
        }

        for (int i = 0; i < hiddenSize; i++) {
            for (int j = 0; j < outputSize; j++) {
                weightsHiddenOutput[i][j] = random.nextDouble();
            }
        }
    }

   

    public void train(double[][] input, int[] target, int maxEpochs, double goal) {
        for (int epoch = 0; epoch < maxEpochs; epoch++) {
            
            double totalError = 0.0;

            for (int i = 0; i < input.length; i++) {
                hiddenLayer = calculateLayer(input[i], weightsInputHidden);
                outputLayer = calculateLayer(hiddenLayer, weightsHiddenOutput);

              
                double[] outputError = new double[outputSize];
                for (int j = 0; j < outputSize; j++) {
                    outputError[j] = target[i] == j ? 1 - outputLayer[j] : 0 - outputLayer[j];
                    totalError += Math.abs(outputError[j]);
                }

              
                for (int j = 0; j < hiddenSize; j++) {
                    for (int k = 0; k < outputSize; k++) {
                        weightsHiddenOutput[j][k] += learningRate * outputError[k] * hiddenLayer[j];
                    }
                }

 
                for (int j = 0; j < inputSize; j++) {
                    for (int k = 0; k < hiddenSize; k++) {
                        double hiddenError = 0.0;
                        for (int l = 0; l < outputSize; l++) {
                            hiddenError += outputError[l] * weightsHiddenOutput[k][l];
                        }
                        weightsInputHidden[j][k] += learningRate * hiddenError * input[i][j];
                    }
                }
            }

            if (totalError < goal) {
                JOptionPane.showMessageDialog(null, "Training converged at epoch " + epoch);
                break;
            }
             error.setText(" Error = " +totalError);
        }
       
    }
     
    public int predict(double[] input) {
        hiddenLayer = calculateLayer(input, weightsInputHidden);
        outputLayer = calculateLayer(hiddenLayer, weightsHiddenOutput);

        int predictedClass = -1;
        double maxOutput = Double.MIN_VALUE;

        for (int i = 0; i < outputSize; i++) {
            if (outputLayer[i] > maxOutput) {
                maxOutput = outputLayer[i];
                predictedClass = i;
            }
        }

        return predictedClass;
    }

    private double[] calculateLayer(double[] input, double[][] weights) {
        double[] output = new double[weights[0].length];

        for (int i = 0; i < weights[0].length; i++) {
            double sum = 0.0;
            for (int j = 0; j < weights.length; j++) {
                sum += input[j] * weights[j][i];
            }
            if(function==1)
            output[i] = sigmoid(sum);
            
            else if(function==2)
                output[i] = tanh(sum);
            else if (function==3)
                output[i] = relu(sum);
             else if (function==4)
                output[i] = linear(sum);
        }

        return output;
        
    }

   
    public Main() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        selectedActivationFunctionLabel1 = new javax.swing.JLabel();
        learningRateSlider = new javax.swing.JSlider();
        SweetnessjLabel1 = new javax.swing.JLabel();
        SweetnessjSlider = new javax.swing.JSlider();
        jLabel6 = new javax.swing.JLabel();
        goal_txt = new javax.swing.JTextField();
        train_btn = new javax.swing.JButton();
        activation = new javax.swing.JComboBox<>();
        testbutton = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        addfruit = new javax.swing.JButton();
        LR4 = new javax.swing.JLabel();
        LR5 = new javax.swing.JLabel();
        iterations_txt = new javax.swing.JTextField();
        colorlabel4 = new javax.swing.JLabel();
        fruit_color_options = new javax.swing.JComboBox<>();
        neurons_txt = new javax.swing.JTextField();
        error = new javax.swing.JLabel();
        sweetlabel = new javax.swing.JLabel();
        lrlabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(102, 0, 51));
        jPanel2.setLayout(null);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 204, 255));
        jLabel5.setText("Fruit Recognition");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(130, 30, 400, 64);

        selectedActivationFunctionLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        selectedActivationFunctionLabel1.setForeground(new java.awt.Color(255, 255, 255));
        selectedActivationFunctionLabel1.setText("Activation Function :");
        jPanel2.add(selectedActivationFunctionLabel1);
        selectedActivationFunctionLabel1.setBounds(70, 410, 200, 25);

        learningRateSlider.setBackground(new java.awt.Color(255, 153, 255));
        learningRateSlider.setMaximum(10);
        learningRateSlider.setMinimum(1);
        learningRateSlider.setValue(1);
        learningRateSlider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                learningRateSliderStateChanged(evt);
            }
        });
        jPanel2.add(learningRateSlider);
        learningRateSlider.setBounds(300, 380, 300, 20);

        SweetnessjLabel1.setBackground(new java.awt.Color(255, 153, 153));
        SweetnessjLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        SweetnessjLabel1.setForeground(new java.awt.Color(255, 255, 255));
        SweetnessjLabel1.setText("Sweetness := ");
        jPanel2.add(SweetnessjLabel1);
        SweetnessjLabel1.setBounds(70, 180, 120, 25);

        SweetnessjSlider.setBackground(new java.awt.Color(255, 153, 255));
        SweetnessjSlider.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        SweetnessjSlider.setMaximum(10);
        SweetnessjSlider.setMinimum(1);
        SweetnessjSlider.setValue(1);
        SweetnessjSlider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                SweetnessjSliderStateChanged(evt);
            }
        });
        jPanel2.add(SweetnessjSlider);
        SweetnessjSlider.setBounds(300, 190, 300, 20);

        jLabel6.setBackground(new java.awt.Color(255, 204, 204));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Max #iterations : =");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(70, 480, 180, 25);

        goal_txt.setBackground(new java.awt.Color(255, 204, 204));
        goal_txt.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        goal_txt.setForeground(new java.awt.Color(102, 102, 255));
        goal_txt.setToolTipText("");
        goal_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goal_txtActionPerformed(evt);
            }
        });
        jPanel2.add(goal_txt);
        goal_txt.setBounds(300, 510, 64, 26);

        train_btn.setBackground(new java.awt.Color(255, 204, 255));
        train_btn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        train_btn.setForeground(new java.awt.Color(102, 0, 51));
        train_btn.setText("Train");
        train_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                train_btnActionPerformed(evt);
            }
        });
        jPanel2.add(train_btn);
        train_btn.setBounds(300, 560, 150, 27);

        activation.setBackground(new java.awt.Color(255, 204, 255));
        activation.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        activation.setForeground(new java.awt.Color(255, 255, 255));
        activation.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sigmoid", "Tanh", "Relu" ,"Linear"}));
        jPanel2.add(activation);
        activation.setBounds(300, 410, 300, 26);

        testbutton.setBackground(new java.awt.Color(255, 204, 255));
        testbutton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        testbutton.setForeground(new java.awt.Color(102, 0, 51));
        testbutton.setText("Test");
        testbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                testbuttonActionPerformed(evt);
            }
        });
        jPanel2.add(testbutton);
        testbutton.setBounds(430, 220, 130, 27);

        jLabel7.setBackground(new java.awt.Color(255, 204, 204));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("#Neurons In Hidden Layer : =");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(70, 450, 230, 22);

        addfruit.setBackground(new java.awt.Color(255, 204, 255));
        addfruit.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        addfruit.setForeground(new java.awt.Color(102, 0, 51));
        addfruit.setText("ADD FRUIT");
        addfruit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addfruitActionPerformed(evt);
            }
        });
        jPanel2.add(addfruit);
        addfruit.setBounds(250, 220, 150, 27);

        LR4.setBackground(new java.awt.Color(255, 102, 102));
        LR4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        LR4.setForeground(new java.awt.Color(255, 255, 255));
        LR4.setText("Goal = ");
        jPanel2.add(LR4);
        LR4.setBounds(70, 510, 70, 25);

        LR5.setBackground(new java.awt.Color(255, 102, 102));
        LR5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        LR5.setForeground(new java.awt.Color(255, 255, 255));
        LR5.setText("Learing Rate : = ");
        jPanel2.add(LR5);
        LR5.setBounds(70, 380, 170, 25);

        iterations_txt.setBackground(new java.awt.Color(255, 204, 204));
        iterations_txt.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        iterations_txt.setForeground(new java.awt.Color(102, 102, 255));
        iterations_txt.setToolTipText("");
        iterations_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iterations_txtActionPerformed(evt);
            }
        });
        jPanel2.add(iterations_txt);
        iterations_txt.setBounds(300, 480, 64, 26);

        colorlabel4.setBackground(new java.awt.Color(255, 204, 204));
        colorlabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        colorlabel4.setForeground(new java.awt.Color(255, 255, 255));
        colorlabel4.setText("Fruit Color: ");
        jPanel2.add(colorlabel4);
        colorlabel4.setBounds(70, 130, 120, 25);

        fruit_color_options.setBackground(new java.awt.Color(255, 204, 255));
        fruit_color_options.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        fruit_color_options.setForeground(new java.awt.Color(255, 255, 255));
        fruit_color_options.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Red", "Orange", "Yellow" }));
        jPanel2.add(fruit_color_options);
        fruit_color_options.setBounds(300, 130, 300, 26);

        neurons_txt.setBackground(new java.awt.Color(255, 204, 204));
        neurons_txt.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        neurons_txt.setForeground(new java.awt.Color(102, 102, 255));
        neurons_txt.setToolTipText("");
        neurons_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                neurons_txtActionPerformed(evt);
            }
        });
        jPanel2.add(neurons_txt);
        neurons_txt.setBounds(300, 450, 64, 26);

        error.setBackground(new java.awt.Color(255, 204, 255));
        error.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        error.setForeground(new java.awt.Color(255, 255, 255));
        error.setText(" Error = ");
        error.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel2.add(error);
        error.setBounds(50, 290, 550, 40);

        sweetlabel.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        sweetlabel.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(sweetlabel);
        sweetlabel.setBounds(200, 180, 60, 30);

        lrlabel.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        lrlabel.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(lrlabel);
        lrlabel.setBounds(230, 380, 60, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 674, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 680, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void goal_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goal_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_goal_txtActionPerformed

    private void train_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_train_btnActionPerformed
 hiddenSize=Integer.parseInt(neurons_txt.getText());
       iterations=Integer.parseInt(iterations_txt.getText());
       goal= Double.parseDouble(goal_txt.getText());
           learningRate=learningRateSlider.getValue();
           
            if (activation.getSelectedItem()=="Sigmoid")
                function=1;
            else if (activation.getSelectedItem()=="Tanh")
                function=2;
            else if (activation.getSelectedItem()=="Relu")
                function=3;
            else if (activation.getSelectedItem()=="Linear")
                function=4;
            
           
           
        
         target[0] = 0;
         target[1] = 1;
         target[2] = 2;
         initializeWeights();
        train(input, target, iterations, goal);
    }//GEN-LAST:event_train_btnActionPerformed

    private void testbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_testbuttonActionPerformed
    //fruit_color_options
        if (fruit_color_options.getSelectedItem()=="Apple")
             color_test=0;  
        else if (fruit_color_options.getSelectedItem()=="Orange")
             color_test=1;  
        else if (fruit_color_options.getSelectedItem()=="Bananah")
             color_test=2;  
        sweetness_test= SweetnessjSlider.getValue();
        //sweetness_test= Integer.parseInt(sweetness_to_test.getText());
        
        test_element[0] = color_test;
        test_element[1] = sweetness_test;
        
         String path=null;
         int predictedClass = predict(test_element);
         
         if (predictedClass==0) {
             
             path="F:\\yousef{{}}}\\Artificial Intellegence\\Fruit Recognition\\Fruit_Recognition_proj\\src\\main\\java\\apple.jpg";
         }
         
          else if (predictedClass==1){
             path="F:\\yousef{{}}}\\Artificial Intellegence\\Fruit Recognition\\Fruit_Recognition_proj\\src\\main\\java\\orange.jpg";

         }
                  else if (predictedClass==2){
                       path="F:\\yousef{{}}}\\Artificial Intellegence\\Fruit Recognition\\Fruit_Recognition_proj\\src\\main\\java\\bananah.jpg";
 
                  } 
        
        
        JFrame frame = new JFrame(" Predicted Fruit ");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ImageIcon icon = new ImageIcon(path);
        JLabel label = new JLabel(icon);
        frame.getContentPane().add(label);
        frame.setSize(600, 600); 
        frame.setVisible(true);
        
         
        
    }//GEN-LAST:event_testbuttonActionPerformed

    private void iterations_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iterations_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_iterations_txtActionPerformed

    private void neurons_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_neurons_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_neurons_txtActionPerformed

    private void addfruitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addfruitActionPerformed
        double sweetness = SweetnessjSlider.getValue();
        
        int fruit_color=0;
        if (fruit_color_options.getSelectedItem()=="Apple")
             fruit_color=0;
        else if (fruit_color_options.getSelectedItem()=="Orange")
             fruit_color=1;
         if (fruit_color_options.getSelectedItem()=="Bananah")
             fruit_color=2;
         
        double[] newElement = {fruit_color, sweetness}; // Sample data
        inputList.add(newElement);
        input = new double[inputList.size()][];
        inputList.toArray(input);
       
        StringBuilder output = new StringBuilder();
for (int i = 0; i < input.length; i++) {
    for (int j = 0; j < input[i].length; j++) {
        output.append(input[i][j]);
        if (j < input[i].length - 1) {
            output.append(", ");
        }
    }
    if (i < input.length - 1) {
        output.append("\n");
    }
}
JOptionPane.showMessageDialog(null,"Added:"+output.toString());
        
        
    }//GEN-LAST:event_addfruitActionPerformed

    private void SweetnessjSliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_SweetnessjSliderStateChanged
     int sweetnessValue = SweetnessjSlider.getValue();
                    sweetlabel.setText("" + sweetnessValue);        // TODO add your handling code here:
    }//GEN-LAST:event_SweetnessjSliderStateChanged

    private void learningRateSliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_learningRateSliderStateChanged
     int lr = learningRateSlider.getValue();
                    lrlabel.setText("" + lr);        // TODO add your handling code here:
    }//GEN-LAST:event_learningRateSliderStateChanged

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
       
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LR4;
    private javax.swing.JLabel LR5;
    private javax.swing.JLabel SweetnessjLabel1;
    private javax.swing.JSlider SweetnessjSlider;
    private javax.swing.JComboBox<String> activation;
    private javax.swing.JButton addfruit;
    private javax.swing.JLabel colorlabel4;
    private javax.swing.JLabel error;
    private javax.swing.JComboBox<String> fruit_color_options;
    private javax.swing.JTextField goal_txt;
    private javax.swing.JTextField iterations_txt;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSlider learningRateSlider;
    private javax.swing.JLabel lrlabel;
    private javax.swing.JTextField neurons_txt;
    private javax.swing.JLabel selectedActivationFunctionLabel1;
    private javax.swing.JLabel sweetlabel;
    private javax.swing.JButton testbutton;
    private javax.swing.JButton train_btn;
    // End of variables declaration//GEN-END:variables
}
