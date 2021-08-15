package com.fabian.emulatorlauncher.Handler;

import com.fabian.emulatorlauncher.Datamodel.ConfigModel;
import com.fabian.emulatorlauncher.Datamodel.EmulatorModel;
import com.fabian.emulatorlauncher.Tasks.ZipTask;

import java.io.File;
import java.util.List;

public class BackupHandler {

    public BackupHandler(List<EmulatorModel> emulatorModels) {
        File theDir = new File(new ConfigModel().getBackupDesFolder());
        if (!theDir.exists()) {
            theDir.mkdirs();
        }
        for (EmulatorModel emulatorModel : emulatorModels) {
            new ZipTask(new File(emulatorModel.getSaveFolderPath()), new File(new ConfigModel().getBackupDesFolder()), emulatorModel.getName() + "_Backup");
        }
    }
}
