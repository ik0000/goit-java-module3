package com.goit.module3.files;

import java.util.ArrayList;
import java.util.List;

public class Directory extends File{
        //MyDirectory parentDir;

        String dirName;

        List<Directory> listOfSubDir = new ArrayList<Directory>();
        //private List<File> directory = new ArrayList<>();
        List<File> listOfFiles = new ArrayList<File>();

        public Directory(String fileName) {
                super(fileName);
        }
        public  List<File> getDirectory() {
                return listOfFiles;
        }
        /*public int getFilesSize(){
                int total=0;
                for (File f  : listOfFiles) {
                        total += f.fileSize;
                }
                return total;
        }

        public void printFiles(){
                for (File f  : listOfFiles) {
                     System.out.println(f.fileName + " file "+ f.fileSize);
                }
        }

        public void printSubDir(){
                for (Directory m  : listOfSubDir) {
                        System.out.println(m.dirName + " dir ");
                }
        }
*/
        @Override
        public String toString() {
                return Directory.class.getSimpleName() + "\t" + getFileName();
        }
        public static void main(String[] args) {
               /* AudioFile f1 = new AudioFile();
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

                Directory m1 = new Directory();
                Directory s1 = new Directory();
                //Subdir s1 = new Subdir();
                //Subdir s2 = new Subdir();

                m1.listOfFiles.add(f1);
                m1.listOfFiles.add(f2);
                m1.listOfFiles.add(f3);

                m1.dirName="root";
                s1.dirName="subdir1";

                m1.listOfSubDir.add(s1);
                //m1.listOfSubDir.add(s2);
                m1.printSubDir();
                m1.printFiles();
                System.out.println("Total file size:" + m1.getFilesSize());
*/
        }
}

