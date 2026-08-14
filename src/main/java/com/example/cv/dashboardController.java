package com.example.cv;

import de.jensd.fx.glyphs.GlyphsDude;
import de.jensd.fx.glyphs.fontawesome.FontAwesomeIcon;
import de.jensd.fx.glyphs.fontawesome.FontAwesomeIcons;
import javafx.animation.FadeTransition;
import javafx.application.Platform;
import javafx.beans.binding.Bindings;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.embed.swing.SwingFXUtils;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.fxml.FXML;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.util.Callback;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;
import java.net.URL;
import java.sql.*;
import java.sql.Date;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

import static com.example.cv.signinController.Username;
import javafx.util.Duration;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;


public class dashboardController implements Initializable {

    @FXML
    private FontAwesomeIcon IDIcon;
    @FXML
    private FontAwesomeIcon accountIcon;
    @FXML
    private Rectangle recID;
    @FXML
    private Circle accountCircle;
    @FXML
    private ComboBox<String> profileGender;
    @FXML
    private ComboBox<String> profileMaritalStatus;
    @FXML
    private TableView<tableData> tableCV;
    @FXML
    private TableColumn<tableData, String> tableCV_BtnCol;
    @FXML
    private TableColumn<tableData, Integer> tableCV_IDCol;
    @FXML
    private TableColumn<tableData, String> tableCV_NameCol;
    @FXML
    private TableColumn<tableData, Date> tableCV_TimeCol;
    @FXML
    private Button backBtn;
    @FXML
    private Button closeBtn;
    @FXML
    private Button minimizeBtn;
    @FXML
    private Button logoutBtn;
    @FXML
    private Button backBtn1;
    @FXML
    private Button backBtn2;
    @FXML
    private Button closeBtn1;
    @FXML
    private Button homeBtn;
    @FXML
    private Button templateBtn;
    @FXML
    private Button helpBtn;
    @FXML
    private Button settingBtn;
    @FXML
    private Button CVPBtn;
    @FXML
    private Button ECVBtn;
    @FXML
    private Button AddIDBtn;
    @FXML
    private Button RemoveIDBtn;
    @FXML
    private Button achieveAddBtn;
    @FXML
    private Button achieveAddBtn2;
    @FXML
    private Button achieveAddBtn3;
    @FXML
    private Button achieveAddBtn4;
    @FXML
    private Button achieveAddBtn5;
    @FXML
    private Button achieveAddBtn6;
    @FXML
    private Button achieveAddBtn7;
    @FXML
    private Button achieveAddBtn8;
    @FXML
    private Button achieveAddBtn9;
    @FXML
    private Button achieveAddBtn10;
    @FXML
    private Button achieveCloseBtn;
    @FXML
    private Button achieveCloseBtn2;
    @FXML
    private Button achieveCloseBtn3;
    @FXML
    private Button achieveCloseBtn4;
    @FXML
    private Button achieveCloseBtn5;
    @FXML
    private Button achieveCloseBtn6;
    @FXML
    private Button achieveCloseBtn7;
    @FXML
    private Button achieveCloseBtn8;
    @FXML
    private Button achieveCloseBtn9;
    @FXML
    private Button achieveCloseBtn10;
    @FXML
    private Button eduAddBtn;
    @FXML
    private Button eduAddBtn2;
    @FXML
    private Button eduAddBtn3;
    @FXML
    private Button eduAddBtn4;
    @FXML
    private Button eduAddBtn5;
    @FXML
    private Button eduAddBtn6;
    @FXML
    private Button eduCloseBtn;
    @FXML
    private Button eduCloseBtn2;
    @FXML
    private Button eduCloseBtn3;
    @FXML
    private Button eduCloseBtn4;
    @FXML
    private Button eduCloseBtn5;
    @FXML
    private Button eduCloseBtn6;
    @FXML
    private Button expAddBtn;
    @FXML
    private Button expAddBtn2;
    @FXML
    private Button expAddBtn3;
    @FXML
    private Button expAddBtn4;
    @FXML
    private Button expAddBtn5;
    @FXML
    private Button expCloseBtn;
    @FXML
    private Button expCloseBtn2;
    @FXML
    private Button expCloseBtn3;
    @FXML
    private Button expCloseBtn4;
    @FXML
    private Button expCloseBtn5;
    @FXML
    private Button langAddBtn;
    @FXML
    private Button langAddBtn2;
    @FXML
    private Button langAddBtn3;
    @FXML
    private Button langAddBtn4;
    @FXML
    private Button langAddBtn5;
    @FXML
    private Button langCloseBtn;
    @FXML
    private Button langCloseBtn2;
    @FXML
    private Button langCloseBtn3;
    @FXML
    private Button langCloseBtn4;
    @FXML
    private Button langCloseBtn5;
    @FXML
    private Button objectiveClearBtn;
    @FXML
    private Button profileResetBtn;
    @FXML
    private Button profileSaveBtn;
    @FXML
    private Button profileUpdateBtn;
    @FXML
    private Button projectAddBtn;
    @FXML
    private Button projectAddBtn2;
    @FXML
    private Button projectAddBtn3;
    @FXML
    private Button projectAddBtn4;
    @FXML
    private Button projectAddBtn5;
    @FXML
    private Button projectCloseBtn;
    @FXML
    private Button projectCloseBtn2;
    @FXML
    private Button projectCloseBtn3;
    @FXML
    private Button projectCloseBtn4;
    @FXML
    private Button projectCloseBtn5;
    @FXML
    private Button refAddBtn;
    @FXML
    private Button refAddBtn2;
    @FXML
    private Button refCloseBtn;
    @FXML
    private Button refCloseBtn2;
    @FXML
    private Button skillAddBtn;
    @FXML
    private Button skillAddBtn2;
    @FXML
    private Button skillAddBtn3;
    @FXML
    private Button skillAddBtn4;
    @FXML
    private Button skillAddBtn5;
    @FXML
    private Button skillAddBtn6;
    @FXML
    private Button skillAddBtn7;
    @FXML
    private Button skillAddBtn8;
    @FXML
    private Button skillAddBtn9;
    @FXML
    private Button skillAddBtn10;
    @FXML
    private Button skillCloseBtn;
    @FXML
    private Button skillCloseBtn2;
    @FXML
    private Button skillCloseBtn3;
    @FXML
    private Button skillCloseBtn4;
    @FXML
    private Button skillCloseBtn5;
    @FXML
    private Button skillCloseBtn6;
    @FXML
    private Button skillCloseBtn7;
    @FXML
    private Button skillCloseBtn8;
    @FXML
    private Button skillCloseBtn9;
    @FXML
    private Button skillCloseBtn10;
    @FXML
    private Button temp1btn;
    @FXML
    private Button temp2btn;
    @FXML
    private Button temp3btn;
    @FXML
    private Button temp4btn;
    @FXML
    private Button temp5btn;
    @FXML
    private Button temp6btn;
    @FXML
    private Button IDBtn;
    @FXML
    private Button changePasswordBtn;
    @FXML
    private Button deleteAccountBtn;
    @FXML
    private Button aboutBtn;
    @FXML
    private Button accountCloseBtn;
    @FXML
    private Button doneBtn;
    @FXML
    private ToggleGroup skill;
    @FXML
    private ToggleGroup skill2;
    @FXML
    private ToggleGroup skill3;
    @FXML
    private ToggleGroup skill4;
    @FXML
    private ToggleGroup skill5;
    @FXML
    private ToggleGroup skill6;
    @FXML
    private ToggleGroup skill7;
    @FXML
    private ToggleGroup skill8;
    @FXML
    private ToggleGroup skill9;
    @FXML
    private ToggleGroup skill10;
    @FXML
    private RadioButton skillLevel1;
    @FXML
    private RadioButton skillLevel2;
    @FXML
    private RadioButton skillLevel3;
    @FXML
    private RadioButton skillLevel4;
    @FXML
    private RadioButton skillLevel2_1;
    @FXML
    private RadioButton skillLevel2_2;
    @FXML
    private RadioButton skillLevel2_3;
    @FXML
    private RadioButton skillLevel2_4;
    @FXML
    private RadioButton skillLevel3_1;
    @FXML
    private RadioButton skillLevel3_2;
    @FXML
    private RadioButton skillLevel3_3;
    @FXML
    private RadioButton skillLevel3_4;
    @FXML
    private RadioButton skillLevel4_1;
    @FXML
    private RadioButton skillLevel4_2;
    @FXML
    private RadioButton skillLevel4_3;
    @FXML
    private RadioButton skillLevel4_4;
    @FXML
    private RadioButton skillLevel5_1;
    @FXML
    private RadioButton skillLevel5_2;
    @FXML
    private RadioButton skillLevel5_3;
    @FXML
    private RadioButton skillLevel5_4;
    @FXML
    private RadioButton skillLevel6_1;
    @FXML
    private RadioButton skillLevel6_2;
    @FXML
    private RadioButton skillLevel6_3;
    @FXML
    private RadioButton skillLevel6_4;
    @FXML
    private RadioButton skillLevel7_1;
    @FXML
    private RadioButton skillLevel7_2;
    @FXML
    private RadioButton skillLevel7_3;
    @FXML
    private RadioButton skillLevel7_4;
    @FXML
    private RadioButton skillLevel8_1;
    @FXML
    private RadioButton skillLevel8_2;
    @FXML
    private RadioButton skillLevel8_3;
    @FXML
    private RadioButton skillLevel8_4;
    @FXML
    private RadioButton skillLevel9_1;
    @FXML
    private RadioButton skillLevel9_2;
    @FXML
    private RadioButton skillLevel9_3;
    @FXML
    private RadioButton skillLevel9_4;
    @FXML
    private RadioButton skillLevel10_1;
    @FXML
    private RadioButton skillLevel10_2;
    @FXML
    private RadioButton skillLevel10_3;
    @FXML
    private RadioButton skillLevel10_4;
    @FXML
    private TextField eduSchool;
    @FXML
    private TextField eduSchool2;
    @FXML
    private TextField eduSchool3;
    @FXML
    private TextField eduSchool4;
    @FXML
    private TextField eduSchool5;
    @FXML
    private TextField eduSchool6;
    @FXML
    private TextField eduYear;
    @FXML
    private TextField eduYear2;
    @FXML
    private TextField eduYear3;
    @FXML
    private TextField eduYear4;
    @FXML
    private TextField eduYear5;
    @FXML
    private TextField eduYear6;
    @FXML
    private TextField eduCourse;
    @FXML
    private TextField eduCourse2;
    @FXML
    private TextField eduCourse3;
    @FXML
    private TextField eduCourse4;
    @FXML
    private TextField eduCourse5;
    @FXML
    private TextField eduCourse6;
    @FXML
    private TextField achieveName;
    @FXML
    private TextField achieveName2;
    @FXML
    private TextField achieveName3;
    @FXML
    private TextField achieveName4;
    @FXML
    private TextField achieveName5;
    @FXML
    private TextField achieveName6;
    @FXML
    private TextField achieveName7;
    @FXML
    private TextField achieveName8;
    @FXML
    private TextField achieveName9;
    @FXML
    private TextField achieveName10;
    @FXML
    private TextField achieveYear;
    @FXML
    private TextField achieveYear2;
    @FXML
    private TextField achieveYear3;
    @FXML
    private TextField achieveYear4;
    @FXML
    private TextField achieveYear5;
    @FXML
    private TextField achieveYear6;
    @FXML
    private TextField achieveYear7;
    @FXML
    private TextField achieveYear8;
    @FXML
    private TextField achieveYear9;
    @FXML
    private TextField achieveYear10;
    @FXML
    private TextField expCompany;
    @FXML
    private TextField expCompany2;
    @FXML
    private TextField expCompany3;
    @FXML
    private TextField expCompany4;
    @FXML
    private TextField expCompany5;
    @FXML
    private TextField expJob;
    @FXML
    private TextField expJob2;
    @FXML
    private TextField expJob3;
    @FXML
    private TextField expJob4;
    @FXML
    private TextField expJob5;
    @FXML
    private TextField langName;
    @FXML
    private TextField langName2;
    @FXML
    private TextField langName3;
    @FXML
    private TextField langName4;
    @FXML
    private TextField langName5;
    @FXML
    private TextField profileName;
    @FXML
    private TextField profileNationality;
    @FXML
    private TextField profilePhone;
    @FXML
    private TextField profileProfession;
    @FXML
    private TextField profileEmail;
    @FXML
    private TextField profileLinkedin;
    @FXML
    private TextField profileGithub;
    @FXML
    private TextField projectTitle;
    @FXML
    private TextField projectTitle2;
    @FXML
    private TextField projectTitle3;
    @FXML
    private TextField projectTitle4;
    @FXML
    private TextField projectTitle5;
    @FXML
    private TextField refCompany;
    @FXML
    private TextField refCompany2;
    @FXML
    private TextField refEmail;
    @FXML
    private TextField refEmail2;
    @FXML
    private TextField refJob;
    @FXML
    private TextField refJob2;
    @FXML
    private TextField refName;
    @FXML
    private TextField refName2;
    @FXML
    private TextField refPhone;
    @FXML
    private TextField refPhone2;
    @FXML
    private TextField skillName;
    @FXML
    private TextField skillName2;
    @FXML
    private TextField skillName3;
    @FXML
    private TextField skillName4;
    @FXML
    private TextField skillName5;
    @FXML
    private TextField skillName6;
    @FXML
    private TextField skillName7;
    @FXML
    private TextField skillName8;
    @FXML
    private TextField skillName9;
    @FXML
    private TextField skillName10;
    @FXML
    private PasswordField currentPassword;
    @FXML
    private PasswordField newPassword;
    @FXML
    private PasswordField confirmNewPassword;
    @FXML
    private TextArea expDetails;
    @FXML
    private TextArea expDetails2;
    @FXML
    private TextArea expDetails3;
    @FXML
    private TextArea expDetails4;
    @FXML
    private TextArea expDetails5;
    @FXML
    private TextArea objective;
    @FXML
    private TextArea profileAddress;
    @FXML
    private TextArea projectDescrip;
    @FXML
    private TextArea projectDescrip2;
    @FXML
    private TextArea projectDescrip3;
    @FXML
    private TextArea projectDescrip4;
    @FXML
    private TextArea projectDescrip5;
    @FXML
    private DatePicker profileDOB;
    @FXML
    private DatePicker expEndDate;
    @FXML
    private DatePicker expEndDate2;
    @FXML
    private DatePicker expEndDate3;
    @FXML
    private DatePicker expEndDate4;
    @FXML
    private DatePicker expEndDate5;
    @FXML
    private DatePicker expStartDate;
    @FXML
    private DatePicker expStartDate2;
    @FXML
    private DatePicker expStartDate3;
    @FXML
    private DatePicker expStartDate4;
    @FXML
    private DatePicker expStartDate5;
    @FXML
    private AnchorPane leftForm_Home;
    @FXML
    private AnchorPane rightForm_CVP;
    @FXML
    private AnchorPane rightForm_ECV;
    @FXML
    private AnchorPane rightForm_Home;
    @FXML
    private AnchorPane rightForm_Temp;
    @FXML
    private AnchorPane rightForm_Temp1;
    @FXML
    private AnchorPane rightForm_Help;
    @FXML
    private AnchorPane rightForm_Setting;
    @FXML
    private AnchorPane topForm_Home;
    @FXML
    private AnchorPane topForm_CVP;
    @FXML
    private Accordion eduAccord;
    @FXML
    private Accordion expAccord;
    @FXML
    private Accordion skillAccord;
    @FXML
    private Accordion achieveAccord;
    @FXML
    private Accordion projectAccord;
    @FXML
    private Accordion langAccord;
    @FXML
    private Accordion refAccord;
    @FXML
    private TitledPane langForm;
    @FXML
    private TitledPane langForm2;
    @FXML
    private TitledPane langForm3;
    @FXML
    private TitledPane langForm4;
    @FXML
    private TitledPane langForm5;
    @FXML
    private TitledPane achieveForm;
    @FXML
    private TitledPane achieveForm2;
    @FXML
    private TitledPane achieveForm3;
    @FXML
    private TitledPane achieveForm4;
    @FXML
    private TitledPane achieveForm5;
    @FXML
    private TitledPane achieveForm6;
    @FXML
    private TitledPane achieveForm7;
    @FXML
    private TitledPane achieveForm8;
    @FXML
    private TitledPane achieveForm9;
    @FXML
    private TitledPane achieveForm10;
    @FXML
    private TitledPane eduForm;
    @FXML
    private TitledPane eduForm2;
    @FXML
    private TitledPane eduForm3;
    @FXML
    private TitledPane eduForm4;
    @FXML
    private TitledPane eduForm5;
    @FXML
    private TitledPane eduForm6;
    @FXML
    private TitledPane expForm;
    @FXML
    private TitledPane expForm2;
    @FXML
    private TitledPane expForm3;
    @FXML
    private TitledPane expForm4;
    @FXML
    private TitledPane expForm5;
    @FXML
    private TitledPane projectForm;
    @FXML
    private TitledPane projectForm2;
    @FXML
    private TitledPane projectForm3;
    @FXML
    private TitledPane projectForm4;
    @FXML
    private TitledPane projectForm5;
    @FXML
    private TitledPane refForm;
    @FXML
    private TitledPane refForm2;
    @FXML
    private TitledPane skillForm;
    @FXML
    private TitledPane skillForm2;
    @FXML
    private TitledPane skillForm3;
    @FXML
    private TitledPane skillForm4;
    @FXML
    private TitledPane skillForm5;
    @FXML
    private TitledPane skillForm6;
    @FXML
    private TitledPane skillForm7;
    @FXML
    private TitledPane skillForm8;
    @FXML
    private TitledPane skillForm9;
    @FXML
    private TitledPane skillForm10;
    @FXML
    private TitledPane passwordForm;
    @FXML
    private Tab tab1;
    @FXML
    private TabPane tabPane;
    @FXML
    private ScrollPane profileScroll;
    @FXML
    private ScrollPane eduScroll;
    @FXML
    private ScrollPane expScroll;
    @FXML
    private ScrollPane skillScroll;
    @FXML
    private ScrollPane achieveScroll;
    @FXML
    private ScrollPane projectScroll;
    @FXML
    private ScrollPane langScroll;
    @FXML
    private ScrollPane objectScroll;
    @FXML
    private ScrollPane refScroll;
    @FXML
    private ScrollPane tempScroll;
    @FXML
    private ScrollPane helpScroll;
    @FXML
    private ScrollPane settingScroll;
    @FXML
    private Label emailLabel;
    @FXML
    private Label emailLabel2;
    @FXML
    private Label usernameLabel;
    @FXML
    private Label usernameLabel2;
    @FXML
    private Label pageName;
    @FXML
    private ImageView CV1;
    @FXML
    private ImageView CV2;
    @FXML
    private ImageView CV3;
    @FXML
    private ImageView CV4;
    @FXML
    private ImageView CV5;
    @FXML
    private ImageView CV6;
    @FXML
    private ImageView profileID;
    @FXML
    private ImageView accountID;
    @FXML
    private ImageView accountIDView;

    public void closeBtnClick(ActionEvent event) {
        Toolkit.getDefaultToolkit().beep();
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

    public void backToLogin() {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Confirmation");
        alert.setHeaderText(null);
        alert.setContentText("Are you sure you want to logout?");
        Optional<ButtonType> result = alert.showAndWait();
        try {
            if (result.get() == ButtonType.OK) {
                backBtn.getScene().getWindow().hide();
                logoutBtn.getScene().getWindow().hide();
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
            else if (result.get() == ButtonType.CANCEL) {
                alert.close();
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void closeBtn1Click(ActionEvent event) {
        Stage stage = (Stage) closeBtn1.getScene().getWindow();
        stage.close();
    }

    public void profileReset() {
        profileName.setText("");
        profileAddress.setText("");
        profileEmail.setText("");
        profilePhone.setText("");
        profileDOB.setValue(null);
        profileGender.setValue(null);
        profileMaritalStatus.setValue(null);
        profileNationality.setText("");
        profileProfession.setText("");
        profileLinkedin.setText("");
        profileGithub.setText("");
        profileID.setImage(null);
        recID.setStyle(null);
        IDIcon.setVisible(true);
        profileName.setStyle(null);
        profileAddress.setStyle(null);
        profileEmail.setStyle(null);
        profilePhone.setStyle(null);
        profileDOB.setStyle(null);
        eduCourse.setText("");
        eduCourse2.setText("");
        eduCourse3.setText("");
        eduCourse4.setText("");
        eduCourse5.setText("");
        eduCourse6.setText("");
        eduSchool.setText("");
        eduSchool2.setText("");
        eduSchool3.setText("");
        eduSchool4.setText("");
        eduSchool5.setText("");
        eduSchool6.setText("");
        eduYear.setText("");
        eduYear2.setText("");
        eduYear3.setText("");
        eduYear4.setText("");
        eduYear5.setText("");
        eduYear6.setText("");
        expJob.setText("");
        expJob2.setText("");
        expJob3.setText("");
        expJob4.setText("");
        expJob5.setText("");
        expCompany.setText("");
        expCompany2.setText("");
        expCompany3.setText("");
        expCompany4.setText("");
        expCompany5.setText("");
        expStartDate.setValue(null);
        expStartDate2.setValue(null);
        expStartDate3.setValue(null);
        expStartDate4.setValue(null);
        expStartDate5.setValue(null);
        expEndDate.setValue(null);
        expEndDate2.setValue(null);
        expEndDate3.setValue(null);
        expEndDate4.setValue(null);
        expEndDate5.setValue(null);
        expDetails.setText("");
        expDetails2.setText("");
        expDetails3.setText("");
        expDetails4.setText("");
        expDetails5.setText("");
        skillName.setText("");
        skillName2.setText("");
        skillName3.setText("");
        skillName4.setText("");
        skillName5.setText("");
        skillName6.setText("");
        skillName7.setText("");
        skillName8.setText("");
        skillName9.setText("");
        skillName10.setText("");
        skill.selectToggle(null);
        skill2.selectToggle(null);
        skill3.selectToggle(null);
        skill4.selectToggle(null);
        skill5.selectToggle(null);
        skill6.selectToggle(null);
        skill7.selectToggle(null);
        skill8.selectToggle(null);
        skill9.selectToggle(null);
        skill10.selectToggle(null);
        achieveName.setText("");
        achieveName2.setText("");
        achieveName3.setText("");
        achieveName4.setText("");
        achieveName5.setText("");
        achieveName6.setText("");
        achieveName7.setText("");
        achieveName8.setText("");
        achieveName9.setText("");
        achieveName10.setText("");
        achieveYear.setText("");
        achieveYear2.setText("");
        achieveYear3.setText("");
        achieveYear4.setText("");
        achieveYear5.setText("");
        achieveYear6.setText("");
        achieveYear7.setText("");
        achieveYear8.setText("");
        achieveYear9.setText("");
        achieveYear10.setText("");
        projectTitle.setText("");
        projectTitle2.setText("");
        projectTitle3.setText("");
        projectTitle4.setText("");
        projectTitle5.setText("");
        projectDescrip.setText("");
        projectDescrip2.setText("");
        projectDescrip3.setText("");
        projectDescrip4.setText("");
        projectDescrip5.setText("");
        langName.setText("");
        langName2.setText("");
        langName3.setText("");
        langName4.setText("");
        langName5.setText("");
        objective.setText("");
        refName.setText("");
        refName2.setText("");
        refJob.setText("");
        refJob2.setText("");
        refCompany.setText("");
        refCompany2.setText("");
        refEmail.setText("");
        refEmail2.setText("");
        refPhone.setText("");
        refPhone2.setText("");
        eduAddBtn.setVisible(false);
        eduAddBtn2.setVisible(true);
        eduAddBtn3.setVisible(false);
        eduAddBtn4.setVisible(false);
        eduAddBtn5.setVisible(false);
        eduAddBtn6.setVisible(false);
        expAddBtn.setVisible(false);
        expAddBtn2.setVisible(true);
        expAddBtn3.setVisible(false);
        expAddBtn4.setVisible(false);
        expAddBtn5.setVisible(false);
        skillAddBtn.setVisible(false);
        skillAddBtn2.setVisible(true);
        skillAddBtn3.setVisible(false);
        skillAddBtn4.setVisible(false);
        skillAddBtn5.setVisible(false);
        skillAddBtn6.setVisible(false);
        skillAddBtn7.setVisible(false);
        skillAddBtn8.setVisible(false);
        skillAddBtn9.setVisible(false);
        skillAddBtn10.setVisible(false);
        achieveAddBtn.setVisible(false);
        achieveAddBtn2.setVisible(true);
        achieveAddBtn3.setVisible(false);
        achieveAddBtn4.setVisible(false);
        achieveAddBtn5.setVisible(false);
        achieveAddBtn6.setVisible(false);
        achieveAddBtn7.setVisible(false);
        achieveAddBtn8.setVisible(false);
        achieveAddBtn9.setVisible(false);
        achieveAddBtn10.setVisible(false);
        projectAddBtn.setVisible(false);
        projectAddBtn2.setVisible(true);
        projectAddBtn3.setVisible(false);
        projectAddBtn4.setVisible(false);
        projectAddBtn5.setVisible(false);
        langAddBtn.setVisible(false);
        langAddBtn2.setVisible(true);
        langAddBtn3.setVisible(false);
        langAddBtn4.setVisible(false);
        langAddBtn5.setVisible(false);
        refAddBtn.setVisible(false);
        refAddBtn2.setVisible(true);
        tabPane.getSelectionModel().select(tab1);
        profileScroll.setVvalue(0);
        eduScroll.setVvalue(0);
        expScroll.setVvalue(0);
        skillScroll.setVvalue(0);
        achieveScroll.setVvalue(0);
        projectScroll.setVvalue(0);
        langScroll.setVvalue(0);
        objectScroll.setVvalue(0);
        refScroll.setVvalue(0);
        eduAccord.getPanes().clear();
        expAccord.getPanes().clear();
        skillAccord.getPanes().clear();
        achieveAccord.getPanes().clear();
        projectAccord.getPanes().clear();
        langAccord.getPanes().clear();
        refAccord.getPanes().clear();
        eduAccord.getPanes().add(eduForm);
        eduForm.setExpanded(true);
        expAccord.getPanes().add(expForm);
        expForm.setExpanded(true);
        skillAccord.getPanes().add(skillForm);
        skillForm.setExpanded(true);
        achieveAccord.getPanes().add(achieveForm);
        achieveForm.setExpanded(true);
        projectAccord.getPanes().add(projectForm);
        projectForm.setExpanded(true);
        langAccord.getPanes().add(langForm);
        langForm.setExpanded(true);
        refAccord.getPanes().add(refForm);
        refForm.setExpanded(true);
        passwordForm.setVisible(false);
        currentPassword.setText("");
        newPassword.setText("");
        confirmNewPassword.setText("");
        currentPassword.setStyle(null);
        newPassword.setStyle(null);
        confirmNewPassword.setStyle(null);
    }

    public void switchForm(ActionEvent event){
        if(event.getSource() == homeBtn){
            topForm_Home.setVisible(true);
            leftForm_Home.setVisible(true);
            rightForm_Home.setVisible(true);
            rightForm_CVP.setVisible(false);
            rightForm_ECV.setVisible(false);
            rightForm_Temp.setVisible(false);
            rightForm_Help.setVisible(false);
            rightForm_Setting.setVisible(false);
            topForm_CVP.setVisible(false);
            homeBtn.setStyle("-fx-background-color: linear-gradient(to top, #21a7ae, #0a5a55); -fx-background-radius: 12px");
            templateBtn.setStyle(null);
            helpBtn.setStyle(null);
            settingBtn.setStyle(null);
            pageName.setText("Home");
            passwordForm.setVisible(false);
            currentPassword.setText("");
            newPassword.setText("");
            confirmNewPassword.setText("");
            currentPassword.setStyle(null);
            newPassword.setStyle(null);
            confirmNewPassword.setStyle(null);

        } else if (event.getSource() == CVPBtn) {
            profileName.setStyle(null);
            profileAddress.setStyle(null);
            profileEmail.setStyle(null);
            profilePhone.setStyle(null);
            profileDOB.setStyle(null);
            topForm_Home.setVisible(false);
            leftForm_Home.setVisible(false);
            rightForm_Home.setVisible(false);
            rightForm_CVP.setVisible(true);
            rightForm_ECV.setVisible(false);
            rightForm_Temp.setVisible(false);
            rightForm_Help.setVisible(false);
            rightForm_Setting.setVisible(false);
            topForm_CVP.setVisible(true);
            profileUpdateBtn.setVisible(false);
            profileSaveBtn.setVisible(true);
            backBtn1.setVisible(true);
            backBtn2.setVisible(false);
            profileName.setDisable(false);
            profileResetBtn.setDisable(false);
            profileReset();
            setFileNull();

        }else if (event.getSource() == ECVBtn) {
            topForm_Home.setVisible(true);
            leftForm_Home.setVisible(true);
            rightForm_Home.setVisible(false);
            rightForm_CVP.setVisible(false);
            rightForm_ECV.setVisible(true);
            rightForm_Temp.setVisible(false);
            rightForm_Help.setVisible(false);
            rightForm_Setting.setVisible(false);
            topForm_CVP.setVisible(false);
            pageName.setText("Edit CV");
            profileReset();

        }else if (event.getSource() == templateBtn) {
            topForm_Home.setVisible(true);
            leftForm_Home.setVisible(true);
            rightForm_Home.setVisible(false);
            rightForm_CVP.setVisible(false);
            rightForm_ECV.setVisible(false);
            rightForm_Temp.setVisible(true);
            rightForm_Help.setVisible(false);
            rightForm_Setting.setVisible(false);
            topForm_CVP.setVisible(false);
            templateBtn.setStyle("-fx-background-color: linear-gradient(to top, #21a7ae, #0a5a55); -fx-background-radius: 12px");
            homeBtn.setStyle(null);
            helpBtn.setStyle(null);
            settingBtn.setStyle(null);
            pageName.setText("Templates");
            tempScroll.setVvalue(0);
            passwordForm.setVisible(false);
            currentPassword.setText("");
            newPassword.setText("");
            confirmNewPassword.setText("");
            currentPassword.setStyle(null);
            newPassword.setStyle(null);
            confirmNewPassword.setStyle(null);

        }else if (event.getSource() == helpBtn) {
            topForm_Home.setVisible(true);
            leftForm_Home.setVisible(true);
            rightForm_Home.setVisible(false);
            rightForm_CVP.setVisible(false);
            rightForm_ECV.setVisible(false);
            rightForm_Temp.setVisible(false);
            rightForm_Help.setVisible(true);
            rightForm_Setting.setVisible(false);
            topForm_CVP.setVisible(false);
            helpBtn.setStyle("-fx-background-color: linear-gradient(to top, #21a7ae, #0a5a55); -fx-background-radius: 12px");
            homeBtn.setStyle(null);
            templateBtn.setStyle(null);
            settingBtn.setStyle(null);
            pageName.setText("Help");
            helpScroll.setVvalue(0);
            passwordForm.setVisible(false);
            currentPassword.setText("");
            newPassword.setText("");
            confirmNewPassword.setText("");
            currentPassword.setStyle(null);
            newPassword.setStyle(null);
            confirmNewPassword.setStyle(null);

        }else if (event.getSource() == settingBtn) {
            topForm_Home.setVisible(true);
            leftForm_Home.setVisible(true);
            rightForm_Home.setVisible(false);
            rightForm_CVP.setVisible(false);
            rightForm_ECV.setVisible(false);
            rightForm_Temp.setVisible(false);
            rightForm_Help.setVisible(false);
            rightForm_Setting.setVisible(true);
            topForm_CVP.setVisible(false);
            settingBtn.setStyle("-fx-background-color: linear-gradient(to top, #21a7ae, #0a5a55); -fx-background-radius: 12px");
            homeBtn.setStyle(null);
            templateBtn.setStyle(null);
            helpBtn.setStyle(null);
            pageName.setText("Settings");
            settingScroll.setVvalue(0);
            passwordForm.setVisible(false);
            currentPassword.setText("");
            newPassword.setText("");
            confirmNewPassword.setText("");
            currentPassword.setStyle(null);
            newPassword.setStyle(null);
            confirmNewPassword.setStyle(null);

        }else if (event.getSource() == backBtn1) {
            topForm_Home.setVisible(true);
            leftForm_Home.setVisible(true);
            rightForm_Home.setVisible(true);
            rightForm_CVP.setVisible(false);
            rightForm_ECV.setVisible(false);
            rightForm_Temp.setVisible(false);
            rightForm_Help.setVisible(false);
            rightForm_Setting.setVisible(false);
            topForm_CVP.setVisible(false);
            homeBtn.setStyle("-fx-background-color: linear-gradient(to top, #21a7ae, #0a5a55); -fx-background-radius: 12px");
            templateBtn.setStyle(null);
            helpBtn.setStyle(null);
            settingBtn.setStyle(null);
            pageName.setText("Home");

        } else if (event.getSource() == backBtn2) {
            topForm_Home.setVisible(true);
            leftForm_Home.setVisible(true);
            rightForm_Home.setVisible(false);
            rightForm_CVP.setVisible(false);
            rightForm_ECV.setVisible(true);
            rightForm_Temp.setVisible(false);
            rightForm_Help.setVisible(false);
            rightForm_Setting.setVisible(false);
            topForm_CVP.setVisible(false);
            homeBtn.setStyle("-fx-background-color: linear-gradient(to top, #21a7ae, #0a5a55); -fx-background-radius: 12px");
            templateBtn.setStyle(null);
            helpBtn.setStyle(null);
            settingBtn.setStyle(null);
            pageName.setText("Edit CV");
        }
    }

    public String levelName = null;
    public String levelName2 = null;
    public String levelName3 = null;
    public String levelName4 = null;
    public String levelName5 = null;
    public String levelName6 = null;
    public String levelName7 = null;
    public String levelName8 = null;
    public String levelName9 = null;
    public String levelName10 = null;
    public void radioBtnClick(ActionEvent event) {
        if(skill.getSelectedToggle() == skillLevel1) {
            levelName = skillLevel1.getText();
        }
        else if(skill.getSelectedToggle() == skillLevel2) {
            levelName = skillLevel2.getText();
        }
        else if(skill.getSelectedToggle() == skillLevel3) {
            levelName = skillLevel3.getText();
        }
        else if(skill.getSelectedToggle() == skillLevel4) {
            levelName = skillLevel4.getText();
        }
    }
    public void radioBtnClick2(ActionEvent event) {
        if(skill2.getSelectedToggle() == skillLevel2_1) {
            levelName2 = skillLevel2_1.getText();
        }
        else if(skill2.getSelectedToggle() == skillLevel2_2) {
            levelName2 = skillLevel2_2.getText();
        }
        else if(skill2.getSelectedToggle() == skillLevel2_3) {
            levelName2 = skillLevel2_3.getText();
        }
        else if(skill2.getSelectedToggle() == skillLevel2_4) {
            levelName2 = skillLevel2_4.getText();
        }
    }
    public void radioBtnClick3(ActionEvent event) {
        if(skill3.getSelectedToggle() == skillLevel3_1) {
            levelName3 = skillLevel3_1.getText();
        }
        else if(skill3.getSelectedToggle() == skillLevel3_2) {
            levelName3 = skillLevel3_2.getText();
        }
        else if(skill3.getSelectedToggle() == skillLevel3_3) {
            levelName3 = skillLevel3_3.getText();
        }
        else if(skill3.getSelectedToggle() == skillLevel3_4) {
            levelName3 = skillLevel3_4.getText();
        }
    }
    public void radioBtnClick4(ActionEvent event) {
        if(skill4.getSelectedToggle() == skillLevel4_1) {
            levelName4 = skillLevel4_1.getText();
        }
        else if(skill4.getSelectedToggle() == skillLevel4_2) {
            levelName4 = skillLevel4_2.getText();
        }
        else if(skill4.getSelectedToggle() == skillLevel4_3) {
            levelName4 = skillLevel4_3.getText();
        }
        else if(skill4.getSelectedToggle() == skillLevel4_4) {
            levelName4 = skillLevel4_4.getText();
        }
    }
    public void radioBtnClick5(ActionEvent event) {
        if(skill5.getSelectedToggle() == skillLevel5_1) {
            levelName5 = skillLevel5_1.getText();
        }
        else if(skill5.getSelectedToggle() == skillLevel5_2) {
            levelName5 = skillLevel5_2.getText();
        }
        else if(skill5.getSelectedToggle() == skillLevel5_3) {
            levelName5 = skillLevel5_3.getText();
        }
        else if(skill5.getSelectedToggle() == skillLevel5_4) {
            levelName5 = skillLevel5_4.getText();
        }
    }
    public void radioBtnClick6(ActionEvent event) {
        if(skill6.getSelectedToggle() == skillLevel6_1) {
            levelName6 = skillLevel6_1.getText();
        }
        else if(skill6.getSelectedToggle() == skillLevel6_2) {
            levelName6 = skillLevel6_2.getText();
        }
        else if(skill6.getSelectedToggle() == skillLevel6_3) {
            levelName6 = skillLevel6_3.getText();
        }
        else if(skill6.getSelectedToggle() == skillLevel6_4) {
            levelName6 = skillLevel6_4.getText();
        }
    }
    public void radioBtnClick7(ActionEvent event) {
        if(skill7.getSelectedToggle() == skillLevel7_1) {
            levelName7 = skillLevel7_1.getText();
        }
        else if(skill7.getSelectedToggle() == skillLevel7_2) {
            levelName7 = skillLevel7_2.getText();
        }
        else if(skill7.getSelectedToggle() == skillLevel7_3) {
            levelName7 = skillLevel7_3.getText();
        }
        else if(skill7.getSelectedToggle() == skillLevel7_4) {
            levelName7 = skillLevel7_4.getText();
        }
    }
    public void radioBtnClick8(ActionEvent event) {
        if(skill8.getSelectedToggle() == skillLevel8_1) {
            levelName8 = skillLevel8_1.getText();
        }
        else if(skill8.getSelectedToggle() == skillLevel8_2) {
            levelName8 = skillLevel8_2.getText();
        }
        else if(skill8.getSelectedToggle() == skillLevel8_3) {
            levelName8 = skillLevel8_3.getText();
        }
        else if(skill8.getSelectedToggle() == skillLevel8_4) {
            levelName8 = skillLevel8_4.getText();
        }
    }
    public void radioBtnClick9(ActionEvent event) {
        if(skill9.getSelectedToggle() == skillLevel9_1) {
            levelName9 = skillLevel9_1.getText();
        }
        else if(skill9.getSelectedToggle() == skillLevel9_2) {
            levelName9 = skillLevel9_2.getText();
        }
        else if(skill9.getSelectedToggle() == skillLevel9_3) {
            levelName9 = skillLevel9_3.getText();
        }
        else if(skill9.getSelectedToggle() == skillLevel9_4) {
            levelName9 = skillLevel9_4.getText();
        }
    }
    public void radioBtnClick10(ActionEvent event) {
        if(skill10.getSelectedToggle() == skillLevel10_1) {
            levelName10 = skillLevel10_1.getText();
        }
        else if(skill10.getSelectedToggle() == skillLevel10_2) {
            levelName10 = skillLevel10_2.getText();
        }
        else if(skill10.getSelectedToggle() == skillLevel10_3) {
            levelName10 = skillLevel10_3.getText();
        }
        else if(skill10.getSelectedToggle() == skillLevel10_4) {
            levelName10 = skillLevel10_4.getText();
        }
    }

    private File file = null;
    public void setFileNull() {
        file = null;
    }

    public void addIDBtnClick(ActionEvent event) {
        if (event.getSource() == AddIDBtn ) {
            FileChooser fileChooser = new FileChooser();
            fileChooser.setTitle("Open Image File");
            FileChooser.ExtensionFilter imageFilter = new FileChooser.ExtensionFilter("All Images", "*.jpg", "*.jpeg", "*.png");
            FileChooser.ExtensionFilter pngFilter = new FileChooser.ExtensionFilter("PNG",  "*.png");
            FileChooser.ExtensionFilter jpgFilter = new FileChooser.ExtensionFilter("JPG", "*.jpg");
            FileChooser.ExtensionFilter jpegFilter = new FileChooser.ExtensionFilter("JPEG", "*.jpeg");
            fileChooser.getExtensionFilters().addAll(imageFilter,pngFilter,jpgFilter,jpegFilter);
            file = fileChooser.showOpenDialog(null);
            if(file != null) {
                if (file.length() > 1000000) {
                    Toolkit.getDefaultToolkit().beep();
                    Alert alert = new Alert(Alert.AlertType.ERROR);
                    alert.setTitle("Error");
                    alert.setHeaderText(null);
                    alert.setContentText("File is too large. \nSelect a file less than 1MB");
                    alert.showAndWait();
                } else {
                    try {
                        Image image = new Image(file.toURI().toString(), 132, 150, false, true);
                        profileID.setImage(null);
                        profileID.setImage(image);
                        recID.setStyle("-fx-fill: transparent; -fx-background-color: transparent;");
                        IDIcon.setVisible(false);
                    }catch (Exception e) {
                        Logger.getLogger(dashboardController.class.getName()).log(Level.SEVERE, null, e);
                    }
                }
            }
        }
    }

    public void removeIDBtnClick(ActionEvent event) {
        if (event.getSource() == RemoveIDBtn) {
            if(profileID.getImage() != null) {
                setFileNull();
                profileID.setImage(null);
                recID.setStyle(null);
                IDIcon.setVisible(true);
            }
        }
    }

    public void profileResetBtnClick(ActionEvent event) {
        if(event.getSource() == profileResetBtn) {
            if(profileName.getText() != null || profileAddress.getText() != null || profileEmail.getText() != null
                    || profilePhone.getText() != null || profileDOB.getValue() != null || profileGender.getValue() != null
                    || profileMaritalStatus.getValue() != null || profileNationality.getText() != null || profileProfession.getText() != null
                    || profileLinkedin.getText() != null || profileGithub.getText() != null || profileID.getImage() != null) {
                profileName.setText("");
                profileAddress.setText("");
                profileEmail.setText("");
                profilePhone.setText("");
                profileDOB.setValue(null);
                profileGender.setValue(null);
                profileMaritalStatus.setValue(null);
                profileNationality.setText("");
                profileProfession.setText("");
                profileLinkedin.setText("");
                profileGithub.setText("");
                profileID.setImage(null);
                recID.setStyle(null);
                IDIcon.setVisible(true);
                profileName.setStyle(null);
                profileAddress.setStyle(null);
                profileEmail.setStyle(null);
                profilePhone.setStyle(null);
                profileDOB.setStyle(null);
            }
        }
    }

    public void objectiveClearBtnClick(ActionEvent event) {
        if(event.getSource() == objectiveClearBtn) {
            if(objective.getText() != null){
                objective.setText("");
            }
        }
    }

    public void setEduFormClick(ActionEvent event) {
         if (event.getSource() == eduAddBtn) {
            eduAccord.getPanes().add(eduForm);
            eduForm.setExpanded(true);
            eduAddBtn.setVisible(false);
            eduAddBtn2.setVisible(true);
        } else if(event.getSource() == eduAddBtn2) {
            eduAccord.getPanes().add(eduForm2);
            eduForm.setExpanded(false);
            eduForm2.setExpanded(true);
            eduAddBtn2.setVisible(false);
            eduAddBtn3.setVisible(true);
            eduCloseBtn.setDisable(true);
        } else if (event.getSource() == eduAddBtn3) {
            eduAccord.getPanes().add(eduForm3);
            eduForm2.setExpanded(false);
            eduForm3.setExpanded(true);
            eduAddBtn3.setVisible(false);
            eduAddBtn4.setVisible(true);
            eduCloseBtn2.setDisable(true);
        } else if (event.getSource() == eduAddBtn4) {
            eduAccord.getPanes().add(eduForm4);
            eduForm3.setExpanded(false);
            eduForm4.setExpanded(true);
            eduAddBtn4.setVisible(false);
            eduAddBtn5.setVisible(true);
            eduCloseBtn3.setDisable(true);
        } else if (event.getSource() == eduAddBtn5) {
            eduAccord.getPanes().add(eduForm5);
            eduForm4.setExpanded(false);
            eduForm5.setExpanded(true);
            eduAddBtn5.setVisible(false);
            eduAddBtn6.setVisible(true);
            eduCloseBtn4.setDisable(true);
        } else if (event.getSource() == eduAddBtn6) {
            eduAccord.getPanes().add(eduForm6);
            eduForm5.setExpanded(false);
            eduForm6.setExpanded(true);
            eduAddBtn6.setVisible(false);
            eduCloseBtn5.setDisable(true);
        } else if (event.getSource() == eduCloseBtn6) {
            eduAccord.getPanes().remove(eduForm6);
            eduAddBtn6.setVisible(true);
            eduCloseBtn5.setDisable(false);
        } else if (event.getSource() == eduCloseBtn5) {
            eduAccord.getPanes().remove(eduForm5);
            eduAddBtn6.setVisible(false);
            eduAddBtn5.setVisible(true);
            eduCloseBtn4.setDisable(false);
        } else if (event.getSource() == eduCloseBtn4) {
            eduAccord.getPanes().remove(eduForm4);
            eduAddBtn5.setVisible(false);
            eduAddBtn4.setVisible(true);
            eduCloseBtn3.setDisable(false);
        } else if (event.getSource() == eduCloseBtn3) {
            eduAccord.getPanes().remove(eduForm3);
            eduAddBtn4.setVisible(false);
            eduAddBtn3.setVisible(true);
            eduCloseBtn2.setDisable(false);
        } else if (event.getSource() == eduCloseBtn2) {
            eduAccord.getPanes().remove(eduForm2);
            eduAddBtn3.setVisible(false);
            eduAddBtn2.setVisible(true);
            eduCloseBtn.setDisable(false);
        } else if (event.getSource() == eduCloseBtn) {
            eduAccord.getPanes().remove(eduForm);
            eduAddBtn2.setVisible(false);
            eduAddBtn.setVisible(true);
        }
    }

    public void setExpFormClick(ActionEvent event) {
        if (event.getSource() == expAddBtn) {
            expAccord.getPanes().add(expForm);
            expForm.setExpanded(true);
            expAddBtn.setVisible(false);
            expAddBtn2.setVisible(true);
        } else if(event.getSource() == expAddBtn2) {
            expAccord.getPanes().add(expForm2);
            expForm.setExpanded(false);
            expForm2.setExpanded(true);
            expAddBtn2.setVisible(false);
            expAddBtn3.setVisible(true);
            expCloseBtn.setDisable(true);
        } else if (event.getSource() == expAddBtn3) {
            expAccord.getPanes().add(expForm3);
            expForm2.setExpanded(false);
            expForm3.setExpanded(true);
            expAddBtn3.setVisible(false);
            expAddBtn4.setVisible(true);
            expCloseBtn2.setDisable(true);
        } else if (event.getSource() == expAddBtn4) {
            expAccord.getPanes().add(expForm4);
            expForm3.setExpanded(false);
            expForm4.setExpanded(true);
            expAddBtn4.setVisible(false);
            expAddBtn5.setVisible(true);
            expCloseBtn3.setDisable(true);
        } else if (event.getSource() == expAddBtn5) {
            expAccord.getPanes().add(expForm5);
            expForm4.setExpanded(false);
            expForm5.setExpanded(true);
            expAddBtn5.setVisible(false);
            expCloseBtn4.setDisable(true);
        } else if (event.getSource() == expCloseBtn5) {
            expAccord.getPanes().remove(expForm5);
            expAddBtn5.setVisible(true);
            expCloseBtn4.setDisable(false);
        } else if (event.getSource() == expCloseBtn4) {
            expAccord.getPanes().remove(expForm4);
            expAddBtn5.setVisible(false);
            expAddBtn4.setVisible(true);
            expCloseBtn3.setDisable(false);
        } else if (event.getSource() == expCloseBtn3) {
            expAccord.getPanes().remove(expForm3);
            expAddBtn4.setVisible(false);
            expAddBtn3.setVisible(true);
            expCloseBtn2.setDisable(false);
        } else if (event.getSource() == expCloseBtn2) {
            expAccord.getPanes().remove(expForm2);
            expAddBtn3.setVisible(false);
            expAddBtn2.setVisible(true);
            expCloseBtn.setDisable(false);
        } else if (event.getSource() == expCloseBtn) {
            expAccord.getPanes().remove(expForm);
            expAddBtn2.setVisible(false);
            expAddBtn.setVisible(true);
        }
    }

    public void setSkillFormClick(ActionEvent event) {
        if (event.getSource() == skillAddBtn) {
            skillAccord.getPanes().add(skillForm);
            skillForm.setExpanded(true);
            skillAddBtn.setVisible(false);
            skillAddBtn2.setVisible(true);
        } else if(event.getSource() == skillAddBtn2) {
            skillAccord.getPanes().add(skillForm2);
            skillForm.setExpanded(false);
            skillForm2.setExpanded(true);
            skillAddBtn2.setVisible(false);
            skillAddBtn3.setVisible(true);
            skillCloseBtn.setDisable(true);
        } else if (event.getSource() == skillAddBtn3) {
            skillAccord.getPanes().add(skillForm3);
            skillForm2.setExpanded(false);
            skillForm3.setExpanded(true);
            skillAddBtn3.setVisible(false);
            skillAddBtn4.setVisible(true);
            skillCloseBtn2.setDisable(true);
        } else if (event.getSource() == skillAddBtn4) {
            skillAccord.getPanes().add(skillForm4);
            skillForm3.setExpanded(false);
            skillForm4.setExpanded(true);
            skillAddBtn4.setVisible(false);
            skillAddBtn5.setVisible(true);
            skillCloseBtn3.setDisable(true);
        } else if (event.getSource() == skillAddBtn5) {
            skillAccord.getPanes().add(skillForm5);
            skillForm4.setExpanded(false);
            skillForm5.setExpanded(true);
            skillAddBtn5.setVisible(false);
            skillAddBtn6.setVisible(true);
            skillCloseBtn4.setDisable(true);
        } else if (event.getSource() == skillAddBtn6) {
            skillAccord.getPanes().add(skillForm6);
            skillForm5.setExpanded(false);
            skillForm6.setExpanded(true);
            skillAddBtn6.setVisible(false);
            skillAddBtn7.setVisible(true);
            skillCloseBtn5.setDisable(true);
        } else if (event.getSource() == skillAddBtn7) {
            skillAccord.getPanes().add(skillForm7);
            skillForm6.setExpanded(false);
            skillForm7.setExpanded(true);
            skillAddBtn7.setVisible(false);
            skillAddBtn8.setVisible(true);
            skillCloseBtn6.setDisable(true);
        } else if (event.getSource() == skillAddBtn8) {
            skillAccord.getPanes().add(skillForm8);
            skillForm7.setExpanded(false);
            skillForm8.setExpanded(true);
            skillAddBtn8.setVisible(false);
            skillAddBtn9.setVisible(true);
            skillCloseBtn7.setDisable(true);
        } else if (event.getSource() == skillAddBtn9) {
            skillAccord.getPanes().add(skillForm9);
            skillForm8.setExpanded(false);
            skillForm9.setExpanded(true);
            skillAddBtn9.setVisible(false);
            skillAddBtn10.setVisible(true);
            skillCloseBtn8.setDisable(true);
        } else if (event.getSource() == skillAddBtn10) {
            skillAccord.getPanes().add(skillForm10);
            skillForm9.setExpanded(false);
            skillForm10.setExpanded(true);
            skillAddBtn10.setVisible(false);
            skillCloseBtn9.setDisable(true);
        } else if (event.getSource() == skillCloseBtn10) {
            skillAccord.getPanes().remove(skillForm10);
            skillAddBtn10.setVisible(true);
            skillCloseBtn9.setDisable(false);
        } else if (event.getSource() == skillCloseBtn9) {
            skillAccord.getPanes().remove(skillForm9);
            skillAddBtn10.setVisible(false);
            skillAddBtn9.setVisible(true);
            skillCloseBtn8.setDisable(false);
        } else if (event.getSource() == skillCloseBtn8) {
            skillAccord.getPanes().remove(skillForm8);
            skillAddBtn9.setVisible(false);
            skillAddBtn8.setVisible(true);
            skillCloseBtn7.setDisable(false);
        } else if (event.getSource() == skillCloseBtn7) {
            skillAccord.getPanes().remove(skillForm7);
            skillAddBtn8.setVisible(false);
            skillAddBtn7.setVisible(true);
            skillCloseBtn6.setDisable(false);
        } else if (event.getSource() == skillCloseBtn6) {
            skillAccord.getPanes().remove(skillForm6);
            skillAddBtn7.setVisible(false);
            skillAddBtn6.setVisible(true);
            skillCloseBtn5.setDisable(false);
        } else if (event.getSource() == skillCloseBtn5) {
            skillAccord.getPanes().remove(skillForm5);
            skillAddBtn6.setVisible(false);
            skillAddBtn5.setVisible(true);
            skillCloseBtn4.setDisable(false);
        } else if (event.getSource() == skillCloseBtn4) {
            skillAccord.getPanes().remove(skillForm4);
            skillAddBtn5.setVisible(false);
            skillAddBtn4.setVisible(true);
            skillCloseBtn3.setDisable(false);
        } else if (event.getSource() == skillCloseBtn3) {
            skillAccord.getPanes().remove(skillForm3);
            skillAddBtn4.setVisible(false);
            skillAddBtn3.setVisible(true);
            skillCloseBtn2.setDisable(false);
        } else if (event.getSource() == skillCloseBtn2) {
            skillAccord.getPanes().remove(skillForm2);
            skillAddBtn3.setVisible(false);
            skillAddBtn2.setVisible(true);
            skillCloseBtn.setDisable(false);
        } else if (event.getSource() == skillCloseBtn) {
            skillAccord.getPanes().remove(skillForm);
            skillAddBtn2.setVisible(false);
            skillAddBtn.setVisible(true);
        }
    }

    public void setAchieveFormClick(ActionEvent event) {
        if (event.getSource() == achieveAddBtn) {
            achieveAccord.getPanes().add(achieveForm);
            achieveForm.setExpanded(true);
            achieveAddBtn.setVisible(false);
            achieveAddBtn2.setVisible(true);
        } else if(event.getSource() == achieveAddBtn2) {
            achieveAccord.getPanes().add(achieveForm2);
            achieveForm.setExpanded(false);
            achieveForm2.setExpanded(true);
            achieveAddBtn2.setVisible(false);
            achieveAddBtn3.setVisible(true);
            achieveCloseBtn.setDisable(true);
        } else if (event.getSource() == achieveAddBtn3) {
            achieveAccord.getPanes().add(achieveForm3);
            achieveForm2.setExpanded(false);
            achieveForm3.setExpanded(true);
            achieveAddBtn3.setVisible(false);
            achieveAddBtn4.setVisible(true);
            achieveCloseBtn2.setDisable(true);
        } else if (event.getSource() == achieveAddBtn4) {
            achieveAccord.getPanes().add(achieveForm4);
            achieveForm3.setExpanded(false);
            achieveForm4.setExpanded(true);
            achieveAddBtn4.setVisible(false);
            achieveAddBtn5.setVisible(true);
            achieveCloseBtn3.setDisable(true);
        } else if (event.getSource() == achieveAddBtn5) {
            achieveAccord.getPanes().add(achieveForm5);
            achieveForm4.setExpanded(false);
            achieveForm5.setExpanded(true);
            achieveAddBtn5.setVisible(false);
            achieveAddBtn6.setVisible(true);
            achieveCloseBtn4.setDisable(true);
        } else if (event.getSource() == achieveAddBtn6) {
            achieveAccord.getPanes().add(achieveForm6);
            achieveForm5.setExpanded(false);
            achieveForm6.setExpanded(true);
            achieveAddBtn6.setVisible(false);
            achieveAddBtn7.setVisible(true);
            achieveCloseBtn5.setDisable(true);
        } else if (event.getSource() == achieveAddBtn7) {
            achieveAccord.getPanes().add(achieveForm7);
            achieveForm6.setExpanded(false);
            achieveForm7.setExpanded(true);
            achieveAddBtn7.setVisible(false);
            achieveAddBtn8.setVisible(true);
            achieveCloseBtn6.setDisable(true);
        } else if (event.getSource() == achieveAddBtn8) {
            achieveAccord.getPanes().add(achieveForm8);
            achieveForm7.setExpanded(false);
            achieveForm8.setExpanded(true);
            achieveAddBtn8.setVisible(false);
            achieveAddBtn9.setVisible(true);
            achieveCloseBtn7.setDisable(true);
        } else if (event.getSource() == achieveAddBtn9) {
            achieveAccord.getPanes().add(achieveForm9);
            achieveForm8.setExpanded(false);
            achieveForm9.setExpanded(true);
            achieveAddBtn9.setVisible(false);
            achieveAddBtn10.setVisible(true);
            achieveCloseBtn8.setDisable(true);
        } else if (event.getSource() == achieveAddBtn10) {
            achieveAccord.getPanes().add(achieveForm10);
            achieveForm9.setExpanded(false);
            achieveForm10.setExpanded(true);
            achieveAddBtn10.setVisible(false);
            achieveCloseBtn9.setDisable(true);
        } else if (event.getSource() == achieveCloseBtn10) {
            achieveAccord.getPanes().remove(achieveForm10);
            achieveAddBtn10.setVisible(true);
            achieveCloseBtn9.setDisable(false);
        } else if (event.getSource() == achieveCloseBtn9) {
            achieveAccord.getPanes().remove(achieveForm9);
            achieveAddBtn10.setVisible(false);
            achieveAddBtn9.setVisible(true);
            achieveCloseBtn8.setDisable(false);
        } else if (event.getSource() == achieveCloseBtn8) {
            achieveAccord.getPanes().remove(achieveForm8);
            achieveAddBtn9.setVisible(false);
            achieveAddBtn8.setVisible(true);
            achieveCloseBtn7.setDisable(false);
        } else if (event.getSource() == achieveCloseBtn7) {
            achieveAccord.getPanes().remove(achieveForm7);
            achieveAddBtn8.setVisible(false);
            achieveAddBtn7.setVisible(true);
            achieveCloseBtn6.setDisable(false);
        } else if (event.getSource() == achieveCloseBtn6) {
            achieveAccord.getPanes().remove(achieveForm6);
            achieveAddBtn7.setVisible(false);
            achieveAddBtn6.setVisible(true);
            achieveCloseBtn5.setDisable(false);
        } else if (event.getSource() == achieveCloseBtn5) {
            achieveAccord.getPanes().remove(achieveForm5);
            achieveAddBtn6.setVisible(false);
            achieveAddBtn5.setVisible(true);
            achieveCloseBtn4.setDisable(false);
        } else if (event.getSource() == achieveCloseBtn4) {
            achieveAccord.getPanes().remove(achieveForm4);
            achieveAddBtn5.setVisible(false);
            achieveAddBtn4.setVisible(true);
            achieveCloseBtn3.setDisable(false);
        } else if (event.getSource() == achieveCloseBtn3) {
            achieveAccord.getPanes().remove(achieveForm3);
            achieveAddBtn4.setVisible(false);
            achieveAddBtn3.setVisible(true);
            achieveCloseBtn2.setDisable(false);
        } else if (event.getSource() == achieveCloseBtn2) {
            achieveAccord.getPanes().remove(achieveForm2);
            achieveAddBtn3.setVisible(false);
            achieveAddBtn2.setVisible(true);
            achieveCloseBtn.setDisable(false);
        } else if (event.getSource() == achieveCloseBtn) {
            achieveAccord.getPanes().remove(achieveForm);
            achieveAddBtn2.setVisible(false);
            achieveAddBtn.setVisible(true);
        }
    }

    public void setProjectFormClick(ActionEvent event) {
        if (event.getSource() == projectAddBtn) {
            projectAccord.getPanes().add(projectForm);
            projectForm.setExpanded(true);
            projectAddBtn.setVisible(false);
            projectAddBtn2.setVisible(true);
        } else if(event.getSource() == projectAddBtn2) {
            projectAccord.getPanes().add(projectForm2);
            projectForm.setExpanded(false);
            projectForm2.setExpanded(true);
            projectAddBtn2.setVisible(false);
            projectAddBtn3.setVisible(true);
            projectCloseBtn.setDisable(true);
        } else if (event.getSource() == projectAddBtn3) {
            projectAccord.getPanes().add(projectForm3);
            projectForm2.setExpanded(false);
            projectForm3.setExpanded(true);
            projectAddBtn3.setVisible(false);
            projectAddBtn4.setVisible(true);
            projectCloseBtn2.setDisable(true);
        } else if (event.getSource() == projectAddBtn4) {
            projectAccord.getPanes().add(projectForm4);
            projectForm3.setExpanded(false);
            projectForm4.setExpanded(true);
            projectAddBtn4.setVisible(false);
            projectAddBtn5.setVisible(true);
            projectCloseBtn3.setDisable(true);
        } else if (event.getSource() == projectAddBtn5) {
            projectAccord.getPanes().add(projectForm5);
            projectForm4.setExpanded(false);
            projectForm5.setExpanded(true);
            projectAddBtn5.setVisible(false);
            projectCloseBtn4.setDisable(true);
        } else if (event.getSource() == projectCloseBtn5) {
            projectAccord.getPanes().remove(projectForm5);
            projectAddBtn5.setVisible(true);
            projectCloseBtn4.setDisable(false);
        } else if (event.getSource() == projectCloseBtn4) {
            projectAccord.getPanes().remove(projectForm4);
            projectAddBtn5.setVisible(false);
            projectAddBtn4.setVisible(true);
            projectCloseBtn3.setDisable(false);
        } else if (event.getSource() == projectCloseBtn3) {
            projectAccord.getPanes().remove(projectForm3);
            projectAddBtn4.setVisible(false);
            projectAddBtn3.setVisible(true);
            projectCloseBtn2.setDisable(false);
        } else if (event.getSource() == projectCloseBtn2) {
            projectAccord.getPanes().remove(projectForm2);
            projectAddBtn3.setVisible(false);
            projectAddBtn2.setVisible(true);
            projectCloseBtn.setDisable(false);
        } else if (event.getSource() == projectCloseBtn) {
            projectAccord.getPanes().remove(projectForm);
            projectAddBtn2.setVisible(false);
            projectAddBtn.setVisible(true);
        }
    }

    public void setLangFormClick(ActionEvent event) {
        if (event.getSource() == langAddBtn) {
            langAccord.getPanes().add(langForm);
            langForm.setExpanded(true);
            langAddBtn.setVisible(false);
            langAddBtn2.setVisible(true);
        } else if(event.getSource() == langAddBtn2) {
            langAccord.getPanes().add(langForm2);
            langForm.setExpanded(false);
            langForm2.setExpanded(true);
            langAddBtn2.setVisible(false);
            langAddBtn3.setVisible(true);
            langCloseBtn.setDisable(true);
        } else if (event.getSource() == langAddBtn3) {
            langAccord.getPanes().add(langForm3);
            langForm2.setExpanded(false);
            langForm3.setExpanded(true);
            langAddBtn3.setVisible(false);
            langAddBtn4.setVisible(true);
            langCloseBtn2.setDisable(true);
        } else if (event.getSource() == langAddBtn4) {
            langAccord.getPanes().add(langForm4);
            langForm3.setExpanded(false);
            langForm4.setExpanded(true);
            langAddBtn4.setVisible(false);
            langAddBtn5.setVisible(true);
            langCloseBtn3.setDisable(true);
        } else if (event.getSource() == langAddBtn5) {
            langAccord.getPanes().add(langForm5);
            langForm4.setExpanded(false);
            langForm5.setExpanded(true);
            langAddBtn5.setVisible(false);
            langCloseBtn4.setDisable(true);
        } else if (event.getSource() == langCloseBtn5) {
            langAccord.getPanes().remove(langForm5);
            langAddBtn5.setVisible(true);
            langCloseBtn4.setDisable(false);
        } else if (event.getSource() == langCloseBtn4) {
            langAccord.getPanes().remove(langForm4);
            langAddBtn5.setVisible(false);
            langAddBtn4.setVisible(true);
            langCloseBtn3.setDisable(false);
        } else if (event.getSource() == langCloseBtn3) {
            langAccord.getPanes().remove(langForm3);
            langAddBtn4.setVisible(false);
            langAddBtn3.setVisible(true);
            langCloseBtn2.setDisable(false);
        } else if (event.getSource() == langCloseBtn2) {
            langAccord.getPanes().remove(langForm2);
            langAddBtn3.setVisible(false);
            langAddBtn2.setVisible(true);
            langCloseBtn.setDisable(false);
        } else if (event.getSource() == langCloseBtn) {
            langAccord.getPanes().remove(langForm);
            langAddBtn2.setVisible(false);
            langAddBtn.setVisible(true);
        }
    }

    public void setRefFormClick(ActionEvent event) {
        if (event.getSource() == refAddBtn) {
            refAccord.getPanes().add(refForm);
            refForm.setExpanded(true);
            refAddBtn.setVisible(false);
            refAddBtn2.setVisible(true);
        } else if(event.getSource() == refAddBtn2) {
            refAccord.getPanes().add(refForm2);
            refForm.setExpanded(false);
            refForm2.setExpanded(true);
            refAddBtn2.setVisible(false);
            refCloseBtn.setDisable(true);
        } else if(event.getSource() == refCloseBtn2){
            refAccord.getPanes().remove(refForm2);
            refAddBtn2.setVisible(true);
            refCloseBtn.setDisable(false);
        } else if(event.getSource() == refCloseBtn){
            refAccord.getPanes().remove(refForm);
            refAddBtn2.setVisible(false);
            refAddBtn.setVisible(true);
        }
    }

    public void profileSaveBtnClick(ActionEvent event) {
        if (profileName.getText().isEmpty() || profileAddress.getText().isEmpty() || profileEmail.getText().isEmpty()
                || profilePhone.getText().isEmpty() || profileDOB.getValue() == null) {
            profileName.setStyle("-fx-border-color: red ; -fx-border-width: 2px");
            profileAddress.setStyle("-fx-border-color: red ; -fx-border-width: 2px");
            profileEmail.setStyle("-fx-border-color: red ; -fx-border-width: 2px");
            profilePhone.setStyle("-fx-border-color: red ; -fx-border-width: 2px");
            profileDOB.setStyle("-fx-border-color: red ; -fx-border-width: 2px");
            tabPane.getSelectionModel().select(tab1);
            profileScroll.setVvalue(0);
            Toolkit.getDefaultToolkit().beep();
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText(null);
            alert.setContentText("Please fill all the required fields!");
            alert.showAndWait();
        }else if (profilePhone.getText().length() > 12){
            profilePhone.setStyle("-fx-border-color: red ; -fx-border-width: 2px");
            tabPane.getSelectionModel().select(tab1);
            profileScroll.setVvalue(0.48);
            Toolkit.getDefaultToolkit().beep();
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText(null);
            alert.setContentText("Invalid phone number!");
            alert.showAndWait();
        }else {
            DBConnect db = new DBConnect();
            Connection dbConnect = db.getConnection();

            String insertData1 = "INSERT INTO cv_profiles (name ,address ,email ,phone,birthday ,gender ,marital ,nationality ,profession ,objective ,linkedin ,github ,photo) VALUES ('"+profileName.getText().replaceAll("'", "''")+"','"+profileAddress.getText().replaceAll("'", "''")+"','"+profileEmail.getText().replaceAll("'", "''")+"','"+profilePhone.getText()+"','"+profileDOB.getValue()+"','"+profileGender.getValue()+"','"+profileMaritalStatus.getValue()+"','"+profileNationality.getText().replaceAll("'", "''")+"','"+profileProfession.getText().replaceAll("'", "''")+"','"+objective.getText().replaceAll("'", "''")+"','"+profileLinkedin.getText().replaceAll("'", "''")+"','"+profileGithub.getText().replaceAll("'", "''")+"', ?)";

            try {
                Alert alt = new Alert(Alert.AlertType.CONFIRMATION);
                alt.setTitle("Confirmation");
                alt.setHeaderText(null);
                alt.setContentText("Are you sure you want to save this profile?");
                Optional<ButtonType> result = alt.showAndWait();
                if (result.get() == ButtonType.OK) {
                    if (file != null) {
                        FileInputStream imageID = new FileInputStream(file);
                        PreparedStatement statement1 = dbConnect.prepareStatement(insertData1,Statement.RETURN_GENERATED_KEYS);
                        statement1.setBinaryStream(1, imageID, (int) file.length());
                        statement1.executeUpdate();
                        ResultSet rs = statement1.getGeneratedKeys();
                        int ID = -1;
                        if (rs.next()) {
                            ID = rs.getInt(1);

                            String insertData2_1 = "INSERT INTO cv_edu (profile_id ,coursename ,school ,year) VALUES ('"+ID+"','"+eduCourse.getText().replaceAll("'", "''")+"','"+eduSchool.getText().replaceAll("'", "''")+"','"+eduYear.getText().replaceAll("'", "''")+"')";
                            String insertData2_2 = "INSERT INTO cv_edu (profile_id ,coursename ,school ,year) VALUES ('"+ID+"','"+eduCourse2.getText().replaceAll("'", "''")+"','"+eduSchool2.getText().replaceAll("'", "''")+"','"+eduYear2.getText().replaceAll("'", "''")+"')";
                            String insertData2_3 = "INSERT INTO cv_edu (profile_id ,coursename ,school ,year) VALUES ('"+ID+"','"+eduCourse3.getText().replaceAll("'", "''")+"','"+eduSchool3.getText().replaceAll("'", "''")+"','"+eduYear3.getText().replaceAll("'", "''")+"')";
                            String insertData2_4 = "INSERT INTO cv_edu (profile_id ,coursename ,school ,year) VALUES ('"+ID+"','"+eduCourse4.getText().replaceAll("'", "''")+"','"+eduSchool4.getText().replaceAll("'", "''")+"','"+eduYear4.getText().replaceAll("'", "''")+"')";
                            String insertData2_5 = "INSERT INTO cv_edu (profile_id ,coursename ,school ,year) VALUES ('"+ID+"','"+eduCourse5.getText().replaceAll("'", "''")+"','"+eduSchool5.getText().replaceAll("'", "''")+"','"+eduYear5.getText().replaceAll("'", "''")+"')";
                            String insertData2_6 = "INSERT INTO cv_edu (profile_id ,coursename ,school ,year) VALUES ('"+ID+"','"+eduCourse6.getText().replaceAll("'", "''")+"','"+eduSchool6.getText().replaceAll("'", "''")+"','"+eduYear6.getText().replaceAll("'", "''")+"')";
                            String insertData3_1 = "INSERT INTO cv_exp (profile_id ,job ,company ,start_date ,end_date ,details) VALUES ('"+ID+"','"+expJob.getText().replaceAll("'", "''")+"','"+expCompany.getText().replaceAll("'", "''")+"','"+expStartDate.getValue()+"','"+expEndDate.getValue()+"','"+expDetails.getText().replaceAll("'", "''")+"')";
                            String insertData3_2 = "INSERT INTO cv_exp (profile_id ,job ,company ,start_date ,end_date ,details) VALUES ('"+ID+"','"+expJob2.getText().replaceAll("'", "''")+"','"+expCompany2.getText().replaceAll("'", "''")+"','"+expStartDate2.getValue()+"','"+expEndDate2.getValue()+"','"+expDetails2.getText().replaceAll("'", "''")+"')";
                            String insertData3_3 = "INSERT INTO cv_exp (profile_id ,job ,company ,start_date ,end_date ,details) VALUES ('"+ID+"','"+expJob3.getText().replaceAll("'", "''")+"','"+expCompany3.getText().replaceAll("'", "''")+"','"+expStartDate3.getValue()+"','"+expEndDate3.getValue()+"','"+expDetails3.getText().replaceAll("'", "''")+"')";
                            String insertData3_4 = "INSERT INTO cv_exp (profile_id ,job ,company ,start_date ,end_date ,details) VALUES ('"+ID+"','"+expJob4.getText().replaceAll("'", "''")+"','"+expCompany4.getText().replaceAll("'", "''")+"','"+expStartDate4.getValue()+"','"+expEndDate4.getValue()+"','"+expDetails4.getText().replaceAll("'", "''")+"')";
                            String insertData3_5 = "INSERT INTO cv_exp (profile_id ,job ,company ,start_date ,end_date ,details) VALUES ('"+ID+"','"+expJob5.getText().replaceAll("'", "''")+"','"+expCompany5.getText().replaceAll("'", "''")+"','"+expStartDate5.getValue()+"','"+expEndDate5.getValue()+"','"+expDetails5.getText().replaceAll("'", "''")+"')";
                            String insertData4_1 = "INSERT INTO cv_skill (profile_id ,skill_name ,level) VALUES ('"+ID+"','"+skillName.getText().replaceAll("'", "''")+"','"+levelName+"')";
                            String insertData4_2 = "INSERT INTO cv_skill (profile_id ,skill_name ,level) VALUES ('"+ID+"','"+skillName2.getText().replaceAll("'", "''")+"','"+levelName2+"')";
                            String insertData4_3 = "INSERT INTO cv_skill (profile_id ,skill_name ,level) VALUES ('"+ID+"','"+skillName3.getText().replaceAll("'", "''")+"','"+levelName3+"')";
                            String insertData4_4 = "INSERT INTO cv_skill (profile_id ,skill_name ,level) VALUES ('"+ID+"','"+skillName4.getText().replaceAll("'", "''")+"','"+levelName4+"')";
                            String insertData4_5 = "INSERT INTO cv_skill (profile_id ,skill_name ,level) VALUES ('"+ID+"','"+skillName5.getText().replaceAll("'", "''")+"','"+levelName5+"')";
                            String insertData4_6 = "INSERT INTO cv_skill (profile_id ,skill_name ,level) VALUES ('"+ID+"','"+skillName6.getText().replaceAll("'", "''")+"','"+levelName6+"')";
                            String insertData4_7 = "INSERT INTO cv_skill (profile_id ,skill_name ,level) VALUES ('"+ID+"','"+skillName7.getText().replaceAll("'", "''")+"','"+levelName7+"')";
                            String insertData4_8 = "INSERT INTO cv_skill (profile_id ,skill_name ,level) VALUES ('"+ID+"','"+skillName8.getText().replaceAll("'", "''")+"','"+levelName8+"')";
                            String insertData4_9 = "INSERT INTO cv_skill (profile_id ,skill_name ,level) VALUES ('"+ID+"','"+skillName9.getText().replaceAll("'", "''")+"','"+levelName9+"')";
                            String insertData4_10 = "INSERT INTO cv_skill (profile_id ,skill_name ,level) VALUES ('"+ID+"','"+skillName10.getText().replaceAll("'", "''")+"','"+levelName10+"')";
                            String insertData5_1 = "INSERT INTO cv_achieve (profile_id ,name ,year) VALUES ('"+ID+"','"+achieveName.getText().replaceAll("'", "''")+"','"+achieveYear.getText().replaceAll("'", "''")+"')";
                            String insertData5_2 = "INSERT INTO cv_achieve (profile_id ,name ,year) VALUES ('"+ID+"','"+achieveName2.getText().replaceAll("'", "''")+"','"+achieveYear2.getText().replaceAll("'", "''")+"')";
                            String insertData5_3 = "INSERT INTO cv_achieve (profile_id ,name ,year) VALUES ('"+ID+"','"+achieveName3.getText().replaceAll("'", "''")+"','"+achieveYear3.getText().replaceAll("'", "''")+"')";
                            String insertData5_4 = "INSERT INTO cv_achieve (profile_id ,name ,year) VALUES ('"+ID+"','"+achieveName4.getText().replaceAll("'", "''")+"','"+achieveYear4.getText().replaceAll("'", "''")+"')";
                            String insertData5_5 = "INSERT INTO cv_achieve (profile_id ,name ,year) VALUES ('"+ID+"','"+achieveName5.getText().replaceAll("'", "''")+"','"+achieveYear5.getText().replaceAll("'", "''")+"')";
                            String insertData5_6 = "INSERT INTO cv_achieve (profile_id ,name ,year) VALUES ('"+ID+"','"+achieveName6.getText().replaceAll("'", "''")+"','"+achieveYear6.getText().replaceAll("'", "''")+"')";
                            String insertData5_7 = "INSERT INTO cv_achieve (profile_id ,name ,year) VALUES ('"+ID+"','"+achieveName7.getText().replaceAll("'", "''")+"','"+achieveYear7.getText().replaceAll("'", "''")+"')";
                            String insertData5_8 = "INSERT INTO cv_achieve (profile_id ,name ,year) VALUES ('"+ID+"','"+achieveName8.getText().replaceAll("'", "''")+"','"+achieveYear8.getText().replaceAll("'", "''")+"')";
                            String insertData5_9 = "INSERT INTO cv_achieve (profile_id ,name ,year) VALUES ('"+ID+"','"+achieveName9.getText().replaceAll("'", "''")+"','"+achieveYear9.getText().replaceAll("'", "''")+"')";
                            String insertData5_10 = "INSERT INTO cv_achieve (profile_id ,name ,year) VALUES ('"+ID+"','"+achieveName10.getText().replaceAll("'", "''")+"','"+achieveYear10.getText().replaceAll("'", "''")+"')";
                            String insertData6_1 = "INSERT INTO cv_projects (profile_id ,title ,descrip) VALUES ('"+ID+"','"+projectTitle.getText().replaceAll("'", "''")+"','"+projectDescrip.getText().replaceAll("'", "''")+"')";
                            String insertData6_2 = "INSERT INTO cv_projects (profile_id ,title ,descrip) VALUES ('"+ID+"','"+projectTitle2.getText().replaceAll("'", "''")+"','"+projectDescrip2.getText().replaceAll("'", "''")+"')";
                            String insertData6_3 = "INSERT INTO cv_projects (profile_id ,title ,descrip) VALUES ('"+ID+"','"+projectTitle3.getText().replaceAll("'", "''")+"','"+projectDescrip3.getText().replaceAll("'", "''")+"')";
                            String insertData6_4 = "INSERT INTO cv_projects (profile_id ,title ,descrip) VALUES ('"+ID+"','"+projectTitle4.getText().replaceAll("'", "''")+"','"+projectDescrip4.getText().replaceAll("'", "''")+"')";
                            String insertData6_5 = "INSERT INTO cv_projects (profile_id ,title ,descrip) VALUES ('"+ID+"','"+projectTitle5.getText().replaceAll("'", "''")+"','"+projectDescrip5.getText().replaceAll("'", "''")+"')";
                            String insertData7_1 = "INSERT INTO cv_lang (profile_id ,language) VALUES ('"+ID+"','"+langName.getText().replaceAll("'", "''")+"')";
                            String insertData7_2 = "INSERT INTO cv_lang (profile_id ,language) VALUES ('"+ID+"','"+langName2.getText().replaceAll("'", "''")+"')";
                            String insertData7_3 = "INSERT INTO cv_lang (profile_id ,language) VALUES ('"+ID+"','"+langName3.getText().replaceAll("'", "''")+"')";
                            String insertData7_4 = "INSERT INTO cv_lang (profile_id ,language) VALUES ('"+ID+"','"+langName4.getText().replaceAll("'", "''")+"')";
                            String insertData7_5 = "INSERT INTO cv_lang (profile_id ,language) VALUES ('"+ID+"','"+langName5.getText().replaceAll("'", "''")+"')";
                            String insertData8_1 = "INSERT INTO cv_ref (profile_id ,ref_name ,job ,company ,email ,phone) VALUES ('"+ID+"','"+refName.getText().replaceAll("'", "''")+"','"+refJob.getText().replaceAll("'", "''")+"','"+refCompany.getText().replaceAll("'", "''")+"','"+refEmail.getText().replaceAll("'", "''")+"','"+refPhone.getText()+"')";
                            String insertData8_2 = "INSERT INTO cv_ref (profile_id ,ref_name ,job ,company ,email ,phone) VALUES ('"+ID+"','"+refName2.getText().replaceAll("'", "''")+"','"+refJob2.getText().replaceAll("'", "''")+"','"+refCompany2.getText().replaceAll("'", "''")+"','"+refEmail2.getText().replaceAll("'", "''")+"','"+refPhone2.getText()+"')";
                            Statement statement2 = dbConnect.createStatement();
                            statement2.executeUpdate(insertData2_1);
                            statement2.executeUpdate(insertData2_2);
                            statement2.executeUpdate(insertData2_3);
                            statement2.executeUpdate(insertData2_4);
                            statement2.executeUpdate(insertData2_5);
                            statement2.executeUpdate(insertData2_6);
                            statement2.executeUpdate(insertData3_1);
                            statement2.executeUpdate(insertData3_2);
                            statement2.executeUpdate(insertData3_3);
                            statement2.executeUpdate(insertData3_4);
                            statement2.executeUpdate(insertData3_5);
                            statement2.executeUpdate(insertData4_1);
                            statement2.executeUpdate(insertData4_2);
                            statement2.executeUpdate(insertData4_3);
                            statement2.executeUpdate(insertData4_4);
                            statement2.executeUpdate(insertData4_5);
                            statement2.executeUpdate(insertData4_6);
                            statement2.executeUpdate(insertData4_7);
                            statement2.executeUpdate(insertData4_8);
                            statement2.executeUpdate(insertData4_9);
                            statement2.executeUpdate(insertData4_10);
                            statement2.executeUpdate(insertData5_1);
                            statement2.executeUpdate(insertData5_2);
                            statement2.executeUpdate(insertData5_3);
                            statement2.executeUpdate(insertData5_4);
                            statement2.executeUpdate(insertData5_5);
                            statement2.executeUpdate(insertData5_6);
                            statement2.executeUpdate(insertData5_7);
                            statement2.executeUpdate(insertData5_8);
                            statement2.executeUpdate(insertData5_9);
                            statement2.executeUpdate(insertData5_10);
                            statement2.executeUpdate(insertData6_1);
                            statement2.executeUpdate(insertData6_2);
                            statement2.executeUpdate(insertData6_3);
                            statement2.executeUpdate(insertData6_4);
                            statement2.executeUpdate(insertData6_5);
                            statement2.executeUpdate(insertData7_1);
                            statement2.executeUpdate(insertData7_2);
                            statement2.executeUpdate(insertData7_3);
                            statement2.executeUpdate(insertData7_4);
                            statement2.executeUpdate(insertData7_5);
                            statement2.executeUpdate(insertData8_1);
                            statement2.executeUpdate(insertData8_2);

                            Toolkit.getDefaultToolkit().beep();
                            Alert alert = new Alert(Alert.AlertType.INFORMATION);
                            alert.setTitle("Save Profile");
                            alert.setHeaderText(null);
                            alert.setContentText("Profile Saved!");
                            alert.showAndWait();
                            topForm_Home.setVisible(true);
                            leftForm_Home.setVisible(true);
                            rightForm_Home.setVisible(true);
                            rightForm_CVP.setVisible(false);
                            rightForm_ECV.setVisible(false);
                            rightForm_Temp.setVisible(false);
                            rightForm_Help.setVisible(false);
                            rightForm_Setting.setVisible(false);
                            topForm_CVP.setVisible(false);
                            showTableList();
                        }
                    } else {
                        PreparedStatement statement1 = dbConnect.prepareStatement(insertData1,Statement.RETURN_GENERATED_KEYS);
                        statement1.setBinaryStream(1, null);
                        statement1.executeUpdate();
                        ResultSet rs = statement1.getGeneratedKeys();
                        int ID = -1;
                        if (rs.next()) {
                            ID = rs.getInt(1);

                            String insertData2_1 = "INSERT INTO cv_edu (profile_id ,coursename ,school ,year) VALUES ('"+ID+"','"+eduCourse.getText().replaceAll("'", "''")+"','"+eduSchool.getText().replaceAll("'", "''")+"','"+eduYear.getText().replaceAll("'", "''")+"')";
                            String insertData2_2 = "INSERT INTO cv_edu (profile_id ,coursename ,school ,year) VALUES ('"+ID+"','"+eduCourse2.getText().replaceAll("'", "''")+"','"+eduSchool2.getText().replaceAll("'", "''")+"','"+eduYear2.getText().replaceAll("'", "''")+"')";
                            String insertData2_3 = "INSERT INTO cv_edu (profile_id ,coursename ,school ,year) VALUES ('"+ID+"','"+eduCourse3.getText().replaceAll("'", "''")+"','"+eduSchool3.getText().replaceAll("'", "''")+"','"+eduYear3.getText().replaceAll("'", "''")+"')";
                            String insertData2_4 = "INSERT INTO cv_edu (profile_id ,coursename ,school ,year) VALUES ('"+ID+"','"+eduCourse4.getText().replaceAll("'", "''")+"','"+eduSchool4.getText().replaceAll("'", "''")+"','"+eduYear4.getText().replaceAll("'", "''")+"')";
                            String insertData2_5 = "INSERT INTO cv_edu (profile_id ,coursename ,school ,year) VALUES ('"+ID+"','"+eduCourse5.getText().replaceAll("'", "''")+"','"+eduSchool5.getText().replaceAll("'", "''")+"','"+eduYear5.getText().replaceAll("'", "''")+"')";
                            String insertData2_6 = "INSERT INTO cv_edu (profile_id ,coursename ,school ,year) VALUES ('"+ID+"','"+eduCourse6.getText().replaceAll("'", "''")+"','"+eduSchool6.getText().replaceAll("'", "''")+"','"+eduYear6.getText().replaceAll("'", "''")+"')";
                            String insertData3_1 = "INSERT INTO cv_exp (profile_id ,job ,company ,start_date ,end_date ,details) VALUES ('"+ID+"','"+expJob.getText().replaceAll("'", "''")+"','"+expCompany.getText().replaceAll("'", "''")+"','"+expStartDate.getValue()+"','"+expEndDate.getValue()+"','"+expDetails.getText().replaceAll("'", "''")+"')";
                            String insertData3_2 = "INSERT INTO cv_exp (profile_id ,job ,company ,start_date ,end_date ,details) VALUES ('"+ID+"','"+expJob2.getText().replaceAll("'", "''")+"','"+expCompany2.getText().replaceAll("'", "''")+"','"+expStartDate2.getValue()+"','"+expEndDate2.getValue()+"','"+expDetails2.getText().replaceAll("'", "''")+"')";
                            String insertData3_3 = "INSERT INTO cv_exp (profile_id ,job ,company ,start_date ,end_date ,details) VALUES ('"+ID+"','"+expJob3.getText().replaceAll("'", "''")+"','"+expCompany3.getText().replaceAll("'", "''")+"','"+expStartDate3.getValue()+"','"+expEndDate3.getValue()+"','"+expDetails3.getText().replaceAll("'", "''")+"')";
                            String insertData3_4 = "INSERT INTO cv_exp (profile_id ,job ,company ,start_date ,end_date ,details) VALUES ('"+ID+"','"+expJob4.getText().replaceAll("'", "''")+"','"+expCompany4.getText().replaceAll("'", "''")+"','"+expStartDate4.getValue()+"','"+expEndDate4.getValue()+"','"+expDetails4.getText().replaceAll("'", "''")+"')";
                            String insertData3_5 = "INSERT INTO cv_exp (profile_id ,job ,company ,start_date ,end_date ,details) VALUES ('"+ID+"','"+expJob5.getText().replaceAll("'", "''")+"','"+expCompany5.getText().replaceAll("'", "''")+"','"+expStartDate5.getValue()+"','"+expEndDate5.getValue()+"','"+expDetails5.getText().replaceAll("'", "''")+"')";
                            String insertData4_1 = "INSERT INTO cv_skill (profile_id ,skill_name ,level) VALUES ('"+ID+"','"+skillName.getText().replaceAll("'", "''")+"','"+levelName+"')";
                            String insertData4_2 = "INSERT INTO cv_skill (profile_id ,skill_name ,level) VALUES ('"+ID+"','"+skillName2.getText().replaceAll("'", "''")+"','"+levelName2+"')";
                            String insertData4_3 = "INSERT INTO cv_skill (profile_id ,skill_name ,level) VALUES ('"+ID+"','"+skillName3.getText().replaceAll("'", "''")+"','"+levelName3+"')";
                            String insertData4_4 = "INSERT INTO cv_skill (profile_id ,skill_name ,level) VALUES ('"+ID+"','"+skillName4.getText().replaceAll("'", "''")+"','"+levelName4+"')";
                            String insertData4_5 = "INSERT INTO cv_skill (profile_id ,skill_name ,level) VALUES ('"+ID+"','"+skillName5.getText().replaceAll("'", "''")+"','"+levelName5+"')";
                            String insertData4_6 = "INSERT INTO cv_skill (profile_id ,skill_name ,level) VALUES ('"+ID+"','"+skillName6.getText().replaceAll("'", "''")+"','"+levelName6+"')";
                            String insertData4_7 = "INSERT INTO cv_skill (profile_id ,skill_name ,level) VALUES ('"+ID+"','"+skillName7.getText().replaceAll("'", "''")+"','"+levelName7+"')";
                            String insertData4_8 = "INSERT INTO cv_skill (profile_id ,skill_name ,level) VALUES ('"+ID+"','"+skillName8.getText().replaceAll("'", "''")+"','"+levelName8+"')";
                            String insertData4_9 = "INSERT INTO cv_skill (profile_id ,skill_name ,level) VALUES ('"+ID+"','"+skillName9.getText().replaceAll("'", "''")+"','"+levelName9+"')";
                            String insertData4_10 = "INSERT INTO cv_skill (profile_id ,skill_name ,level) VALUES ('"+ID+"','"+skillName10.getText().replaceAll("'", "''")+"','"+levelName10+"')";
                            String insertData5_1 = "INSERT INTO cv_achieve (profile_id ,name ,year) VALUES ('"+ID+"','"+achieveName.getText().replaceAll("'", "''")+"','"+achieveYear.getText().replaceAll("'", "''")+"')";
                            String insertData5_2 = "INSERT INTO cv_achieve (profile_id ,name ,year) VALUES ('"+ID+"','"+achieveName2.getText().replaceAll("'", "''")+"','"+achieveYear2.getText().replaceAll("'", "''")+"')";
                            String insertData5_3 = "INSERT INTO cv_achieve (profile_id ,name ,year) VALUES ('"+ID+"','"+achieveName3.getText().replaceAll("'", "''")+"','"+achieveYear3.getText().replaceAll("'", "''")+"')";
                            String insertData5_4 = "INSERT INTO cv_achieve (profile_id ,name ,year) VALUES ('"+ID+"','"+achieveName4.getText().replaceAll("'", "''")+"','"+achieveYear4.getText().replaceAll("'", "''")+"')";
                            String insertData5_5 = "INSERT INTO cv_achieve (profile_id ,name ,year) VALUES ('"+ID+"','"+achieveName5.getText().replaceAll("'", "''")+"','"+achieveYear5.getText().replaceAll("'", "''")+"')";
                            String insertData5_6 = "INSERT INTO cv_achieve (profile_id ,name ,year) VALUES ('"+ID+"','"+achieveName6.getText().replaceAll("'", "''")+"','"+achieveYear6.getText().replaceAll("'", "''")+"')";
                            String insertData5_7 = "INSERT INTO cv_achieve (profile_id ,name ,year) VALUES ('"+ID+"','"+achieveName7.getText().replaceAll("'", "''")+"','"+achieveYear7.getText().replaceAll("'", "''")+"')";
                            String insertData5_8 = "INSERT INTO cv_achieve (profile_id ,name ,year) VALUES ('"+ID+"','"+achieveName8.getText().replaceAll("'", "''")+"','"+achieveYear8.getText().replaceAll("'", "''")+"')";
                            String insertData5_9 = "INSERT INTO cv_achieve (profile_id ,name ,year) VALUES ('"+ID+"','"+achieveName9.getText().replaceAll("'", "''")+"','"+achieveYear9.getText().replaceAll("'", "''")+"')";
                            String insertData5_10 = "INSERT INTO cv_achieve (profile_id ,name ,year) VALUES ('"+ID+"','"+achieveName10.getText().replaceAll("'", "''")+"','"+achieveYear10.getText().replaceAll("'", "''")+"')";
                            String insertData6_1 = "INSERT INTO cv_projects (profile_id ,title ,descrip) VALUES ('"+ID+"','"+projectTitle.getText().replaceAll("'", "''")+"','"+projectDescrip.getText().replaceAll("'", "''")+"')";
                            String insertData6_2 = "INSERT INTO cv_projects (profile_id ,title ,descrip) VALUES ('"+ID+"','"+projectTitle2.getText().replaceAll("'", "''")+"','"+projectDescrip2.getText().replaceAll("'", "''")+"')";
                            String insertData6_3 = "INSERT INTO cv_projects (profile_id ,title ,descrip) VALUES ('"+ID+"','"+projectTitle3.getText().replaceAll("'", "''")+"','"+projectDescrip3.getText().replaceAll("'", "''")+"')";
                            String insertData6_4 = "INSERT INTO cv_projects (profile_id ,title ,descrip) VALUES ('"+ID+"','"+projectTitle4.getText().replaceAll("'", "''")+"','"+projectDescrip4.getText().replaceAll("'", "''")+"')";
                            String insertData6_5 = "INSERT INTO cv_projects (profile_id ,title ,descrip) VALUES ('"+ID+"','"+projectTitle5.getText().replaceAll("'", "''")+"','"+projectDescrip5.getText().replaceAll("'", "''")+"')";
                            String insertData7_1 = "INSERT INTO cv_lang (profile_id ,language) VALUES ('"+ID+"','"+langName.getText().replaceAll("'", "''")+"')";
                            String insertData7_2 = "INSERT INTO cv_lang (profile_id ,language) VALUES ('"+ID+"','"+langName2.getText().replaceAll("'", "''")+"')";
                            String insertData7_3 = "INSERT INTO cv_lang (profile_id ,language) VALUES ('"+ID+"','"+langName3.getText().replaceAll("'", "''")+"')";
                            String insertData7_4 = "INSERT INTO cv_lang (profile_id ,language) VALUES ('"+ID+"','"+langName4.getText().replaceAll("'", "''")+"')";
                            String insertData7_5 = "INSERT INTO cv_lang (profile_id ,language) VALUES ('"+ID+"','"+langName5.getText().replaceAll("'", "''")+"')";
                            String insertData8_1 = "INSERT INTO cv_ref (profile_id ,ref_name ,job ,company ,email ,phone) VALUES ('"+ID+"','"+refName.getText().replaceAll("'", "''")+"','"+refJob.getText().replaceAll("'", "''")+"','"+refCompany.getText().replaceAll("'", "''")+"','"+refEmail.getText().replaceAll("'", "''")+"','"+refPhone.getText()+"')";
                            String insertData8_2 = "INSERT INTO cv_ref (profile_id ,ref_name ,job ,company ,email ,phone) VALUES ('"+ID+"','"+refName2.getText().replaceAll("'", "''")+"','"+refJob2.getText().replaceAll("'", "''")+"','"+refCompany2.getText().replaceAll("'", "''")+"','"+refEmail2.getText().replaceAll("'", "''")+"','"+refPhone2.getText()+"')";
                            Statement statement2 = dbConnect.createStatement();
                            statement2.executeUpdate(insertData2_1);
                            statement2.executeUpdate(insertData2_2);
                            statement2.executeUpdate(insertData2_3);
                            statement2.executeUpdate(insertData2_4);
                            statement2.executeUpdate(insertData2_5);
                            statement2.executeUpdate(insertData2_6);
                            statement2.executeUpdate(insertData3_1);
                            statement2.executeUpdate(insertData3_2);
                            statement2.executeUpdate(insertData3_3);
                            statement2.executeUpdate(insertData3_4);
                            statement2.executeUpdate(insertData3_5);
                            statement2.executeUpdate(insertData4_1);
                            statement2.executeUpdate(insertData4_2);
                            statement2.executeUpdate(insertData4_3);
                            statement2.executeUpdate(insertData4_4);
                            statement2.executeUpdate(insertData4_5);
                            statement2.executeUpdate(insertData4_6);
                            statement2.executeUpdate(insertData4_7);
                            statement2.executeUpdate(insertData4_8);
                            statement2.executeUpdate(insertData4_9);
                            statement2.executeUpdate(insertData4_10);
                            statement2.executeUpdate(insertData5_1);
                            statement2.executeUpdate(insertData5_2);
                            statement2.executeUpdate(insertData5_3);
                            statement2.executeUpdate(insertData5_4);
                            statement2.executeUpdate(insertData5_5);
                            statement2.executeUpdate(insertData5_6);
                            statement2.executeUpdate(insertData5_7);
                            statement2.executeUpdate(insertData5_8);
                            statement2.executeUpdate(insertData5_9);
                            statement2.executeUpdate(insertData5_10);
                            statement2.executeUpdate(insertData6_1);
                            statement2.executeUpdate(insertData6_2);
                            statement2.executeUpdate(insertData6_3);
                            statement2.executeUpdate(insertData6_4);
                            statement2.executeUpdate(insertData6_5);
                            statement2.executeUpdate(insertData7_1);
                            statement2.executeUpdate(insertData7_2);
                            statement2.executeUpdate(insertData7_3);
                            statement2.executeUpdate(insertData7_4);
                            statement2.executeUpdate(insertData7_5);
                            statement2.executeUpdate(insertData8_1);
                            statement2.executeUpdate(insertData8_2);

                            Toolkit.getDefaultToolkit().beep();
                            Alert alert = new Alert(Alert.AlertType.INFORMATION);
                            alert.setTitle("Save Profile");
                            alert.setHeaderText(null);
                            alert.setContentText("Profile Saved!");
                            alert.showAndWait();
                            topForm_Home.setVisible(true);
                            leftForm_Home.setVisible(true);
                            rightForm_Home.setVisible(true);
                            rightForm_CVP.setVisible(false);
                            rightForm_ECV.setVisible(false);
                            rightForm_Temp.setVisible(false);
                            rightForm_Help.setVisible(false);
                            rightForm_Setting.setVisible(false);
                            topForm_CVP.setVisible(false);
                            showTableList();
                        }
                    }
                }else if(result.get() == ButtonType.CANCEL){
                    alt.close();
                }

            }catch (SQLIntegrityConstraintViolationException e) {
                e.printStackTrace();
                System.out.println(e.getCause());
                profileName.setStyle("-fx-border-color: red ; -fx-border-width: 2px");
                profileAddress.setStyle(null);
                profileEmail.setStyle(null);
                profilePhone.setStyle(null);
                profileDOB.setStyle(null);
                tabPane.getSelectionModel().select(tab1);
                profileScroll.setVvalue(0);
                Toolkit.getDefaultToolkit().beep();
                Alert alert = new Alert(Alert.AlertType.WARNING);
                alert.setTitle("Error");
                alert.setHeaderText(null);
                alert.setContentText("Profile name already exists! \nPlease try a different name!");
                alert.showAndWait();
            }catch (SQLException e){
                e.printStackTrace();
                e.getCause();
                System.out.println(e);
                Toolkit.getDefaultToolkit().beep();
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Error");
                alert.setHeaderText(null);
                alert.setContentText("Database Error!");
                alert.showAndWait();
            }catch (Exception e) {
                e.printStackTrace();
                e.getCause();
                System.out.println(e);
                Toolkit.getDefaultToolkit().beep();
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Error");
                alert.setHeaderText(null);
                alert.setContentText("System Error!");
                alert.showAndWait();
            }
        }
    }
    
    public void profileUpdateBtnClick(ActionEvent event) {
        if (profileAddress.getText().isEmpty() || profileEmail.getText().isEmpty()
                || profilePhone.getText().isEmpty() || profileDOB.getValue() == null) {
            profileAddress.setStyle("-fx-border-color: red ; -fx-border-width: 2px");
            profileEmail.setStyle("-fx-border-color: red ; -fx-border-width: 2px");
            profilePhone.setStyle("-fx-border-color: red ; -fx-border-width: 2px");
            profileDOB.setStyle("-fx-border-color: red ; -fx-border-width: 2px");
            tabPane.getSelectionModel().select(tab1);
            profileScroll.setVvalue(0);
            Toolkit.getDefaultToolkit().beep();
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText(null);
            alert.setContentText("Please fill all the required fields!");
            alert.showAndWait();
        }else if (profilePhone.getText().length() > 12){
            profilePhone.setStyle("-fx-border-color: red ; -fx-border-width: 2px");
            tabPane.getSelectionModel().select(tab1);
            profileScroll.setVvalue(0.48);
            Toolkit.getDefaultToolkit().beep();
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText(null);
            alert.setContentText("Invalid phone number!");
            alert.showAndWait();
        }else {
            DBConnect db = new DBConnect();
            Connection dbConnect = db.getConnection();

            String updateData1_1 = "UPDATE cv_profiles SET address = '"+profileAddress.getText().replaceAll("'", "''")+"', email = '"+profileEmail.getText().replaceAll("'", "''")+"', phone = '"+profilePhone.getText()+"', birthday = '"+profileDOB.getValue()+"', gender = '"+profileGender.getValue()+"', marital = '"+profileMaritalStatus.getValue()+"', nationality = '"+profileNationality.getText().replaceAll("'", "''")+"', profession = '"+profileProfession.getText().replaceAll("'", "''")+"', objective = '"+objective.getText().replaceAll("'", "''")+"', linkedin = '"+profileLinkedin.getText().replaceAll("'", "''")+"', github = '"+profileGithub.getText().replaceAll("'", "''")+"', photo = ? WHERE name = '"+profileName.getText().replaceAll("'", "''")+"'";
            String updateData1_2 = "UPDATE cv_profiles SET address = '"+profileAddress.getText().replaceAll("'", "''")+"', email = '"+profileEmail.getText().replaceAll("'", "''")+"', phone = '"+profilePhone.getText()+"', birthday = '"+profileDOB.getValue()+"', gender = '"+profileGender.getValue()+"', marital = '"+profileMaritalStatus.getValue()+"', nationality = '"+profileNationality.getText().replaceAll("'", "''")+"', profession = '"+profileProfession.getText().replaceAll("'", "''")+"', objective = '"+objective.getText().replaceAll("'", "''")+"', linkedin = '"+profileLinkedin.getText().replaceAll("'", "''")+"', github = '"+profileGithub.getText().replaceAll("'", "''")+"' WHERE name = '"+profileName.getText().replaceAll("'", "''")+"'";
            String selectData1 = "SELECT id FROM cv_profiles WHERE name = '"+profileName.getText().replaceAll("'", "''")+"'";

            try {
                Alert alt = new Alert(Alert.AlertType.CONFIRMATION);
                alt.setTitle("Confirmation");
                alt.setHeaderText(null);
                alt.setContentText("Are you sure you want to update this profile?");
                Optional<ButtonType> result = alt.showAndWait();
                if (result.get() == ButtonType.OK) {
                    if (file != null) {
                        FileInputStream imageID = new FileInputStream(file);
                        PreparedStatement statement1_1 = dbConnect.prepareStatement(updateData1_1);
                        statement1_1.setBinaryStream(1, imageID, (int) file.length());
                        statement1_1.executeUpdate();
                    } else if (profileID.getImage() == null) {
                        PreparedStatement statement1_1 = dbConnect.prepareStatement(updateData1_1);
                        statement1_1.setBinaryStream(1, null);
                        statement1_1.executeUpdate();
                    }else {
                        PreparedStatement statement1_2 = dbConnect.prepareStatement(updateData1_2);
                        statement1_2.executeUpdate();
                    }
                    PreparedStatement statement0 = dbConnect.prepareStatement(selectData1);
                    ResultSet rs = statement0.executeQuery();
                    int ID = -1;
                    if (rs.next()) {
                        ID = rs.getInt(1);

                        String selectData2_1 = "SELECT id FROM cv_edu WHERE profile_id = '"+ID+"' LIMIT 1";
                        String selectData2_2 = "SELECT id FROM cv_edu WHERE profile_id = '"+ID+"' LIMIT 1 OFFSET 1";
                        String selectData2_3 = "SELECT id FROM cv_edu WHERE profile_id = '"+ID+"' LIMIT 1 OFFSET 2";
                        String selectData2_4 = "SELECT id FROM cv_edu WHERE profile_id = '"+ID+"' LIMIT 1 OFFSET 3";
                        String selectData2_5 = "SELECT id FROM cv_edu WHERE profile_id = '"+ID+"' LIMIT 1 OFFSET 4";
                        String selectData2_6 = "SELECT id FROM cv_edu WHERE profile_id = '"+ID+"' LIMIT 1 OFFSET 5";

                        PreparedStatement state2_1 = dbConnect.prepareStatement(selectData2_1);
                        ResultSet rset2_1 = state2_1.executeQuery();
                        PreparedStatement state2_2 = dbConnect.prepareStatement(selectData2_2);
                        ResultSet rset2_2 = state2_2.executeQuery();
                        PreparedStatement state2_3 = dbConnect.prepareStatement(selectData2_3);
                        ResultSet rset2_3 = state2_3.executeQuery();
                        PreparedStatement state2_4 = dbConnect.prepareStatement(selectData2_4);
                        ResultSet rset2_4 = state2_4.executeQuery();
                        PreparedStatement state2_5 = dbConnect.prepareStatement(selectData2_5);
                        ResultSet rset2_5 = state2_5.executeQuery();
                        PreparedStatement state2_6 = dbConnect.prepareStatement(selectData2_6);
                        ResultSet rset2_6 = state2_6.executeQuery();

                        int[] ID2 = {-1, -1, -1, -1, -1, -1};
                        while (rset2_1.next() && rset2_2.next() && rset2_3.next() && rset2_4.next() && rset2_5.next() && rset2_6.next()) {
                            ID2[0] = rset2_1.getInt(1);
                            ID2[1] = rset2_2.getInt(1);
                            ID2[2] = rset2_3.getInt(1);
                            ID2[3] = rset2_4.getInt(1);
                            ID2[4] = rset2_5.getInt(1);
                            ID2[5] = rset2_6.getInt(1);

                            String updateData2_1 = "UPDATE cv_edu SET coursename = '"+eduCourse.getText().replaceAll("'", "''")+"', school = '"+eduSchool.getText().replaceAll("'", "''")+"', year = '"+eduYear.getText().replaceAll("'", "''")+"' WHERE id = '"+ID2[0]+"'";
                            String updateData2_2 = "UPDATE cv_edu SET coursename = '"+eduCourse2.getText().replaceAll("'", "''")+"', school = '"+eduSchool2.getText().replaceAll("'", "''")+"', year = '"+eduYear2.getText().replaceAll("'", "''")+"' WHERE id = '"+ID2[1]+"'";
                            String updateData2_3 = "UPDATE cv_edu SET coursename = '"+eduCourse3.getText().replaceAll("'", "''")+"', school = '"+eduSchool3.getText().replaceAll("'", "''")+"', year = '"+eduYear3.getText().replaceAll("'", "''")+"' WHERE id = '"+ID2[2]+"'";
                            String updateData2_4 = "UPDATE cv_edu SET coursename = '"+eduCourse4.getText().replaceAll("'", "''")+"', school = '"+eduSchool4.getText().replaceAll("'", "''")+"', year = '"+eduYear4.getText().replaceAll("'", "''")+"' WHERE id = '"+ID2[3]+"'";
                            String updateData2_5 = "UPDATE cv_edu SET coursename = '"+eduCourse5.getText().replaceAll("'", "''")+"', school = '"+eduSchool5.getText().replaceAll("'", "''")+"', year = '"+eduYear5.getText().replaceAll("'", "''")+"' WHERE id = '"+ID2[4]+"'";
                            String updateData2_6 = "UPDATE cv_edu SET coursename = '"+eduCourse6.getText().replaceAll("'", "''")+"', school = '"+eduSchool6.getText().replaceAll("'", "''")+"', year = '"+eduYear6.getText().replaceAll("'", "''")+"' WHERE id = '"+ID2[5]+"'";

                            PreparedStatement statement2_1 = dbConnect.prepareStatement(updateData2_1);
                            statement2_1.executeUpdate();
                            PreparedStatement statement2_2 = dbConnect.prepareStatement(updateData2_2);
                            statement2_2.executeUpdate();
                            PreparedStatement statement2_3 = dbConnect.prepareStatement(updateData2_3);
                            statement2_3.executeUpdate();
                            PreparedStatement statement2_4 = dbConnect.prepareStatement(updateData2_4);
                            statement2_4.executeUpdate();
                            PreparedStatement statement2_5 = dbConnect.prepareStatement(updateData2_5);
                            statement2_5.executeUpdate();
                            PreparedStatement statement2_6 = dbConnect.prepareStatement(updateData2_6);
                            statement2_6.executeUpdate();
                        }

                        String selectData3_1 = "SELECT id FROM cv_exp WHERE profile_id = '"+ID+"' LIMIT 1";
                        String selectData3_2 = "SELECT id FROM cv_exp WHERE profile_id = '"+ID+"' LIMIT 1 OFFSET 1";
                        String selectData3_3 = "SELECT id FROM cv_exp WHERE profile_id = '"+ID+"' LIMIT 1 OFFSET 2";
                        String selectData3_4 = "SELECT id FROM cv_exp WHERE profile_id = '"+ID+"' LIMIT 1 OFFSET 3";
                        String selectData3_5 = "SELECT id FROM cv_exp WHERE profile_id = '"+ID+"' LIMIT 1 OFFSET 4";

                        PreparedStatement state3_1 = dbConnect.prepareStatement(selectData3_1);
                        ResultSet rset3_1 = state3_1.executeQuery();
                        PreparedStatement state3_2 = dbConnect.prepareStatement(selectData3_2);
                        ResultSet rset3_2 = state3_2.executeQuery();
                        PreparedStatement state3_3 = dbConnect.prepareStatement(selectData3_3);
                        ResultSet rset3_3 = state3_3.executeQuery();
                        PreparedStatement state3_4 = dbConnect.prepareStatement(selectData3_4);
                        ResultSet rset3_4 = state3_4.executeQuery();
                        PreparedStatement state3_5 = dbConnect.prepareStatement(selectData3_5);
                        ResultSet rset3_5 = state3_5.executeQuery();

                        int[] ID3 = {-1, -1, -1, -1, -1};
                        while (rset3_1.next() && rset3_2.next() && rset3_3.next() && rset3_4.next() && rset3_5.next()) {
                            ID3[0] = rset3_1.getInt(1);
                            ID3[1] = rset3_2.getInt(1);
                            ID3[2] = rset3_3.getInt(1);
                            ID3[3] = rset3_4.getInt(1);
                            ID3[4] = rset3_5.getInt(1);

                            String updateData3_1 = "UPDATE cv_exp SET job = '"+expJob.getText().replaceAll("'", "''")+"', company = '"+expCompany.getText().replaceAll("'", "''")+"', start_date = '"+expStartDate.getValue()+"', end_date = '"+expEndDate.getValue()+"', details = '"+expDetails.getText().replaceAll("'", "''")+"' WHERE id = '"+ID3[0]+"'";
                            String updateData3_2 = "UPDATE cv_exp SET job = '"+expJob2.getText().replaceAll("'", "''")+"', company = '"+expCompany2.getText().replaceAll("'", "''")+"', start_date = '"+expStartDate2.getValue()+"', end_date = '"+expEndDate2.getValue()+"', details = '"+expDetails2.getText().replaceAll("'", "''")+"' WHERE id = '"+ID3[1]+"'";
                            String updateData3_3 = "UPDATE cv_exp SET job = '"+expJob3.getText().replaceAll("'", "''")+"', company = '"+expCompany3.getText().replaceAll("'", "''")+"', start_date = '"+expStartDate3.getValue()+"', end_date = '"+expEndDate3.getValue()+"', details = '"+expDetails3.getText().replaceAll("'", "''")+"' WHERE id = '"+ID3[2]+"'";
                            String updateData3_4 = "UPDATE cv_exp SET job = '"+expJob4.getText().replaceAll("'", "''")+"', company = '"+expCompany4.getText().replaceAll("'", "''")+"', start_date = '"+expStartDate4.getValue()+"', end_date = '"+expEndDate4.getValue()+"', details = '"+expDetails4.getText().replaceAll("'", "''")+"' WHERE id = '"+ID3[3]+"'";
                            String updateData3_5 = "UPDATE cv_exp SET job = '"+expJob5.getText().replaceAll("'", "''")+"', company = '"+expCompany5.getText().replaceAll("'", "''")+"', start_date = '"+expStartDate5.getValue()+"', end_date = '"+expEndDate5.getValue()+"', details = '"+expDetails5.getText().replaceAll("'", "''")+"' WHERE id = '"+ID3[4]+"'";

                            PreparedStatement statement3_1 = dbConnect.prepareStatement(updateData3_1);
                            statement3_1.executeUpdate();
                            PreparedStatement statement3_2 = dbConnect.prepareStatement(updateData3_2);
                            statement3_2.executeUpdate();
                            PreparedStatement statement3_3 = dbConnect.prepareStatement(updateData3_3);
                            statement3_3.executeUpdate();
                            PreparedStatement statement3_4 = dbConnect.prepareStatement(updateData3_4);
                            statement3_4.executeUpdate();
                            PreparedStatement statement3_5 = dbConnect.prepareStatement(updateData3_5);
                            statement3_5.executeUpdate();
                        }

                        String selectData4_1 = "SELECT id FROM cv_skill WHERE profile_id = '"+ID+"' LIMIT 1";
                        String selectData4_2 = "SELECT id FROM cv_skill WHERE profile_id = '"+ID+"' LIMIT 1 OFFSET 1";
                        String selectData4_3 = "SELECT id FROM cv_skill WHERE profile_id = '"+ID+"' LIMIT 1 OFFSET 2";
                        String selectData4_4 = "SELECT id FROM cv_skill WHERE profile_id = '"+ID+"' LIMIT 1 OFFSET 3";
                        String selectData4_5 = "SELECT id FROM cv_skill WHERE profile_id = '"+ID+"' LIMIT 1 OFFSET 4";
                        String selectData4_6 = "SELECT id FROM cv_skill WHERE profile_id = '"+ID+"' LIMIT 1 OFFSET 5";
                        String selectData4_7 = "SELECT id FROM cv_skill WHERE profile_id = '"+ID+"' LIMIT 1 OFFSET 6";
                        String selectData4_8 = "SELECT id FROM cv_skill WHERE profile_id = '"+ID+"' LIMIT 1 OFFSET 7";
                        String selectData4_9 = "SELECT id FROM cv_skill WHERE profile_id = '"+ID+"' LIMIT 1 OFFSET 8";
                        String selectData4_10 = "SELECT id FROM cv_skill WHERE profile_id = '"+ID+"' LIMIT 1 OFFSET 9";

                        PreparedStatement state4_1 = dbConnect.prepareStatement(selectData4_1);
                        ResultSet rset4_1 = state4_1.executeQuery();
                        PreparedStatement state4_2 = dbConnect.prepareStatement(selectData4_2);
                        ResultSet rset4_2 = state4_2.executeQuery();
                        PreparedStatement state4_3 = dbConnect.prepareStatement(selectData4_3);
                        ResultSet rset4_3 = state4_3.executeQuery();
                        PreparedStatement state4_4 = dbConnect.prepareStatement(selectData4_4);
                        ResultSet rset4_4 = state4_4.executeQuery();
                        PreparedStatement state4_5 = dbConnect.prepareStatement(selectData4_5);
                        ResultSet rset4_5 = state4_5.executeQuery();
                        PreparedStatement state4_6 = dbConnect.prepareStatement(selectData4_6);
                        ResultSet rset4_6 = state4_6.executeQuery();
                        PreparedStatement state4_7 = dbConnect.prepareStatement(selectData4_7);
                        ResultSet rset4_7 = state4_7.executeQuery();
                        PreparedStatement state4_8 = dbConnect.prepareStatement(selectData4_8);
                        ResultSet rset4_8 = state4_8.executeQuery();
                        PreparedStatement state4_9 = dbConnect.prepareStatement(selectData4_9);
                        ResultSet rset4_9 = state4_9.executeQuery();
                        PreparedStatement state4_10 = dbConnect.prepareStatement(selectData4_10);
                        ResultSet rset4_10 = state4_10.executeQuery();

                        int[] ID4 = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
                        while (rset4_1.next() && rset4_2.next() && rset4_3.next() && rset4_4.next() && rset4_5.next() && rset4_6.next() && rset4_7.next() && rset4_8.next() && rset4_9.next() && rset4_10.next()) {
                            ID4[0] = rset4_1.getInt(1);
                            ID4[1] = rset4_2.getInt(1);
                            ID4[2] = rset4_3.getInt(1);
                            ID4[3] = rset4_4.getInt(1);
                            ID4[4] = rset4_5.getInt(1);
                            ID4[5] = rset4_6.getInt(1);
                            ID4[6] = rset4_7.getInt(1);
                            ID4[7] = rset4_8.getInt(1);
                            ID4[8] = rset4_9.getInt(1);
                            ID4[9] = rset4_10.getInt(1);

                            String updateData4_1 = "UPDATE cv_skill SET skill_name = '"+skillName.getText().replaceAll("'", "''")+"', level = '"+levelName+"' WHERE id = '"+ID4[0]+"'";
                            String updateData4_2 = "UPDATE cv_skill SET skill_name = '"+skillName2.getText().replaceAll("'", "''")+"', level = '"+levelName2+"' WHERE id = '"+ID4[1]+"'";
                            String updateData4_3 = "UPDATE cv_skill SET skill_name = '"+skillName3.getText().replaceAll("'", "''")+"', level = '"+levelName3+"' WHERE id = '"+ID4[2]+"'";
                            String updateData4_4 = "UPDATE cv_skill SET skill_name = '"+skillName4.getText().replaceAll("'", "''")+"', level = '"+levelName4+"' WHERE id = '"+ID4[3]+"'";
                            String updateData4_5 = "UPDATE cv_skill SET skill_name = '"+skillName5.getText().replaceAll("'", "''")+"', level = '"+levelName5+"' WHERE id = '"+ID4[4]+"'";
                            String updateData4_6 = "UPDATE cv_skill SET skill_name = '"+skillName6.getText().replaceAll("'", "''")+"', level = '"+levelName6+"' WHERE id = '"+ID4[5]+"'";
                            String updateData4_7 = "UPDATE cv_skill SET skill_name = '"+skillName7.getText().replaceAll("'", "''")+"', level = '"+levelName7+"' WHERE id = '"+ID4[6]+"'";
                            String updateData4_8 = "UPDATE cv_skill SET skill_name = '"+skillName8.getText().replaceAll("'", "''")+"', level = '"+levelName8+"' WHERE id = '"+ID4[7]+"'";
                            String updateData4_9 = "UPDATE cv_skill SET skill_name = '"+skillName9.getText().replaceAll("'", "''")+"', level = '"+levelName9+"' WHERE id = '"+ID4[8]+"'";
                            String updateData4_10 = "UPDATE cv_skill SET skill_name = '"+skillName10.getText().replaceAll("'", "''")+"', level = '"+levelName10+"' WHERE id = '"+ID4[9]+"'";

                            PreparedStatement statement4_1 = dbConnect.prepareStatement(updateData4_1);
                            statement4_1.executeUpdate();
                            PreparedStatement statement4_2 = dbConnect.prepareStatement(updateData4_2);
                            statement4_2.executeUpdate();
                            PreparedStatement statement4_3 = dbConnect.prepareStatement(updateData4_3);
                            statement4_3.executeUpdate();
                            PreparedStatement statement4_4 = dbConnect.prepareStatement(updateData4_4);
                            statement4_4.executeUpdate();
                            PreparedStatement statement4_5 = dbConnect.prepareStatement(updateData4_5);
                            statement4_5.executeUpdate();
                            PreparedStatement statement4_6 = dbConnect.prepareStatement(updateData4_6);
                            statement4_6.executeUpdate();
                            PreparedStatement statement4_7 = dbConnect.prepareStatement(updateData4_7);
                            statement4_7.executeUpdate();
                            PreparedStatement statement4_8 = dbConnect.prepareStatement(updateData4_8);
                            statement4_8.executeUpdate();
                            PreparedStatement statement4_9 = dbConnect.prepareStatement(updateData4_9);
                            statement4_9.executeUpdate();
                            PreparedStatement statement4_10 = dbConnect.prepareStatement(updateData4_10);
                            statement4_10.executeUpdate();
                        }

                        String selectData5_1 = "SELECT id FROM cv_achieve WHERE profile_id = '"+ID+"' LIMIT 1";
                        String selectData5_2 = "SELECT id FROM cv_achieve WHERE profile_id = '"+ID+"' LIMIT 1 OFFSET 1";
                        String selectData5_3 = "SELECT id FROM cv_achieve WHERE profile_id = '"+ID+"' LIMIT 1 OFFSET 2";
                        String selectData5_4 = "SELECT id FROM cv_achieve WHERE profile_id = '"+ID+"' LIMIT 1 OFFSET 3";
                        String selectData5_5 = "SELECT id FROM cv_achieve WHERE profile_id = '"+ID+"' LIMIT 1 OFFSET 4";
                        String selectData5_6 = "SELECT id FROM cv_achieve WHERE profile_id = '"+ID+"' LIMIT 1 OFFSET 5";
                        String selectData5_7 = "SELECT id FROM cv_achieve WHERE profile_id = '"+ID+"' LIMIT 1 OFFSET 6";
                        String selectData5_8 = "SELECT id FROM cv_achieve WHERE profile_id = '"+ID+"' LIMIT 1 OFFSET 7";
                        String selectData5_9 = "SELECT id FROM cv_achieve WHERE profile_id = '"+ID+"' LIMIT 1 OFFSET 8";
                        String selectData5_10 = "SELECT id FROM cv_achieve WHERE profile_id = '"+ID+"' LIMIT 1 OFFSET 9";

                        PreparedStatement state5_1 = dbConnect.prepareStatement(selectData5_1);
                        ResultSet rset5_1 = state5_1.executeQuery();
                        PreparedStatement state5_2 = dbConnect.prepareStatement(selectData5_2);
                        ResultSet rset5_2 = state5_2.executeQuery();
                        PreparedStatement state5_3 = dbConnect.prepareStatement(selectData5_3);
                        ResultSet rset5_3 = state5_3.executeQuery();
                        PreparedStatement state5_4 = dbConnect.prepareStatement(selectData5_4);
                        ResultSet rset5_4 = state5_4.executeQuery();
                        PreparedStatement state5_5 = dbConnect.prepareStatement(selectData5_5);
                        ResultSet rset5_5 = state5_5.executeQuery();
                        PreparedStatement state5_6 = dbConnect.prepareStatement(selectData5_6);
                        ResultSet rset5_6 = state5_6.executeQuery();
                        PreparedStatement state5_7 = dbConnect.prepareStatement(selectData5_7);
                        ResultSet rset5_7 = state5_7.executeQuery();
                        PreparedStatement state5_8 = dbConnect.prepareStatement(selectData5_8);
                        ResultSet rset5_8 = state5_8.executeQuery();
                        PreparedStatement state5_9 = dbConnect.prepareStatement(selectData5_9);
                        ResultSet rset5_9 = state5_9.executeQuery();
                        PreparedStatement state5_10 = dbConnect.prepareStatement(selectData5_10);
                        ResultSet rset5_10 = state5_10.executeQuery();

                        int[] ID5 = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
                        while (rset5_1.next() && rset5_2.next() && rset5_3.next() && rset5_4.next() && rset5_5.next() && rset5_6.next() && rset5_7.next() && rset5_8.next() && rset5_9.next() && rset5_10.next()) {
                            ID5[0] = rset5_1.getInt(1);
                            ID5[1] = rset5_2.getInt(1);
                            ID5[2] = rset5_3.getInt(1);
                            ID5[3] = rset5_4.getInt(1);
                            ID5[4] = rset5_5.getInt(1);
                            ID5[5] = rset5_6.getInt(1);
                            ID5[6] = rset5_7.getInt(1);
                            ID5[7] = rset5_8.getInt(1);
                            ID5[8] = rset5_9.getInt(1);
                            ID5[9] = rset5_10.getInt(1);

                            String updateData5_1 = "UPDATE cv_achieve SET name = '"+achieveName.getText().replaceAll("'", "''")+"', year = '"+achieveYear.getText().replaceAll("'", "''")+"' WHERE id = '"+ID5[0]+"'";
                            String updateData5_2 = "UPDATE cv_achieve SET name = '"+achieveName2.getText().replaceAll("'", "''")+"', year = '"+achieveYear2.getText().replaceAll("'", "''")+"' WHERE id = '"+ID5[1]+"'";
                            String updateData5_3 = "UPDATE cv_achieve SET name = '"+achieveName3.getText().replaceAll("'", "''")+"', year = '"+achieveYear3.getText().replaceAll("'", "''")+"' WHERE id = '"+ID5[2]+"'";
                            String updateData5_4 = "UPDATE cv_achieve SET name = '"+achieveName4.getText().replaceAll("'", "''")+"', year = '"+achieveYear4.getText().replaceAll("'", "''")+"' WHERE id = '"+ID5[3]+"'";
                            String updateData5_5 = "UPDATE cv_achieve SET name = '"+achieveName5.getText().replaceAll("'", "''")+"', year = '"+achieveYear5.getText().replaceAll("'", "''")+"' WHERE id = '"+ID5[4]+"'";
                            String updateData5_6 = "UPDATE cv_achieve SET name = '"+achieveName6.getText().replaceAll("'", "''")+"', year = '"+achieveYear6.getText().replaceAll("'", "''")+"' WHERE id = '"+ID5[5]+"'";
                            String updateData5_7 = "UPDATE cv_achieve SET name = '"+achieveName7.getText().replaceAll("'", "''")+"', year = '"+achieveYear7.getText().replaceAll("'", "''")+"' WHERE id = '"+ID5[6]+"'";
                            String updateData5_8 = "UPDATE cv_achieve SET name = '"+achieveName8.getText().replaceAll("'", "''")+"', year = '"+achieveYear8.getText().replaceAll("'", "''")+"' WHERE id = '"+ID5[7]+"'";
                            String updateData5_9 = "UPDATE cv_achieve SET name = '"+achieveName9.getText().replaceAll("'", "''")+"', year = '"+achieveYear9.getText().replaceAll("'", "''")+"' WHERE id = '"+ID5[8]+"'";
                            String updateData5_10 = "UPDATE cv_achieve SET name = '"+achieveName10.getText().replaceAll("'", "''")+"', year = '"+achieveYear10.getText().replaceAll("'", "''")+"' WHERE id = '"+ID5[9]+"'";

                            PreparedStatement statement5_1 = dbConnect.prepareStatement(updateData5_1);
                            statement5_1.executeUpdate();
                            PreparedStatement statement5_2 = dbConnect.prepareStatement(updateData5_2);
                            statement5_2.executeUpdate();
                            PreparedStatement statement5_3 = dbConnect.prepareStatement(updateData5_3);
                            statement5_3.executeUpdate();
                            PreparedStatement statement5_4 = dbConnect.prepareStatement(updateData5_4);
                            statement5_4.executeUpdate();
                            PreparedStatement statement5_5 = dbConnect.prepareStatement(updateData5_5);
                            statement5_5.executeUpdate();
                            PreparedStatement statement5_6 = dbConnect.prepareStatement(updateData5_6);
                            statement5_6.executeUpdate();
                            PreparedStatement statement5_7 = dbConnect.prepareStatement(updateData5_7);
                            statement5_7.executeUpdate();
                            PreparedStatement statement5_8 = dbConnect.prepareStatement(updateData5_8);
                            statement5_8.executeUpdate();
                            PreparedStatement statement5_9 = dbConnect.prepareStatement(updateData5_9);
                            statement5_9.executeUpdate();
                            PreparedStatement statement5_10 = dbConnect.prepareStatement(updateData5_10);
                            statement5_10.executeUpdate();
                        }

                        String selectData6_1 = "SELECT id FROM cv_projects WHERE profile_id = '"+ID+"' LIMIT 1";
                        String selectData6_2 = "SELECT id FROM cv_projects WHERE profile_id = '"+ID+"' LIMIT 1 OFFSET 1";
                        String selectData6_3 = "SELECT id FROM cv_projects WHERE profile_id = '"+ID+"' LIMIT 1 OFFSET 2";
                        String selectData6_4 = "SELECT id FROM cv_projects WHERE profile_id = '"+ID+"' LIMIT 1 OFFSET 3";
                        String selectData6_5 = "SELECT id FROM cv_projects WHERE profile_id = '"+ID+"' LIMIT 1 OFFSET 4";

                        PreparedStatement state6_1 = dbConnect.prepareStatement(selectData6_1);
                        ResultSet rset6_1 = state6_1.executeQuery();
                        PreparedStatement state6_2 = dbConnect.prepareStatement(selectData6_2);
                        ResultSet rset6_2 = state6_2.executeQuery();
                        PreparedStatement state6_3 = dbConnect.prepareStatement(selectData6_3);
                        ResultSet rset6_3 = state6_3.executeQuery();
                        PreparedStatement state6_4 = dbConnect.prepareStatement(selectData6_4);
                        ResultSet rset6_4 = state6_4.executeQuery();
                        PreparedStatement state6_5 = dbConnect.prepareStatement(selectData6_5);
                        ResultSet rset6_5 = state6_5.executeQuery();

                        int[] ID6 = {-1, -1, -1, -1, -1};
                        while (rset6_1.next() && rset6_2.next() && rset6_3.next() && rset6_4.next() && rset6_5.next()) {
                            ID6[0] = rset6_1.getInt(1);
                            ID6[1] = rset6_2.getInt(1);
                            ID6[2] = rset6_3.getInt(1);
                            ID6[3] = rset6_4.getInt(1);
                            ID6[4] = rset6_5.getInt(1);

                            String updateData6_1 = "UPDATE cv_projects SET title = '"+projectTitle.getText().replaceAll("'", "''")+"', descrip = '"+projectDescrip.getText().replaceAll("'", "''")+"' WHERE id = '"+ID6[0]+"'";
                            String updateData6_2 = "UPDATE cv_projects SET title = '"+projectTitle2.getText().replaceAll("'", "''")+"', descrip = '"+projectDescrip2.getText().replaceAll("'", "''")+"' WHERE id = '"+ID6[1]+"'";
                            String updateData6_3 = "UPDATE cv_projects SET title = '"+projectTitle3.getText().replaceAll("'", "''")+"', descrip = '"+projectDescrip3.getText().replaceAll("'", "''")+"' WHERE id = '"+ID6[2]+"'";
                            String updateData6_4 = "UPDATE cv_projects SET title = '"+projectTitle4.getText().replaceAll("'", "''")+"', descrip = '"+projectDescrip4.getText().replaceAll("'", "''")+"' WHERE id = '"+ID6[3]+"'";
                            String updateData6_5 = "UPDATE cv_projects SET title = '"+projectTitle5.getText().replaceAll("'", "''")+"', descrip = '"+projectDescrip5.getText().replaceAll("'", "''")+"' WHERE id = '"+ID6[4]+"'";

                            PreparedStatement statement6_1 = dbConnect.prepareStatement(updateData6_1);
                            statement6_1.executeUpdate();
                            PreparedStatement statement6_2 = dbConnect.prepareStatement(updateData6_2);
                            statement6_2.executeUpdate();
                            PreparedStatement statement6_3 = dbConnect.prepareStatement(updateData6_3);
                            statement6_3.executeUpdate();
                            PreparedStatement statement6_4 = dbConnect.prepareStatement(updateData6_4);
                            statement6_4.executeUpdate();
                            PreparedStatement statement6_5 = dbConnect.prepareStatement(updateData6_5);
                            statement6_5.executeUpdate();
                        }

                        String selectData7_1 = "SELECT id FROM cv_lang WHERE profile_id = '"+ID+"' LIMIT 1";
                        String selectData7_2 = "SELECT id FROM cv_lang WHERE profile_id = '"+ID+"' LIMIT 1 OFFSET 1";
                        String selectData7_3 = "SELECT id FROM cv_lang WHERE profile_id = '"+ID+"' LIMIT 1 OFFSET 2";
                        String selectData7_4 = "SELECT id FROM cv_lang WHERE profile_id = '"+ID+"' LIMIT 1 OFFSET 3";
                        String selectData7_5 = "SELECT id FROM cv_lang WHERE profile_id = '"+ID+"' LIMIT 1 OFFSET 4";

                        PreparedStatement state7_1 = dbConnect.prepareStatement(selectData7_1);
                        ResultSet rset7_1 = state7_1.executeQuery();
                        PreparedStatement state7_2 = dbConnect.prepareStatement(selectData7_2);
                        ResultSet rset7_2 = state7_2.executeQuery();
                        PreparedStatement state7_3 = dbConnect.prepareStatement(selectData7_3);
                        ResultSet rset7_3 = state7_3.executeQuery();
                        PreparedStatement state7_4 = dbConnect.prepareStatement(selectData7_4);
                        ResultSet rset7_4 = state7_4.executeQuery();
                        PreparedStatement state7_5 = dbConnect.prepareStatement(selectData7_5);
                        ResultSet rset7_5 = state7_5.executeQuery();

                        int[] ID7 = {-1, -1, -1, -1, -1};
                        while (rset7_1.next() && rset7_2.next() && rset7_3.next() && rset7_4.next() && rset7_5.next()){
                            ID7[0] = rset7_1.getInt(1);
                            ID7[1] = rset7_2.getInt(1);
                            ID7[2] = rset7_3.getInt(1);
                            ID7[3] = rset7_4.getInt(1);
                            ID7[4] = rset7_5.getInt(1);

                            String updateData7_1 = "UPDATE cv_lang SET language ='"+langName.getText().replaceAll("'", "''")+"' WHERE id = '"+ID7[0]+"'";
                            String updateData7_2 = "UPDATE cv_lang SET language ='"+langName2.getText().replaceAll("'", "''")+"' WHERE id = '"+ID7[1]+"'";
                            String updateData7_3 = "UPDATE cv_lang SET language ='"+langName3.getText().replaceAll("'", "''")+"' WHERE id = '"+ID7[2]+"'";
                            String updateData7_4 = "UPDATE cv_lang SET language ='"+langName4.getText().replaceAll("'", "''")+"' WHERE id = '"+ID7[3]+"'";
                            String updateData7_5 = "UPDATE cv_lang SET language ='"+langName5.getText().replaceAll("'", "''")+"' WHERE id = '"+ID7[4]+"'";

                            PreparedStatement statement7_1 = dbConnect.prepareStatement(updateData7_1);
                            statement7_1.executeUpdate();
                            PreparedStatement statement7_2 = dbConnect.prepareStatement(updateData7_2);
                            statement7_2.executeUpdate();
                            PreparedStatement statement7_3 = dbConnect.prepareStatement(updateData7_3);
                            statement7_3.executeUpdate();
                            PreparedStatement statement7_4 = dbConnect.prepareStatement(updateData7_4);
                            statement7_4.executeUpdate();
                            PreparedStatement statement7_5 = dbConnect.prepareStatement(updateData7_5);
                            statement7_5.executeUpdate();
                        }

                        String selectData8_1 = "SELECT id FROM cv_ref WHERE profile_id = '"+ID+"' LIMIT 1";
                        String selectData8_2 = "SELECT id FROM cv_ref WHERE profile_id = '"+ID+"' LIMIT 1 OFFSET 1";

                        PreparedStatement state8_1 = dbConnect.prepareStatement(selectData8_1);
                        ResultSet rset8_1 = state8_1.executeQuery();
                        PreparedStatement state8_2 = dbConnect.prepareStatement(selectData8_2);
                        ResultSet rset8_2 = state8_2.executeQuery();

                        int[] ID8 = {-1, -1};
                        while (rset8_1.next() && rset8_2.next()){
                            ID8[0] = rset8_1.getInt(1);
                            ID8[1] = rset8_2.getInt(1);

                            String updateData8_1 = "UPDATE cv_ref SET ref_name = '"+refName.getText().replaceAll("'", "''")+"', job = '"+refJob.getText().replaceAll("'", "''")+"', company = '"+refCompany.getText().replaceAll("'", "''")+"', email = '"+refEmail.getText().replaceAll("'", "''")+"', phone = '"+refPhone.getText()+"' WHERE id = '"+ID8[0]+"'";
                            String updateData8_2 = "UPDATE cv_ref SET ref_name = '"+refName2.getText().replaceAll("'", "''")+"', job = '"+refJob2.getText().replaceAll("'", "''")+"', company = '"+refCompany2.getText().replaceAll("'", "''")+"', email = '"+refEmail2.getText().replaceAll("'", "''")+"', phone = '"+refPhone2.getText()+"' WHERE id = '"+ID8[1]+"'";

                            PreparedStatement statement8_1 = dbConnect.prepareStatement(updateData8_1);
                            statement8_1.executeUpdate();
                            PreparedStatement statement8_2 = dbConnect.prepareStatement(updateData8_2);
                            statement8_2.executeUpdate();
                        }

                        Toolkit.getDefaultToolkit().beep();
                        Alert alert = new Alert(Alert.AlertType.INFORMATION);
                        alert.setTitle("Update Profile");
                        alert.setHeaderText(null);
                        alert.setContentText("Profile Updated!");
                        alert.showAndWait();
                        topForm_Home.setVisible(true);
                        leftForm_Home.setVisible(true);
                        rightForm_Home.setVisible(false);
                        rightForm_CVP.setVisible(false);
                        rightForm_ECV.setVisible(true);
                        rightForm_Temp.setVisible(false);
                        rightForm_Help.setVisible(false);
                        rightForm_Setting.setVisible(false);
                        topForm_CVP.setVisible(false);
                        showTableList();
                    }
                }else if(result.get() == ButtonType.CANCEL){
                    alt.close();
                }

            }catch (SQLIntegrityConstraintViolationException e){
                e.printStackTrace();
                e.getCause();
                System.out.println(e);
                profileName.setStyle("-fx-border-color: red ; -fx-border-width: 2px");
                tabPane.getSelectionModel().select(tab1);
                profileScroll.setVvalue(0);
                profileAddress.setStyle(null);
                profileEmail.setStyle(null);
                profilePhone.setStyle(null);
                profileDOB.setStyle(null);
                profileGender.setStyle(null);
                Toolkit.getDefaultToolkit().beep();
                Alert alert = new Alert(Alert.AlertType.WARNING);
                alert.setTitle("Error");
                alert.setHeaderText(null);
                alert.setContentText("Profile name already exists! \nPlease try a different name!");
                alert.showAndWait();
            }catch (SQLException e) {
                e.printStackTrace();
                System.out.println(e.getCause());
                Toolkit.getDefaultToolkit().beep();
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Error");
                alert.setHeaderText(null);
                alert.setContentText("Database Error!");
                alert.showAndWait();
            }catch (Exception  e) {
                e.printStackTrace();
                e.getCause();
                System.out.println(e);
                Toolkit.getDefaultToolkit().beep();
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Error");
                alert.setHeaderText(null);
                alert.setContentText("System Error!");
                alert.showAndWait();
            }
        }
    }

    public void generateJasperReport1() {
        try {
            InputStream input = new FileInputStream("C:\\Users\\Acer\\IdeaProjects\\CV\\src\\main\\resources\\com\\example\\cv\\Template01.jrxml");
            JasperDesign jasperDesign = JRXmlLoader.load(input);
            JasperReport jasperReport = JasperCompileManager.compileReport(jasperDesign);
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, new JREmptyDataSource());
            JasperViewer.viewReport(jasperPrint, false);
        }catch (JRException e) {
            throw new RuntimeException(e);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (Exception e) {
            System.out.println(e.getCause());
        }
    }

    public void generateJasperReport2() {
        try {
            InputStream input = new FileInputStream("C:\\Users\\Acer\\IdeaProjects\\CV\\src\\main\\resources\\com\\example\\cv\\Template02.jrxml");
            JasperDesign jasperDesign = JRXmlLoader.load(input);
            JasperReport jasperReport = JasperCompileManager.compileReport(jasperDesign);
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, new JREmptyDataSource());
            JasperViewer.viewReport(jasperPrint, false);
        }catch (JRException e) {
            throw new RuntimeException(e);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (Exception e) {
            System.out.println(e.getCause());
        }
    }

    public void generateJasperReport3() {
        try {
            InputStream input = new FileInputStream("C:\\Users\\Acer\\IdeaProjects\\CV\\src\\main\\resources\\com\\example\\cv\\Template03.jrxml");
            JasperDesign jasperDesign = JRXmlLoader.load(input);
            JasperReport jasperReport = JasperCompileManager.compileReport(jasperDesign);
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, new JREmptyDataSource());
            JasperViewer.viewReport(jasperPrint, false);
        }catch (JRException e) {
            throw new RuntimeException(e);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (Exception e) {
            System.out.println(e.getCause());
        }
    }

    public void generateJasperReport4() {
        try {
            InputStream input = new FileInputStream("C:\\Users\\Acer\\IdeaProjects\\CV\\src\\main\\resources\\com\\example\\cv\\Template04.jrxml");
            JasperDesign jasperDesign = JRXmlLoader.load(input);
            JasperReport jasperReport = JasperCompileManager.compileReport(jasperDesign);
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, new JREmptyDataSource());
            JasperViewer.viewReport(jasperPrint, false);
        }catch (JRException e) {
            throw new RuntimeException(e);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (Exception e) {
            System.out.println(e.getCause());
        }
    }

    int ID = -1;
    Map<String, Object> parameters = new HashMap<>();
    public void getProfileDetails(){
        DBConnect dbConnect = new DBConnect();
        Connection conn = dbConnect.getConnection();
        String selectData1 = "SELECT * FROM cv_profiles WHERE name = '"+profileName.getText()+"'";

        try {
            PreparedStatement statement1 = conn.prepareStatement(selectData1);
            ResultSet rs1 = statement1.executeQuery();
            while (rs1.next()) {
                ID = rs1.getInt(1);
                String Name = rs1.getString(2);
                String Address = rs1.getString(3);
                String Email = rs1.getString(4);
                String Phone = rs1.getString(5);
                Date DOB = rs1.getDate(6);
                String Gender = rs1.getString(7);
                String Marital = rs1.getString(8);
                String Nationality = rs1.getString(9);
                String Profession = rs1.getString(10);
                String Objective = rs1.getString(11);
                String Linkedin = rs1.getString(12);
                String Github = rs1.getString(13);
                Blob Photo = rs1.getBlob(14);

                profileAddress.setText(Address);
                profileEmail.setText(Email);
                profilePhone.setText(Phone);
                profileDOB.setValue(DOB.toLocalDate());
                profileGender.setValue(Gender);
                profileMaritalStatus.setValue(Marital);
                profileNationality.setText(Nationality);
                profileProfession.setText(Profession);
                objective.setText(Objective);
                profileLinkedin.setText(Linkedin);
                profileGithub.setText(Github);
                if (Photo != null) {
                    InputStream inputStream = Photo.getBinaryStream();
                    Image IDPhoto = new Image(inputStream, 132, 150, false, true);
                    profileID.setImage(IDPhoto);
                    recID.setStyle("-fx-fill: transparent; -fx-background-color: transparent;");
                    IDIcon.setVisible(false);

                    if (!Objects.equals(Linkedin, "") && !Objects.equals(Github, "")) {
                        parameters.put("Name", Name);
                        parameters.put("Profession", Profession);
                        parameters.put("DOB", String.valueOf(DOB));
                        parameters.put("Gender", Gender);
                        parameters.put("MStatus", Marital);
                        parameters.put("Nationality", Nationality);
                        parameters.put("Address", Address);
                        parameters.put("Phone", Phone);
                        parameters.put("Email", Email);
                        parameters.put("LinkedIn", Linkedin);
                        parameters.put("Github", Github);
                        BufferedImage IDP = SwingFXUtils.fromFXImage(IDPhoto, null);
                        parameters.put("IDPhoto", IDP);
                        if (!Objects.equals(Objective, "")) {
                            parameters.put("Objective", Objective);
                        } else {
                            parameters.put("Objective", null);
                        }
                    }else if (!Objects.equals(Linkedin, "") && Objects.equals(Github, "")) {
                        parameters.put("Name", Name);
                        parameters.put("Profession", Profession);
                        parameters.put("DOB", String.valueOf(DOB));
                        parameters.put("Gender", Gender);
                        parameters.put("MStatus", Marital);
                        parameters.put("Nationality", Nationality);
                        parameters.put("Address", Address);
                        parameters.put("Phone", Phone);
                        parameters.put("Email", Email);
                        parameters.put("LinkedIn", Linkedin);
                        parameters.put("Github", null);
                        BufferedImage IDP = SwingFXUtils.fromFXImage(IDPhoto, null);
                        parameters.put("IDPhoto", IDP);
                        if (!Objects.equals(Objective, "")) {
                            parameters.put("Objective", Objective);
                        } else {
                            parameters.put("Objective", null);
                        }
                    } else {
                        parameters.put("Name", Name);
                        parameters.put("Profession", Profession);
                        parameters.put("DOB", String.valueOf(DOB));
                        parameters.put("Gender", Gender);
                        parameters.put("MStatus", Marital);
                        parameters.put("Nationality", Nationality);
                        parameters.put("Address", Address);
                        parameters.put("Phone", Phone);
                        parameters.put("Email", Email);
                        parameters.put("LinkedIn", null);
                        parameters.put("Github", null);
                        BufferedImage IDP = SwingFXUtils.fromFXImage(IDPhoto, null);
                        parameters.put("IDPhoto", IDP);
                        if (!Objects.equals(Objective, "")) {
                            parameters.put("Objective", Objective);
                        } else {
                            parameters.put("Objective", null);
                        }
                    }
                } else {
                    profileID.setImage(null);
                    recID.setStyle(null);
                    IDIcon.setVisible(true);

                    if (!Objects.equals(Linkedin, "") && !Objects.equals(Github, "")) {
                        parameters.put("Name", Name);
                        parameters.put("Profession", Profession);
                        parameters.put("DOB", String.valueOf(DOB));
                        parameters.put("Gender", Gender);
                        parameters.put("MStatus", Marital);
                        parameters.put("Nationality", Nationality);
                        parameters.put("Address", Address);
                        parameters.put("Phone", Phone);
                        parameters.put("Email", Email);
                        parameters.put("LinkedIn", Linkedin);
                        parameters.put("Github", Github);
                        parameters.put("IDPhoto", null);
                        if (!Objects.equals(Objective, "")) {
                            parameters.put("Objective", Objective);
                        } else {
                            parameters.put("Objective", null);
                        }
                    }else if (!Objects.equals(Linkedin, "") && Objects.equals(Github, "")) {
                        parameters.put("Name", Name);
                        parameters.put("Profession", Profession);
                        parameters.put("DOB", String.valueOf(DOB));
                        parameters.put("Gender", Gender);
                        parameters.put("MStatus", Marital);
                        parameters.put("Nationality", Nationality);
                        parameters.put("Address", Address);
                        parameters.put("Phone", Phone);
                        parameters.put("Email", Email);
                        parameters.put("LinkedIn", Linkedin);
                        parameters.put("Github", null);
                        parameters.put("IDPhoto", null);
                        if (!Objects.equals(Objective, "")) {
                            parameters.put("Objective", Objective);
                        } else {
                            parameters.put("Objective", null);
                        }
                    } else {
                        parameters.put("Name", Name);
                        parameters.put("Profession", Profession);
                        parameters.put("DOB", String.valueOf(DOB));
                        parameters.put("Gender", Gender);
                        parameters.put("MStatus", Marital);
                        parameters.put("Nationality", Nationality);
                        parameters.put("Address", Address);
                        parameters.put("Phone", Phone);
                        parameters.put("Email", Email);
                        parameters.put("LinkedIn", null);
                        parameters.put("Github", null);
                        parameters.put("IDPhoto", null);
                        if (!Objects.equals(Objective, "")) {
                            parameters.put("Objective", Objective);
                        } else {
                            parameters.put("Objective", null);
                        }
                    }
                }
            }
        }catch (SQLException e) {
            Logger.getLogger(dashboardController.class.getName()).log(Level.SEVERE, null, e);
            System.out.println(e);
        }
    }

    public void getEduDetails() {
        DBConnect dbConnect = new DBConnect();
        Connection conn = dbConnect.getConnection();
        String selectData2_1 = "SELECT * FROM cv_edu WHERE profile_id = '"+ID+"' LIMIT 1";
        String selectData2_2 = "SELECT * FROM cv_edu WHERE profile_id = '"+ID+"' LIMIT 1 OFFSET 1";
        String selectData2_3 = "SELECT * FROM cv_edu WHERE profile_id = '"+ID+"' LIMIT 1 OFFSET 2";
        String selectData2_4 = "SELECT * FROM cv_edu WHERE profile_id = '"+ID+"' LIMIT 1 OFFSET 3";
        String selectData2_5 = "SELECT * FROM cv_edu WHERE profile_id = '"+ID+"' LIMIT 1 OFFSET 4";
        String selectData2_6 = "SELECT * FROM cv_edu WHERE profile_id = '"+ID+"' LIMIT 1 OFFSET 5";

        try {
            PreparedStatement statement2_1 = conn.prepareStatement(selectData2_1);
            ResultSet rs2_1 = statement2_1.executeQuery();
            while (rs2_1.next()) {
                String Coursename1 = rs2_1.getString(3);
                String School1 = rs2_1.getString(4);
                String Year1 = rs2_1.getString(5);

                eduCourse.setText(Coursename1);
                eduSchool.setText(School1);
                eduYear.setText(Year1);
                if (!Objects.equals(Coursename1, "") && !Objects.equals(School1, "") && !Objects.equals(Year1, "")) {
                    parameters.put("Course1","• "+Coursename1+" ("+Year1+")"+" - "+School1);
                } else if (!Objects.equals(Coursename1, "") && !Objects.equals(School1, "") && Objects.equals(Year1, "")) {
                    parameters.put("Course1","• "+Coursename1+" - "+School1);
                } else if (!Objects.equals(Coursename1, "") && !Objects.equals(Year1, "") && Objects.equals(School1, "")) {
                    parameters.put("Course1","• "+Coursename1+" ("+Year1+")");
                } else {
                    parameters.put("Course1", null);
                }
            }
            PreparedStatement statement2_2 = conn.prepareStatement(selectData2_2);
            ResultSet rs2_2 = statement2_2.executeQuery();
            while (rs2_2.next()) {
                String Coursename2 = rs2_2.getString(3);
                String School2 = rs2_2.getString(4);
                String Year2 = rs2_2.getString(5);

                eduCourse2.setText(Coursename2);
                eduSchool2.setText(School2);
                eduYear2.setText(Year2);
                if (!Objects.equals(Coursename2, "") && !Objects.equals(School2, "") && !Objects.equals(Year2, "")) {
                    parameters.put("Course2","• "+Coursename2+" ("+Year2+")"+" - "+School2);
                } else if (!Objects.equals(Coursename2, "") && !Objects.equals(School2, "") && Objects.equals(Year2, "")) {
                    parameters.put("Course2","• "+Coursename2+" - "+School2);
                } else if (!Objects.equals(Coursename2, "") && !Objects.equals(Year2, "") && Objects.equals(School2, "")) {
                    parameters.put("Course2","• "+Coursename2+" ("+Year2+")");
                } else {
                    parameters.put("Course2", "");
                }
            }
            PreparedStatement statement2_3 = conn.prepareStatement(selectData2_3);
            ResultSet rs2_3 = statement2_3.executeQuery();
            while (rs2_3.next()) {
                String Coursename3 = rs2_3.getString(3);
                String School3 = rs2_3.getString(4);
                String Year3 = rs2_3.getString(5);

                eduCourse3.setText(Coursename3);
                eduSchool3.setText(School3);
                eduYear3.setText(Year3);
                if (!Objects.equals(Coursename3, "") && !Objects.equals(School3, "") && !Objects.equals(Year3, "")) {
                    parameters.put("Course3","• "+Coursename3+" ("+Year3+")"+" - "+School3);
                } else if (!Objects.equals(Coursename3, "") && !Objects.equals(School3, "") && Objects.equals(Year3, "")) {
                    parameters.put("Course3","• "+Coursename3+" - "+School3);
                } else if (!Objects.equals(Coursename3, "") && !Objects.equals(Year3, "") && Objects.equals(School3, "")) {
                    parameters.put("Course3","• "+Coursename3+" ("+Year3+")");
                } else {
                    parameters.put("Course3", "");
                }
            }
            PreparedStatement statement2_4 = conn.prepareStatement(selectData2_4);
            ResultSet rs2_4 = statement2_4.executeQuery();
            while (rs2_4.next()) {
                String Coursename4 = rs2_4.getString(3);
                String School4 = rs2_4.getString(4);
                String Year4 = rs2_4.getString(5);

                eduCourse4.setText(Coursename4);
                eduSchool4.setText(School4);
                eduYear4.setText(Year4);
                if (!Objects.equals(Coursename4, "") && !Objects.equals(School4, "") && !Objects.equals(Year4, "")) {
                    parameters.put("Course4","• "+Coursename4+" ("+Year4+")"+" - "+School4);
                } else if (!Objects.equals(Coursename4, "") && !Objects.equals(School4, "") && Objects.equals(Year4, "")) {
                    parameters.put("Course4","• "+Coursename4+" - "+School4);
                } else if (!Objects.equals(Coursename4, "") && !Objects.equals(Year4, "") && Objects.equals(School4, "")) {
                    parameters.put("Course4","• "+Coursename4+" ("+Year4+")");
                } else {
                    parameters.put("Course4", "");
                }
            }
            PreparedStatement statement2_5 = conn.prepareStatement(selectData2_5);
            ResultSet rs2_5 = statement2_5.executeQuery();
            while (rs2_5.next()) {
                String Coursename5 = rs2_5.getString(3);
                String School5 = rs2_5.getString(4);
                String Year5 = rs2_5.getString(5);

                eduCourse5.setText(Coursename5);
                eduSchool5.setText(School5);
                eduYear5.setText(Year5);
                if (!Objects.equals(Coursename5, "") && !Objects.equals(School5, "") && !Objects.equals(Year5, "")) {
                    parameters.put("Course5","• "+Coursename5+" ("+Year5+")"+" - "+School5);
                } else if (!Objects.equals(Coursename5, "") && !Objects.equals(School5, "") && Objects.equals(Year5, "")) {
                    parameters.put("Course5","• "+Coursename5+" - "+School5);
                } else if (!Objects.equals(Coursename5, "") && !Objects.equals(Year5, "") && Objects.equals(School5, "")) {
                    parameters.put("Course5","• "+Coursename5+" ("+Year5+")");
                } else {
                    parameters.put("Course5", "");
                }
            }
            PreparedStatement statement2_6 = conn.prepareStatement(selectData2_6);
            ResultSet rs2_6 = statement2_6.executeQuery();
            while (rs2_6.next()) {
                String Coursename6 = rs2_6.getString(3);
                String School6 = rs2_6.getString(4);
                String Year6 = rs2_6.getString(5);

                eduCourse6.setText(Coursename6);
                eduSchool6.setText(School6);
                eduYear6.setText(Year6);
                if (!Objects.equals(Coursename6, "") && !Objects.equals(School6, "") && !Objects.equals(Year6, "")) {
                    parameters.put("Course6","• "+Coursename6+" ("+Year6+")"+" - "+School6);
                } else if (!Objects.equals(Coursename6, "") && !Objects.equals(School6, "") && Objects.equals(Year6, "")) {
                    parameters.put("Course6","• "+Coursename6+" - "+School6);
                } else if (!Objects.equals(Coursename6, "") && !Objects.equals(Year6, "") && Objects.equals(School6, "")) {
                    parameters.put("Course6","• "+Coursename6+" ("+Year6+")");
                } else {
                    parameters.put("Course6", "");
                }
            }
        }catch (SQLException e){
            Logger.getLogger(dashboardController.class.getName()).log(Level.SEVERE, null, e);
            System.out.println(e);
        }
    }

    public void getExpDetails() {
        DBConnect dbConnect = new DBConnect();
        Connection conn = dbConnect.getConnection();
        String selectData3_1 = "SELECT * FROM cv_exp WHERE profile_id = '"+ID+"' LIMIT 1";
        String selectData3_2 = "SELECT * FROM cv_exp WHERE profile_id = '"+ID+"' LIMIT 1 OFFSET 1";
        String selectData3_3 = "SELECT * FROM cv_exp WHERE profile_id = '"+ID+"' LIMIT 1 OFFSET 2";
        String selectData3_4 = "SELECT * FROM cv_exp WHERE profile_id = '"+ID+"' LIMIT 1 OFFSET 3";
        String selectData3_5 = "SELECT * FROM cv_exp WHERE profile_id = '"+ID+"' LIMIT 1 OFFSET 4";

        try {
            PreparedStatement statement3_1 = conn.prepareStatement(selectData3_1);
            ResultSet rs3_1 = statement3_1.executeQuery();
            while (rs3_1.next()) {
                String Job1 = rs3_1.getString(3);
                String Company1 = rs3_1.getString(4);
                String Details1 = rs3_1.getString(7);
                expJob.setText(Job1);
                expCompany.setText(Company1);
                expDetails.setText(Details1);
                if (!Objects.equals(rs3_1.getString(5), "null") && !Objects.equals(rs3_1.getString(6), "null")) {
                    Date StartDate1 = rs3_1.getDate(5);
                    Date EndDate1 = rs3_1.getDate(6);
                    expStartDate.setValue(StartDate1.toLocalDate());
                    expEndDate.setValue(EndDate1.toLocalDate());
                    if (!Objects.equals(Job1, "") && !Objects.equals(Company1, "")) {
                        parameters.put("Job1", Job1);
                        parameters.put("JobDetails1", Company1+"\n("+StartDate1+" ➔ "+EndDate1+")\n"+Details1);
                    } else {
                        parameters.put("Job1", null);
                        parameters.put("JobDetails1", null);
                    }
                } else if (!Objects.equals(rs3_1.getString(5), "null") && Objects.equals(rs3_1.getString(6), "null")) {
                    Date StartDate1 = rs3_1.getDate(5);
                    expStartDate.setValue(StartDate1.toLocalDate());
                    expEndDate.setValue(null);
                    if (!Objects.equals(Job1, "") && !Objects.equals(Company1, "")) {
                        parameters.put("Job1", Job1);
                        parameters.put("JobDetails1", Company1+"\n("+StartDate1+")\n"+Details1);
                    } else {
                        parameters.put("Job1", null);
                        parameters.put("JobDetails1", null);
                    }
                } else {
                    expStartDate.setValue(null);
                    expEndDate.setValue(null);
                    if (!Objects.equals(Job1, "") && !Objects.equals(Company1, "")) {
                        parameters.put("Job1", Job1);
                        parameters.put("JobDetails1", Company1+"\n"+Details1);
                    } else {
                        parameters.put("Job1", null);
                        parameters.put("JobDetails1", null);
                    }
                }
            }
            PreparedStatement statement3_2 = conn.prepareStatement(selectData3_2);
            ResultSet rs3_2 = statement3_2.executeQuery();
            while (rs3_2.next()) {
                String Job2 = rs3_2.getString(3);
                String Company2 = rs3_2.getString(4);
                String Details2 = rs3_2.getString(7);
                expJob2.setText(Job2);
                expCompany2.setText(Company2);
                expDetails2.setText(Details2);
                if (!Objects.equals(rs3_2.getString(5), "null") && !Objects.equals(rs3_2.getString(6), "null")) {
                    Date StartDate2 = rs3_2.getDate(5);
                    Date EndDate2 = rs3_2.getDate(6);
                    expStartDate2.setValue(StartDate2.toLocalDate());
                    expEndDate2.setValue(EndDate2.toLocalDate());
                    if (!Objects.equals(Job2, "") && !Objects.equals(Company2, "")) {
                        parameters.put("Job2", Job2);
                        parameters.put("JobDetails2", Company2+"\n("+StartDate2+" ➔ "+EndDate2+")\n"+Details2);
                    } else {
                        parameters.put("Job2", null);
                        parameters.put("JobDetails2", null);
                    }
                } else if (!Objects.equals(rs3_2.getString(5), "null") && Objects.equals(rs3_2.getString(6), "null")) {
                    Date StartDate2 = rs3_2.getDate(5);
                    expStartDate2.setValue(StartDate2.toLocalDate());
                    expEndDate2.setValue(null);
                    if (!Objects.equals(Job2, "") && !Objects.equals(Company2, "")) {
                        parameters.put("Job2", Job2);
                        parameters.put("JobDetails2", Company2+"\n("+StartDate2+")\n"+Details2);
                    } else {
                        parameters.put("Job2", null);
                        parameters.put("JobDetails2", null);
                    }
                } else {
                    expStartDate2.setValue(null);
                    expEndDate2.setValue(null);
                    if (!Objects.equals(Job2, "") && !Objects.equals(Company2, "")) {
                        parameters.put("Job2", Job2);
                        parameters.put("JobDetails2", Company2+"\n"+Details2);
                    } else {
                        parameters.put("Job2", null);
                        parameters.put("JobDetails2", null);
                    }
                }
            }
            PreparedStatement statement3_3 = conn.prepareStatement(selectData3_3);
            ResultSet rs3_3 = statement3_3.executeQuery();
            while (rs3_3.next()) {
                String Job3 = rs3_3.getString(3);
                String Company3 = rs3_3.getString(4);
                String Details3 = rs3_3.getString(7);
                expJob3.setText(Job3);
                expCompany3.setText(Company3);
                expDetails3.setText(Details3);
                if (!Objects.equals(rs3_3.getString(5), "null") && !Objects.equals(rs3_3.getString(6), "null")) {
                    Date StartDate3 = rs3_3.getDate(5);
                    Date EndDate3 = rs3_3.getDate(6);
                    expStartDate3.setValue(StartDate3.toLocalDate());
                    expEndDate3.setValue(EndDate3.toLocalDate());
                    if (!Objects.equals(Job3, "") && !Objects.equals(Company3, "")) {
                        parameters.put("Job3", Job3);
                        parameters.put("JobDetails3", Company3+"\n("+StartDate3+" ➔ "+EndDate3+")\n"+Details3);
                    } else {
                        parameters.put("Job3", null);
                        parameters.put("JobDetails3", null);
                    }
                } else if (!Objects.equals(rs3_3.getString(5), "null") && Objects.equals(rs3_3.getString(6), "null")) {
                    Date StartDate3 = rs3_3.getDate(5);
                    expStartDate3.setValue(StartDate3.toLocalDate());
                    expEndDate3.setValue(null);
                    if (!Objects.equals(Job3, "") && !Objects.equals(Company3, "")) {
                        parameters.put("Job3", Job3);
                        parameters.put("JobDetails3", Company3+"\n("+StartDate3+")\n"+Details3);
                    } else {
                        parameters.put("Job3", null);
                        parameters.put("JobDetails3", null);
                    }
                } else {
                    expStartDate3.setValue(null);
                    expEndDate3.setValue(null);
                    if (!Objects.equals(Job3, "") && !Objects.equals(Company3, "")) {
                        parameters.put("Job3", Job3);
                        parameters.put("JobDetails3", Company3+"\n"+Details3);
                    } else {
                        parameters.put("Job3", null);
                        parameters.put("JobDetails3", null);
                    }
                }
            }
            PreparedStatement statement3_4 = conn.prepareStatement(selectData3_4);
            ResultSet rs3_4 = statement3_4.executeQuery();
            while (rs3_4.next()) {
                String Job4 = rs3_4.getString(3);
                String Company4 = rs3_4.getString(4);
                String Details4 = rs3_4.getString(7);
                expJob4.setText(Job4);
                expCompany4.setText(Company4);
                expDetails4.setText(Details4);
                if (!Objects.equals(rs3_4.getString(5), "null") && !Objects.equals(rs3_4.getString(6), "null")) {
                    Date StartDate4 = rs3_4.getDate(5);
                    Date EndDate4 = rs3_4.getDate(6);
                    expStartDate4.setValue(StartDate4.toLocalDate());
                    expEndDate4.setValue(EndDate4.toLocalDate());
                    if (!Objects.equals(Job4, "") && !Objects.equals(Company4, "")) {
                        parameters.put("Job4", Job4);
                        parameters.put("JobDetails4", Company4+"\n("+StartDate4+" ➔ "+EndDate4+")\n"+Details4);
                    } else {
                        parameters.put("Job4", null);
                        parameters.put("JobDetails4", null);
                    }
                } else if (!Objects.equals(rs3_4.getString(5), "null") && Objects.equals(rs3_4.getString(6), "null")) {
                    Date StartDate4 = rs3_4.getDate(5);
                    expStartDate4.setValue(StartDate4.toLocalDate());
                    expEndDate4.setValue(null);
                    if (!Objects.equals(Job4, "") && !Objects.equals(Company4, "")) {
                        parameters.put("Job4", Job4);
                        parameters.put("JobDetails4", Company4+"\n("+StartDate4+")\n"+Details4);
                    } else {
                        parameters.put("Job4", null);
                        parameters.put("JobDetails4", null);
                    }
                } else {
                    expStartDate4.setValue(null);
                    expEndDate4.setValue(null);
                    if (!Objects.equals(Job4, "") && !Objects.equals(Company4, "")) {
                        parameters.put("Job4", Job4);
                        parameters.put("JobDetails4", Company4+"\n"+Details4);
                    } else {
                        parameters.put("Job4", null);
                        parameters.put("JobDetails4", null);
                    }
                }
            }
            PreparedStatement statement3_5 = conn.prepareStatement(selectData3_5);
            ResultSet rs3_5 = statement3_5.executeQuery();
            while (rs3_5.next()) {
                String Job5 = rs3_5.getString(3);
                String Company5 = rs3_5.getString(4);
                String Details5 = rs3_5.getString(7);
                expJob5.setText(Job5);
                expCompany5.setText(Company5);
                expDetails5.setText(Details5);
                if (!Objects.equals(rs3_5.getString(5), "null") && !Objects.equals(rs3_5.getString(6), "null")) {
                    Date StartDate5 = rs3_5.getDate(5);
                    Date EndDate5 = rs3_5.getDate(6);
                    expStartDate5.setValue(StartDate5.toLocalDate());
                    expEndDate5.setValue(EndDate5.toLocalDate());
                } else if (!Objects.equals(rs3_5.getString(5), "null") && Objects.equals(rs3_5.getString(6), "null")) {
                    Date StartDate5 = rs3_5.getDate(5);
                    expStartDate5.setValue(StartDate5.toLocalDate());
                    expEndDate5.setValue(null);
                } else {
                    expStartDate5.setValue(null);
                    expEndDate5.setValue(null);
                }
            }
        }catch (SQLException e){
            Logger.getLogger(dashboardController.class.getName()).log(Level.SEVERE, null, e);
            System.out.println(e);
        }
    }

    public void getSkillDetails() {
        DBConnect dbConnect = new DBConnect();
        Connection conn = dbConnect.getConnection();
        String selectData4_1 = "SELECT * FROM cv_skill WHERE profile_id = '"+ID+"' LIMIT 1";
        String selectData4_2 = "SELECT * FROM cv_skill WHERE profile_id = '"+ID+"' LIMIT 1 OFFSET 1";
        String selectData4_3 = "SELECT * FROM cv_skill WHERE profile_id = '"+ID+"' LIMIT 1 OFFSET 2";
        String selectData4_4 = "SELECT * FROM cv_skill WHERE profile_id = '"+ID+"' LIMIT 1 OFFSET 3";
        String selectData4_5 = "SELECT * FROM cv_skill WHERE profile_id = '"+ID+"' LIMIT 1 OFFSET 4";
        String selectData4_6 = "SELECT * FROM cv_skill WHERE profile_id = '"+ID+"' LIMIT 1 OFFSET 5";
        String selectData4_7 = "SELECT * FROM cv_skill WHERE profile_id = '"+ID+"' LIMIT 1 OFFSET 6";
        String selectData4_8 = "SELECT * FROM cv_skill WHERE profile_id = '"+ID+"' LIMIT 1 OFFSET 7";
        String selectData4_9 = "SELECT * FROM cv_skill WHERE profile_id = '"+ID+"' LIMIT 1 OFFSET 8";
        String selectData4_10 = "SELECT * FROM cv_skill WHERE profile_id = '"+ID+"' LIMIT 1 OFFSET 9";

        try {
            Image q1_1 = new Image("C:\\Users\\Acer\\IdeaProjects\\CV\\src\\main\\images\\25%level_bar_blue.png");
            Image q1_2 = new Image("C:\\Users\\Acer\\IdeaProjects\\CV\\src\\main\\images\\50%level_bar_blue.png");
            Image q1_3 = new Image("C:\\Users\\Acer\\IdeaProjects\\CV\\src\\main\\images\\75%level_bar_blue.png");
            Image q1_4 = new Image("C:\\Users\\Acer\\IdeaProjects\\CV\\src\\main\\images\\100%level_bar_blue.png");
            Image q2_1 = new Image("C:\\Users\\Acer\\IdeaProjects\\CV\\src\\main\\images\\25%level_bar_brown.png");
            Image q2_2 = new Image("C:\\Users\\Acer\\IdeaProjects\\CV\\src\\main\\images\\50%level_bar_brown.png");
            Image q2_3 = new Image("C:\\Users\\Acer\\IdeaProjects\\CV\\src\\main\\images\\75%level_bar_brown.png");
            Image q2_4 = new Image("C:\\Users\\Acer\\IdeaProjects\\CV\\src\\main\\images\\100%level_bar_brown.png");
            BufferedImage Q1 = SwingFXUtils.fromFXImage(q1_1, null);
            BufferedImage Q2 = SwingFXUtils.fromFXImage(q1_2, null);
            BufferedImage Q3 = SwingFXUtils.fromFXImage(q1_3, null);
            BufferedImage Q4 = SwingFXUtils.fromFXImage(q1_4, null);
            BufferedImage Q1_1 = SwingFXUtils.fromFXImage(q2_1, null);
            BufferedImage Q1_2 = SwingFXUtils.fromFXImage(q2_2, null);
            BufferedImage Q1_3 = SwingFXUtils.fromFXImage(q2_3, null);
            BufferedImage Q1_4 = SwingFXUtils.fromFXImage(q2_4, null);
            PreparedStatement statement4_1 = conn.prepareStatement(selectData4_1);
            ResultSet rs4_1 = statement4_1.executeQuery();
            while (rs4_1.next()) {
                String Skill1 = rs4_1.getString(3);
                String Level1 = rs4_1.getString(4);

                skillName.setText(Skill1);
                if (!Objects.equals(Skill1, "")) {
                    parameters.put("Skill1", "• "+Skill1);
                } else {
                    parameters.put("Skill1", null);
                }
                switch (Level1) {
                    case " Beginner" -> {
                        skill.selectToggle(skillLevel1);
                        parameters.put("Level1", Q1);
                        parameters.put("Level1_1", Q1_1);
                    }
                    case " Intermediate" -> {
                        skill.selectToggle(skillLevel2);
                        parameters.put("Level1", Q2);
                        parameters.put("Level1_1", Q1_2);
                    }
                    case " Advanced" -> {
                        skill.selectToggle(skillLevel3);
                        parameters.put("Level1", Q3);
                        parameters.put("Level1_1", Q1_3);
                    }
                    case " Expert" -> {
                        skill.selectToggle(skillLevel4);
                        parameters.put("Level1", Q4);
                        parameters.put("Level1_1", Q1_4);
                    }
                }
            }
            PreparedStatement statement4_2 = conn.prepareStatement(selectData4_2);
            ResultSet rs4_2 = statement4_2.executeQuery();
            while (rs4_2.next()) {
                String Skill2 = rs4_2.getString(3);
                String Level2 = rs4_2.getString(4);

                skillName2.setText(Skill2);
                if (!Objects.equals(Skill2, "")) {
                    parameters.put("Skill2", "• "+Skill2);
                } else {
                    parameters.put("Skill2", "");
                }
                switch (Level2) {
                    case " Beginner" -> {
                        skill2.selectToggle(skillLevel2_1);
                        parameters.put("Level2", Q1);
                        parameters.put("Level1_2", Q1_1);
                    }
                    case " Intermediate" -> {
                        skill2.selectToggle(skillLevel2_2);
                        parameters.put("Level2", Q2);
                        parameters.put("Level1_2", Q1_2);
                    }
                    case " Advanced" -> {
                        skill2.selectToggle(skillLevel2_3);
                        parameters.put("Level2", Q3);
                        parameters.put("Level1_2", Q1_3);
                    }
                    case " Expert" -> {
                        skill2.selectToggle(skillLevel2_4);
                        parameters.put("Level2", Q4);
                        parameters.put("Level1_2", Q1_4);
                    }
                }
            }
            PreparedStatement statement4_3 = conn.prepareStatement(selectData4_3);
            ResultSet rs4_3 = statement4_3.executeQuery();
            while (rs4_3.next()) {
                String Skill3 = rs4_3.getString(3);
                String Level3 = rs4_3.getString(4);

                skillName3.setText(Skill3);
                if (!Objects.equals(Skill3, "")) {
                    parameters.put("Skill3", "• "+Skill3);
                } else {
                    parameters.put("Skill3", "");
                }
                switch (Level3) {
                    case " Beginner" -> {
                        skill3.selectToggle(skillLevel3_1);
                        parameters.put("Level3", Q1);
                        parameters.put("Level1_3", Q1_1);
                    }
                    case " Intermediate" -> {
                        skill3.selectToggle(skillLevel3_2);
                        parameters.put("Level3", Q2);
                        parameters.put("Level1_3", Q1_2);
                    }
                    case " Advanced" -> {
                        skill3.selectToggle(skillLevel3_3);
                        parameters.put("Level3", Q3);
                        parameters.put("Level1_3", Q1_3);
                    }
                    case " Expert" -> {
                        skill3.selectToggle(skillLevel3_4);
                        parameters.put("Level3", Q4);
                        parameters.put("Level1_3", Q1_4);
                    }
                }
            }
            PreparedStatement statement4_4 = conn.prepareStatement(selectData4_4);
            ResultSet rs4_4 = statement4_4.executeQuery();
            while (rs4_4.next()) {
                String Skill4 = rs4_4.getString(3);
                String Level4 = rs4_4.getString(4);

                skillName4.setText(Skill4);
                if (!Objects.equals(Skill4, "")) {
                    parameters.put("Skill4", "• "+Skill4);
                } else {
                    parameters.put("Skill4", "");
                }
                switch (Level4) {
                    case " Beginner" -> {
                        skill4.selectToggle(skillLevel4_1);
                        parameters.put("Level4", Q1);
                        parameters.put("Level1_4", Q1_1);
                    }
                    case " Intermediate" -> {
                        skill4.selectToggle(skillLevel4_2);
                        parameters.put("Level4", Q2);
                        parameters.put("Level1_4", Q1_2);
                    }
                    case " Advanced" -> {
                        skill4.selectToggle(skillLevel4_3);
                        parameters.put("Level4", Q3);
                        parameters.put("Level1_4", Q1_3);
                    }
                    case " Expert" -> {
                        skill4.selectToggle(skillLevel4_4);
                        parameters.put("Level4", Q4);
                        parameters.put("Level1_4", Q1_4);
                    }
                }
            }
            PreparedStatement statement4_5 = conn.prepareStatement(selectData4_5);
            ResultSet rs4_5 = statement4_5.executeQuery();
            while (rs4_5.next()) {
                String Skill5 = rs4_5.getString(3);
                String Level5 = rs4_5.getString(4);

                skillName5.setText(Skill5);
                if (!Objects.equals(Skill5, "")) {
                    parameters.put("Skill5", "• "+Skill5);
                } else {
                    parameters.put("Skill5", "");
                }
                switch (Level5) {
                    case " Beginner" -> {
                        skill5.selectToggle(skillLevel5_1);
                        parameters.put("Level5", Q1);
                        parameters.put("Level1_5", Q1_1);
                    }
                    case " Intermediate" -> {
                        skill5.selectToggle(skillLevel5_2);
                        parameters.put("Level5", Q2);
                        parameters.put("Level1_5", Q1_2);
                    }
                    case " Advanced" -> {
                        skill5.selectToggle(skillLevel5_3);
                        parameters.put("Level5", Q3);
                        parameters.put("Level1_5", Q1_3);
                    }
                    case " Expert" -> {
                        skill5.selectToggle(skillLevel5_4);
                        parameters.put("Level5", Q4);
                        parameters.put("Level1_5", Q1_4);
                    }
                }
            }
            PreparedStatement statement4_6 = conn.prepareStatement(selectData4_6);
            ResultSet rs4_6 = statement4_6.executeQuery();
            while (rs4_6.next()) {
                String Skill6 = rs4_6.getString(3);
                String Level6 = rs4_6.getString(4);

                skillName6.setText(Skill6);
                switch (Level6) {
                    case " Beginner" -> skill6.selectToggle(skillLevel6_1);
                    case " Intermediate" -> skill6.selectToggle(skillLevel6_2);
                    case " Advanced" -> skill6.selectToggle(skillLevel6_3);
                    case " Expert" -> skill6.selectToggle(skillLevel6_4);
                }
            }
            PreparedStatement statement4_7 = conn.prepareStatement(selectData4_7);
            ResultSet rs4_7 = statement4_7.executeQuery();
            while (rs4_7.next()) {
                String Skill7 = rs4_7.getString(3);
                String Level7 = rs4_7.getString(4);

                skillName7.setText(Skill7);
                switch (Level7) {
                    case " Beginner" -> skill7.selectToggle(skillLevel7_1);
                    case " Intermediate" -> skill7.selectToggle(skillLevel7_2);
                    case " Advanced" -> skill7.selectToggle(skillLevel7_3);
                    case " Expert" -> skill7.selectToggle(skillLevel7_4);
                }
            }
            PreparedStatement statement4_8 = conn.prepareStatement(selectData4_8);
            ResultSet rs4_8 = statement4_8.executeQuery();
            while (rs4_8.next()) {
                String Skill8 = rs4_8.getString(3);
                String Level8 = rs4_8.getString(4);

                skillName8.setText(Skill8);
                switch (Level8) {
                    case " Beginner" -> skill8.selectToggle(skillLevel8_1);
                    case " Intermediate" -> skill8.selectToggle(skillLevel8_2);
                    case " Advanced" -> skill8.selectToggle(skillLevel8_3);
                    case " Expert" -> skill8.selectToggle(skillLevel8_4);
                }
            }
            PreparedStatement statement4_9 = conn.prepareStatement(selectData4_9);
            ResultSet rs4_9 = statement4_9.executeQuery();
            while (rs4_9.next()) {
                String Skill9 = rs4_9.getString(3);
                String Level9 = rs4_9.getString(4);

                skillName9.setText(Skill9);
                switch (Level9) {
                    case " Beginner" -> skill9.selectToggle(skillLevel9_1);
                    case " Intermediate" -> skill9.selectToggle(skillLevel9_2);
                    case " Advanced" -> skill9.selectToggle(skillLevel9_3);
                    case " Expert" -> skill9.selectToggle(skillLevel9_4);
                }
            }
            PreparedStatement statement4_10 = conn.prepareStatement(selectData4_10);
            ResultSet rs4_10 = statement4_10.executeQuery();
            while (rs4_10.next()) {
                String Skill10 = rs4_10.getString(3);
                String Level10 = rs4_10.getString(4);

                skillName10.setText(Skill10);
                switch (Level10) {
                    case " Beginner" -> skill10.selectToggle(skillLevel10_1);
                    case " Intermediate" -> skill10.selectToggle(skillLevel10_2);
                    case " Advanced" -> skill10.selectToggle(skillLevel10_3);
                    case " Expert" -> skill10.selectToggle(skillLevel10_4);
                }
            }
        }catch (SQLException e) {
            Logger.getLogger(dashboardController.class.getName()).log(Level.SEVERE, null, e);
            System.out.println(e);
        }
    }

    public void getAchieveDetails() {
        DBConnect dbConnect = new DBConnect();
        Connection conn = dbConnect.getConnection();
        String selectData5_1 = "SELECT * FROM cv_achieve WHERE profile_id = '"+ID+"' LIMIT 1";
        String selectData5_2 = "SELECT * FROM cv_achieve WHERE profile_id = '"+ID+"' LIMIT 1 OFFSET 1";
        String selectData5_3 = "SELECT * FROM cv_achieve WHERE profile_id = '"+ID+"' LIMIT 1 OFFSET 2";
        String selectData5_4 = "SELECT * FROM cv_achieve WHERE profile_id = '"+ID+"' LIMIT 1 OFFSET 3";
        String selectData5_5 = "SELECT * FROM cv_achieve WHERE profile_id = '"+ID+"' LIMIT 1 OFFSET 4";
        String selectData5_6 = "SELECT * FROM cv_achieve WHERE profile_id = '"+ID+"' LIMIT 1 OFFSET 5";
        String selectData5_7 = "SELECT * FROM cv_achieve WHERE profile_id = '"+ID+"' LIMIT 1 OFFSET 6";
        String selectData5_8 = "SELECT * FROM cv_achieve WHERE profile_id = '"+ID+"' LIMIT 1 OFFSET 7";
        String selectData5_9 = "SELECT * FROM cv_achieve WHERE profile_id = '"+ID+"' LIMIT 1 OFFSET 8";
        String selectData5_10 = "SELECT * FROM cv_achieve WHERE profile_id = '"+ID+"' LIMIT 1 OFFSET 9";

        try {
            PreparedStatement statement5_1 = conn.prepareStatement(selectData5_1);
            ResultSet rs5_1 = statement5_1.executeQuery();
            while (rs5_1.next()) {
                String Name1 = rs5_1.getString(3);
                String Year1 = rs5_1.getString(4);

                achieveName.setText(Name1);
                achieveYear.setText(Year1);
                if (!Objects.equals(Name1, "") && !Objects.equals(Year1, "")) {
                    parameters.put("Achieve1", "• "+Name1+" ("+Year1+")");
                } else if (!Objects.equals(Name1, "") && Objects.equals(Year1, "")) {
                    parameters.put("Achieve1", "• "+Name1);
                } else {
                    parameters.put("Achieve1", null);
                }
            }
            PreparedStatement statement5_2 = conn.prepareStatement(selectData5_2);
            ResultSet rs5_2 = statement5_2.executeQuery();
            while (rs5_2.next()) {
                String Name2 = rs5_2.getString(3);
                String Year2 = rs5_2.getString(4);

                achieveName2.setText(Name2);
                achieveYear2.setText(Year2);
                if (!Objects.equals(Name2, "") && !Objects.equals(Year2, "")) {
                    parameters.put("Achieve2", "• "+Name2+" ("+Year2+")");
                } else if (!Objects.equals(Name2, "") && Objects.equals(Year2, "")) {
                    parameters.put("Achieve2", "• "+Name2);
                } else {
                    parameters.put("Achieve2", "");
                }
            }
            PreparedStatement statement5_3 = conn.prepareStatement(selectData5_3);
            ResultSet rs5_3 = statement5_3.executeQuery();
            while (rs5_3.next()) {
                String Name3 = rs5_3.getString(3);
                String Year3 = rs5_3.getString(4);

                achieveName3.setText(Name3);
                achieveYear3.setText(Year3);
                if (!Objects.equals(Name3, "") && !Objects.equals(Year3, "")) {
                    parameters.put("Achieve3", "• "+Name3+" ("+Year3+")");
                } else if (!Objects.equals(Name3, "") && Objects.equals(Year3, "")) {
                    parameters.put("Achieve3", "• "+Name3);
                } else {
                    parameters.put("Achieve3", "");
                }
            }
            PreparedStatement statement5_4 = conn.prepareStatement(selectData5_4);
            ResultSet rs5_4 = statement5_4.executeQuery();
            while (rs5_4.next()) {
                String Name4 = rs5_4.getString(3);
                String Year4 = rs5_4.getString(4);

                achieveName4.setText(Name4);
                achieveYear4.setText(Year4);
                if (!Objects.equals(Name4, "") && !Objects.equals(Year4, "")) {
                    parameters.put("Achieve4", "• "+Name4+" ("+Year4+")");
                } else if (!Objects.equals(Name4, "") && Objects.equals(Year4, "")) {
                    parameters.put("Achieve4", "• "+Name4);
                } else {
                    parameters.put("Achieve4", "");
                }
            }
            PreparedStatement statement5_5 = conn.prepareStatement(selectData5_5);
            ResultSet rs5_5 = statement5_5.executeQuery();
            while (rs5_5.next()) {
                String Name5 = rs5_5.getString(3);
                String Year5 = rs5_5.getString(4);

                achieveName5.setText(Name5);
                achieveYear5.setText(Year5);
                if (!Objects.equals(Name5, "") && !Objects.equals(Year5, "")) {
                    parameters.put("Achieve5", "• "+Name5+" ("+Year5+")");
                } else if (!Objects.equals(Name5, "") && Objects.equals(Year5, "")) {
                    parameters.put("Achieve5", "• "+Name5);
                } else {
                    parameters.put("Achieve5", "");
                }
            }
            PreparedStatement statement5_6 = conn.prepareStatement(selectData5_6);
            ResultSet rs5_6 = statement5_6.executeQuery();
            while (rs5_6.next()) {
                String Name6 = rs5_6.getString(3);
                String Year6 = rs5_6.getString(4);

                achieveName6.setText(Name6);
                achieveYear6.setText(Year6);
            }
            PreparedStatement statement5_7 = conn.prepareStatement(selectData5_7);
            ResultSet rs5_7 = statement5_7.executeQuery();
            while (rs5_7.next()) {
                String Name7 = rs5_7.getString(3);
                String Year7 = rs5_7.getString(4);

                achieveName7.setText(Name7);
                achieveYear7.setText(Year7);
            }
            PreparedStatement statement5_8 = conn.prepareStatement(selectData5_8);
            ResultSet rs5_8 = statement5_8.executeQuery();
            while (rs5_8.next()) {
                String Name8 = rs5_8.getString(3);
                String Year8 = rs5_8.getString(4);

                achieveName8.setText(Name8);
                achieveYear8.setText(Year8);
            }
            PreparedStatement statement5_9 = conn.prepareStatement(selectData5_9);
            ResultSet rs5_9 = statement5_9.executeQuery();
            while (rs5_9.next()) {
                String Name9 = rs5_9.getString(3);
                String Year9 = rs5_9.getString(4);

                achieveName9.setText(Name9);
                achieveYear9.setText(Year9);
            }
            PreparedStatement statement5_10 = conn.prepareStatement(selectData5_10);
            ResultSet rs5_10 = statement5_10.executeQuery();
            while (rs5_10.next()) {
                String Name10 = rs5_10.getString(3);
                String Year10 = rs5_10.getString(4);

                achieveName10.setText(Name10);
                achieveYear10.setText(Year10);
            }
        }catch (SQLException e){
            Logger.getLogger(dashboardController.class.getName()).log(Level.SEVERE, null, e);
            System.out.println(e);
        }
    }

    public void getProjectDetails() {
        DBConnect dbConnect = new DBConnect();
        Connection conn = dbConnect.getConnection();
        String selectData6_1 = "SELECT * FROM cv_projects WHERE profile_id = '"+ID+"' LIMIT 1";
        String selectData6_2 = "SELECT * FROM cv_projects WHERE profile_id = '"+ID+"' LIMIT 1 OFFSET 1";
        String selectData6_3 = "SELECT * FROM cv_projects WHERE profile_id = '"+ID+"' LIMIT 1 OFFSET 2";
        String selectData6_4 = "SELECT * FROM cv_projects WHERE profile_id = '"+ID+"' LIMIT 1 OFFSET 3";
        String selectData6_5 = "SELECT * FROM cv_projects WHERE profile_id = '"+ID+"' LIMIT 1 OFFSET 4";

        try {
            PreparedStatement statement6_1 = conn.prepareStatement(selectData6_1);
            ResultSet rs6_1 = statement6_1.executeQuery();
            while (rs6_1.next()) {
                String Title1 = rs6_1.getString(3);
                String Description1 = rs6_1.getString(4);

                projectTitle.setText(Title1);
                projectDescrip.setText(Description1);
            }
            PreparedStatement statement6_2 = conn.prepareStatement(selectData6_2);
            ResultSet rs6_2 = statement6_2.executeQuery();
            while (rs6_2.next()) {
                String Title2 = rs6_2.getString(3);
                String Description2 = rs6_2.getString(4);

                projectTitle2.setText(Title2);
                projectDescrip2.setText(Description2);
            }
            PreparedStatement statement6_3 = conn.prepareStatement(selectData6_3);
            ResultSet rs6_3 = statement6_3.executeQuery();
            while (rs6_3.next()) {
                String Title3 = rs6_3.getString(3);
                String Description3 = rs6_3.getString(4);

                projectTitle3.setText(Title3);
                projectDescrip3.setText(Description3);
            }
            PreparedStatement statement6_4 = conn.prepareStatement(selectData6_4);
            ResultSet rs6_4 = statement6_4.executeQuery();
            while (rs6_4.next()) {
                String Title4 = rs6_4.getString(3);
                String Description4 = rs6_4.getString(4);

                projectTitle4.setText(Title4);
                projectDescrip4.setText(Description4);
            }
            PreparedStatement statement6_5 = conn.prepareStatement(selectData6_5);
            ResultSet rs6_5 = statement6_5.executeQuery();
            while (rs6_5.next()) {
                String Title5 = rs6_5.getString(3);
                String Description5 = rs6_5.getString(4);

                projectTitle5.setText(Title5);
                projectDescrip5.setText(Description5);
            }
        }catch (SQLException e){
            Logger.getLogger(dashboardController.class.getName()).log(Level.SEVERE, null, e);
            System.out.println(e);
        }
    }

    public void getLangDetails() {
        DBConnect dbConnect = new DBConnect();
        Connection conn = dbConnect.getConnection();
        String selectData7_1 = "SELECT * FROM cv_lang WHERE profile_id = '"+ID+"' LIMIT 1";
        String selectData7_2 = "SELECT * FROM cv_lang WHERE profile_id = '"+ID+"' LIMIT 1 OFFSET 1";
        String selectData7_3 = "SELECT * FROM cv_lang WHERE profile_id = '"+ID+"' LIMIT 1 OFFSET 2";
        String selectData7_4 = "SELECT * FROM cv_lang WHERE profile_id = '"+ID+"' LIMIT 1 OFFSET 3";
        String selectData7_5 = "SELECT * FROM cv_lang WHERE profile_id = '"+ID+"' LIMIT 1 OFFSET 4";

        try {
            PreparedStatement statement7_1 = conn.prepareStatement(selectData7_1);
            ResultSet rs7_1 = statement7_1.executeQuery();
            while (rs7_1.next()) {
                String Language1 = rs7_1.getString(3);

                langName.setText(Language1);
                if (!Objects.equals(Language1, "")) {
                    parameters.put("Lang1", "• "+Language1);
                } else {
                    parameters.put("Lang1", null);
                }
            }
            PreparedStatement statement7_2 = conn.prepareStatement(selectData7_2);
            ResultSet rs7_2 = statement7_2.executeQuery();
            while (rs7_2.next()) {
                String Language2 = rs7_2.getString(3);

                langName2.setText(Language2);
                if (!Objects.equals(Language2, "")) {
                    parameters.put("Lang2", "• "+Language2);
                } else {
                    parameters.put("Lang2", "");
                }
            }
            PreparedStatement statement7_3 = conn.prepareStatement(selectData7_3);
            ResultSet rs7_3 = statement7_3.executeQuery();
            while (rs7_3.next()) {
                String Language3 = rs7_3.getString(3);

                langName3.setText(Language3);
                if (!Objects.equals(Language3, "")) {
                    parameters.put("Lang3", "• "+Language3);
                } else {
                    parameters.put("Lang3", "");
                }
            }
            PreparedStatement statement7_4 = conn.prepareStatement(selectData7_4);
            ResultSet rs7_4 = statement7_4.executeQuery();
            while (rs7_4.next()) {
                String Language4 = rs7_4.getString(3);

                langName4.setText(Language4);
                if (!Objects.equals(Language4, "")) {
                    parameters.put("Lang4", "• "+Language4);
                } else {
                    parameters.put("Lang4", "");
                }
            }
            PreparedStatement statement7_5 = conn.prepareStatement(selectData7_5);
            ResultSet rs7_5 = statement7_5.executeQuery();
            while (rs7_5.next()) {
                String Language5 = rs7_5.getString(3);

                langName5.setText(Language5);
                if (!Objects.equals(Language5, "")) {
                    parameters.put("Lang5", "• "+Language5);
                } else {
                    parameters.put("Lang5", "");
                }
            }
        }catch (SQLException e){
            Logger.getLogger(dashboardController.class.getName()).log(Level.SEVERE, null, e);
            System.out.println(e);
        }
    }

    public void getRefDetails() {
        DBConnect dbConnect = new DBConnect();
        Connection conn = dbConnect.getConnection();
        String selectData8_1 = "SELECT * FROM cv_ref WHERE profile_id = '"+ID+"' LIMIT 1";
        String selectData8_2 = "SELECT * FROM cv_ref WHERE profile_id = '"+ID+"' LIMIT 1 OFFSET 1";

        try {
            PreparedStatement statement8_1 = conn.prepareStatement(selectData8_1);
            ResultSet rs8_1 = statement8_1.executeQuery();
            while (rs8_1.next()) {
                String RefName1 = rs8_1.getString(3);
                String Job1 = rs8_1.getString(4);
                String Company1 = rs8_1.getString(5);
                String Email1 = rs8_1.getString(6);
                String Phone1 = rs8_1.getString(7);

                refName.setText(RefName1);
                refJob.setText(Job1);
                refCompany.setText(Company1);
                refEmail.setText(Email1);
                refPhone.setText(Phone1);
                if (!Objects.equals(RefName1, "") && !Objects.equals(Job1, "") & !Objects.equals(Company1, "") && !Objects.equals(Email1, "") && !Objects.equals(Phone1, "")) {
                    parameters.put("Ref1", RefName1+"\n"+Job1+"\n"+Company1+"\n"+Email1+"\n"+Phone1);
                } else if (!Objects.equals(RefName1, "") && !Objects.equals(Job1, "") & Objects.equals(Company1, "") && !Objects.equals(Email1, "") && !Objects.equals(Phone1, "")) {
                    parameters.put("Ref1", RefName1+"\n"+Job1+"\n"+Email1+"\n"+Phone1);
                } else if (!Objects.equals(RefName1, "") && !Objects.equals(Job1, "") & !Objects.equals(Company1, "") && Objects.equals(Email1, "") && !Objects.equals(Phone1, "")) {
                    parameters.put("Ref1", RefName1+"\n"+Job1+"\n"+Company1+"\n"+Phone1);
                } else if (!Objects.equals(RefName1, "") && !Objects.equals(Job1, "") & Objects.equals(Company1, "") && Objects.equals(Email1, "") && !Objects.equals(Phone1, "")) {
                    parameters.put("Ref1", RefName1+"\n"+Job1+"\n"+Phone1);
                } else {
                    parameters.put("Ref1", null);
                }
            }
            PreparedStatement statement8_2 = conn.prepareStatement(selectData8_2);
            ResultSet rs8_2 = statement8_2.executeQuery();
            while (rs8_2.next()) {
                String RefName2 = rs8_2.getString(3);
                String Job2 = rs8_2.getString(4);
                String Company2 = rs8_2.getString(5);
                String Email2 = rs8_2.getString(6);
                String Phone2 = rs8_2.getString(7);

                refName2.setText(RefName2);
                refJob2.setText(Job2);
                refCompany2.setText(Company2);
                refEmail2.setText(Email2);
                refPhone2.setText(Phone2);
                if (!Objects.equals(RefName2, "") && !Objects.equals(Job2, "") & !Objects.equals(Company2, "") && !Objects.equals(Email2, "") && !Objects.equals(Phone2, "")) {
                    parameters.put("Ref2", RefName2+"\n"+Job2+"\n"+Company2+"\n"+Email2+"\n"+Phone2);
                } else if (!Objects.equals(RefName2, "") && !Objects.equals(Job2, "") & Objects.equals(Company2, "") && !Objects.equals(Email2, "") && !Objects.equals(Phone2, "")) {
                    parameters.put("Ref2", RefName2+"\n"+Job2+"\n"+Email2+"\n"+Phone2);
                } else if (!Objects.equals(RefName2, "") && !Objects.equals(Job2, "") & !Objects.equals(Company2, "") && Objects.equals(Email2, "") && !Objects.equals(Phone2, "")) {
                    parameters.put("Ref2", RefName2+"\n"+Job2+"\n"+Company2+"\n"+Phone2);
                } else if (!Objects.equals(RefName2, "") && !Objects.equals(Job2, "") & Objects.equals(Company2, "") && Objects.equals(Email2, "") && !Objects.equals(Phone2, "")) {
                    parameters.put("Ref2", RefName2+"\n"+Job2+"\n"+Phone2);
                } else {
                    parameters.put("Ref2", null);
                }
            }

        }catch (SQLException e){
            Logger.getLogger(dashboardController.class.getName()).log(Level.SEVERE, null, e);
            System.out.println(e);
        }
    }

    public void getTitledPane() {
        if (!Objects.equals(eduCourse.getText(), "")) {
            eduAccord.getPanes().add(eduForm);
            eduAddBtn.setVisible(false);
            eduAddBtn2.setVisible(true);
            eduAddBtn3.setVisible(false);
            eduAddBtn4.setVisible(false);
            eduAddBtn5.setVisible(false);
            eduAddBtn6.setVisible(false);
        }else if (Objects.equals(eduCourse.getText(), "")) {
            eduAddBtn.setVisible(true);
            eduAddBtn2.setVisible(false);
            eduAddBtn3.setVisible(false);
            eduAddBtn4.setVisible(false);
            eduAddBtn5.setVisible(false);
            eduAddBtn6.setVisible(false);
        }
        if (!Objects.equals(eduCourse2.getText(), "")) {
            eduAccord.getPanes().add(eduForm2);
            eduAddBtn.setVisible(false);
            eduAddBtn2.setVisible(false);
            eduAddBtn3.setVisible(true);
            eduAddBtn4.setVisible(false);
            eduAddBtn5.setVisible(false);
            eduAddBtn6.setVisible(false);
            eduCloseBtn.setDisable(true);
        }
        if (!Objects.equals(eduCourse3.getText(), "")) {
            eduAccord.getPanes().add(eduForm3);
            eduAddBtn.setVisible(false);
            eduAddBtn2.setVisible(false);
            eduAddBtn3.setVisible(false);
            eduAddBtn4.setVisible(true);
            eduAddBtn5.setVisible(false);
            eduAddBtn6.setVisible(false);
            eduCloseBtn.setDisable(true);
            eduCloseBtn2.setDisable(true);
        }
        if (!Objects.equals(eduCourse4.getText(), "")) {
            eduAccord.getPanes().add(eduForm4);
            eduAddBtn.setVisible(false);
            eduAddBtn2.setVisible(false);
            eduAddBtn3.setVisible(false);
            eduAddBtn4.setVisible(false);
            eduAddBtn5.setVisible(true);
            eduAddBtn6.setVisible(false);
            eduCloseBtn.setDisable(true);
            eduCloseBtn2.setDisable(true);
            eduCloseBtn3.setDisable(true);
        }
        if (!Objects.equals(eduCourse5.getText(), "")) {
            eduAccord.getPanes().add(eduForm5);
            eduAddBtn.setVisible(false);
            eduAddBtn2.setVisible(false);
            eduAddBtn3.setVisible(false);
            eduAddBtn4.setVisible(false);
            eduAddBtn5.setVisible(false);
            eduAddBtn6.setVisible(true);
            eduCloseBtn.setDisable(true);
            eduCloseBtn2.setDisable(true);
            eduCloseBtn3.setDisable(true);
            eduCloseBtn4.setDisable(true);
        }
        if (!Objects.equals(eduCourse6.getText(), "")) {
            eduAccord.getPanes().add(eduForm6);
            eduAddBtn.setVisible(false);
            eduAddBtn2.setVisible(false);
            eduAddBtn3.setVisible(false);
            eduAddBtn4.setVisible(false);
            eduAddBtn5.setVisible(false);
            eduAddBtn6.setVisible(false);
            eduCloseBtn.setDisable(true);
            eduCloseBtn2.setDisable(true);
            eduCloseBtn3.setDisable(true);
            eduCloseBtn4.setDisable(true);
            eduCloseBtn5.setDisable(true);
        }

        if (!Objects.equals(expJob.getText(), "")) {
            expAccord.getPanes().add(expForm);
            expAddBtn.setVisible(false);
            expAddBtn2.setVisible(true);
            expAddBtn3.setVisible(false);
            eduAddBtn4.setVisible(false);
            expAddBtn5.setVisible(false);
        } else if (Objects.equals(expJob.getText(), "")) {
            expAddBtn.setVisible(true);
            expAddBtn2.setVisible(false);
            expAddBtn3.setVisible(false);
            eduAddBtn4.setVisible(false);
            expAddBtn5.setVisible(false);
        }
        if (!Objects.equals(expJob2.getText(), "")) {
            expAccord.getPanes().add(expForm2);
            expAddBtn.setVisible(false);
            expAddBtn2.setVisible(false);
            expAddBtn3.setVisible(true);
            eduAddBtn4.setVisible(false);
            expAddBtn5.setVisible(false);
            expCloseBtn.setDisable(true);
        }
        if (!Objects.equals(expJob3.getText(), "")) {
            expAccord.getPanes().add(expForm3);
            expAddBtn.setVisible(false);
            expAddBtn2.setVisible(false);
            expAddBtn3.setVisible(false);
            eduAddBtn4.setVisible(true);
            expAddBtn5.setVisible(false);
            expCloseBtn.setDisable(true);
            expCloseBtn2.setDisable(true);
        }
        if (!Objects.equals(expJob4.getText(), "")) {
            expAccord.getPanes().add(expForm4);
            expAddBtn.setVisible(false);
            expAddBtn2.setVisible(false);
            expAddBtn3.setVisible(false);
            eduAddBtn4.setVisible(false);
            expAddBtn5.setVisible(true);
            expCloseBtn.setDisable(true);
            expCloseBtn2.setDisable(true);
            expCloseBtn3.setDisable(true);
        }
        if (!Objects.equals(expJob5.getText(), "")) {
            expAccord.getPanes().add(expForm5);
            expAddBtn.setVisible(false);
            expAddBtn2.setVisible(false);
            expAddBtn3.setVisible(false);
            eduAddBtn4.setVisible(false);
            expAddBtn5.setVisible(false);
            expCloseBtn.setDisable(true);
            expCloseBtn2.setDisable(true);
            expCloseBtn3.setDisable(true);
            expCloseBtn4.setDisable(true);
        }

        if (!Objects.equals(skillName.getText(), "")) {
            skillAccord.getPanes().add(skillForm);
            skillAddBtn.setVisible(false);
            skillAddBtn2.setVisible(true);
            skillAddBtn3.setVisible(false);
            skillAddBtn4.setVisible(false);
            skillAddBtn5.setVisible(false);
            skillAddBtn6.setVisible(false);
            skillAddBtn7.setVisible(false);
            skillAddBtn8.setVisible(false);
            skillAddBtn9.setVisible(false);
            skillAddBtn10.setVisible(false);
        } else if (Objects.equals(skillName.getText(), "")) {
            skillAddBtn.setVisible(true);
            skillAddBtn2.setVisible(false);
            skillAddBtn3.setVisible(false);
            skillAddBtn4.setVisible(false);
            skillAddBtn5.setVisible(false);
            skillAddBtn6.setVisible(false);
            skillAddBtn7.setVisible(false);
            skillAddBtn8.setVisible(false);
            skillAddBtn9.setVisible(false);
            skillAddBtn10.setVisible(false);
        }
        if (!Objects.equals(skillName2.getText(), "")) {
            skillAccord.getPanes().add(skillForm2);
            skillAddBtn.setVisible(false);
            skillAddBtn2.setVisible(false);
            skillAddBtn3.setVisible(true);
            skillAddBtn4.setVisible(false);
            skillAddBtn5.setVisible(false);
            skillAddBtn6.setVisible(false);
            skillAddBtn7.setVisible(false);
            skillAddBtn8.setVisible(false);
            skillAddBtn9.setVisible(false);
            skillAddBtn10.setVisible(false);
            skillCloseBtn.setDisable(true);
        }
        if (!Objects.equals(skillName3.getText(), "")) {
            skillAccord.getPanes().add(skillForm3);
            skillAddBtn.setVisible(false);
            skillAddBtn2.setVisible(false);
            skillAddBtn3.setVisible(false);
            skillAddBtn4.setVisible(true);
            skillAddBtn5.setVisible(false);
            skillAddBtn6.setVisible(false);
            skillAddBtn7.setVisible(false);
            skillAddBtn8.setVisible(false);
            skillAddBtn9.setVisible(false);
            skillAddBtn10.setVisible(false);
            skillCloseBtn.setDisable(true);
            skillCloseBtn2.setDisable(true);
        }
        if (!Objects.equals(skillName4.getText(), "")) {
            skillAccord.getPanes().add(skillForm4);
            skillAddBtn.setVisible(false);
            skillAddBtn2.setVisible(false);
            skillAddBtn3.setVisible(false);
            skillAddBtn4.setVisible(false);
            skillAddBtn5.setVisible(true);
            skillAddBtn6.setVisible(false);
            skillAddBtn7.setVisible(false);
            skillAddBtn8.setVisible(false);
            skillAddBtn9.setVisible(false);
            skillAddBtn10.setVisible(false);
            skillCloseBtn.setDisable(true);
            skillCloseBtn2.setDisable(true);
            skillCloseBtn3.setDisable(true);
        }
        if (!Objects.equals(skillName5.getText(), "")) {
            skillAccord.getPanes().add(skillForm5);
            skillAddBtn.setVisible(false);
            skillAddBtn2.setVisible(false);
            skillAddBtn3.setVisible(false);
            skillAddBtn4.setVisible(false);
            skillAddBtn5.setVisible(false);
            skillAddBtn6.setVisible(true);
            skillAddBtn7.setVisible(false);
            skillAddBtn8.setVisible(false);
            skillAddBtn9.setVisible(false);
            skillAddBtn10.setVisible(false);
            skillCloseBtn.setDisable(true);
            skillCloseBtn2.setDisable(true);
            skillCloseBtn3.setDisable(true);
            skillCloseBtn4.setDisable(true);
        }
        if (!Objects.equals(skillName6.getText(), "")) {
            skillAccord.getPanes().add(skillForm6);
            skillAddBtn.setVisible(false);
            skillAddBtn2.setVisible(false);
            skillAddBtn3.setVisible(false);
            skillAddBtn4.setVisible(false);
            skillAddBtn5.setVisible(false);
            skillAddBtn6.setVisible(false);
            skillAddBtn7.setVisible(true);
            skillAddBtn8.setVisible(false);
            skillAddBtn9.setVisible(false);
            skillAddBtn10.setVisible(false);
            skillCloseBtn.setDisable(true);
            skillCloseBtn2.setDisable(true);
            skillCloseBtn3.setDisable(true);
            skillCloseBtn4.setDisable(true);
            skillCloseBtn5.setDisable(true);
        }
        if (!Objects.equals(skillName7.getText(), "")) {
            skillAccord.getPanes().add(skillForm7);
            skillAddBtn.setVisible(false);
            skillAddBtn2.setVisible(false);
            skillAddBtn3.setVisible(false);
            skillAddBtn4.setVisible(false);
            skillAddBtn5.setVisible(false);
            skillAddBtn6.setVisible(false);
            skillAddBtn7.setVisible(false);
            skillAddBtn8.setVisible(true);
            skillAddBtn9.setVisible(false);
            skillAddBtn10.setVisible(false);
            skillCloseBtn.setDisable(true);
            skillCloseBtn2.setDisable(true);
            skillCloseBtn3.setDisable(true);
            skillCloseBtn4.setDisable(true);
            skillCloseBtn5.setDisable(true);
            skillCloseBtn6.setDisable(true);
        }
        if (!Objects.equals(skillName8.getText(), "")) {
            skillAccord.getPanes().add(skillForm8);
            skillAddBtn.setVisible(false);
            skillAddBtn2.setVisible(false);
            skillAddBtn3.setVisible(false);
            skillAddBtn4.setVisible(false);
            skillAddBtn5.setVisible(false);
            skillAddBtn6.setVisible(false);
            skillAddBtn7.setVisible(false);
            skillAddBtn8.setVisible(false);
            skillAddBtn9.setVisible(true);
            skillAddBtn10.setVisible(false);
            skillCloseBtn.setDisable(true);
            skillCloseBtn2.setDisable(true);
            skillCloseBtn3.setDisable(true);
            skillCloseBtn4.setDisable(true);
            skillCloseBtn5.setDisable(true);
            skillCloseBtn6.setDisable(true);
            skillCloseBtn7.setDisable(true);
        }
        if (!Objects.equals(skillName9.getText(), "")) {
            skillAccord.getPanes().add(skillForm9);
            skillAddBtn.setVisible(false);
            skillAddBtn2.setVisible(false);
            skillAddBtn3.setVisible(false);
            skillAddBtn4.setVisible(false);
            skillAddBtn5.setVisible(false);
            skillAddBtn6.setVisible(false);
            skillAddBtn7.setVisible(false);
            skillAddBtn8.setVisible(false);
            skillAddBtn9.setVisible(false);
            skillAddBtn10.setVisible(true);
            skillCloseBtn.setDisable(true);
            skillCloseBtn2.setDisable(true);
            skillCloseBtn3.setDisable(true);
            skillCloseBtn4.setDisable(true);
            skillCloseBtn5.setDisable(true);
            skillCloseBtn6.setDisable(true);
            skillCloseBtn7.setDisable(true);
            skillCloseBtn8.setDisable(true);
        }
        if (!Objects.equals(skillName10.getText(), "")) {
            skillAccord.getPanes().add(skillForm10);
            skillAddBtn.setVisible(false);
            skillAddBtn2.setVisible(false);
            skillAddBtn3.setVisible(false);
            skillAddBtn4.setVisible(false);
            skillAddBtn5.setVisible(false);
            skillAddBtn6.setVisible(false);
            skillAddBtn7.setVisible(false);
            skillAddBtn8.setVisible(false);
            skillAddBtn9.setVisible(false);
            skillAddBtn10.setVisible(false);
            skillCloseBtn.setDisable(true);
            skillCloseBtn2.setDisable(true);
            skillCloseBtn3.setDisable(true);
            skillCloseBtn4.setDisable(true);
            skillCloseBtn5.setDisable(true);
            skillCloseBtn6.setDisable(true);
            skillCloseBtn7.setDisable(true);
            skillCloseBtn8.setDisable(true);
            skillCloseBtn9.setDisable(true);
        }

        if (!Objects.equals(achieveName.getText(), "")) {
            achieveAccord.getPanes().add(achieveForm);
            achieveAddBtn.setVisible(false);
            achieveAddBtn2.setVisible(true);
            achieveAddBtn3.setVisible(false);
            achieveAddBtn4.setVisible(false);
            achieveAddBtn5.setVisible(false);
            achieveAddBtn6.setVisible(false);
            achieveAddBtn7.setVisible(false);
            achieveAddBtn8.setVisible(false);
            achieveAddBtn9.setVisible(false);
            achieveAddBtn10.setVisible(false);
        } else if (Objects.equals(achieveName.getText(), "")) {
            achieveAddBtn.setVisible(true);
            achieveAddBtn2.setVisible(false);
            achieveAddBtn3.setVisible(false);
            achieveAddBtn4.setVisible(false);
            achieveAddBtn5.setVisible(false);
            achieveAddBtn6.setVisible(false);
            achieveAddBtn7.setVisible(false);
            achieveAddBtn8.setVisible(false);
            achieveAddBtn9.setVisible(false);
            achieveAddBtn10.setVisible(false);
        }
        if (!Objects.equals(achieveName2.getText(), "")) {
            achieveAccord.getPanes().add(achieveForm2);
            achieveAddBtn.setVisible(false);
            achieveAddBtn2.setVisible(false);
            achieveAddBtn3.setVisible(true);
            achieveAddBtn4.setVisible(false);
            achieveAddBtn5.setVisible(false);
            achieveAddBtn6.setVisible(false);
            achieveAddBtn7.setVisible(false);
            achieveAddBtn8.setVisible(false);
            achieveAddBtn9.setVisible(false);
            achieveAddBtn10.setVisible(false);
            achieveCloseBtn.setDisable(true);
        }
        if (!Objects.equals(achieveName3.getText(), "")) {
            achieveAccord.getPanes().add(achieveForm3);
            achieveAddBtn.setVisible(false);
            achieveAddBtn2.setVisible(false);
            achieveAddBtn3.setVisible(false);
            achieveAddBtn4.setVisible(true);
            achieveAddBtn5.setVisible(false);
            achieveAddBtn6.setVisible(false);
            achieveAddBtn7.setVisible(false);
            achieveAddBtn8.setVisible(false);
            achieveAddBtn9.setVisible(false);
            achieveAddBtn10.setVisible(false);
            achieveCloseBtn.setDisable(true);
            achieveCloseBtn2.setDisable(true);
        }
        if (!Objects.equals(achieveName4.getText(), "")) {
            achieveAccord.getPanes().add(achieveForm4);
            achieveAddBtn.setVisible(false);
            achieveAddBtn2.setVisible(false);
            achieveAddBtn3.setVisible(false);
            achieveAddBtn4.setVisible(false);
            achieveAddBtn5.setVisible(true);
            achieveAddBtn6.setVisible(false);
            achieveAddBtn7.setVisible(false);
            achieveAddBtn8.setVisible(false);
            achieveAddBtn9.setVisible(false);
            achieveAddBtn10.setVisible(false);
            achieveCloseBtn.setDisable(true);
            achieveCloseBtn2.setDisable(true);
            achieveCloseBtn3.setDisable(true);
        }
        if (!Objects.equals(achieveName5.getText(), "")) {
            achieveAccord.getPanes().add(achieveForm5);
            achieveAddBtn.setVisible(false);
            achieveAddBtn2.setVisible(false);
            achieveAddBtn3.setVisible(false);
            achieveAddBtn4.setVisible(false);
            achieveAddBtn5.setVisible(false);
            achieveAddBtn6.setVisible(true);
            achieveAddBtn7.setVisible(false);
            achieveAddBtn8.setVisible(false);
            achieveAddBtn9.setVisible(false);
            achieveAddBtn10.setVisible(false);
            achieveCloseBtn.setDisable(true);
            achieveCloseBtn2.setDisable(true);
            achieveCloseBtn3.setDisable(true);
            achieveCloseBtn4.setDisable(true);
        }
        if (!Objects.equals(achieveName6.getText(), "")) {
            achieveAccord.getPanes().add(achieveForm6);
            achieveAddBtn.setVisible(false);
            achieveAddBtn2.setVisible(false);
            achieveAddBtn3.setVisible(false);
            achieveAddBtn4.setVisible(false);
            achieveAddBtn5.setVisible(false);
            achieveAddBtn6.setVisible(false);
            achieveAddBtn7.setVisible(true);
            achieveAddBtn8.setVisible(false);
            achieveAddBtn9.setVisible(false);
            achieveAddBtn10.setVisible(false);
            achieveCloseBtn.setDisable(true);
            achieveCloseBtn2.setDisable(true);
            achieveCloseBtn3.setDisable(true);
            achieveCloseBtn4.setDisable(true);
            achieveCloseBtn5.setDisable(true);
        }
        if (!Objects.equals(achieveName7.getText(), "")) {
            achieveAccord.getPanes().add(achieveForm7);
            achieveAddBtn.setVisible(false);
            achieveAddBtn2.setVisible(false);
            achieveAddBtn3.setVisible(false);
            achieveAddBtn4.setVisible(false);
            achieveAddBtn5.setVisible(false);
            achieveAddBtn6.setVisible(false);
            achieveAddBtn7.setVisible(false);
            achieveAddBtn8.setVisible(true);
            achieveAddBtn9.setVisible(false);
            achieveAddBtn10.setVisible(false);
            achieveCloseBtn.setDisable(true);
            achieveCloseBtn2.setDisable(true);
            achieveCloseBtn3.setDisable(true);
            achieveCloseBtn4.setDisable(true);
            achieveCloseBtn5.setDisable(true);
            achieveCloseBtn6.setDisable(true);
        }
        if (!Objects.equals(achieveName8.getText(), "")) {
            achieveAccord.getPanes().add(achieveForm8);
            achieveAddBtn.setVisible(false);
            achieveAddBtn2.setVisible(false);
            achieveAddBtn3.setVisible(false);
            achieveAddBtn4.setVisible(false);
            achieveAddBtn5.setVisible(false);
            achieveAddBtn6.setVisible(false);
            achieveAddBtn7.setVisible(false);
            achieveAddBtn8.setVisible(false);
            achieveAddBtn9.setVisible(true);
            achieveAddBtn10.setVisible(false);
            achieveCloseBtn.setDisable(true);
            achieveCloseBtn2.setDisable(true);
            achieveCloseBtn3.setDisable(true);
            achieveCloseBtn4.setDisable(true);
            achieveCloseBtn5.setDisable(true);
            achieveCloseBtn6.setDisable(true);
            achieveCloseBtn7.setDisable(true);
        }
        if (!Objects.equals(achieveName9.getText(), "")) {
            achieveAccord.getPanes().add(achieveForm9);
            achieveAddBtn.setVisible(false);
            achieveAddBtn2.setVisible(false);
            achieveAddBtn3.setVisible(false);
            achieveAddBtn4.setVisible(false);
            achieveAddBtn5.setVisible(false);
            achieveAddBtn6.setVisible(false);
            achieveAddBtn7.setVisible(false);
            achieveAddBtn8.setVisible(false);
            achieveAddBtn9.setVisible(false);
            achieveAddBtn10.setVisible(true);
            achieveCloseBtn.setDisable(true);
            achieveCloseBtn2.setDisable(true);
            achieveCloseBtn3.setDisable(true);
            achieveCloseBtn4.setDisable(true);
            achieveCloseBtn5.setDisable(true);
            achieveCloseBtn6.setDisable(true);
            achieveCloseBtn7.setDisable(true);
            achieveCloseBtn8.setDisable(true);
        }
        if (!Objects.equals(achieveName10.getText(), "")) {
            achieveAccord.getPanes().add(achieveForm10);
            achieveAddBtn.setVisible(false);
            achieveAddBtn2.setVisible(false);
            achieveAddBtn3.setVisible(false);
            achieveAddBtn4.setVisible(false);
            achieveAddBtn5.setVisible(false);
            achieveAddBtn6.setVisible(false);
            achieveAddBtn7.setVisible(false);
            achieveAddBtn8.setVisible(false);
            achieveAddBtn9.setVisible(false);
            achieveAddBtn10.setVisible(false);
            achieveCloseBtn.setDisable(true);
            achieveCloseBtn2.setDisable(true);
            achieveCloseBtn3.setDisable(true);
            achieveCloseBtn4.setDisable(true);
            achieveCloseBtn5.setDisable(true);
            achieveCloseBtn6.setDisable(true);
            achieveCloseBtn7.setDisable(true);
            achieveCloseBtn8.setDisable(true);
            achieveCloseBtn9.setDisable(true);
        }

        if (!Objects.equals(projectTitle.getText(), "")) {
            projectAccord.getPanes().add(projectForm);
            projectAddBtn.setVisible(false);
            projectAddBtn2.setVisible(true);
            projectAddBtn3.setVisible(false);
            projectAddBtn4.setVisible(false);
            projectAddBtn5.setVisible(false);
        } else if (Objects.equals(projectTitle.getText(), "")) {
            projectAddBtn.setVisible(true);
            projectAddBtn2.setVisible(false);
            projectAddBtn3.setVisible(false);
            projectAddBtn4.setVisible(false);
            projectAddBtn5.setVisible(false);
        }
        if (!Objects.equals(projectTitle2.getText(), "")) {
            projectAccord.getPanes().add(projectForm2);
            projectAddBtn.setVisible(false);
            projectAddBtn2.setVisible(false);
            projectAddBtn3.setVisible(true);
            projectAddBtn4.setVisible(false);
            projectAddBtn5.setVisible(false);
            projectCloseBtn.setDisable(true);
        }
        if (!Objects.equals(projectTitle3.getText(), "")) {
            projectAccord.getPanes().add(projectForm3);
            projectAddBtn.setVisible(false);
            projectAddBtn2.setVisible(false);
            projectAddBtn3.setVisible(false);
            projectAddBtn4.setVisible(true);
            projectAddBtn5.setVisible(false);
            projectCloseBtn.setDisable(true);
            projectCloseBtn2.setDisable(true);
        }
        if (!Objects.equals(projectTitle4.getText(), "")) {
            projectAccord.getPanes().add(projectForm4);
            projectAddBtn.setVisible(false);
            projectAddBtn2.setVisible(false);
            projectAddBtn3.setVisible(false);
            projectAddBtn4.setVisible(false);
            projectAddBtn5.setVisible(true);
            projectCloseBtn.setDisable(true);
            projectCloseBtn2.setDisable(true);
            projectCloseBtn3.setDisable(true);
        }
        if (!Objects.equals(projectTitle5.getText(), "")) {
            projectAccord.getPanes().add(projectForm5);
            projectAddBtn.setVisible(false);
            projectAddBtn2.setVisible(false);
            projectAddBtn3.setVisible(false);
            projectAddBtn4.setVisible(false);
            projectAddBtn5.setVisible(false);
            projectCloseBtn.setDisable(true);
            projectCloseBtn2.setDisable(true);
            projectCloseBtn3.setDisable(true);
            projectCloseBtn4.setDisable(true);
        }

        if (!Objects.equals(langName.getText(), "")) {
            langAccord.getPanes().add(langForm);
            langAddBtn.setVisible(false);
            langAddBtn2.setVisible(true);
            langAddBtn3.setVisible(false);
            langAddBtn4.setVisible(false);
            langAddBtn5.setVisible(false);
        } else if (Objects.equals(langName.getText(), "")) {
            langAddBtn.setVisible(true);
            langAddBtn2.setVisible(false);
            langAddBtn3.setVisible(false);
            langAddBtn4.setVisible(false);
            langAddBtn5.setVisible(false);
        }
        if (!Objects.equals(langName2.getText(), "")) {
            langAccord.getPanes().add(langForm2);
            langAddBtn.setVisible(false);
            langAddBtn2.setVisible(false);
            langAddBtn3.setVisible(true);
            langAddBtn4.setVisible(false);
            langAddBtn5.setVisible(false);
            langCloseBtn.setDisable(true);
        }
        if (!Objects.equals(langName3.getText(), "")) {
            langAccord.getPanes().add(langForm3);
            langAddBtn.setVisible(false);
            langAddBtn2.setVisible(false);
            langAddBtn3.setVisible(false);
            langAddBtn4.setVisible(true);
            langAddBtn5.setVisible(false);
            langCloseBtn.setDisable(true);
            langCloseBtn2.setDisable(true);
        }
        if (!Objects.equals(langName4.getText(), "")) {
            langAccord.getPanes().add(langForm4);
            langAddBtn.setVisible(false);
            langAddBtn2.setVisible(false);
            langAddBtn3.setVisible(false);
            langAddBtn4.setVisible(false);
            langAddBtn5.setVisible(true);
            langCloseBtn.setDisable(true);
            langCloseBtn2.setDisable(true);
            langCloseBtn3.setDisable(true);
        }
        if (!Objects.equals(langName5.getText(), "")) {
            langAccord.getPanes().add(langForm5);
            langAddBtn.setVisible(false);
            langAddBtn2.setVisible(false);
            langAddBtn3.setVisible(false);
            langAddBtn4.setVisible(false);
            langAddBtn5.setVisible(false);
            langCloseBtn.setDisable(true);
            langCloseBtn2.setDisable(true);
            langCloseBtn3.setDisable(true);
            langCloseBtn4.setDisable(true);
        }

        if (!Objects.equals(refName.getText(), "")) {
            refAccord.getPanes().add(refForm);
            refAddBtn.setVisible(false);
            refAddBtn2.setVisible(true);
        } else if (Objects.equals(refName.getText(), "")) {
            refAddBtn.setVisible(true);
            refAddBtn2.setVisible(false);
        }
        if (!Objects.equals(refName2.getText(), "")) {
            refAccord.getPanes().add(refForm2);
            refAddBtn.setVisible(false);
            refAddBtn2.setVisible(false);
            refCloseBtn.setDisable(true);
        }
    }

    public void displayUsername(){
            String User = Username;
            usernameLabel.setText(User.substring(0, 1).toUpperCase() + User.substring(1));
            usernameLabel2.setText(User);
    }

    public void displayEmail() {
        DBConnect dbConnect = new DBConnect();
        Connection conn = dbConnect.getConnection();
        String getemail = "Select email from user_accounts where username = '" +Username+ "'";
        try {
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery(getemail);
            while (rs.next()) {
                emailLabel.setText(rs.getString("email"));
                emailLabel2.setText(rs.getString("email"));
            }
        }catch (SQLException e){
            e.printStackTrace();
            System.out.println(e);
        }
    }

    public void setPasswordFormClick(ActionEvent event) {
        if (event.getSource() == doneBtn) {
            DBConnect dbConnect = new DBConnect();
            Connection conn = dbConnect.getConnection();
            String pwQuery = "SELECT count(1) FROM user_accounts WHERE username = '"+usernameLabel2.getText()+"' AND password = '"+ currentPassword.getText()+"'";
            try {
                Statement statement1 = conn.createStatement();
                ResultSet rs1 = statement1.executeQuery(pwQuery);
                while (rs1.next()) {
                    if (rs1.getInt(1) == 1) {
                        if (newPassword.getText().equals(confirmNewPassword.getText())) {
                            String updatePW = "UPDATE user_accounts SET password = '"+newPassword.getText()+"' WHERE username = '"+usernameLabel2.getText()+"'";
                            try {
                                Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
                                alert.setTitle("Update Password");
                                alert.setHeaderText(null);
                                alert.setContentText("Are you sure you want to update the password?");
                                Optional<ButtonType> result = alert.showAndWait();
                                if (result.get() == ButtonType.OK) {
                                    if (newPassword.getText().isEmpty()) {
                                        newPassword.setStyle("-fx-border-color: red ; -fx-border-width: 2px");
                                        confirmNewPassword.setStyle("-fx-border-color: red ; -fx-border-width: 2px");
                                        Alert alert1 = new Alert(Alert.AlertType.ERROR);
                                        alert1.setTitle("Error Message");
                                        alert1.setHeaderText(null);
                                        alert1.setContentText("Please fill all the required fields!");
                                        alert1.showAndWait();
                                    } else {
                                        PreparedStatement statement2 = dbConnect.dbLink.prepareStatement(updatePW);
                                        statement2.executeUpdate();
                                        Alert alert2 = new Alert(Alert.AlertType.INFORMATION);
                                        alert2.setTitle("Update Profile");
                                        alert2.setHeaderText(null);
                                        alert2.setContentText("Password Updated!");
                                        alert2.showAndWait();
                                        passwordForm.setVisible(false);
                                        currentPassword.setText("");
                                        newPassword.setText("");
                                        confirmNewPassword.setText("");
                                        currentPassword.setStyle(null);
                                        newPassword.setStyle(null);
                                        confirmNewPassword.setStyle(null);
                                    }
                                } else if (result.get() == ButtonType.CANCEL) {
                                    alert.close();
                                }
                            }catch (Exception e) {
                                e.printStackTrace();
                                System.out.println(e.getCause());
                            }
                        } else {
                            newPassword.setStyle("-fx-border-color: red ; -fx-border-width: 2px");
                            confirmNewPassword.setStyle("-fx-border-color: red ; -fx-border-width: 2px");
                            Alert alert = new Alert(Alert.AlertType.ERROR);
                            alert.setTitle("Error Message");
                            alert.setHeaderText(null);
                            alert.setContentText("Password does not match!");
                            alert.showAndWait();
                        }
                    } else {
                        currentPassword.setStyle("-fx-border-color: red ; -fx-border-width: 2px");
                        Alert alert = new Alert(Alert.AlertType.ERROR);
                        alert.setTitle("Error Message");
                        alert.setHeaderText(null);
                        alert.setContentText("Invalid Password!");
                        alert.showAndWait();
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println(e.getCause());
            }
        } else if (event.getSource() == accountCloseBtn) {
            passwordForm.setVisible(false);
            currentPassword.setText("");
            newPassword.setText("");
            confirmNewPassword.setText("");
            currentPassword.setStyle(null);
            newPassword.setStyle(null);
            confirmNewPassword.setStyle(null);
        }
    }

    public void settingFormBtnClick(ActionEvent event1) {
        if (event1.getSource() == changePasswordBtn) {
            passwordForm.setVisible(true);
            passwordForm.setExpanded(true);
        } else if (event1.getSource() == deleteAccountBtn) {
            DBConnect db = new DBConnect();
            Connection conn = db.getConnection();
            String deleteAccount = "DELETE FROM user_accounts WHERE username = '"+usernameLabel2.getText()+"'";
            try {
                Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
                alert.setTitle("Confirmation");
                alert.setHeaderText(null);
                alert.setContentText("Are you sure you want to delete this account?\n\nWarning: Changes are permanent and can not be reverted.");
                Optional<ButtonType> result = alert.showAndWait();
                if (result.get() == ButtonType.OK){
                    Statement statement = conn.createStatement();
                    statement.executeUpdate(deleteAccount);
                    Alert alert2 = new Alert(Alert.AlertType.INFORMATION);
                    alert2.setTitle("Delete Account");
                    alert2.setHeaderText(null);
                    alert2.setContentText("Account Deleted!");
                    alert2.showAndWait();
                    try {
                        deleteAccountBtn.getScene().getWindow().hide();
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
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }else if(result.get() == ButtonType.CANCEL){
                    alert.close();
                }
            }catch (Exception e){
                e.printStackTrace();
                System.out.println(e);
            }
        } else if (event1.getSource() == aboutBtn) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("About");
            alert.setHeaderText(null);
            Image icon = new Image("C:\\Users\\Acer\\IdeaProjects\\CV\\src\\main\\images\\CV_logo.png",75,48,true,true);
            ImageView iconView = new ImageView(icon);
            alert.setGraphic(iconView);
            alert.setContentText("CV Creator Tool\nVersion: 1.0\nDate Created: 2025 May");
            alert.showAndWait();
        }
    }

    public void selectTemplate(ActionEvent event) {
        if (event.getSource() == temp1btn) {
            generateJasperReport1();
        } else if (event.getSource() == temp2btn) {
            generateJasperReport2();
        } else if (event.getSource() == temp3btn) {
            generateJasperReport3();
        } else if (event.getSource() == temp4btn) {
            generateJasperReport4();
        }
    }

    public ObservableList<tableData> addTableListData(){
        ObservableList<tableData> listData = FXCollections.observableArrayList();
        String tableList = "select * from cv_profiles";

        DBConnect dbConnect = new DBConnect();
        Connection connect = dbConnect.getConnection();

        try {
            PreparedStatement statement = connect.prepareStatement(tableList);
            ResultSet result = statement.executeQuery();
            while (result.next()) {
                tableData tabledata = new tableData(result.getInt(1),
                        result.getString("name"),
                        result.getString("created_date"));
                listData.add(tabledata);
            }

        }catch (Exception e){
            e.printStackTrace();
            System.out.println(e);
        }
        return listData;
    }

    tableData tabledata = null;
    public void showTableList(){
        ObservableList<tableData> profileList = addTableListData();

        tableCV_IDCol.setCellValueFactory(new PropertyValueFactory<>("id"));
        tableCV_NameCol.setCellValueFactory(new PropertyValueFactory<>("name"));
        tableCV_TimeCol.setCellValueFactory(new PropertyValueFactory<>("createdDate"));

        Callback<TableColumn<tableData, String>, TableCell<tableData, String>> cellFactory = (TableColumn<tableData, String> param) -> {
            final TableCell<tableData, String> cell = new TableCell<>(){
                @Override
                public void updateItem(String item, boolean empty) {
                    super.updateItem(item, empty);
                    if (empty) {
                        setGraphic(null);
                        setText(null);
                    }else {
                        Button createBtn = new Button();
                        Button editBtn = new Button();
                        Button deleteBtn = new Button();
                        HBox btnLayout = new HBox();

                        createBtn.styleProperty().bind(Bindings.when(createBtn.hoverProperty())
                                .then("-fx-background-color: #ffff; -fx-background-radius: 10px; -fx-cursor: hand")
                                .otherwise("-fx-background-color: #7fa9fd; -fx-background-radius: 10px"));

                        editBtn.styleProperty().bind(Bindings.when(editBtn.hoverProperty())
                                .then("-fx-background-color: #ffff; -fx-background-radius: 10px; -fx-cursor: hand")
                                .otherwise("-fx-background-color: #00E676; -fx-background-radius: 10px"));

                        deleteBtn.styleProperty().bind(Bindings.when(deleteBtn.hoverProperty())
                                .then("-fx-background-color: #ffff; -fx-background-radius: 10px; -fx-cursor: hand")
                                .otherwise("-fx-background-color: #ff1744; -fx-background-radius: 10px"));

                        createBtn.setGraphic(GlyphsDude.createIcon(FontAwesomeIcons.FILE_TEXT,"20px"));
                        editBtn.setGraphic(GlyphsDude.createIcon(FontAwesomeIcons.PENCIL_SQUARE,"20px"));
                        deleteBtn.setGraphic(GlyphsDude.createIcon(FontAwesomeIcons.TRASH,"20px"));

                        createBtn.setOnMouseClicked((MouseEvent mouseEvent) -> {
                            tableData td = getTableView().getItems().get(getIndex());
                            profileName.setText(td.getName());
                            getProfileDetails();
                            getEduDetails();
                            getExpDetails();
                            getSkillDetails();
                            getAchieveDetails();
                            getLangDetails();
                            getRefDetails();
                            topForm_Home.setVisible(true);
                            leftForm_Home.setVisible(true);
                            rightForm_Home.setVisible(false);
                            rightForm_CVP.setVisible(false);
                            rightForm_ECV.setVisible(false);
                            rightForm_Temp.setVisible(true);
                            rightForm_Help.setVisible(false);
                            rightForm_Setting.setVisible(false);
                            topForm_CVP.setVisible(false);
                            templateBtn.setStyle("-fx-background-color: linear-gradient(to top, #21a7ae, #0a5a55); -fx-background-radius: 12px");
                            homeBtn.setStyle(null);
                            helpBtn.setStyle(null);
                            settingBtn.setStyle(null);
                            pageName.setText("Templates");
                            tempScroll.setVvalue(0);
                        });

                        editBtn.setOnMouseClicked((MouseEvent event) -> {
                            tabledata = tableCV.getSelectionModel().getSelectedItem();
                            try {
                               if (event.getSource() == editBtn) {
                                   profileName.setStyle(null);
                                   profileAddress.setStyle(null);
                                   profileEmail.setStyle(null);
                                   profilePhone.setStyle(null);
                                   profileDOB.setStyle(null);
                                   topForm_Home.setVisible(false);
                                   leftForm_Home.setVisible(false);
                                   rightForm_Home.setVisible(false);
                                   rightForm_CVP.setVisible(true);
                                   rightForm_ECV.setVisible(false);
                                   rightForm_Temp.setVisible(false);
                                   rightForm_Help.setVisible(false);
                                   rightForm_Setting.setVisible(false);
                                   topForm_CVP.setVisible(true);
                                   profileUpdateBtn.setVisible(true);
                                   profileSaveBtn.setVisible(false);
                                   backBtn1.setVisible(false);
                                   backBtn2.setVisible(true);
                                   profileName.setDisable(true);
                                   profileResetBtn.setDisable(true);
                                   profileReset();
                                   setFileNull();
                                   eduAccord.getPanes().clear();
                                   expAccord.getPanes().clear();
                                   skillAccord.getPanes().clear();
                                   achieveAccord.getPanes().clear();
                                   projectAccord.getPanes().clear();
                                   langAccord.getPanes().clear();
                                   refAccord.getPanes().clear();
                                   tableData td = getTableView().getItems().get(getIndex());
                                   profileName.setText(td.getName());
                                   getProfileDetails();
                                   getEduDetails();
                                   getExpDetails();
                                   getSkillDetails();
                                   getAchieveDetails();
                                   getProjectDetails();
                                   getLangDetails();
                                   getRefDetails();
                                   getTitledPane();
                               }
                            }catch (Exception ex){
                                Logger.getLogger(dashboardController.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        });

                        deleteBtn.setOnMouseClicked((MouseEvent event) -> {
                            DBConnect db = new DBConnect();
                            Connection conn = db.getConnection();
                            tableData td = getTableView().getItems().get(getIndex());
                            String deleteData = "DELETE FROM cv_profiles WHERE name = '"+td.getName()+"'";

                            try {
                                Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
                                alert.setTitle("Confirmation");
                                alert.setHeaderText(null);
                                alert.setContentText("Are you sure you want to delete this profile?");
                                Optional<ButtonType> result = alert.showAndWait();
                                if (result.get() == ButtonType.OK){
                                    Statement statement = conn.createStatement();
                                    statement.executeUpdate(deleteData);
                                    Alert alert2 = new Alert(Alert.AlertType.INFORMATION);
                                    alert2.setTitle("Delete Profile");
                                    alert2.setHeaderText(null);
                                    alert2.setContentText("Profile Deleted!");
                                    alert2.showAndWait();
                                    showTableList();
                                }else if(result.get() == ButtonType.CANCEL){
                                    alert.close();
                                }

                            }catch (SQLException e){
                                e.printStackTrace();
                                System.out.println(e);
                            }
                        });

                        btnLayout.getChildren().add(createBtn);
                        btnLayout.getChildren().add(editBtn);
                        btnLayout.getChildren().add(deleteBtn);
                        btnLayout.setStyle("-fx-alignment: center");
                        btnLayout.setMargin(createBtn, new Insets(3, 3, 0, 2));
                        btnLayout.setMargin(editBtn, new Insets(3, 3, 0, 3));
                        btnLayout.setMargin(deleteBtn, new Insets(3, 2, 0, 3));
                        setGraphic(btnLayout);
                        setText(null);
                    }
                }
            };
            return cell;
        };

        tableCV_BtnCol.setCellFactory(cellFactory);
        tableCV.setItems(profileList);

    }

    private String[] gender = {"Male", "Female"};
    private String[] maritalStatus = {"Single", "Married"};


    /**
     * @param url
     * @param resourceBundle
     */
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Image cv1 = new Image("C:\\Users\\Acer\\IdeaProjects\\CV\\src\\main\\images\\CV_1.png");
        ImageView cv1View = new ImageView(cv1);
        CV1.setImage(cv1View.getImage());

        Image cv2 = new Image("C:\\Users\\Acer\\IdeaProjects\\CV\\src\\main\\images\\CV_2.png");
        ImageView cv2View = new ImageView(cv2);
        CV2.setImage(cv2View.getImage());

        Image cv3 = new Image("C:\\Users\\Acer\\IdeaProjects\\CV\\src\\main\\images\\CV_3.png");
        ImageView cv3View = new ImageView(cv3);
        CV3.setImage(cv3View.getImage());

        Image cv4 = new Image("C:\\Users\\Acer\\IdeaProjects\\CV\\src\\main\\images\\CV_4.png");
        ImageView cv4View = new ImageView(cv4);
        CV4.setImage(cv4View.getImage());

        Image cv5 = new Image("C:\\Users\\Acer\\IdeaProjects\\CV\\src\\main\\images\\CV_5.png");
        ImageView cv5View = new ImageView(cv5);
        CV5.setImage(cv5View.getImage());

        Image cv6 = new Image("C:\\Users\\Acer\\IdeaProjects\\CV\\src\\main\\images\\CV_6.png");
        ImageView cv6View = new ImageView(cv6);
        CV6.setImage(cv6View.getImage());

        displayUsername();
        displayEmail();
        showTableList();

        profileGender.getItems().addAll(gender);
        profileMaritalStatus.getItems().addAll(maritalStatus);

    }
}
