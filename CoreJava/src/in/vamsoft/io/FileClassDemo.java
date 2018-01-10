package in.vamsoft.io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class FileClassDemo {

  public static void main(String[] args) {
    Path path=Paths.get("/home/vamsoft/Desktop/Number.txt");
    Path path1=Paths.get("/home/vamsoft/Desktop/Number.txt");
    System.out.println("Paths Equal : "+path.equals(path1));
    System.out.println("Excute the path methods");
    System.out.println("File Name:"+path.getFileName());
    System.out.println("File System : "+path.getFileSystem());
    System.out.println("Parent Directory : "+path.getParent());
    System.out.println("Name Count "+path.getNameCount());
    System.out.println("Root :"+path.getRoot());
    Path destPath=Paths.get("/home/vamsoft/Desktop/CopiedFile");
    try {
      Files.copy(path, destPath,StandardCopyOption.REPLACE_EXISTING,StandardCopyOption.COPY_ATTRIBUTES);
      System.out.println("File Copied ");
      
      
      
    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    
  }
}
