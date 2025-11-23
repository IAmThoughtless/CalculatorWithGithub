package com.example.starting_ui.views;

import javafx.animation.FadeTransition;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.util.Duration;

/**
 * Quiz View Section
 * This class handles the movie quiz page.
 * Branch: feature/quiz-page
 */
public class QuizView {
    
    public VBox getView() {
        Label titleLabel = new Label("Movie Quiz");
        titleLabel.getStyleClass().add("welcome-title");

        Label placeholderLabel = new Label("Quiz functionality will be displayed here");
        placeholderLabel.getStyleClass().add("subtitle");

        VBox quizContent = new VBox(20, titleLabel, placeholderLabel);
        quizContent.setAlignment(Pos.CENTER);
        quizContent.setPadding(new Insets(60, 40, 40, 40));

        fadeInContent(quizContent);
        return quizContent;
    }

    private void fadeInContent(Pane content) {
        content.setOpacity(0);
        FadeTransition fadeTransition = new FadeTransition(Duration.millis(300), content);
        fadeTransition.setFromValue(0);
        fadeTransition.setToValue(1);
        fadeTransition.play();
    }
}

