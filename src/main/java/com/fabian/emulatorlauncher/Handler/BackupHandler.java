package com.fabian.emulatorlauncher.Handler;

import com.fabian.emulatorlauncher.Datamodel.EmulatorModel;
import com.fabian.emulatorlauncher.Tasks.ZipTask;


import java.io.File;
import java.util.List;

public class BackupHandler {
    String desFolder = "C:\\Users\\Fabian\\Desktop\\";

    public BackupHandler(List<EmulatorModel> emulatorModels) {
        for (EmulatorModel emulatorModel : emulatorModels) {
            new ZipTask(new File(emulatorModel.getSaveFolderPath()),new File(desFolder));
        }
    }
}
