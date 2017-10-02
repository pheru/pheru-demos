package de.pheru.demos.fx.mvp;

import de.pheru.fx.mvp.UpdateableSplashStage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class SplashStage extends Stage implements UpdateableSplashStage{

    private ProgressBar progressBar = new ProgressBar();
    private Label label = new Label("Lade...");

    public SplashStage() {
        setScene(new Scene(new VBox(label, progressBar)));
    }

    @Override
    public void loadingMessageUpdated(final String s) {
        label.setText(s);
    }

    @Override
    public void loadingProgressUpdated(final double v, final double v1) {
        progressBar.setProgress(v / v1);
    }

    @Override
    public void loadingFailed(final String s, final Throwable throwable) {
        label.setText(s);
    }
}
