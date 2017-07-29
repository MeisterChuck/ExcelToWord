package WordToExcel;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable{
    private Stage stage;
    private String fileName;

    @FXML
    private Label labelFileName;


    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    public void init(Stage stage) {
        this.stage = stage;
    }

    public void OpenFile(){
        System.out.println("Open File");

        FileChooser fileChooser = new FileChooser();
        fileChooser.getExtensionFilters().addAll(new FileChooser.ExtensionFilter("Excel Files", "*.xlsx"));

        File file = fileChooser.showOpenDialog(stage);

        if(file != null){
            System.out.println("Chosen file: " + file);
            fileName = file.getName();

            System.out.println(fileName);
            labelFileName.setText(fileName);
        }
    }

    public void ConvertToWord(){
        System.out.println("File converted to Word doc");
    }
}
