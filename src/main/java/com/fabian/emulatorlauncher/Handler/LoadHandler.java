package com.fabian.emulatorlauncher.Handler;

import com.fabian.emulatorlauncher.Datamodel.EmulatorModel;

import java.util.LinkedList;
import java.util.List;

public class LoadHandler {
    List<EmulatorModel> emulatorModels = new LinkedList<>();

    public LoadHandler() {
        for (int i = 0; i < 100; i++) {
            emulatorModels.add(new EmulatorModel("test","C:\\Users\\Fabian\\Desktop\\balenaEtcher.exe","test"));
        }
    }

//TODO implement loading from database

    public List<EmulatorModel> getEmulatorModels() {
        return emulatorModels;
    }
}
