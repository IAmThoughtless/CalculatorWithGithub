package com.example.starting_ui;

import com.example.starting_ui.components.NavigationBar;
import com.example.starting_ui.views.*;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/**
 * Main Application Class
 * This is the entry point that coordinates all views and components.
 * Each view is now in its own class for separate branch development.
 */
public class HelloApplication extends Application {

    private BorderPane root;
    private Scene scene;
    
    // View instances
    private HomeView homeView;
    private LoginView loginView;
    private RegisterView registerView;
    private Top10View top10View;
    private QuizView quizView;
    private NavigationBar navigationBar;

    @Override
    public void start(Stage stage) {
        root = new BorderPane();

        // Initialize views
        homeView = new HomeView();
        loginView = new LoginView(this::showRegisterView);
        registerView = new RegisterView(this::showLoginView);
        top10View = new Top10View();
        quizView = new QuizView();
        
        // Initialize navigation bar with callbacks
        navigationBar = new NavigationBar(
            this::showHomeView,
            this::showTop10View,
            this::showQuizView,
            this::showLoginView
        );

        root.setTop(navigationBar.getView());
        showHomeView();

        scene = new Scene(root, 1200, 800);
        scene.getStylesheets().add(getClass().getResource("/com/example/starting_ui/modern-styles.css").toExternalForm());
        
        stage.setTitle("CineMatch - Discover Your Next Favorite Movie");
        stage.setScene(scene);
        stage.setMinWidth(900);
        stage.setMinHeight(600);
        stage.show();
    }

    // --- VIEW NAVIGATION METHODS ---
    
    private void showHomeView() {
        root.setCenter(homeView.getView());
    }

    private void showLoginView() {
        root.setCenter(loginView.getView());
    }

    private void showRegisterView() {
        root.setCenter(registerView.getView());
    }

    private void showTop10View() {
        root.setCenter(top10View.getView());
    }

    private void showQuizView() {
        root.setCenter(quizView.getView());
    }

    public static void main(String[] args) {
        launch();
    }
}





