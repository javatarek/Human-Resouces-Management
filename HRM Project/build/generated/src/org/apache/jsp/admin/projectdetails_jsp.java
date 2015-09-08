package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class projectdetails_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>Project Details Page</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <h1>HRM DATABASE MANAGEMENT SYSTEM</h1>\r\n");
      out.write("        <h2>PROJECT REPORT</h2>\r\n");
      out.write("        <p>\r\n");
      out.write("                                  TABLE OF CONTENTS\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("1.\tABSTRACT\r\n");
      out.write("\r\n");
      out.write("2.\tOBJECTIVES OF PROPOSED SYSTEM\r\n");
      out.write("\r\n");
      out.write("3.\tADVANTAGES OF PROPOSED SYSTEM\r\n");
      out.write("\r\n");
      out.write("4.\tOVERALL DESCRIPTION\r\n");
      out.write("\r\n");
      out.write("5.\tPROJECT REQUIREMENTS\r\n");
      out.write("\r\n");
      out.write("6.\tDEFINITION OF PROBLEM\r\n");
      out.write("\r\n");
      out.write("7.\tFEASIBILITY STUDY\r\n");
      out.write("\r\n");
      out.write("8.\tOOP CONCEPTS\r\n");
      out.write("\r\n");
      out.write("9.\tSOFTWARE DEVELOPMENT\r\n");
      out.write("\r\n");
      out.write("10.\t DATA TABLES\r\n");
      out.write("\r\n");
      out.write("11.\tER  DIAGRAMS\r\n");
      out.write("\r\n");
      out.write("12.\tSAMPLE CODE\r\n");
      out.write("\r\n");
      out.write("        </p>\r\n");
      out.write("    </body>\r\n");
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
