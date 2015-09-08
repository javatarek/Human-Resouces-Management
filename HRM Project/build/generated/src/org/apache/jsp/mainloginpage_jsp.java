package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class mainloginpage_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write(" <!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\" dir=\"ltr\">\n");
      out.write("<head>\n");
      out.write("\t<meta http-equiv=\"content-type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("\t<title>Main Login Page</title>\n");
      out.write("\t\t<!-- Start css3menu.com HEAD section -->\n");
      out.write("\t<link rel=\"stylesheet\" href=\"style.css\" type=\"text/css\" /><style type=\"text/css\">._css3m{display:none}</style>\n");
      out.write("        \n");
      out.write("        <link rel=\"stylesheet\" href=\"style_1.css\" type=\"text/css\" /><style type=\"text/css\">._css3m{display:none}</style>\n");
      out.write("\t<!-- End css3menu.com HEAD section -->\n");
      out.write("\n");
      out.write("\t\n");
      out.write("        <script type=\"text/javascript\"> \n");
      out.write("function display_c(){\n");
      out.write("var refresh=1000; // Refresh rate in milli seconds\n");
      out.write("mytime=setTimeout('display_ct()',refresh);\n");
      out.write("}\n");
      out.write("\n");
      out.write("function display_ct() {\n");
      out.write("var strcount;\n");
      out.write("var x = new Date();\n");
      out.write("document.getElementById('ct').innerHTML = x;\n");
      out.write("tt=display_c();\n");
      out.write(" }\n");
      out.write(" \n");
      out.write("    \n");
      out.write("</script>\n");
      out.write("        \n");
      out.write("</head>\n");
      out.write("<body style=\"background-color:#EBEBEB\" background=\"images/bananaleaf.jpg\" width=\"960px\" height=\"500px\" onload=display_ct()>\n");
      out.write("     \n");
      out.write("    <div style=\"background-color: pink\" >\n");
      out.write("                         \n");
      out.write("                        \n");
      out.write("                        <h2 style=\"width: 50px;height: 100px;color: blue\">HUMAN RESOURCES MANAGEMENT</h2>\n");
      out.write("                       \n");
      out.write("                        <span id='ct' style=\" font-size: 20px\" ></span>\n");
      out.write("                      \n");
      out.write("                        <h2 align=\"center\">Main Login Page</h2>\n");
      out.write("                    </div>\n");
      out.write("    \n");
      out.write("    <div align=\"center\">\n");
      out.write("    <img  src=\"images/hrfront.jpg\" width=\"500px\" height=\"300px\"/>\n");
      out.write("     <h2 align=\"left\">Select an Role</h2>\n");
      out.write("</div>\n");
      out.write("    \n");
      out.write(" \n");
      out.write(" \n");
      out.write("    <div>\n");
      out.write("       <ul id=\"css3menu1\" class=\"topmenu\">\n");
      out.write("<input type=\"checkbox\" id=\"css3menu-switcher\" class=\"switchbox\"><label onclick=\"\" class=\"switch\" for=\"css3menu-switcher\"></label>\t\n");
      out.write("<li class=\"topmenu\"><a href=\"admin/adminloginform.jsp\" style=\"height:25px;line-height:25px;\">Admin</a></li>\n");
      out.write("\t<li class=\"topmenu\"><a href=\"manager/managerloginform.jsp\" style=\"height:25px;line-height:25px;\">Manager</a></li>\n");
      out.write("\t<li class=\"topmenu\"><a href=\"employees/employeesloginform.jsp\" style=\"height:25px;line-height:25px;\">Employees</a></li>\n");
      out.write("         \n");
      out.write("</ul><p class=\"_css3m\"><a href=\"http://css3menu.com/\">html menu generator</a> by Css3Menu.com</p>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <div>\n");
      out.write("        <ul id=\"css3menu1\" class=\"topmenu\">\n");
      out.write("<input type=\"checkbox\" id=\"css3menu-switcher\" class=\"switchbox\"><label onclick=\"\" class=\"switch\" for=\"css3menu-switcher\"></label>\t<li class=\"toplast\"><a href=\"#\" style=\"height:27px;line-height:27px;\"><span>Attendance</span></a>\n");
      out.write("\t<ul>\n");
      out.write("\t\t<li><a href=\"attendancein.jsp\">Attendance  In</a></li>\n");
      out.write("\t\t<li><a href=\"attendanceout.jsp\">Attendance  Out</a></li>\n");
      out.write("\t</ul></li>\n");
      out.write("</ul>\n");
      out.write("    </div>\n");
      out.write("  \n");
      out.write("</body>\n");
      out.write("</html>\n");
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
