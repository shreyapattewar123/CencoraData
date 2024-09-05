package CaseStudy;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

import static java.nio.file.Files.readAllLines;

class ListBuses{


    public void getListBuses() throws IOException {
        Path path = Paths.get("C:/BusData.txt");
        byte[] bs = Files.readAllBytes(path);
        List<String> lines = Files.readAllLines(path);
        String[] words = null;
//        System.out.println(lines);
        for (String line : lines) {
            System.out.println(line);
            words = line.split(",");
        }
        for (String word : words) {
            System.out.println(word.trim());
        }

    }
    public void AddBus(int i,String name1,String name2,String date,int price){

    }
}

public class TravleManagementSystem {
    public static void main(String[] args) throws IOException {
        ListBuses bs1 =new ListBuses();
        bs1.getListBuses();
        //System.out.println("read bytes :\n"+String.(bs));
        //System.out.println("read line :\n"+strings);

    }
}
