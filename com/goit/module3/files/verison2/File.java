package com.goit.module3.files;

public class File{
    String fileName;
    String extension;
    int fileSize;

    public File(String fileName) {
        this.fileName = fileName;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }
}