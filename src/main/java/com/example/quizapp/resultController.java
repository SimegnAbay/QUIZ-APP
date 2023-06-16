package com.example.quizapp;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressIndicator;

public class resultController {

    @FXML
    private Label remarks;

    @FXML
    private Label marks;

    @FXML
    private ProgressIndicator correct_progress;

    @FXML
    private ProgressIndicator wrong_progress;

    @FXML
    private Label marktext;

    @FXML
    private Label wrongtext;

    @FXML
    private Label correcttext;

    @FXML
    private void initialize() {
        correcttext.setText("correct Answer : " + String.valueOf(quizcontroller.correct));
        wrongtext.setText("Incorrect Answer : " + String.valueOf(quizcontroller.wrong));

        marks.setText(quizcontroller.correct + "/10");

        float correctf = (float) quizcontroller.correct / 10;
        correct_progress.setProgress(correctf);

        float wrongtf = (float) quizcontroller.wrong / 10;
        wrong_progress.setProgress(wrongtf);

        int correct = quizcontroller.correct;

        if (correct < 2) {
            remarks.setText("Oh no..! you have failed the quiz.It seems that you need to improve.");
        } else if (correct > 2 && correct < 5) {
            remarks.setText("Oops..! you have scored less marks. It seems like you need to improve.");
        } else if (correct >= 5 && correct <= 7) {
            remarks.setText("Good.A bit more improvement might help you to get better results.");
        } else if (correct == 8 || correct == 9) {
            remarks.setText("Congratulation! Its your hardwork and determination which helped you to score good result");
        } else if (correct == 10) {
            remarks.setText("Congratulation! you have passed the quiz with full marks ");

        }
    }
}