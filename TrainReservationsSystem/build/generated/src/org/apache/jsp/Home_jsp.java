package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import hiber.Passenger;
import java.util.List;
import hiber.Train;
import hiber.TrainDetail;

public final class Home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("    \r\n");
      out.write("    <head>\r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write(" \r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        <link href=\"dist/css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("        <link href=\"dist/css/bootstrap-theme.min.css\" rel=\"stylesheet\">\r\n");
      out.write("        <link href=\"assets/css/ie10-viewport-bug-workaround.css\" rel=\"stylesheet\">\r\n");
      out.write("        <link href=\"theme.css\" rel=\"stylesheet\">\r\n");
      out.write("        <script src=\"assets/js/ie-emulation-modes-warning.js\"></script>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>Train Reservations</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body><center>\r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("         <BODY background=\"images/tt1.jpg\"></BODY>\r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        <nav class=\"navbar navbar-inverse\"> \r\n");
      out.write("            <div class=\"collapse navbar-collapse\" id=\"bs-example-navbar-collapse-1\">\r\n");
      out.write("                <ul class=\"nav navbar-nav\">\r\n");
      out.write("                    <li> <a  class=\"navbar-brand\" href=\"Home.jsp\">Train Reservations</a> </li>\r\n");
      out.write("                    <li> <a  href=\"ProfilePage.jsp\">Profile</a> </li>\r\n");
      out.write("                    <li> <a  href=\"AddCreditCard.jsp\">History Ticket</a> </li>\r\n");
      out.write("                    <li> <a  href=\"LogoutController\">Sign out</a> </li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </div>\r\n");
      out.write("        </nav>   \r\n");
      out.write("         \r\n");
      out.write("         <br>\r\n");
      out.write("         <font color=\"white\"><h1>Phuket Trains</h1></font>\r\n");
      out.write("         \r\n");
      out.write("         \r\n");
      out.write("        <font color=\"white\">จองตั๋วรถไฟ <br><br></font>\r\n");
      out.write("        \r\n");
      out.write("        <font color=\"white\">(คุณสามารถขึ้นที่สถานีใดก็ได้ภายในจังหวัดนั้น) <br><br></font>\r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        <form name=\"SearchTicket\" action=\"TrainSearchController\" >\r\n");
      out.write("            <font color=\"white\">สถานีต้นทาง</font> \r\n");
      out.write("            <select name =\"TrainFrom\">\r\n");
      out.write("                <option selected disabled>เลือกต้นทาง</option>\r\n");
      out.write("                <option value=\"Phuket\">Phuket</option>\r\n");
      out.write("                <option value=\"Suratthani\">Suratthani</option>\r\n");
      out.write("                <option value=\"Krabi\">Krabi</option>\r\n");
      out.write("                <option value=\"Trang\">Trang</option>\r\n");
      out.write("                <option value=\"Ranong\">Ranong</option>\r\n");
      out.write("                <option value=\"Phang-nga\">Phang-nga</option>\r\n");
      out.write("            </select>&nbsp;&nbsp;&nbsp;\r\n");
      out.write("             <font color=\"white\">สถานีปลายทาง</font>\r\n");
      out.write("            <select name =\"TrainTo\">\r\n");
      out.write("                <option selected disabled>เลือกปลายทาง</option>\r\n");
      out.write("                <option value=\"Phuket\">Phuket</option>\r\n");
      out.write("                <option value=\"Suratthani\">Suratthani</option>\r\n");
      out.write("                <option value=\"Krabi\">Krabi</option>\r\n");
      out.write("                <option value=\"Trang\">Trang</option>\r\n");
      out.write("                <option value=\"Ranong\">Ranong</option>\r\n");
      out.write("                <option value=\"Phang-nga\">Phang-nga</option>\r\n");
      out.write("            </select>&nbsp;&nbsp;&nbsp;\r\n");
      out.write("            <input type=\"submit\" value=\"ค้นหาตั๋วโดยสาร\" name=\"searchButton\" /> <br><br>\r\n");
      out.write("        </form>\r\n");
      out.write("        ");

            try {
                // Create a session object if it is already not created.
                List<Object[]> trainSearchList = (List<Object[]>) session.getAttribute("searchResult");
                List psg = (List) session.getAttribute("resultPsg");
                Passenger passenger = null;
                for (Object l : psg) {
                    passenger = (Passenger) l;
                }
                if (trainSearchList != null) {
        
      out.write("\r\n");
      out.write("        <table border=\"1\"> ");
 //border="1" 
      out.write("\r\n");
      out.write("            <tbody>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td >ชื่อรถไฟ</td>\r\n");
      out.write("                    <td>สถานีต้นทาง</td>\r\n");
      out.write("                    <td>สถานีปลายทาง</td>\r\n");
      out.write("                    <td>วันที่ออก</td>\r\n");
      out.write("                    <td>เวลาออก</td> \r\n");
      out.write("                    <td>เวลาถึง</td>\r\n");
      out.write("                    <td>จำนวนที่นั่งว่าง</td>\r\n");
      out.write("                    <td>ราคา(บาท)</td>\r\n");
      out.write("                    <td>จอง</td>\r\n");
      out.write("                </tr>\r\n");
      out.write("            <form name = \"ReservationsTicket\" action=\"TicketWaittingController\" method=\"GET\">\r\n");
      out.write("                ");
 

                    for (Object[] obj : trainSearchList) {
                        Train train = (Train) obj[0];
                        TrainDetail traindetail = (TrainDetail) obj[1];
                
      out.write(" \r\n");
      out.write("\r\n");
      out.write("                <tr>\r\n");
      out.write("                <input type=\"text\" name=\"psgId\" value =\"");
      out.print( passenger.getPsgId());
      out.write("\" hidden>\r\n");
      out.write("                <input type=\"text\" name=\"trainid\" value =\"");
      out.print( traindetail.getTrainTravelId());
      out.write("\" hidden>\r\n");
      out.write("                <input type=\"text\" name=\"trainTravelId\" value =\"");
      out.print( traindetail.getTrainTravelId());
      out.write("\" hidden>\r\n");
      out.write("                <td ><input type = \"text\" name = \"trainname\" value=\"");
 out.println(train.getTrainname()); 
      out.write("\" readonly</td>\r\n");
      out.write("                <td><input type = \"text\" name = \"fromlocation\" value=\"");
 out.println(train.getFromLocation()); 
      out.write("\" readonly</td>\r\n");
      out.write("                <td><input type = \"text\" name = \"tolocation\" value=\"");
 out.println(train.getToLocation()); 
      out.write("\" readonly</td>\r\n");
      out.write("                <td><input type = \"text\" name = \"departuredate\" value=\"");
 out.println(traindetail.getDepartureDate()); 
      out.write("\" readonly</td>\r\n");
      out.write("                <td><input type = \"text\" name = \"departuretime\" value=\"");
 out.println(train.getDepartureTime()); 
      out.write("\" readonly</td>\r\n");
      out.write("                <td><input type = \"text\" name = \"arrivaltime\" value=\"");
 out.println(train.getArrivalTime()); 
      out.write("\" readonly</td>\r\n");
      out.write("                <td><input type = \"text\" name = \"availableseat\" value=\"");
 out.println(traindetail.getAvailableSeat()); 
      out.write("\" readonly</td>\r\n");
      out.write("                <td><input type = \"text\" name = \"price\" value=\"");
 out.println(traindetail.getPrice()); 
      out.write("\" readonly</td>\r\n");
      out.write("                <td><input type =\"submit\" name =\"submit\" value = \"จองตั๋วโดยสาร\"></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("            </form>\r\n");
      out.write("            ");
}
      out.write("\r\n");
      out.write("            </tbody>\r\n");
      out.write("        </table>\r\n");
      out.write("        ");
 }
            } catch (Exception e) {
                e.printStackTrace();
            }
        
      out.write("\r\n");
      out.write("    </center>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
