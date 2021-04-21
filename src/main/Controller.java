package main;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Font;

import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.sql.*;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    private ListView<String> worldList;

    @FXML
    private Label lblDef;

    @FXML
    private Label lblCount;

    @FXML
    private TextField searchField;

    @FXML
    private Hyperlink showMe;

    @FXML
    private Hyperlink Update;

    Connection c = null;
    Statement stmt = null;
    int rsCount = 0;

    ObservableList<String> db = FXCollections.observableArrayList();
    static String wordDef;

    String lowerCaseSearch;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Font font = Font.loadFont(getClass().getResourceAsStream("/assets/zawgyi.ttf"), 16);
        lblDef.setFont(font);
        lblDef.setText("Please select word");

        try {
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:src/assets/database.db");
            c.setAutoCommit(false);
            System.out.println("Opened database successfully");
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }

        try {
            selectWordsFromDB();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        worldList.getItems().addAll(db);
        worldList.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                System.out.println("Clicked " + worldList.getSelectionModel().getSelectedItem());
                wordDef = worldList.getSelectionModel().getSelectedItem();
                try {
                    getWordDef(wordDef);
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
        });
        worldList.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent keyEvent) {
                switch (keyEvent.getCode()){
                    case UP:
                    case DOWN:
                        wordDef = worldList.getSelectionModel().getSelectedItem();
                        try {
                            getWordDef(wordDef);
                        } catch (SQLException throwables) {
                            throwables.printStackTrace();
                        }
                        break;
                    default:
                        break;
                }
            }
        });
        searchField.setPromptText("Search...");
        FilteredList<String> filteredList = new FilteredList<String>(db, data -> true);
        worldList.setItems(filteredList);

        searchField.textProperty().addListener(((observable, oldValue, newValue) -> {

            filteredList.setPredicate(data -> {
                if (newValue == null || newValue.isEmpty()){
                    return true;
                }
                lowerCaseSearch=newValue.toLowerCase();
                return (data.contains(lowerCaseSearch));
            });
            System.out.println(filteredList.size());
            lblCount.setText("Total Words : "+filteredList.size());
        }));
        showMe.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                try {
                    Desktop.getDesktop().browse(new URI("https://moekyawsoe.github.io/"));
                } catch (IOException e) {
                    e.printStackTrace();
                } catch (URISyntaxException e) {
                    e.printStackTrace();
                }
            }
        });

        Update.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                try {
                    Desktop.getDesktop().browse(new URI("https://moekyawsoe.github.io/mmengdictionary/"));
                } catch (IOException e) {
                    e.printStackTrace();
                } catch (URISyntaxException e) {
                    e.printStackTrace();
                }
            }
        });
    }

    private void selectWordsFromDB() throws SQLException {
        stmt = c.createStatement();
        ResultSet rs = stmt.executeQuery(" SELECT * FROM mmeng;");

        while (rs.next()) {
            rsCount = rsCount + 1;
            String word = rs.getString("word");
            db.add(word);
        }
        lblCount.setText("Total Words : "+rsCount);


        rs.close();
        stmt.close();
        System.out.println("Operation done successfully");
    }

    private void getWordDef(String word) throws SQLException {
        stmt = c.createStatement();
        String sql = "SELECT definition FROM mmeng WHERE word = ?";
        PreparedStatement prepStmt = c.prepareStatement(sql);
        prepStmt.setString(1, word);
        ResultSet rs = prepStmt.executeQuery();
        String data = rs.getString("definition");
        data = Uni51ToZg1.Uni_Z1(data);
//        data = Zg1ToUni51.Z1_Uni(data);
        lblDef.setText(data);
    }

    public void moveUp(){
        System.out.println("Move Up");
    }

    public void moveDown(){
        System.out.println("Move Down");
    }



}
