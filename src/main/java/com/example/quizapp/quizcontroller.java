package com.example.quizapp;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class quizcontroller {

    @FXML
    private Label question;

    @FXML
    private Button opt1;

    @FXML
    private Button opt2;

    @FXML
    private Button opt3;

    @FXML
    private Button opt4;

    int counter = 0;
    static int correct = 0;
    static int wrong = 0;

    @FXML
     private  void  initialize(){
       loadQuestions();
     }
    private void loadQuestions() {

        if (counter == 0) {
        question.setText("1.which language is the first programming language");
        opt1.setText("fortran");
        opt2.setText("C");
        opt3.setText("assembly");
        opt4.setText("pascal");
    } else if (counter == 1) {
            question.setText("2.What is the return type of hash code");
            opt1.setText("object");
            opt2.setText("int");
            opt3.setText("long");
            opt4.setText("void");
        }
        else if (counter == 2) {
            question.setText("3._is used to find and fix bugs in the java program");
            opt1.setText("JVM");
            opt2.setText("JRE");
            opt3.setText("JDK");
            opt4.setText("JDB");
        } else if (counter == 3) {
            question.setText("4.which package contains the random the class");
            opt1.setText("java.util.");
            opt2.setText("java.lang");
            opt3.setText("java.awt");
            opt4.setText("java.io");
        }
        else if (counter == 4) {
            question.setText("5. which of the following is a reserved key word in java ?");
            opt1.setText("object");
            opt2.setText("strictfp");
            opt3.setText("main");
            opt4.setText("system");
        } else if (counter == 5) {
            question.setText("6.how many thread can be executed at a time ");
            opt1.setText("one");
            opt2.setText("multiple");
            opt3.setText("two");
            opt4.setText("only main");
        }
        else if (counter == 6) {
            question.setText("7.what is the initial quantity of array list ");
            opt1.setText("5");
            opt2.setText("10");
            opt3.setText("0");
            opt4.setText("100");
        } else if (counter == 7) {
            question.setText("8.Animation and interactivity with the user on web page can be done by ");
            opt1.setText("php");
            opt2.setText("java");
            opt3.setText("javascript");
            opt4.setText("python");

        }
        else if (counter == 8) {
            question.setText("9.which of the following modifier can be use for a variable so that it can be accessed by any thread ");
            opt1.setText("global");
            opt2.setText("transient");
            opt3.setText("volatile");
            opt4.setText("default");
        }
        else if (counter == 9) {
            question.setText("1.which keyword is used for accessing the features of a package");
            opt1.setText("package");
            opt2.setText("import");
            opt3.setText("extend");
            opt4.setText("export");
        }

    }

    @FXML
    public void opt1clicked(ActionEvent event) {
        checkAnswer(opt1.getText().toString());
        if (checkAnswer(opt1.getText().toString())){
          correct = correct + 1;
        } else{
    wrong = wrong + 1;
        }
        if (counter == 9) {

            try {
                Stage thisstage = (Stage) ((Button) event.getSource()).getScene().getWindow();
                thisstage.close();

                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("result.fxml"));

                Scene scene = new Scene(fxmlLoader.load());
                Stage stage = new Stage();
                stage.setScene(scene);
                stage.initStyle(StageStyle.TRANSPARENT);
                scene.setFill(Color.TRANSPARENT);

                stage.show();;

            } catch (Exception e) {
                e.printStackTrace();
            }

        } else {

            counter++;
            loadQuestions();
        }
    }

    boolean checkAnswer(String answer) {
        if (counter == 0) {
            if (answer.equals("fortran")) {
                return true;
            } else {
                return false;
            }
        }

        if (counter == 1) {
            if (answer.equals("int")) {
                return true;
            } else {
                return false;
            }
        }
        if (counter == 2) {
            if (answer.equals("JDB")) {
                return true;
            } else {
                return false;
            }
        }
        if (counter == 3) {
            if (answer.equals("java.util")) {
                return true;
            } else {
                return false;
            }
        }
        if (counter == 4) {
            if (answer.equals("strictfp")) {
                return true;
            } else {
                return false;
            }
        }
        if (counter == 5) {
            if (answer.equals("multiple")) {
                return true;
            } else {
                return false;
            }
        }
        if (counter == 6) {
            if (answer.equals("0")) {
                return true;
            } else {
                return false;
            }
        }
        if (counter == 7) {
            if (answer.equals("javascript")) {
                return true;
            } else {
                return false;
            }
        }
        if (counter == 8) {
            if (answer.equals("volatile")) {
                return true;
            } else {
                return false;
            }
        }
        if (counter == 9) {
            if (answer.equals("import")) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }


    @FXML
   public void opt2clicked(ActionEvent event) {
        checkAnswer(opt2.getText().toString());
        if (checkAnswer(opt2.getText().toString())){
            correct = correct + 1;
        } else{
            wrong = wrong + 1;
        }
        if (counter == 9) {

            try {
                Stage thisstage = (Stage) ((Button) event.getSource()).getScene().getWindow();
                thisstage.close();

                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("result.fxml"));

                Scene scene = new Scene(fxmlLoader.load());
                Stage stage = new Stage();
                stage.setScene(scene);
                stage.initStyle(StageStyle.TRANSPARENT);
                scene.setFill(Color.TRANSPARENT);

                stage.show();;

            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {

            counter++;
            loadQuestions();
        }
    }

    @FXML
    public void opt3clicked(ActionEvent event) {
        checkAnswer(opt3.getText().toString());
        if (checkAnswer(opt3.getText().toString())){
            correct = correct + 1;
        } else{
            wrong = wrong + 1;
        }
        if (counter == 9) {

            try {
                Stage thisstage = (Stage) ((Button) event.getSource()).getScene().getWindow();
                thisstage.close();

                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("result.fxml"));

                Scene scene = new Scene(fxmlLoader.load());
                Stage stage = new Stage();
                stage.setScene(scene);
                stage.initStyle(StageStyle.TRANSPARENT);
                scene.setFill(Color.TRANSPARENT);

                stage.show();;

            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {

            counter++;
            loadQuestions();
        }
    }

    @FXML
    public void opt4clicked(ActionEvent event) {
        checkAnswer(opt4.getText().toString());
        if (checkAnswer(opt4.getText().toString())){
            correct = correct + 1;
        } else{
            wrong = wrong + 1;
        }
        if (counter == 9) {

        } else {

            counter++;
            loadQuestions();
        }
    }

}
