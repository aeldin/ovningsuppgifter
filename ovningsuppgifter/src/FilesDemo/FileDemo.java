package FilesDemo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.nio.file.attribute.FileTime;
import java.time.ZoneId;
import java.util.stream.Stream;

public class FileDemo {

    public static void main(String[] args) {
        String userHome = System.getProperty("user.home");
        System.out.println(userHome);
        Path path = Path.of(userHome, "readme.txt");
        System.out.println(path);
        System.out.println(Files.exists(path));
        System.out.println(Files.exists(Path.of(userHome)));
//        try {
//            //Files.delete(path);
//            if(!Files.exists(path)) {
//                Files.createFile(path);
//                //FileTime fileTime = Files.getLastModifiedTime(path);
//                //System.out.println(fileTime.toInstant().atZone(ZoneId.of("UTC+2")));
//
//            }
//        } catch (IOException e) {
//            System.out.println("Couldn't create file: " + e.getMessage());
//        }
        try (Stream<String> stringStream = Files.lines(path)){
            stringStream.skip(1).filter(s -> !s.startsWith("k"))
                    .forEach(System.out::println);
            //Files.writeString(path, "Hello there, åäö\n");
            //Files.writeString(path, "Hello there, åäö\n", StandardOpenOption.APPEND); //APPEND lägger till. utan APPEND skrivs filen över
            //String fileContent = Files.readString(path); //använd bara på små filer
            //System.out.println(fileContent);
            //Files.lines(path).filter(s-> !s.startsWith("k")).forEach(System.out::println); // Skriva ut textfiler med stream + filter
        } catch (IOException e) {
            System.out.println("Couldn't access file: " + e.getMessage());;
        }



    }
}
