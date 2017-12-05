package com.kodilla.exception.io;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FileReader {
    public void readFile(){

        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource("file/names.txt").getFile());//sciezka do pliku
        //Path path = Paths.get(file.getPath()); //zmienia sciezke String na obiekt Path
        //Stream<String> fileLines = Files.lines(path); //Files.lines() robi stream poszczeg. linii z pliku txt

        try (Stream<String> fileLines = Files.lines(Paths.get(file.getPath()))){
            fileLines.forEach(System.out::println);
        } catch (IOException e) { System.out.println("Cos nie poszlo z ladowaniem pliku!!"+e);
        } finally {
            System.out.println("\nTo wyswietla sie zawsze!!");
        }
    }
}
