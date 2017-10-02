package de.pheru.demos.fx.mvp;

import de.pheru.demos.fx.mvp.eins.EinsView;
import de.pheru.fx.mvp.PheruFXEntryPoint;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import javax.inject.Inject;

public class EntryPoint implements PheruFXEntryPoint {

    @Inject
    private EinsView einsView;

    @Override
    public void start(final Stage stage) throws Exception {
        System.out.println("Entrypoint - Start");
//        throw  new RuntimeException("Test");
        stage.setScene(new Scene(new VBox(einsView.getView())));
        stage.show();
    }

    @Override
    public void stop() throws Exception {
        System.out.println("Entrypoint - Stop");
    }
}
