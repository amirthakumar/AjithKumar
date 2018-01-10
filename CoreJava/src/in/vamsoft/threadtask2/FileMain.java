package in.vamsoft.threadtask2;

public class FileMain {

  public static void main(String[] args) {
    File1 file1=new File1(args[0]);
    File2 file2=new File2(args[1]);
    file1.start();
    file2.start();
  }
}
