package august.examen.controllers;

import august.examen.db.DatabaseWrapper;
import august.examen.models.Question;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class NewQuestionController {
    public Button btnAdd;
    public TextField txtLabel;
    public TextArea txtContent;
    public CheckBox chbAcceptsImageInput;
    private Question question;
    public DatabaseWrapper databaseWrapper;

    public void setDatabaseWrapper(DatabaseWrapper databaseWrapper) {
        this.databaseWrapper = databaseWrapper;
    }

    public void addQuestionData(ActionEvent actionEvent) {
        question = new Question(databaseWrapper);
        question.setLabel(txtLabel.getText());
        question.setContent(txtContent.getText());
        question.setAcceptImages(chbAcceptsImageInput.isSelected());
        Stage stage = (Stage) btnAdd.getScene().getWindow();
        stage.hide();
    }

    public Question getQuestion() {
        return question;
    }
}
