package de.pheru.demos.fx.mvp.eins;

import de.pheru.fx.mvp.factories.AlertFactory;
import de.pheru.fx.mvp.factories.StageFactory;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import javax.inject.Inject;

/**
 * Created by Philipp on 03.08.2017.
 */
public class EinsPresenter {

    @Inject
    private StageFactory stageFactory;
    @Inject
    private AlertFactory alertFactory;

    @FXML
    private void showStage() {
        final Stage stage = stageFactory.createStage(StageStyle.UTILITY);
        stage.setWidth(400);
        stage.setHeight(400);
        Label l = new Label("stagelabel");
        l.getStyleClass().add("stagelabel");
        stage.setScene(new Scene(new VBox(l)));
        stage.show();
    }

    @FXML
    private void showAlert() {
        final Alert alert = alertFactory.createAlert(Alert.AlertType.INFORMATION);
        alert.showAndWait();


    }
}