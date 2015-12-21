package com.goit.module3.files;

import java.util.ArrayList;
import java.util.List;

public class MyDirectory {

        List<Subdir> listOfSubDir = new ArrayList<Subdir>();

        List<MyFile> listOfFiles = new ArrayList<MyFile>();

        public int getFilesSize(){
                int total=0;
                for (MyFile f  : listOfFiles) {
                        total += f.fileSize;
                }
                return total;
        }

        public int getSubDirList(){
                int total=0;
                for (Subdir m  : listOfSubDir) {
                     System.out.println("Directory "+ m.dirName);
                }
                return 0;
        }

        public static void main(String[] args) {
                AudioFile f1 = new AudioFile();
                f1.fileName="audio1";
                f1.extension="mp3";
                f1.fileSize=1025;

                TextFile f2 = new TextFile();
                f2.fileName="text";
                f2.extension="txt";
                f2.fileSize=10;


                ImageFile f3 = new ImageFile();

                f3.fileName="image";
                f3.extension="jpg";
                f3.fileSize=1000;

                MyDirectory m1 = new MyDirectory();
                Subdir s1 = new Subdir();
                Subdir s2 = new Subdir();

                m1.listOfFiles.add(f1);
                m1.listOfFiles.add(f2);
                m1.listOfFiles.add(f3);

                s1.dirName="dir1";
                s2.dirName="dir2";

                m1.listOfSubDir.add(s1);
                m1.listOfSubDir.add(s2);
                m1.getSubDirList();
                System.out.println("File size Total:" + m1.getFilesSize());

        }
}

