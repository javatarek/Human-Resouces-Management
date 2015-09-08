package org.apache.jsp.salary;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class payrollsetting_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("  <!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\" dir=\"ltr\">\n");
      out.write("<head>\n");
      out.write("\t<meta http-equiv=\"content-type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("        <link rel=\"stylesheet\" href=\"style.css \" type=\"text/css\" /><style type=\"text/css\">._css3m{display:none}</style>\n");
      out.write("\t    \n");
      out.write("</head>\n");
      out.write("<body style=\" background-image: url(../images/h.jpg)\"  >\n");
      out.write("    <center>\n");
      out.write("        <h1 style=\" color: rgb\">Payroll System Here</h1>\n");
      out.write("   \n");
      out.write("       <ul id=\"css3menu1\" class=\"topmenu\">\n");
      out.write("<input type=\"checkbox\" id=\"css3menu-switcher\" class=\"switchbox\"><label onclick=\"\" class=\"switch\" for=\"css3menu-switcher\"></label>\t<li class=\"toplast\">\n");
      out.write("    <a href=\"#\" style=\"width:198px;\"><span>Payroll System</span></a>\n");
      out.write("\t<ul>\n");
      out.write("\t\t<li class=\"subfirst\"><a href=\"viewsalaryform.jsp\">View Salary</a></li>\n");
      out.write("\t\t<li><a href=\"viewdeductionform.jsp\">View Deduction</a></li>\n");
      out.write("\t</ul> \n");
      out.write("</ul>\n");
      out.write("  \n");
      out.write("    </center>  \n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write(" ");
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
