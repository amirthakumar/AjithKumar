package in.vamsoft.io;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;

public class FileAttributesDemo {
  public static void main(String[] args) {
    
    Path file=Paths.get("/home/vamsoft/Desktop/CopiedFile");
    BasicFileAttributes attr=Files.readAttributes(file, type, options);
    
  }

}
