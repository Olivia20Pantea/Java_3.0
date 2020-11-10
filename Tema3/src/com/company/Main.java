package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {

    private static JTextField firstNameInput;
    private static JTextField lastNameInput;
    private static JTextField ageInput;
    private static JRadioButton jRadioButton1;
    private static JRadioButton jRadioButton2;
    private static ButtonGroup genderButton;
    private static JCheckBox marriedCheck;
    private static JTextArea adressInput;
    private static JButton saveButton;

    public static void main(String[] args) {
        JPanel userPanel = buildPanel();
        addActionToButon(userPanel);
    }

    public static void addActionToButon(JPanel panel) {
        saveButton.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        String firstName = firstNameInput.getText();
                        String lastName = lastNameInput.getText();
                        int age = Integer.parseInt(ageInput.getText());
                        String gender;
                        if (jRadioButton1.isSelected())
                            gender = "Male";
                        else if (jRadioButton2.isSelected())
                            gender = "Female";
                        else
                            gender = "N/A";
                        String married;
                        if (marriedCheck.isSelected())
                            married = "Yes";
                        else
                            married = "No";
                        String adress = adressInput.getText();

                        User user = new User(firstName, lastName, age, gender, married, adress);
                        resultPanel(panel, user);
                    }
                }
        );
    }

    public static void resultPanel(JPanel panel, com.company.User user) {
        panel.removeAll();
        JLabel userFirstName = new JLabel("\nFirst name: " + user.getFirstName());
        userFirstName.setBounds(10, 20, 300, 25);
        panel.add(userFirstName);

        JLabel userLastName = new JLabel("\nLast name: " + user.getLastName());
        userLastName.setBounds(10, 50, 300, 25);
        panel.add(userLastName);

        JLabel userAge = new JLabel("\nAge: " + user.getAge());
        userAge.setBounds(10, 80, 300, 25);
        panel.add(userAge);

        JLabel userGender = new JLabel("\nGender: " + user.getGender());
        userGender.setBounds(10, 110, 300, 25);
        panel.add(userGender);

        JLabel userMarried = new JLabel("\nMaried: " + user.isMarried());
        userMarried.setBounds(10, 140, 300, 25);
        panel.add(userMarried);

        JLabel userAdress = new JLabel("\nAdress: " + user.getAdress());
        userAdress.setBounds(10, 170, 300, 25);
        panel.add(userAdress);
        panel.updateUI();
    }

    private static JPanel buildPanel() {
        JFrame frame = new JFrame("Insert data: ");
        frame.setSize(350, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        frame.add(panel);

        placeComponents(panel);

        frame.setVisible(true);

        return panel;
    }

    private static void placeComponents(JPanel panel) {
        panel.setLayout(null);

        JLabel firstNameLabel = new JLabel("First name:");
        firstNameLabel.setBounds(10, 20, 80, 25);
        panel.add(firstNameLabel);

        firstNameInput = new JTextField(20);
        firstNameInput.setBounds(100, 20, 165, 25);
        panel.add(firstNameInput);

        JLabel lastNameLabel = new JLabel("Last name:");
        lastNameLabel.setBounds(10, 50, 80, 25);
        panel.add(lastNameLabel);

        lastNameInput = new JTextField(20);
        lastNameInput.setBounds(100, 50, 165, 25);
        panel.add(lastNameInput);

        JLabel ageLabel = new JLabel("Age:");
        ageLabel.setBounds(10, 80, 80, 25);
        panel.add(ageLabel);

        ageInput = new JTextField(20);
        ageInput.setBounds(100, 80, 165, 25);
        panel.add(ageInput);

        JLabel genderLabel = new JLabel("Gender:");
        genderLabel.setBounds(10, 110, 80, 25);
        panel.add(genderLabel);

        jRadioButton1 = new JRadioButton();
        jRadioButton1.setText("Male");
        jRadioButton1.setBounds(80, 110, 60, 25);
        panel.add(jRadioButton1);

        jRadioButton2 = new JRadioButton();
        jRadioButton2.setText("Female");
        jRadioButton2.setBounds(160, 110, 80, 25);
        panel.add(jRadioButton2);

        genderButton = new ButtonGroup();
        genderButton.add(jRadioButton1);
        genderButton.add(jRadioButton2);

        marriedCheck = new JCheckBox("Married?");
        marriedCheck.setBounds(10, 140, 165, 25);
        panel.add(marriedCheck);

        JLabel adressLabel = new JLabel("Adress:");
        adressLabel.setBounds(10, 170, 80, 25);
        panel.add(adressLabel);

        adressInput = new JTextArea(5, 10);
        adressInput.setBounds(100, 170, 165, 80);
        panel.add(adressInput);

        saveButton = new JButton("Save");
        saveButton.setBounds(10, 270, 150, 25);
        panel.add(saveButton);
    }
}