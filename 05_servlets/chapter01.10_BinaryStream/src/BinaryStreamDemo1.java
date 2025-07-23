import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.*;
@WebServlet("/test")
public class BinaryStreamDemo1 extends HttpServlet{
public void doGet(HttpServletRequest req, HttpServletResponse resp) 
throws ServletException, IOException{
resp.setContentType("image/jpeg");
ServletOutputStream os = resp.getOutputStream();
String path=getServletContext().getRealPath("D:\\DCIM\\sunny.jpg");
System.out.println(path);
File f = new File(path);
FileInputStream fis = new FileInputStream(f);
byte[] b = new byte[(int)f.length()];
fis.read(b);//reading the image and placing into byte array
os.write(b);//write byte array to the response
os.flush();
os.close();
}
}
