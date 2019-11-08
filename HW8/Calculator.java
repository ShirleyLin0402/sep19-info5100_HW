import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

enum Operator {
    ADD,
    SUBTRACT,
    MULTIPLY,
    DIVIDE
}

@SuppressWarnings("serial")
public class Calculator extends JFrame {
    private JButton nums[];
    private JButton add, subtract, multiply, divide, calculate, clear;
    private JTextField resultTextField;
    private Operator o;
    private int first;
    private int second;
    private String stringNum1 = "";
    private String stringNum2 = "";
    private Font font;
    private boolean isSecond = false;

    public Calculator() {
        createComponents();
        setLayout();
        addComponent();
        addBehaviorToComponent();
        display();
    }

    private void createComponents() {
        font = new Font("TimesRoman", Font.PLAIN, 36);

        nums = new JButton[10];
        for (int i = 0; i <= 9; i++) {
            nums[i] = new JButton(String.valueOf(i));
            nums[i].setFont(font);
        }

        add = new JButton("+");
        add.setFont(font);
        subtract = new JButton("-");
        subtract.setFont(font);
        multiply = new JButton("¡Á");
        multiply.setFont(font);
        divide = new JButton("¡Â");
        divide.setFont(font);

        calculate = new JButton("=");
        calculate.setFont(font);

        resultTextField = new JTextField(8);
        resultTextField.setSize(300,30);
        resultTextField.setFont(font);

        clear = new JButton("C");
        clear.setFont(font);
    }

    private void setLayout() {
        GridLayout gl = new GridLayout(4, 1);
        Container c = this.getContentPane();
        c.setLayout(gl);
    }

    private void addComponent() {
        Container c = getContentPane();

        //first row
        JPanel p = new JPanel();
        for (int i = 0; i < 5; i++) {
            p.add(nums[i]);
        }
        c.add(p);

        //second row
        p = new JPanel();
        for (int i = 5; i < 10; i++) {
            p.add(nums[i]);
        }
        c.add(p);

        //third row
        p = new JPanel();
        p.add(add);
        p.add(subtract);
        p.add(divide);
        p.add(multiply);
        p.add(calculate);
        c.add(p);

        //forth row
        p = new JPanel();
        p.add(resultTextField);
        p.add(clear);
        c.add(p);
    }

    class NumberListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (!isSecond) {
                stringNum1 += ((JButton) e.getSource()).getText();
                first = Integer.parseInt(stringNum1);
            } else {
                stringNum2 += ((JButton) e.getSource()).getText();
                second = Integer.parseInt(stringNum2);
            }
        }
    }

    class OperatorListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            isSecond = true;
            if (e.getSource() == add) {
                o = Operator.ADD;
            }
            if (e.getSource() == subtract) {
                o = Operator.SUBTRACT;
            }
            if (e.getSource() == multiply) {
                o = Operator.MULTIPLY;
            }
            if (e.getSource() == divide) {
                o = Operator.DIVIDE;
            }
            if (e.getSource() == clear) {
                resultTextField.setText("");
                isSecond = false;
                stringNum1="";
                stringNum2="";
            }
        }
    }

    class CalculateListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            int result;
            if (o == Operator.ADD) {
                result = first + second;
                resultTextField.setText(first + " + " + second + " = " + result);
            }
            if (o == Operator.SUBTRACT) {
                result = first - second;
                resultTextField.setText(first + " - " + second + " = " + result);
            }
            if (o == Operator.MULTIPLY) {
                result = first * second;
                resultTextField.setText(first + " ¡Á " + second + " = " + result);
            }
            if (o == Operator.DIVIDE) {
                result = first / second;
                resultTextField.setText(first + " ¡Â " + second + " = " + result);
            }
        }
    }


    private void addBehaviorToComponent() {
        NumberListener nl = new NumberListener();
        for (int i = 0; i < 10; i++) {
            nums[i].addActionListener(nl);
        }

        OperatorListener ol = new OperatorListener();
        add.addActionListener(ol);
        subtract.addActionListener(ol);
        multiply.addActionListener(ol);
        divide.addActionListener(ol);
        clear.addActionListener(ol);

        CalculateListener cl = new CalculateListener();
        calculate.addActionListener(cl);

    }

    private void display() {
        setSize(600, 600);
        setVisible(true);
    }

    public static void main(String args[]) {
        @SuppressWarnings("unused")
		Calculator c = new Calculator();
    }
}
