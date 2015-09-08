package org.apache.jsp.attendance;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class attendancein_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_combobox_name_list_label_headerValue_headerKey_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_sx_datetimepicker_value_name_label_displayFormat_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_reset_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_textfield_name_label_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_sx_head_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_submit_value_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_s_combobox_name_list_label_headerValue_headerKey_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_sx_datetimepicker_value_name_label_displayFormat_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_reset_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_textfield_name_label_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_sx_head_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_submit_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_s_combobox_name_list_label_headerValue_headerKey_nobody.release();
    _jspx_tagPool_sx_datetimepicker_value_name_label_displayFormat_nobody.release();
    _jspx_tagPool_s_reset_value_nobody.release();
    _jspx_tagPool_s_textfield_name_label_nobody.release();
    _jspx_tagPool_sx_head_nobody.release();
    _jspx_tagPool_s_submit_value_nobody.release();
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

      out.write("\n");
      out.write("\n");
      out.write(" \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\"/>\n");
      out.write("        <title>Attendance Page</title>\n");
      out.write("        ");
      if (_jspx_meth_sx_head_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body  style=\"background-color:grey\">\n");
      out.write("    <center>\n");
      out.write("        \n");
      out.write("        <form action=\"attendanceinsert\" method=\"POST\">\n");
      out.write("            <h1>Employee Attendance Form</h1>\n");
      out.write("        <table >\n");
      out.write("            <tr><td>\n");
      out.write("                    ");
      if (_jspx_meth_s_textfield_0(_jspx_page_context))
        return;
      out.write(" \n");
      out.write("                </td></tr>\n");
      out.write("      <tr>\n");
      out.write("          <td>\n");
      out.write("        ");
      if (_jspx_meth_sx_datetimepicker_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("        </td>\n");
      out.write("      </tr>\n");
      out.write("      \n");
      out.write("        \n");
      out.write("      \n");
      out.write("        <tr>\n");
      out.write("            <td>\n");
      out.write("        ");
      if (_jspx_meth_s_textfield_1(_jspx_page_context))
        return;
      out.write(" \n");
      out.write("            </td>\n");
      out.write("        </tr>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <tr>\n");
      out.write("            <td>\n");
      out.write("        ");
      if (_jspx_meth_s_textfield_2(_jspx_page_context))
        return;
      out.write(" \n");
      out.write("        </td>\n");
      out.write("        </tr>\n");
      out.write("        \n");
      out.write("      <tr>\n");
      out.write("            <td>");
      if (_jspx_meth_s_combobox_0(_jspx_page_context))
        return;
      out.write(" \n");
      out.write("        </td>\n");
      out.write("        </tr>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <tr>\n");
      out.write("            <td>");
      if (_jspx_meth_s_combobox_1(_jspx_page_context))
        return;
      out.write(" \n");
      out.write("        </td>\n");
      out.write("        </tr>\n");
      out.write("        \n");
      out.write("         \n");
      out.write("       \n");
      out.write("        <tr>\n");
      out.write("            <td>\n");
      out.write("        ");
      if (_jspx_meth_s_submit_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("            </td>\n");
      out.write("        </tr>\n");
      out.write("            \n");
      out.write("        <tr>\n");
      out.write("            <td></td>\n");
      out.write("            <td> ");
      if (_jspx_meth_s_reset_0(_jspx_page_context))
        return;
      out.write("</td>\n");
      out.write("     \n");
      out.write("        </tr>\n");
      out.write("      \n");
      out.write("        \n");
      out.write("       \n");
      out.write("        </table>\n");
      out.write("         </form>\n");
      out.write("            <a href=\"../mainloginpage.jsp\" >Back</a>\n");
      out.write("    </center>\n");
      out.write("    </body>\n");
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

  private boolean _jspx_meth_sx_head_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sx:head
    org.apache.struts2.dojo.views.jsp.ui.HeadTag _jspx_th_sx_head_0 = (org.apache.struts2.dojo.views.jsp.ui.HeadTag) _jspx_tagPool_sx_head_nobody.get(org.apache.struts2.dojo.views.jsp.ui.HeadTag.class);
    _jspx_th_sx_head_0.setPageContext(_jspx_page_context);
    _jspx_th_sx_head_0.setParent(null);
    int _jspx_eval_sx_head_0 = _jspx_th_sx_head_0.doStartTag();
    if (_jspx_th_sx_head_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_sx_head_nobody.reuse(_jspx_th_sx_head_0);
      return true;
    }
    _jspx_tagPool_sx_head_nobody.reuse(_jspx_th_sx_head_0);
    return false;
  }

  private boolean _jspx_meth_s_textfield_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:textfield
    org.apache.struts2.views.jsp.ui.TextFieldTag _jspx_th_s_textfield_0 = (org.apache.struts2.views.jsp.ui.TextFieldTag) _jspx_tagPool_s_textfield_name_label_nobody.get(org.apache.struts2.views.jsp.ui.TextFieldTag.class);
    _jspx_th_s_textfield_0.setPageContext(_jspx_page_context);
    _jspx_th_s_textfield_0.setParent(null);
    _jspx_th_s_textfield_0.setName("attendance.employeeId");
    _jspx_th_s_textfield_0.setLabel("Employee Id");
    int _jspx_eval_s_textfield_0 = _jspx_th_s_textfield_0.doStartTag();
    if (_jspx_th_s_textfield_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_textfield_name_label_nobody.reuse(_jspx_th_s_textfield_0);
      return true;
    }
    _jspx_tagPool_s_textfield_name_label_nobody.reuse(_jspx_th_s_textfield_0);
    return false;
  }

  private boolean _jspx_meth_sx_datetimepicker_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sx:datetimepicker
    org.apache.struts2.dojo.views.jsp.ui.DateTimePickerTag _jspx_th_sx_datetimepicker_0 = (org.apache.struts2.dojo.views.jsp.ui.DateTimePickerTag) _jspx_tagPool_sx_datetimepicker_value_name_label_displayFormat_nobody.get(org.apache.struts2.dojo.views.jsp.ui.DateTimePickerTag.class);
    _jspx_th_sx_datetimepicker_0.setPageContext(_jspx_page_context);
    _jspx_th_sx_datetimepicker_0.setParent(null);
    _jspx_th_sx_datetimepicker_0.setName("attendance.dateFrom");
    _jspx_th_sx_datetimepicker_0.setLabel("Date From");
    _jspx_th_sx_datetimepicker_0.setDisplayFormat("dd-MMM-yyyy");
    _jspx_th_sx_datetimepicker_0.setValue("todayDate");
    int _jspx_eval_sx_datetimepicker_0 = _jspx_th_sx_datetimepicker_0.doStartTag();
    if (_jspx_th_sx_datetimepicker_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_sx_datetimepicker_value_name_label_displayFormat_nobody.reuse(_jspx_th_sx_datetimepicker_0);
      return true;
    }
    _jspx_tagPool_sx_datetimepicker_value_name_label_displayFormat_nobody.reuse(_jspx_th_sx_datetimepicker_0);
    return false;
  }

  private boolean _jspx_meth_s_textfield_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:textfield
    org.apache.struts2.views.jsp.ui.TextFieldTag _jspx_th_s_textfield_1 = (org.apache.struts2.views.jsp.ui.TextFieldTag) _jspx_tagPool_s_textfield_name_label_nobody.get(org.apache.struts2.views.jsp.ui.TextFieldTag.class);
    _jspx_th_s_textfield_1.setPageContext(_jspx_page_context);
    _jspx_th_s_textfield_1.setParent(null);
    _jspx_th_s_textfield_1.setName("attendance.officeIn");
    _jspx_th_s_textfield_1.setLabel("Office In");
    int _jspx_eval_s_textfield_1 = _jspx_th_s_textfield_1.doStartTag();
    if (_jspx_th_s_textfield_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_textfield_name_label_nobody.reuse(_jspx_th_s_textfield_1);
      return true;
    }
    _jspx_tagPool_s_textfield_name_label_nobody.reuse(_jspx_th_s_textfield_1);
    return false;
  }

  private boolean _jspx_meth_s_textfield_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:textfield
    org.apache.struts2.views.jsp.ui.TextFieldTag _jspx_th_s_textfield_2 = (org.apache.struts2.views.jsp.ui.TextFieldTag) _jspx_tagPool_s_textfield_name_label_nobody.get(org.apache.struts2.views.jsp.ui.TextFieldTag.class);
    _jspx_th_s_textfield_2.setPageContext(_jspx_page_context);
    _jspx_th_s_textfield_2.setParent(null);
    _jspx_th_s_textfield_2.setName("attendance.officeOut");
    _jspx_th_s_textfield_2.setLabel("Office Out");
    int _jspx_eval_s_textfield_2 = _jspx_th_s_textfield_2.doStartTag();
    if (_jspx_th_s_textfield_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_textfield_name_label_nobody.reuse(_jspx_th_s_textfield_2);
      return true;
    }
    _jspx_tagPool_s_textfield_name_label_nobody.reuse(_jspx_th_s_textfield_2);
    return false;
  }

  private boolean _jspx_meth_s_combobox_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:combobox
    org.apache.struts2.views.jsp.ui.ComboBoxTag _jspx_th_s_combobox_0 = (org.apache.struts2.views.jsp.ui.ComboBoxTag) _jspx_tagPool_s_combobox_name_list_label_headerValue_headerKey_nobody.get(org.apache.struts2.views.jsp.ui.ComboBoxTag.class);
    _jspx_th_s_combobox_0.setPageContext(_jspx_page_context);
    _jspx_th_s_combobox_0.setParent(null);
    _jspx_th_s_combobox_0.setName("attendance.status");
    _jspx_th_s_combobox_0.setHeaderKey("-1");
    _jspx_th_s_combobox_0.setHeaderValue("--- Select Status ---");
    _jspx_th_s_combobox_0.setList("{'Present','Absent','Late'}");
    _jspx_th_s_combobox_0.setLabel("Status:");
    int _jspx_eval_s_combobox_0 = _jspx_th_s_combobox_0.doStartTag();
    if (_jspx_th_s_combobox_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_combobox_name_list_label_headerValue_headerKey_nobody.reuse(_jspx_th_s_combobox_0);
      return true;
    }
    _jspx_tagPool_s_combobox_name_list_label_headerValue_headerKey_nobody.reuse(_jspx_th_s_combobox_0);
    return false;
  }

  private boolean _jspx_meth_s_combobox_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:combobox
    org.apache.struts2.views.jsp.ui.ComboBoxTag _jspx_th_s_combobox_1 = (org.apache.struts2.views.jsp.ui.ComboBoxTag) _jspx_tagPool_s_combobox_name_list_label_headerValue_headerKey_nobody.get(org.apache.struts2.views.jsp.ui.ComboBoxTag.class);
    _jspx_th_s_combobox_1.setPageContext(_jspx_page_context);
    _jspx_th_s_combobox_1.setParent(null);
    _jspx_th_s_combobox_1.setName("attendance.remarks");
    _jspx_th_s_combobox_1.setHeaderKey("-1");
    _jspx_th_s_combobox_1.setHeaderValue("--- Select Remarks ---");
    _jspx_th_s_combobox_1.setList("{'OK'}");
    _jspx_th_s_combobox_1.setLabel("Remarks");
    int _jspx_eval_s_combobox_1 = _jspx_th_s_combobox_1.doStartTag();
    if (_jspx_th_s_combobox_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_combobox_name_list_label_headerValue_headerKey_nobody.reuse(_jspx_th_s_combobox_1);
      return true;
    }
    _jspx_tagPool_s_combobox_name_list_label_headerValue_headerKey_nobody.reuse(_jspx_th_s_combobox_1);
    return false;
  }

  private boolean _jspx_meth_s_submit_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:submit
    org.apache.struts2.views.jsp.ui.SubmitTag _jspx_th_s_submit_0 = (org.apache.struts2.views.jsp.ui.SubmitTag) _jspx_tagPool_s_submit_value_nobody.get(org.apache.struts2.views.jsp.ui.SubmitTag.class);
    _jspx_th_s_submit_0.setPageContext(_jspx_page_context);
    _jspx_th_s_submit_0.setParent(null);
    _jspx_th_s_submit_0.setValue("SAVE");
    int _jspx_eval_s_submit_0 = _jspx_th_s_submit_0.doStartTag();
    if (_jspx_th_s_submit_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_submit_value_nobody.reuse(_jspx_th_s_submit_0);
      return true;
    }
    _jspx_tagPool_s_submit_value_nobody.reuse(_jspx_th_s_submit_0);
    return false;
  }

  private boolean _jspx_meth_s_reset_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:reset
    org.apache.struts2.views.jsp.ui.ResetTag _jspx_th_s_reset_0 = (org.apache.struts2.views.jsp.ui.ResetTag) _jspx_tagPool_s_reset_value_nobody.get(org.apache.struts2.views.jsp.ui.ResetTag.class);
    _jspx_th_s_reset_0.setPageContext(_jspx_page_context);
    _jspx_th_s_reset_0.setParent(null);
    _jspx_th_s_reset_0.setValue("Reset");
    int _jspx_eval_s_reset_0 = _jspx_th_s_reset_0.doStartTag();
    if (_jspx_th_s_reset_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_reset_value_nobody.reuse(_jspx_th_s_reset_0);
      return true;
    }
    _jspx_tagPool_s_reset_value_nobody.reuse(_jspx_th_s_reset_0);
    return false;
  }
}
