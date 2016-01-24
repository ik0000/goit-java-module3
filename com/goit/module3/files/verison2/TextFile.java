package com.goit.module3.files;

public class TextFile extends File{
    String encoding;

    public TextFile(String fileName) {
        super(fileName);
    }
    @Override
    public String toString() {
        return TextFile.class.getSimpleName() + "\t" + getFileName();
    }
}