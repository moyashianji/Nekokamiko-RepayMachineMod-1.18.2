package com.Moyashi.Nekokamiko.config;

import java.io.*;


public class ConfigFile {

    public static File modsFolder;
    public static File modFolder;
    public static File configFile;
    public static FileWriter writer;
    public static long firstline;
    public static String filePath = "mods/nekokamiko/config.txt";

    public void ConfigFile(){

    }
    public static void generateConfigFile(){
        modsFolder = new File("mods");
        modFolder = new File(modsFolder, "nekokamiko");

        System.out.println("Already File Created");

        //モッド名のフォルダが存在しなければ生成する
        if(!modFolder.exists()){
            modFolder.mkdirs();
            System.out.println("Folder Created");
        }

        configFile = new File(modFolder, "config.txt");
        System.out.println("Already Config Created");

        if(!configFile.exists()){
            try{
                configFile.createNewFile();
                writer = new FileWriter(configFile);

                writer.write("1000000000000");

                writer.close();
                System.out.println("Config Created");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        firstline= readFirstLineAsInt(filePath);

        System.out.println("一行目の値: " + firstline);
    }
    public static long readFirstLineAsInt(String filePath) {
        long result = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line = br.readLine();
            if (line != null) {
                result = Long.parseLong(line);
            }
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        }
        return result;
    }

}
