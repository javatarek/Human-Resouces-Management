package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class addEmployee_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_combobox_name_list_label_headerValue_headerKey_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_radio_name_list_label_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_sx_datetimepicker_value_name_label_displayFormat_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_reset_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_select_name_list_label_headerValue_headerKey_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_textfield_name_label_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_sx_head_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_submit_value_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_s_combobox_name_list_label_headerValue_headerKey_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_radio_name_list_label_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_sx_datetimepicker_value_name_label_displayFormat_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_reset_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_select_name_list_label_headerValue_headerKey_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_textfield_name_label_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_sx_head_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_submit_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_s_combobox_name_list_label_headerValue_headerKey_nobody.release();
    _jspx_tagPool_s_radio_name_list_label_nobody.release();
    _jspx_tagPool_sx_datetimepicker_value_name_label_displayFormat_nobody.release();
    _jspx_tagPool_s_reset_value_nobody.release();
    _jspx_tagPool_s_select_name_list_label_headerValue_headerKey_nobody.release();
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("  \n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\"/>\n");
      out.write("        <title>Insert Page</title>\n");
      out.write("        ");
      if (_jspx_meth_sx_head_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body  style=\"background-color:grey\">\n");
      out.write("    <center>\n");
      out.write("        <div>\n");
      out.write("            <h1>Add Employee Form</h1>\n");
      out.write("        <form action=\"employeeinsert\" method=\"POST\">\n");
      out.write("            \n");
      out.write("        <table >\n");
      out.write("            <tr><td>\n");
      out.write("                    ");
      if (_jspx_meth_s_textfield_0(_jspx_page_context))
        return;
      out.write(" \n");
      out.write("                </td></tr>\n");
      out.write("        <tr><td>\n");
      out.write("        ");
      if (_jspx_meth_s_textfield_1(_jspx_page_context))
        return;
      out.write(" \n");
      out.write("        </td></tr>\n");
      out.write("        <tr><td>\n");
      out.write("        ");
      if (_jspx_meth_s_textfield_2(_jspx_page_context))
        return;
      out.write(" \n");
      out.write("        </td></tr>\n");
      out.write("         <tr>\n");
      out.write("             <td>");
      if (_jspx_meth_s_select_0(_jspx_page_context))
        return;
      out.write(" \n");
      out.write("        </td>\n");
      out.write("        </tr>\n");
      out.write("        \n");
      out.write("        <tr><td>\n");
      out.write("        ");
      if (_jspx_meth_s_textfield_3(_jspx_page_context))
        return;
      out.write(" \n");
      out.write("        </td></tr>\n");
      out.write("        <tr><td>\n");
      out.write("        ");
      if (_jspx_meth_s_textfield_4(_jspx_page_context))
        return;
      out.write(" \n");
      out.write("            </td>\n");
      out.write("        </tr>\n");
      out.write("        \n");
      out.write("        <tr><td>\n");
      out.write("                ");
      if (_jspx_meth_s_radio_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("            </td>\n");
      out.write("        </tr>\n");
      out.write("   \n");
      out.write("        <tr>\n");
      out.write("            <td>");
      if (_jspx_meth_s_combobox_0(_jspx_page_context))
        return;
      out.write(" \n");
      out.write("        </td>\n");
      out.write("        </tr>\n");
      out.write("        \n");
      out.write("       \n");
      out.write("        \n");
      out.write("        <tr>\n");
      out.write("            <td>\n");
      out.write("        ");
      if (_jspx_meth_s_textfield_5(_jspx_page_context))
        return;
      out.write(" \n");
      out.write("        </td>\n");
      out.write("        </tr>\n");
      out.write("        \n");
      out.write("        <tr><td>\n");
      out.write("        ");
      if (_jspx_meth_s_textfield_6(_jspx_page_context))
        return;
      out.write(" \n");
      out.write("        </td></tr>\n");
      out.write("        \n");
      out.write("        <tr><td>\n");
      out.write("        ");
      if (_jspx_meth_s_textfield_7(_jspx_page_context))
        return;
      out.write(" \n");
      out.write("        </td></tr>\n");
      out.write("        \n");
      out.write("         <tr><td>\n");
      out.write("                 ");
      if (_jspx_meth_s_radio_1(_jspx_page_context))
        return;
      out.write(" \n");
      out.write("        </td></tr>\n");
      out.write("        \n");
      out.write("        <tr>\n");
      out.write("            <td>");
      if (_jspx_meth_s_combobox_1(_jspx_page_context))
        return;
      out.write(" \n");
      out.write("        </td>\n");
      out.write("        </tr>\n");
      out.write("        \n");
      out.write("        <tr><td>\n");
      out.write("        ");
      if (_jspx_meth_s_textfield_8(_jspx_page_context))
        return;
      out.write(" \n");
      out.write("        </td></tr>\n");
      out.write("        <tr><td>\n");
      out.write("        ");
      if (_jspx_meth_s_textfield_9(_jspx_page_context))
        return;
      out.write(" \n");
      out.write("        </td></tr>\n");
      out.write("        <tr><td>\n");
      out.write("        ");
      if (_jspx_meth_sx_datetimepicker_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("        </td></tr>\n");
      out.write("         <tr><td>\n");
      out.write("        ");
      if (_jspx_meth_s_textfield_10(_jspx_page_context))
        return;
      out.write(" \n");
      out.write("        </td></tr>\n");
      out.write("        \n");
      out.write("         <tr><td>\n");
      out.write("        ");
      if (_jspx_meth_s_textfield_11(_jspx_page_context))
        return;
      out.write(" \n");
      out.write("        </td></tr>\n");
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
      out.write("        </div>\n");
      out.write("            <a href=\"admincontrolpage.jsp\" >Back</a>\n");
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
    _jspx_th_s_textfield_0.setName("employee.employeeId");
    _jspx_th_s_textfield_0.setLabel("Employee Id");
    int _jspx_eval_s_textfield_0 = _jspx_th_s_textfield_0.doStartTag();
    if (_jspx_th_s_textfield_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_textfield_name_label_nobody.reuse(_jspx_th_s_textfield_0);
      return true;
    }
    _jspx_tagPool_s_textfield_name_label_nobody.reuse(_jspx_th_s_textfield_0);
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
    _jspx_th_s_textfield_1.setName("employee.managerId");
    _jspx_th_s_textfield_1.setLabel("Manager Id");
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
    _jspx_th_s_textfield_2.setName("employee.departmentId");
    _jspx_th_s_textfield_2.setLabel("Department Id");
    int _jspx_eval_s_textfield_2 = _jspx_th_s_textfield_2.doStartTag();
    if (_jspx_th_s_textfield_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_textfield_name_label_nobody.reuse(_jspx_th_s_textfield_2);
      return true;
    }
    _jspx_tagPool_s_textfield_name_label_nobody.reuse(_jspx_th_s_textfield_2);
    return false;
  }

  private boolean _jspx_meth_s_select_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:select
    org.apache.struts2.views.jsp.ui.SelectTag _jspx_th_s_select_0 = (org.apache.struts2.views.jsp.ui.SelectTag) _jspx_tagPool_s_select_name_list_label_headerValue_headerKey_nobody.get(org.apache.struts2.views.jsp.ui.SelectTag.class);
    _jspx_th_s_select_0.setPageContext(_jspx_page_context);
    _jspx_th_s_select_0.setParent(null);
    _jspx_th_s_select_0.setName("employee.departmentName");
    _jspx_th_s_select_0.setHeaderKey("-1");
    _jspx_th_s_select_0.setHeaderValue("--- Select Department Name ---");
    _jspx_th_s_select_0.setList("{'IT','Marketting','Pharmacy','Medicine','ShareBazar','Sales','Recruitment'}");
    _jspx_th_s_select_0.setLabel("Department Name");
    int _jspx_eval_s_select_0 = _jspx_th_s_select_0.doStartTag();
    if (_jspx_th_s_select_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_select_name_list_label_headerValue_headerKey_nobody.reuse(_jspx_th_s_select_0);
      return true;
    }
    _jspx_tagPool_s_select_name_list_label_headerValue_headerKey_nobody.reuse(_jspx_th_s_select_0);
    return false;
  }

  private boolean _jspx_meth_s_textfield_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:textfield
    org.apache.struts2.views.jsp.ui.TextFieldTag _jspx_th_s_textfield_3 = (org.apache.struts2.views.jsp.ui.TextFieldTag) _jspx_tagPool_s_textfield_name_label_nobody.get(org.apache.struts2.views.jsp.ui.TextFieldTag.class);
    _jspx_th_s_textfield_3.setPageContext(_jspx_page_context);
    _jspx_th_s_textfield_3.setParent(null);
    _jspx_th_s_textfield_3.setName("employee.firstName");
    _jspx_th_s_textfield_3.setLabel("First Name");
    int _jspx_eval_s_textfield_3 = _jspx_th_s_textfield_3.doStartTag();
    if (_jspx_th_s_textfield_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_textfield_name_label_nobody.reuse(_jspx_th_s_textfield_3);
      return true;
    }
    _jspx_tagPool_s_textfield_name_label_nobody.reuse(_jspx_th_s_textfield_3);
    return false;
  }

  private boolean _jspx_meth_s_textfield_4(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:textfield
    org.apache.struts2.views.jsp.ui.TextFieldTag _jspx_th_s_textfield_4 = (org.apache.struts2.views.jsp.ui.TextFieldTag) _jspx_tagPool_s_textfield_name_label_nobody.get(org.apache.struts2.views.jsp.ui.TextFieldTag.class);
    _jspx_th_s_textfield_4.setPageContext(_jspx_page_context);
    _jspx_th_s_textfield_4.setParent(null);
    _jspx_th_s_textfield_4.setName("employee.lastName");
    _jspx_th_s_textfield_4.setLabel("Last Name");
    int _jspx_eval_s_textfield_4 = _jspx_th_s_textfield_4.doStartTag();
    if (_jspx_th_s_textfield_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_textfield_name_label_nobody.reuse(_jspx_th_s_textfield_4);
      return true;
    }
    _jspx_tagPool_s_textfield_name_label_nobody.reuse(_jspx_th_s_textfield_4);
    return false;
  }

  private boolean _jspx_meth_s_radio_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:radio
    org.apache.struts2.views.jsp.ui.RadioTag _jspx_th_s_radio_0 = (org.apache.struts2.views.jsp.ui.RadioTag) _jspx_tagPool_s_radio_name_list_label_nobody.get(org.apache.struts2.views.jsp.ui.RadioTag.class);
    _jspx_th_s_radio_0.setPageContext(_jspx_page_context);
    _jspx_th_s_radio_0.setParent(null);
    _jspx_th_s_radio_0.setList("{'Male','Female'}");
    _jspx_th_s_radio_0.setLabel("Gender");
    _jspx_th_s_radio_0.setName("employee.gender");
    int _jspx_eval_s_radio_0 = _jspx_th_s_radio_0.doStartTag();
    if (_jspx_th_s_radio_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_radio_name_list_label_nobody.reuse(_jspx_th_s_radio_0);
      return true;
    }
    _jspx_tagPool_s_radio_name_list_label_nobody.reuse(_jspx_th_s_radio_0);
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
    _jspx_th_s_combobox_0.setName("employee.city");
    _jspx_th_s_combobox_0.setHeaderKey("-1");
    _jspx_th_s_combobox_0.setHeaderValue("--- Select City ---");
    _jspx_th_s_combobox_0.setList("{'Dhaka','Khulna','Sylhet','Chittagong','Barisal','Rajshahi','Rongpur'}");
    _jspx_th_s_combobox_0.setLabel("City Name");
    int _jspx_eval_s_combobox_0 = _jspx_th_s_combobox_0.doStartTag();
    if (_jspx_th_s_combobox_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_combobox_name_list_label_headerValue_headerKey_nobody.reuse(_jspx_th_s_combobox_0);
      return true;
    }
    _jspx_tagPool_s_combobox_name_list_label_headerValue_headerKey_nobody.reuse(_jspx_th_s_combobox_0);
    return false;
  }

  private boolean _jspx_meth_s_textfield_5(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:textfield
    org.apache.struts2.views.jsp.ui.TextFieldTag _jspx_th_s_textfield_5 = (org.apache.struts2.views.jsp.ui.TextFieldTag) _jspx_tagPool_s_textfield_name_label_nobody.get(org.apache.struts2.views.jsp.ui.TextFieldTag.class);
    _jspx_th_s_textfield_5.setPageContext(_jspx_page_context);
    _jspx_th_s_textfield_5.setParent(null);
    _jspx_th_s_textfield_5.setName("employee.email");
    _jspx_th_s_textfield_5.setLabel("Email");
    int _jspx_eval_s_textfield_5 = _jspx_th_s_textfield_5.doStartTag();
    if (_jspx_th_s_textfield_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_textfield_name_label_nobody.reuse(_jspx_th_s_textfield_5);
      return true;
    }
    _jspx_tagPool_s_textfield_name_label_nobody.reuse(_jspx_th_s_textfield_5);
    return false;
  }

  private boolean _jspx_meth_s_textfield_6(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:textfield
    org.apache.struts2.views.jsp.ui.TextFieldTag _jspx_th_s_textfield_6 = (org.apache.struts2.views.jsp.ui.TextFieldTag) _jspx_tagPool_s_textfield_name_label_nobody.get(org.apache.struts2.views.jsp.ui.TextFieldTag.class);
    _jspx_th_s_textfield_6.setPageContext(_jspx_page_context);
    _jspx_th_s_textfield_6.setParent(null);
    _jspx_th_s_textfield_6.setName("employee.phoneNumber");
    _jspx_th_s_textfield_6.setLabel("Phone Number");
    int _jspx_eval_s_textfield_6 = _jspx_th_s_textfield_6.doStartTag();
    if (_jspx_th_s_textfield_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_textfield_name_label_nobody.reuse(_jspx_th_s_textfield_6);
      return true;
    }
    _jspx_tagPool_s_textfield_name_label_nobody.reuse(_jspx_th_s_textfield_6);
    return false;
  }

  private boolean _jspx_meth_s_textfield_7(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:textfield
    org.apache.struts2.views.jsp.ui.TextFieldTag _jspx_th_s_textfield_7 = (org.apache.struts2.views.jsp.ui.TextFieldTag) _jspx_tagPool_s_textfield_name_label_nobody.get(org.apache.struts2.views.jsp.ui.TextFieldTag.class);
    _jspx_th_s_textfield_7.setPageContext(_jspx_page_context);
    _jspx_th_s_textfield_7.setParent(null);
    _jspx_th_s_textfield_7.setName("employee.jobId");
    _jspx_th_s_textfield_7.setLabel("Job Id");
    int _jspx_eval_s_textfield_7 = _jspx_th_s_textfield_7.doStartTag();
    if (_jspx_th_s_textfield_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_textfield_name_label_nobody.reuse(_jspx_th_s_textfield_7);
      return true;
    }
    _jspx_tagPool_s_textfield_name_label_nobody.reuse(_jspx_th_s_textfield_7);
    return false;
  }

  private boolean _jspx_meth_s_radio_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:radio
    org.apache.struts2.views.jsp.ui.RadioTag _jspx_th_s_radio_1 = (org.apache.struts2.views.jsp.ui.RadioTag) _jspx_tagPool_s_radio_name_list_label_nobody.get(org.apache.struts2.views.jsp.ui.RadioTag.class);
    _jspx_th_s_radio_1.setPageContext(_jspx_page_context);
    _jspx_th_s_radio_1.setParent(null);
    _jspx_th_s_radio_1.setName("employee.jobGrade");
    _jspx_th_s_radio_1.setList("{'A','B','C'}");
    _jspx_th_s_radio_1.setLabel("Job Grade");
    int _jspx_eval_s_radio_1 = _jspx_th_s_radio_1.doStartTag();
    if (_jspx_th_s_radio_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_radio_name_list_label_nobody.reuse(_jspx_th_s_radio_1);
      return true;
    }
    _jspx_tagPool_s_radio_name_list_label_nobody.reuse(_jspx_th_s_radio_1);
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
    _jspx_th_s_combobox_1.setName("employee.jobLocation");
    _jspx_th_s_combobox_1.setHeaderKey("-1");
    _jspx_th_s_combobox_1.setHeaderValue("--- Select Location ---");
    _jspx_th_s_combobox_1.setList("{'Dhanmondi','Gulshan','Uttra','Savar','Panthpath','Mirpur','Kalabagan'}");
    _jspx_th_s_combobox_1.setLabel("Location Name");
    int _jspx_eval_s_combobox_1 = _jspx_th_s_combobox_1.doStartTag();
    if (_jspx_th_s_combobox_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_combobox_name_list_label_headerValue_headerKey_nobody.reuse(_jspx_th_s_combobox_1);
      return true;
    }
    _jspx_tagPool_s_combobox_name_list_label_headerValue_headerKey_nobody.reuse(_jspx_th_s_combobox_1);
    return false;
  }

  private boolean _jspx_meth_s_textfield_8(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:textfield
    org.apache.struts2.views.jsp.ui.TextFieldTag _jspx_th_s_textfield_8 = (org.apache.struts2.views.jsp.ui.TextFieldTag) _jspx_tagPool_s_textfield_name_label_nobody.get(org.apache.struts2.views.jsp.ui.TextFieldTag.class);
    _jspx_th_s_textfield_8.setPageContext(_jspx_page_context);
    _jspx_th_s_textfield_8.setParent(null);
    _jspx_th_s_textfield_8.setName("employee.salary");
    _jspx_th_s_textfield_8.setLabel("Salary");
    int _jspx_eval_s_textfield_8 = _jspx_th_s_textfield_8.doStartTag();
    if (_jspx_th_s_textfield_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_textfield_name_label_nobody.reuse(_jspx_th_s_textfield_8);
      return true;
    }
    _jspx_tagPool_s_textfield_name_label_nobody.reuse(_jspx_th_s_textfield_8);
    return false;
  }

  private boolean _jspx_meth_s_textfield_9(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:textfield
    org.apache.struts2.views.jsp.ui.TextFieldTag _jspx_th_s_textfield_9 = (org.apache.struts2.views.jsp.ui.TextFieldTag) _jspx_tagPool_s_textfield_name_label_nobody.get(org.apache.struts2.views.jsp.ui.TextFieldTag.class);
    _jspx_th_s_textfield_9.setPageContext(_jspx_page_context);
    _jspx_th_s_textfield_9.setParent(null);
    _jspx_th_s_textfield_9.setName("employee.commissionPct");
    _jspx_th_s_textfield_9.setLabel("Comission Pct");
    int _jspx_eval_s_textfield_9 = _jspx_th_s_textfield_9.doStartTag();
    if (_jspx_th_s_textfield_9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_textfield_name_label_nobody.reuse(_jspx_th_s_textfield_9);
      return true;
    }
    _jspx_tagPool_s_textfield_name_label_nobody.reuse(_jspx_th_s_textfield_9);
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
    _jspx_th_sx_datetimepicker_0.setName("employee.hireDate");
    _jspx_th_sx_datetimepicker_0.setLabel("Hire Date");
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

  private boolean _jspx_meth_s_textfield_10(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:textfield
    org.apache.struts2.views.jsp.ui.TextFieldTag _jspx_th_s_textfield_10 = (org.apache.struts2.views.jsp.ui.TextFieldTag) _jspx_tagPool_s_textfield_name_label_nobody.get(org.apache.struts2.views.jsp.ui.TextFieldTag.class);
    _jspx_th_s_textfield_10.setPageContext(_jspx_page_context);
    _jspx_th_s_textfield_10.setParent(null);
    _jspx_th_s_textfield_10.setName("employee.primarySkill");
    _jspx_th_s_textfield_10.setLabel("Primary Skill");
    int _jspx_eval_s_textfield_10 = _jspx_th_s_textfield_10.doStartTag();
    if (_jspx_th_s_textfield_10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_textfield_name_label_nobody.reuse(_jspx_th_s_textfield_10);
      return true;
    }
    _jspx_tagPool_s_textfield_name_label_nobody.reuse(_jspx_th_s_textfield_10);
    return false;
  }

  private boolean _jspx_meth_s_textfield_11(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:textfield
    org.apache.struts2.views.jsp.ui.TextFieldTag _jspx_th_s_textfield_11 = (org.apache.struts2.views.jsp.ui.TextFieldTag) _jspx_tagPool_s_textfield_name_label_nobody.get(org.apache.struts2.views.jsp.ui.TextFieldTag.class);
    _jspx_th_s_textfield_11.setPageContext(_jspx_page_context);
    _jspx_th_s_textfield_11.setParent(null);
    _jspx_th_s_textfield_11.setName("employee.secondarySkill");
    _jspx_th_s_textfield_11.setLabel("Secondary Skill");
    int _jspx_eval_s_textfield_11 = _jspx_th_s_textfield_11.doStartTag();
    if (_jspx_th_s_textfield_11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_textfield_name_label_nobody.reuse(_jspx_th_s_textfield_11);
      return true;
    }
    _jspx_tagPool_s_textfield_name_label_nobody.reuse(_jspx_th_s_textfield_11);
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
    _jspx_th_s_submit_0.setValue("Add Employee");
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
