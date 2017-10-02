package de.pheru.demos.fx.mvp;

import de.pheru.fx.mvp.PheruFXLoader;

public class Loader extends PheruFXLoader {

    @Override
    public void load() throws Exception {
        updateProgress(-1, 100);
        updateMessage("Loader...");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        for (int i = 0; i < 100; i++) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            updateProgress(i + 1, 100);
            updateMessage("Loader... " + (i + 1));
        }
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
