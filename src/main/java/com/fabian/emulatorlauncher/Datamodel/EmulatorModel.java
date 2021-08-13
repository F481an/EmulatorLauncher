package com.fabian.emulatorlauncher.Datamodel;

import java.nio.file.Path;

public class EmulatorModel {

    String name;
    Path exeFilePath;
    Path SaveFolderPath;

    public EmulatorModel() {
    }

    public EmulatorModel(String name, Path exeFilePath, Path saveFolderPath) {
        this.name = name;
        this.exeFilePath = exeFilePath;
        SaveFolderPath = saveFolderPath;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Path getExeFilePath() {
        return exeFilePath;
    }

    public void setExeFilePath(Path exeFilePath) {
        this.exeFilePath = exeFilePath;
    }

    public Path getSaveFolderPath() {
        return SaveFolderPath;
    }

    public void setSaveFolderPath(Path saveFolderPath) {
        SaveFolderPath = saveFolderPath;
    }

    @Override
    public String toString() {
        return name;
    }
}
