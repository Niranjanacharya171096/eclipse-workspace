import javax.servlet.*;   
import javax.servlet.http.*;   
import java.io.*;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.*;   
@WebServlet("/test")   
public class BinaryStreamDemo2 extends HttpServlet    
{   
public void doGet(HttpServletRequest req, HttpServletResponse resp) 
throws ServletException, IOException   
{   
resp.setContentType("video/mp4");   
ServletOutputStream os = resp.getOutputStream();   
String path=getServletContext().getRealPath("dhoni.mp4");   
File f = new File(path);   
FileInputStream fis = new FileInputStream(f);   
byte[] b = new byte[(int)f.length()];   
fis.read(b);//reading the image and placing into byte array   
os.write(b);//write byte array to the response   
os.flush();   
os.close();   
}   
}
