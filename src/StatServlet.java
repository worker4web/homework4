import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by worker4web on 21.08.2016.
 */
@SuppressWarnings("serial")
@WebServlet(name = "StatServlet", urlPatterns = "/statistic")
public class StatServlet extends HttpServlet
{
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
        String ip = req.getRemoteAddr();
        System.out.print("Ip="+ip);
        res.sendRedirect("statistic.jsp");
    }


}
