import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class numberButton extends JButton implements ActionListener {

    private int number;     // holds the number

    // Getter + Setter methods
    public numberButton(int number) {
        super(String.valueOf(number));      // gets the string number as a value
        this.number = number;               // set the number
    }

    public int getNumber() {
        return number;
    }
}

public class operatorButton extends JButton {

    private String operator;    // holds the appropriate operator

    public operatorButton(String operator) {
        super(operator);
        this.operator = operator;
    }

    public String getOperator() {
        return operator;
    }

}

public class CalcGUI extends JFrame{
    
    public CalcGUI() {
        super ("Calculator App");

        /*
        * The layout is basic. 
        * Will just contain a variable for input values and depending on those values, it will be stored and "calculated"
        * based on what choices were made.
        */

        int totalNums = 10;

        JFrame frame = new JFrame("Calculator App");
        JPanel panel = new JPanel();

        // for the numbers, use a for loop from 0 to 9 to call the number and create those buttons accordingly
        for (int i = 0; i < totalNums; i++) {
            numberButton button = new numberButton(i);
            button.setText(String.valueOf(i));
            panel.add(button);
        }

        // creating the 4 buttons will do basic mathematics 
        
        operatorButton addButton = new operatorButton("+");
        addButton.addActionListener(this);
        operatorButton subtractButton = new operatorButton("-");
        subtractButton.addActionListener(this);
        operatorButton multiplyButton = new operatorButton("*");
        multiplyButton.addActionListener(this);
        operatorButton divideButton = new operatorButton("/");
        divideButton.addActionListener(this);

        // Add panels to frame
        this.add(panel);
        this.pack();

        // Set frame properties
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    
    }

    protected static double mathOperations (int a, int b, String operator) {

        double answer = 0;
    
        switch(operator) {
            case "+":
                answer = a + b;
                break;
            case "-":
                answer = a - b;
                break;
            case "*":
                answer = a * b;
                break;
            case "/":
                if (b == 0)
                    throw new ArithmeticException("Cannot divide by zero");
                answer = a / b;
                break;
        }
        return answer;
    
    }
}
