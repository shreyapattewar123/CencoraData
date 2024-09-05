import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Paths;
import java.util.List;

public class Files_Input_output {
    public static void main(String[] args) throws IOException {
//        Path path1 = Paths.get("C:/test");
//        Path path2= Paths.get("C:/test/java7");
//        Path path3= Paths.get("C:/test/java7/files");
//        try{
//            Path createdDir1=Files.createDirectories(path3);
//            System.out.println("created");
//        }catch(Exception e){
//            System.out.println(e);
//        }
                Path path = Paths.get("C:/file1.txt");
        try{
            byte[] bs =Files.readAllBytes(path);
            List<String> strings = Files.readAllLines(path);
            System.out.println("read bytes :\n"+new String(bs));
            System.out.println("read line :\n"+ strings);
        }catch(Exception e){
            System.out.println(e);
        }

//        try{
//            Path createFilePath=Files.createFile(path);
//            System.out.println("created");
//
//        }catch(IOException e){
//            System.out.println(e);
//        }


    }
}
