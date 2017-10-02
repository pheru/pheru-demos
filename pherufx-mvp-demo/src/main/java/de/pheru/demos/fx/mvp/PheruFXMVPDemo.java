package de.pheru.demos.fx.mvp;

import de.pheru.fx.mvp.PheruFXApplication;
import de.pheru.fx.mvp.PheruFXEntryPoint;
import de.pheru.fx.mvp.PheruFXLoader;
import de.pheru.fx.mvp.annotations.AdditionalStylesheets;
import javafx.stage.Stage;

@AdditionalStylesheets({"additional", "css/additional", "css/additional2.css"})
public class PheruFXMVPDemo extends PheruFXApplication {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void init() throws Exception {
        System.out.println("App - Init " + System.currentTimeMillis());
    }

    @Override
    protected Class<? extends PheruFXEntryPoint> getEntryPointClass() {
        return EntryPoint.class;
    }

    @Override
    public Class<? extends PheruFXLoader> getLoaderClass() {
        return Loader.class;
    }

    @Override
    public Stage createSplashStage() {
        return new SplashStage();
    }
}
