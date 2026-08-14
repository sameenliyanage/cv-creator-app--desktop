package com.example.cv;

import java.io.File;
import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Optional;
import java.util.ResourceBundle;

import javafx.animation.FadeTransition;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.fxml.Initializable;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.util.Duration;

public class signinController implements Initializable{

    @FXML
    private Button minimizeBtn;
    @FXML
    private Button closeBtn;
    @FXML
    private Button loginBtn;
    @FXML
    private Label loginMsg;
    @FXML
    private PasswordField password;
    @FXML
    private Hyperlink signupBtn;
    @FXML
    private TextField username;
    @FXML
    private ImageView bgCover;
    @FXML
    private ImageView logo;

    public static String Username;

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

    public void minimizeBtnClick(ActionEvent event){
        Stage stage = (Stage) minimizeBtn.getScene().getWindow();
        stage.setIconified(true);
    }

    public void signupBtnClick(ActionEvent e) throws Exception {
        signupBtn.getScene().getWindow().hide();
        Parent root = FXMLLoader.load(getClass().getResource("Signup-view.fxml"));
        Stage stage = new Stage();
        stage.setTitle("Signup");
        stage.getIcons().add(new Image("C:\\Users\\Acer\\IdeaProjects\\CV\\src\\main\\images\\CV_logo.png"));
        Scene scene = new Scene(root,600,450);

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

    private double x = 0;
    private double y = 0;

    public void validateLogin(){
        DBConnect db = new DBConnect();
        Connection conn = db.getConnection();

        String sql = "SELECT count(1) FROM user_accounts WHERE username = '" + username.getText() + "' AND password = '" + password.getText() + "'";
        Username = username.getText();

        try {
            Statement state = conn.createStatement();
            ResultSet qResult = state.executeQuery(sql);

            while (qResult.next()){
                if (qResult.getInt(1) == 1){
                    loginMsg.setText("");
                    Alert alert = new Alert(Alert.AlertType.INFORMATION);
                    alert.setTitle("Login Message");
                    alert.setHeaderText(null);
                    alert.setContentText("Successfully Login!");
                    alert.showAndWait();

                    loginBtn.getScene().getWindow().hide();
                    Parent root = FXMLLoader.load(getClass().getResource("DashBoard-view.fxml"));
                    Stage stage = new Stage();
                    stage.setTitle("DashBoard");
                    stage.getIcons().add(new Image("C:\\Users\\Acer\\IdeaProjects\\CV\\src\\main\\images\\CV_logo.png"));
                    Scene scene = new Scene(root);

                    root.setOnMousePressed((MouseEvent event) ->{
                        x = event.getSceneX();
                        y = event.getSceneY();
                    });

                    root.setOnMouseDragged((MouseEvent event) ->{
                        stage.setX(event.getScreenX() - x);
                        stage.setY(event.getScreenY() - y);
                    });

                    stage.initStyle(StageStyle.UNDECORATED);
                    stage.setScene(scene);
                    FadeTransition fadeout = new FadeTransition(Duration.seconds(0.3), root);
                    fadeout.setFromValue(0.0);
                    fadeout.setToValue(1.0);
                    fadeout.play();
                    stage.show();
                }
                else {
                    loginMsg.setText("");
                    loginMsg.setText("Invalid username or password!");
                }
            }
        }
        catch (Exception e) {
            e.printStackTrace();
            e.getCause();
        }

    }

    public void loginBtnClick(ActionEvent event){
        if (username.getText().isBlank() == false && password.getText().isBlank() == false ){
            validateLogin();
        }
        else {
            loginMsg.setText("Please enter username and password!");
        }
    }

    /**
     *
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        File coverFile = new File("C:\\Users\\Acer\\IdeaProjects\\CV\\src\\main\\images\\Cover1.png");
        Image coverImage = new Image(coverFile.toURI().toString());
        bgCover.setImage(coverImage);

        File logoFile = new File("C:\\Users\\Acer\\IdeaProjects\\CV\\src\\main\\images\\CV_logo.png");
        Image logoImage = new Image(logoFile.toURI().toString(),75,48,true,true);
        logo.setImage(logoImage);

    }

}