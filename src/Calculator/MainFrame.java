package Calculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame
{
    private boolean InputOneEmpty;
    private boolean InputOneState;
    private boolean InputTwoState;
    private boolean OperatorChosen;
    private JTextField inputText1;
    private JTextField operandText;
    private JTextField inputText2;
    private JTextField outputText;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JButton button6;
    private JButton button7;
    private JButton button8;
    private JButton button9;
    private JButton button0;
    private JButton btnclr;
    private JButton btneql;
    private JButton buttonMultiply;
    private JButton buttonDivide;
    private JButton buttonAdd;
    private JButton buttonSubtract;
    private JButton buttonBack;
    private JButton buttonSqr;
    private JButton buttonSqrRt;
    private JButton buttonInverse;

    public MainFrame()
    {
        super("Hello World");

        setLayout(new GridBagLayout());

        InputOneEmpty = true;
        InputOneState = true;
        InputTwoState = false;

        GridBagConstraints GridConstraints = new GridBagConstraints();

        inputText1 = new JTextField(20);
        inputText1.setText("");
        inputText2 = new JTextField(20);
        inputText2.setText("");
        operandText = new JTextField(2);
        operandText.setText("");
        outputText = new JTextField(20);
        outputText.setText("");

        button1 = new JButton("1");

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(InputOneEmpty)
                {
                    InputOneEmpty = false;
                }

                if(InputOneState) {
                    var text = inputText1.getText();
                    text += "1";
                    inputText1.setText(text);
                } else if(InputTwoState)
                {
                    var text = inputText2.getText();
                    text += "1";
                    inputText2.setText(text);
                }
            }
        });

        button2 = new JButton("2");

        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(InputOneEmpty)
                {
                    InputOneEmpty = false;
                }

                if(InputOneState) {
                    var text = inputText1.getText();
                    text += "2";
                    inputText1.setText(text);
                } else if(InputTwoState)
                {
                    var text = inputText2.getText();
                    text += "2";
                    inputText2.setText(text);
                }
            }
        });

        button3 = new JButton("3");

        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(InputOneEmpty)
                {
                    InputOneEmpty = false;
                }

                if(InputOneState) {
                    var text = inputText1.getText();
                    text += "3";
                    inputText1.setText(text);
                } else if(InputTwoState)
                {
                    var text = inputText2.getText();
                    text += "3";
                    inputText2.setText(text);
                }
            }
        });

        button4 = new JButton("4");

        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(InputOneEmpty)
                {
                    InputOneEmpty = false;
                }

                if(InputOneState) {
                    var text = inputText1.getText();
                    text += "4";
                    inputText1.setText(text);
                } else if(InputTwoState)
                {
                    var text = inputText2.getText();
                    text += "4";
                    inputText2.setText(text);
                }
            }
        });

        button5 = new JButton("5");

        button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(InputOneEmpty)
                {
                    InputOneEmpty = false;
                }

                if(InputOneState) {
                    var text = inputText1.getText();
                    text += "5";
                    inputText1.setText(text);
                } else if(InputTwoState)
                {
                    var text = inputText2.getText();
                    text += "5";
                    inputText2.setText(text);
                }
            }
        });

        button6 = new JButton("6");

        button6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(InputOneEmpty)
                {
                    InputOneEmpty = false;
                }

                if(InputOneState) {
                    var text = inputText1.getText();
                    text += "6";
                    inputText1.setText(text);
                } else if(InputTwoState)
                {
                    var text = inputText2.getText();
                    text += "6";
                    inputText2.setText(text);
                }
            }
        });

        button7 = new JButton("7");

        button7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(InputOneEmpty)
                {
                    InputOneEmpty = false;
                }

                if(InputOneState) {
                    var text = inputText1.getText();
                    text += "7";
                    inputText1.setText(text);
                } else if(InputTwoState)
                {
                    var text = inputText2.getText();
                    text += "7";
                    inputText2.setText(text);
                }
            }
        });

        button8 = new JButton("8");

        button8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(InputOneEmpty)
                {
                    InputOneEmpty = false;
                }

                if(InputOneState) {
                    var text = inputText1.getText();
                    text += "8";
                    inputText1.setText(text);
                } else if(InputTwoState)
                {
                    var text = inputText2.getText();
                    text += "8";
                    inputText2.setText(text);
                }
            }
        });

        button9 = new JButton("9");

        button9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(InputOneEmpty)
                {
                    InputOneEmpty = false;
                }

                if(InputOneState) {
                    var text = inputText1.getText();
                    text += "9";
                    inputText1.setText(text);
                } else if(InputTwoState)
                {
                    var text = inputText2.getText();
                    text += "9";
                    inputText2.setText(text);
                }
            }
        });

        button0 = new JButton("0");

        button0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(InputOneEmpty)
                {
                    InputOneEmpty = false;
                }

                if(InputOneState) {
                    var text = inputText1.getText();
                    text += "0";
                    inputText1.setText(text);
                } else if(InputTwoState)
                {
                    var text = inputText2.getText();
                    text += "0";
                    inputText2.setText(text);
                }
            }
        });

        btnclr = new JButton("C");

        btnclr.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                inputText1.setText("");
                operandText.setText("");
                inputText2.setText("");
                outputText.setText("");
                InputOneEmpty = true;
                InputOneState = true;
                InputTwoState = false;
            }
        });

        btneql = new JButton("=");

        btneql.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                var text1 = inputText1.getText();
                var text2 = operandText.getText();
                var text3 = inputText2.getText();
                var value = calculateOutput();
                var text = text1 + text2 + text3 + "=" + value;
                outputText.setText(text);
            }
        });

        buttonMultiply = new JButton("*");

        buttonMultiply.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!InputOneEmpty)
                {
                    operandText.setText("*");
                    InputOneState = false;
                    InputTwoState = true;
                }
            }
        });

        buttonDivide = new JButton("/");

        buttonDivide.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!InputOneEmpty)
                {
                    operandText.setText("/");
                    InputOneState = false;
                    InputTwoState = true;
                }
            }
        });

        buttonAdd = new JButton("+");

        buttonAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!InputOneEmpty)
                {
                    operandText.setText("+");
                    InputOneState = false;
                    InputTwoState = true;
                }
            }
        });

        buttonSubtract = new JButton("-");

        buttonSubtract.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!InputOneEmpty)
                {
                    operandText.setText("-");
                    InputOneState = false;
                    InputTwoState = true;
                }
            }
        });

        buttonBack = new JButton("B");

        buttonBack.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(InputOneState){
                    var text = inputText1.getText();
                    var textString = (text == null || text.length() == 0) ? null : text.substring(0, text.length() - 1);
                    inputText1.setText(textString);
                } else if(InputTwoState)
                {
                    var text = inputText2.getText();
                    var textString = (text == null || text.length() == 0) ? null : text.substring(0, text.length() - 1);
                    inputText2.setText(textString);
                }
            }
        });

        buttonSqr = new JButton("X^2");

        buttonSqr.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    var input = calculateSquare();
                    var text = "";
                    text += input;
                    outputText.setText(text);
            }
        });

        buttonSqrRt = new JButton("X^-2");

        buttonSqrRt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                var input = calculateSquareRoot();
                var text = "";
                text += input;
                outputText.setText(text);
            }
        });

        buttonInverse = new JButton("X^-1");

        buttonInverse.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                var input = calculateSquareInverse();
                var text = "";
                text += input;
                outputText.setText(text);
            }
        });




        GridConstraints.gridx = 0;
        GridConstraints.gridy = 0;
        GridConstraints.weightx = 1;
        GridConstraints.weighty = 1;
        GridConstraints.fill = GridBagConstraints.NONE;

        add(inputText1, GridConstraints);

        GridConstraints.gridx = 1;
        GridConstraints.gridy = 0;
        GridConstraints.gridwidth=2;
        GridConstraints.weightx = 1;
        GridConstraints.weighty = 1;
        GridConstraints.fill = GridBagConstraints.NONE;

        add(operandText, GridConstraints);

        GridConstraints.gridx = 3;
        GridConstraints.gridy = 0;
        GridConstraints.weightx = 1;
        GridConstraints.weighty = 1;
        GridConstraints.fill = GridBagConstraints.NONE;

        add(inputText2, GridConstraints);

        GridConstraints.gridx = 1;
        GridConstraints.gridy = 1;
        GridConstraints.weightx = 1;
        GridConstraints.weighty = 1;
        GridConstraints.gridwidth = 3;
        GridConstraints.fill = GridBagConstraints.HORIZONTAL;


        add(outputText, GridConstraints);

        GridConstraints.gridx = 0;
        GridConstraints.gridy = 2;
        GridConstraints.ipadx = 40;
        GridConstraints.insets = new Insets(0,0,0,100);
        GridConstraints.weightx = 1;
        GridConstraints.weighty = 1;
        GridConstraints.fill = GridBagConstraints.NONE;

        add(button1, GridConstraints);

        GridConstraints.gridx = 1;
        GridConstraints.gridy = 2;
        GridConstraints.ipadx = 40;
        GridConstraints.insets = new Insets(0,0,0,100);
        GridConstraints.weightx = 1;
        GridConstraints.weighty = 1;
        GridConstraints.fill = GridBagConstraints.NONE;

        add(button2, GridConstraints);

        GridConstraints.gridx = 2;
        GridConstraints.gridy = 2;
        GridConstraints.ipadx = 40;
        GridConstraints.insets = new Insets(0,0,0,100);
        GridConstraints.weightx = 1;
        GridConstraints.weighty = 1;
        GridConstraints.fill = GridBagConstraints.NONE;

        add(button3, GridConstraints);

        GridConstraints.gridx = 3;
        GridConstraints.gridy = 2;
        GridConstraints.ipadx = 40;
        GridConstraints.insets = new Insets(0,0,0,100);
        GridConstraints.weightx = 1;
        GridConstraints.weighty = 1;
        GridConstraints.fill = GridBagConstraints.NONE;

        add(buttonMultiply, GridConstraints);

        GridConstraints.gridx = 0;
        GridConstraints.gridy = 3;
        GridConstraints.ipadx = 40;
        GridConstraints.insets = new Insets(0,0,0,100);
        GridConstraints.weightx = 1;
        GridConstraints.weighty = 1;
        GridConstraints.fill = GridBagConstraints.NONE;

        add(button4, GridConstraints);

        GridConstraints.gridx = 1;
        GridConstraints.gridy = 3;
        GridConstraints.ipadx = 40;
        GridConstraints.insets = new Insets(0,0,0,100);
        GridConstraints.weightx = 1;
        GridConstraints.weighty = 1;
        GridConstraints.fill = GridBagConstraints.NONE;

        add(button5, GridConstraints);

        GridConstraints.gridx = 2;
        GridConstraints.gridy = 3;
        GridConstraints.ipadx = 40;
        GridConstraints.insets = new Insets(0,0,0,100);
        GridConstraints.weightx = 1;
        GridConstraints.weighty = 1;
        GridConstraints.fill = GridBagConstraints.NONE;

        add(button6, GridConstraints);

        GridConstraints.gridx = 3;
        GridConstraints.gridy = 3;
        GridConstraints.ipadx = 40;
        GridConstraints.insets = new Insets(0,0,0,100);
        GridConstraints.weightx = 1;
        GridConstraints.weighty = 1;
        GridConstraints.fill = GridBagConstraints.NONE;

        add(buttonDivide, GridConstraints);

        GridConstraints.gridx = 0;
        GridConstraints.gridy = 4;
        GridConstraints.ipadx = 40;
        GridConstraints.insets = new Insets(0,0,0,100);
        GridConstraints.weightx = 1;
        GridConstraints.weighty = 1;
        GridConstraints.fill = GridBagConstraints.NONE;

        add(button7, GridConstraints);

        GridConstraints.gridx = 1;
        GridConstraints.gridy = 4;
        GridConstraints.ipadx = 40;
        GridConstraints.insets = new Insets(0,0,0,100);
        GridConstraints.weightx = 1;
        GridConstraints.weighty = 1;
        GridConstraints.fill = GridBagConstraints.NONE;

        add(button8, GridConstraints);

        GridConstraints.gridx = 2;
        GridConstraints.gridy = 4;
        GridConstraints.ipadx = 40;
        GridConstraints.insets = new Insets(0,0,0,100);
        GridConstraints.weightx = 1;
        GridConstraints.weighty = 1;
        GridConstraints.fill = GridBagConstraints.NONE;

        add(button9, GridConstraints);

        GridConstraints.gridx = 3;
        GridConstraints.gridy = 4;
        GridConstraints.ipadx = 40;
        GridConstraints.insets = new Insets(0,0,0,100);
        GridConstraints.weightx = 1;
        GridConstraints.weighty = 1;
        GridConstraints.fill = GridBagConstraints.NONE;

        add(buttonAdd, GridConstraints);

        GridConstraints.gridx = 0;
        GridConstraints.gridy = 5;
        GridConstraints.ipadx = 40;
        GridConstraints.insets = new Insets(0,0,0,100);
        GridConstraints.weightx = 1;
        GridConstraints.weighty = 1;
        GridConstraints.fill = GridBagConstraints.NONE;

        add(btnclr, GridConstraints);

        GridConstraints.gridx = 1;
        GridConstraints.gridy = 5;
        GridConstraints.ipadx = 40;
        GridConstraints.insets = new Insets(0,0,0,100);
        GridConstraints.weightx = 1;
        GridConstraints.weighty = 1;
        GridConstraints.fill = GridBagConstraints.NONE;

        add(button0, GridConstraints);

        GridConstraints.gridx = 2;
        GridConstraints.gridy = 5;
        GridConstraints.ipadx = 40;
        GridConstraints.insets = new Insets(0,0,0,100);
        GridConstraints.weightx = 1;
        GridConstraints.weighty = 1;
        GridConstraints.fill = GridBagConstraints.NONE;

        add(btneql, GridConstraints);

        GridConstraints.gridx = 3;
        GridConstraints.gridy = 5;
        GridConstraints.ipadx = 40;
        GridConstraints.insets = new Insets(0,0,0,100);
        GridConstraints.weightx = 1;
        GridConstraints.weighty = 1;
        GridConstraints.fill = GridBagConstraints.NONE;

        add(buttonSubtract, GridConstraints);

        setSize(1000,1000);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    private int calculateOutput()
    {
        var input1 = Integer.parseInt(inputText1.getText());
        var input2 = Integer.parseInt(inputText2.getText());
        var operator = operandText.getText();

        switch(operator)
        {
            case "*":
                return input1 * input2;
            case "/":
                return input1 / input2;
            case "+":
                return input1 + input2;
            case "-":
                return input1 - input2;
        }

        return 0;
    }

    private int calculateSquare()
    {
        var input1 = Integer.parseInt(inputText1.getText());

        return input1 * input1;
    }

    private double calculateSquareRoot()
    {
        var input1 = Integer.parseInt(inputText1.getText());

        var output = Math.sqrt(input1);
        return output;
    }

    private double calculateSquareInverse()
    {
        var input1 = Integer.parseInt(inputText1.getText());

        return 1 / input1;
    }
}
