package pl.mikolaj.computer.drive;

import pl.mikolaj.computer.file.File;

public interface Drive {
    void addFile(File file);
    void listFiles();
    File findFile(String name);
}
