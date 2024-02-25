/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ws.computershop.other;

import javax.swing.JButton;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author Waruna
 */
public class Validation {

    public static void enableButton(JButton button) {

        button.setEnabled(true);
    }

    public static void enableButton(JButton button, JPasswordField passwordField) {

        if (passwordField.getText().isEmpty()) {
            button.setEnabled(false);
        } else {
            button.setEnabled(true);
        }

    }
    public static void enableButton(JButton button, JPasswordField passwordFieldone,JPasswordField passwordFieldtwo) {

        if (!passwordFieldone.getText().isEmpty() && !passwordFieldtwo.getText().isEmpty()) {
            button.setEnabled(true);
        } else {
            button.setEnabled(false);
        }

    }

    public static void enableButton(JButton button, JTextField... textFields) {

        boolean isEmpty = false;
        for (JTextField textField : textFields) {
            if (textField.getText().isEmpty()) {
                isEmpty = true;
                break;
            }
        }
        if (isEmpty) {
            button.setEnabled(false);
        } else {
            button.setEnabled(true);
        }
    }

    public static void enableButton(JButton button, JTextArea textArea1, JTextArea textArea2, JTextField... textFields) {

        boolean isEmpty = false;
        for (JTextField textField : textFields) {
            if (textField.getText().isEmpty()) {
                isEmpty = true;
                break;
            }
        }
        if (textArea1.getText().isEmpty()) {
            isEmpty = true;
        }
        if (textArea2.getText().isEmpty()) {
            isEmpty = true;
        }
        if (isEmpty) {
            button.setEnabled(false);
        } else {
            button.setEnabled(true);
        }
    }

    public static void validateAmountInput(JTextField textField) {

        String text = textField.getText();
        boolean match = text.matches("[0-9]+[.]?[0-9]{0,2}");
        if (!match) {
            if (text.length() > 0) {
                textField.setText(text.substring(0, text.length() - 1));
            }
        }
    }
    public static void validateNumberInput(JTextField textField) {

        String text = textField.getText();
        boolean match = text.matches("[0-9]");
        if (!match) {
            if (text.length() > 0) {
                textField.setText(text.substring(0, text.length() - 1));
            }
        }
    }

    public static void inputDigitAndCharaters(JTextField textField) {
        String text = textField.getText();
        boolean match = text.matches("[a-zA-Zz 0-9]+");
        if (!match) {
            if (text.length() > 0) {
                textField.setText(text.substring(0, text.length() - 1));
            }

        }
    }

    public static void inputDigitAndCharaters(JTextArea textField) {
        String text = textField.getText();
        boolean match = text.matches("[a-zA-Zz 0-9]+");
        if (!match) {
            if (text.length() > 0) {
                textField.setText(text.substring(0, text.length() - 1));
            }

        }
    }

    public static void inputValidNic(JTextField textField) {
        String text = textField.getText();
        textField.setText(text.replaceAll("[\\D]", ""));
        if (text.length() > 9) {
            textField.setText(text.substring(0, 10));
        }
        boolean matches = text.matches("[\\d]{9}");
        if (matches) {
            textField.setText(textField.getText() + "V");
        }
    }

    public static void inputCharaterOnly(JTextField textField) {
        String text = textField.getText();
        boolean match = text.matches("[a-zA-Zz]+");
        if (!match) {
            if (text.length() > 0) {
                textField.setText(text.substring(0, text.length() - 1));
            }

        }
    }

    public static void inputContactNumber(JTextField textField) {
        String text = textField.getText();

        if (!text.matches("0[0-9]{0,9}")) {
            if (text.length() > 0) {
                text = text.substring(0, text.length() - 1);
            }
            textField.setText(text);
        }
    }

    public static void inputValidAccountNumber(JTextField textField) {
        String text = textField.getText();

        if (!text.matches("[0-9]{0,10}")) {
            if (text.length() > 0) {
                text = text.substring(0, text.length() - 1);
            }
            textField.setText(text);
        }
    }
}
