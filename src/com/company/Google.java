package com.company;

import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Google extends Thread {

    List<String> siteCOntent = new ArrayList<>();

    @Override
    public void run() {
        try {
            URL hotnews = new URL("https://hotnews.ro");

            URLConnection con = hotnews.openConnection();
            InputStream inputStream = con.getInputStream();
            Scanner scannerHotNews = new Scanner(inputStream);

            while (scannerHotNews.hasNext()) {
siteCOntent.add(scannerHotNews.nextLine());
            }

    }catch (Exception e){
        System.out.println("eroare in scanare");
    }

}}
