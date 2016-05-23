import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Mat on 23/05/2016.
 */
public class XifratCesar extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher view = req.getRequestDispatcher("/index.jsp");
        view.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String strMissatge = req.getParameter("missatge");

        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();

        out.println("<html>\n" +
                "  <head>\n" +
                "    <title>ServidorXifratCesar</title>\n" +
                "        <div class=\"container-fluid\">\n" +
                "          <a class=\"navbar-brand\" href=\"./index.jsp\"><--Enrere </a>\n" +
                "        </div>\n" +
                "\n" +
                "  </head>\n" +

                "<body>\n" +
                "       <h1>Xifrat Cesar</h1>\n" +
                "           <p>Text original:\n" + strMissatge + "</p>"
        );

        out.println("Missatge xifrat:");

        for (int i = 0; i < 26; i++) {
            if(i != 0)
                out.println("<li>" + encryptCesar(strMissatge, i) + "</li>");
        }

        out.println("</body></html>");
    }
                                                        //comprobacio lletres en alfbt
    private String encryptCesar(String textOriginal, int indice) {

        char textXifrat[];
        textXifrat = textOriginal.toCharArray();

        for (int contChar = 0; contChar < textOriginal.length(); contChar++) {
            for (int i = 0; i < indice; i++) {

                if ((textXifrat[contChar] >= 65 && textXifrat[contChar] < 90)
                        || (textXifrat[contChar] >= 97 && textXifrat[contChar] < 122)) {
                    textXifrat[contChar]++;
                }
                else if (textXifrat[contChar] == 122)
                    textXifrat[contChar] = 'a';
                else if (textXifrat[contChar] == 90)
                    textXifrat[contChar] = 'A';
            }
        }

        textOriginal = String.valueOf(textXifrat);
        return textOriginal;
    }

}
