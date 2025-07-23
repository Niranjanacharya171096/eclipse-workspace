import java.io.File;

//available in H14_DownloadFiles
public class FileCheck {
  public static void main(String[] args) throws InterruptedException {
    String downloadPath = "C:\\Users\\CTS-Y-Desk\\Downloads";
    String fileName = "Core Java Programs.docx";

    File downloadedFile = new File(downloadPath + File.separator + fileName);
    Thread.sleep(5000);
    System.out.println(downloadedFile + " " +downloadedFile.exists());
    if (downloadedFile.exists()) {
      System.out.println("File downloaded successfully!");
    } else {
      System.out.println("File not found. Download might have failed.");
    }
  }
}
