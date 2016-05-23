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
        String valueString = req.getParameter("value");

        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();

        out.println("<html>\n" +
                "  <head>\n" +
                "    <script src=\"https://ajax.googleapis.com/ajax/libs/angularjs/1.3.15/angular.min.js\"></script>\n" +
                "    <script src=\"https://cdn.firebase.com/js/client/2.2.4/firebase.js\"></script>\n" +
                "    <script src=\"https://cdn.firebase.com/libs/angularfire/1.1.3/angularfire.min.js\"></script>\n" +
                "\n" +
                "    <title>ServidorXifratCesar</title>\n" +
                "\n" +
                "    <!-- Importamos Bootstrap  -->\n" +
                "    <link rel=\"stylesheet\" href=\"http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css\">\n" +
                "    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js\"></script>\n" +
                "    <script src=\"http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js\"></script>\n" +
                "\n" +
                "    <!-- Barra de navegación -->\n" +
                "    <nav class=\"navbar navbar-default\">\n" +
                "      <div class=\"container-fluid\">\n" +
                "\n" +
                "        <!-- Brand and toggle get grouped for better mobile display -->\n" +
                "        <div class=\"navbar-header\">\n" +
                "          <button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#bs-example-navbar-collapse-1\" aria-expanded=\"false\">\n" +
                "            <span class=\"sr-only\">Toggle navigation</span>\n" +
                "            <span class=\"icon-bar\"></span>\n" +
                "            <span class=\"icon-bar\"></span>\n" +
                "            <span class=\"icon-bar\"></span>\n" +
                "          </button>\n" +
                "          <a class=\"navbar-brand\" href=\"./index.jsp\">Marc Cano | Poblenou </a>\n" +
                "        </div>\n" +
                "\n" +
                "      </div>\n" +
                "    </nav>\n" +
                "  </head>\n" +
                "<body>\n" +
                "   <center>\n" +
                "       <h1>Xifrat Cesar</h1>\n" +
                "           <p>Text original: " + valueString + "</p>"
        );

        // Escribimos en cada linea encriptado con un indice diferente
        for (int iterador = 1; iterador < 26; iterador++) {
            out.println("<li>" + encriptarCesar(valueString, iterador) + "</p></li>");
        }

        out.println(" </center>\n" +
                "  </body>\n" +
                "</html>");
    }

    private String encriptarCesar(String textoAEncriptar, int indice) {

        char fraseCifrada[];
        fraseCifrada = textoAEncriptar.toCharArray();

        for (int iteradorCaracteres = 0; iteradorCaracteres < textoAEncriptar.length(); iteradorCaracteres++) {
            for (int iteradorAlfabeto = 0; iteradorAlfabeto < indice; iteradorAlfabeto++) {

                if ((fraseCifrada[iteradorCaracteres] >= 65 && fraseCifrada[iteradorCaracteres] < 90) || (fraseCifrada[iteradorCaracteres] >= 97 && fraseCifrada[iteradorCaracteres] < 122)) {
                    fraseCifrada[iteradorCaracteres]++;
                }
                else if (fraseCifrada[iteradorCaracteres] == 90)
                    fraseCifrada[iteradorCaracteres] = 'A';
                else if (fraseCifrada[iteradorCaracteres] == 122)
                    fraseCifrada[iteradorCaracteres] = 'a';
            }
        }
        textoAEncriptar = String.valueOf(fraseCifrada);
        return textoAEncriptar;
    }

}
