package org.example.Services;

import org.example.Model.Element;
import org.example.Model.FileElement;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FileService {


    public static List<FileElement> GetElements(File element) {
        List<File> files = Arrays.asList(element.listFiles());
        List<FileElement> elements = new ArrayList<>();

        for (int i = 0; i < files.size(); i++) {
            elements.add(new Element(files.get(i).getName(), files.get(i).lastModified(),
                    files.get(i).length(), files.get(i).getPath()));

        }

        return elements;
    }
}
