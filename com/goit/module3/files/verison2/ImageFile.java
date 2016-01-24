package com.goit.module3.files;

public class ImageFile extends File {
      double dimensionX;
      double dimensionY;

    public ImageFile(String fileName) {
        super(fileName);
    }

    @Override
    public String toString() {
        return ImageFile.class.getSimpleName() + "\t" + getFileName();
    }
}