package com.goit.module3.files;

public class AudioFile extends File {
    int latency;
    String encoding;
    int bitrate;

    public AudioFile(String fileName) {
        super(fileName);
    }

    @Override
    public String toString() {
        return AudioFile.class.getSimpleName() + "\t" + getFileName();
    }
}