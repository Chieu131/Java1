package com.class5;

import java.util.Scanner;

public class MainClass5 {
    public static void main(String[] args) {


        FileName fileName
                = new FileName("E:\\FAPTECH\\SEM2\\6.PHP\\Class7\\shopbeau\\composer.json",
                ' ','\\',' ');

//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter path: ");
//        String path = input.nextLine();
//
//        FileName fileName = new FileName(path, 'a','\\','a');
//        System.out.println("Full path " + fileName.getPath());

        System.out.println("File name : " + fileName.getFilename());
        System.out.println("Extension: " + fileName.getExtension());
        System.out.println("Disk name: " + fileName.getDisk());

        String folders[] = fileName.getFolders();
        for (String item : folders) {
            System.out.println(item);
        }
    }
}
