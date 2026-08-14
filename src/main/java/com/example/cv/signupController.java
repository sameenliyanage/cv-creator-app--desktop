package com.example.cv;

import javafx.animation.FadeTransition;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.util.Duration;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.Statement;
import java.util.Optional;
import java.util.ResourceBundle;


public class signupController implements Initializable {

    @FXML
    private Button backBtn;
    @FXML
    private Button closeBtn;
    @FXML
    private Label confirmMsg;
    @FXML
    private PasswordField confirmPassword;
    @FXML
    private TextField email;
    @FXML
    private Button minimizeBtn;
    @FXML
    private PasswordField password;
    @FXML
    private Button registerBtn;
    @FXML
    private Hyperlink signinBtn;
    @FXML
    private TextField username;

    public static String Email;

    public void closeBtnClick(ActionEvent event) {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Confirmation");
        alert.setHeaderText(null);
        alert.setContentText("Are you sure you want to exit?");
        Optional<ButtonType> result = alert.showAndWait();
        try {
            if (result.get() == ButtonType.OK) {
                Stage stage = (Stage) closeBtn.getScene().getWindow();
                stage.close();
                Platform.exit();
            }
            else if (result.get() == ButtonType.CANCEL) {
                alert.close();
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void minimizeBtnClick(ActionEvent event) {
        Stage stage = (Stage) minimizeBtn.getScene().getWindow();
        stage.setIconified(true);
    }

    private double x = 0;
    private double y = 0;

    public void backToLogin() throws IOException {
        backBtn.getScene().getWindow().hide();
        signinBtn.getScene().getWindow().hide();
        registerBtn.getScene().getWindow().hide();
        Parent root = FXMLLoader.load(getClass().getResource("Signin-view.fxml"));
        Stage stage = new Stage();
        stage.setTitle("Signin");
        stage.getIcons().add(new Image("C:\\Users\\Acer\\IdeaProjects\\CV\\src\\main\\images\\CV_logo.png"));
        Scene scene = new Scene(root);

       root.setOnMousePressed((MouseEvent event) -> {
            x = event.getSceneX();
            y = event.getSceneY();
        });

        root.setOnMouseDragged((MouseEvent event) -> {
            stage.setX(event.getScreenX() - x);
            stage.setY(event.getScreenY() - y);

            stage.setOpacity(0.8);
        });

        root.setOnMouseReleased((MouseEvent event) -> {
            stage.setOpacity(1);
        });

        stage.initStyle(StageStyle.UNDECORATED);
        stage.setScene(scene);
        FadeTransition fadeout = new FadeTransition(Duration.seconds(0.3), root);
        fadeout.setFromValue(0.0);
        fadeout.setToValue(1.0);
        fadeout.play();
        stage.show();

    }

    public void registerBtnClick(ActionEvent event) {

        if (username.getText().isEmpty() || email.getText().isEmpty() || password.getText().isEmpty()) {
            confirmMsg.setText("");
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Warning");
            alert.setHeaderText(null);
            alert.setContentText("Please fill all the fields!");
            alert.showAndWait();

        }else {
            registerUser();
        }
    }

    public void registerUser(){
        DBConnect db = new DBConnect();
        Connection dbConnect = db.getConnection();

        String dataInsert = "INSERT INTO user_accounts (username ,email , password) VALUES ('"+username.getText()+"','"+email.getText()+"','"+password.getText()+"')";
        Email = email.getText();

        try {
            if (password.getText().equals(confirmPassword.getText())){
                Statement statement = dbConnect.createStatement();
                statement.executeUpdate(dataInsert);
                confirmMsg.setText("");
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Register Message");
                alert.setHeaderText(null);
                alert.setContentText("User has been registered successfully!");
                alert.showAndWait();
                backToLogin();
            }else {
                confirmMsg.setText("Password does not match!");
            }


        }catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getCause());
            confirmMsg.setText("");
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Error");
            alert.setHeaderText(null);
            alert.setContentText("Username already exists!");
            alert.showAndWait();
        }

    }


    /**
     * @param url
     * @param resourceBundle
     */
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
