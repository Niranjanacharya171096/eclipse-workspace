/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.45
 * Generated at: 2021-12-06 10:49:13 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("jar:file:/E:/Software%20Files/eclipse-workspace/03_spring/.metadata/.plugins/org.eclipse.wst.server.core/tmp1/wtpwebapps/02.11_MVC_extendingSimpleFormController/WEB-INF/lib/spring-2.0.5.jar!/META-INF/spring-form.tld", Long.valueOf(1176130810000L));
    _jspx_dependants.put("/WEB-INF/lib/spring-2.0.5.jar", Long.valueOf(1638774815592L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fform_0026_005fcommandName;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005ferrors_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005finput_0026_005fpath_005fnobody;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fhtml_005fform_0026_005fcommandName = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005ferrors_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005finput_0026_005fpath_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fhtml_005fform_0026_005fcommandName.release();
    _005fjspx_005ftagPool_005fhtml_005ferrors_005fnobody.release();
    _005fjspx_005ftagPool_005fhtml_005finput_0026_005fpath_005fnobody.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


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

      out.write("\r\n");
      out.write("\r\n");
      //  html:form
      org.springframework.web.servlet.tags.form.FormTag _jspx_th_html_005fform_005f0 = (org.springframework.web.servlet.tags.form.FormTag) _005fjspx_005ftagPool_005fhtml_005fform_0026_005fcommandName.get(org.springframework.web.servlet.tags.form.FormTag.class);
      boolean _jspx_th_html_005fform_005f0_reused = false;
      try {
        _jspx_th_html_005fform_005f0.setPageContext(_jspx_page_context);
        _jspx_th_html_005fform_005f0.setParent(null);
        // /index.jsp(3,0) name = commandName type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
        _jspx_th_html_005fform_005f0.setCommandName("form");
        int[] _jspx_push_body_count_html_005fform_005f0 = new int[] { 0 };
        try {
          int _jspx_eval_html_005fform_005f0 = _jspx_th_html_005fform_005f0.doStartTag();
          if (_jspx_eval_html_005fform_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n");
              out.write("<h1>EmployeeRegandValidatio-extendingSimpleFormController</h1>\r\n");
              out.write("<pre>\r\n");
              //  html:errors
              org.springframework.web.servlet.tags.form.ErrorsTag _jspx_th_html_005ferrors_005f0 = (org.springframework.web.servlet.tags.form.ErrorsTag) _005fjspx_005ftagPool_005fhtml_005ferrors_005fnobody.get(org.springframework.web.servlet.tags.form.ErrorsTag.class);
              boolean _jspx_th_html_005ferrors_005f0_reused = false;
              try {
                _jspx_th_html_005ferrors_005f0.setPageContext(_jspx_page_context);
                _jspx_th_html_005ferrors_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f0);
                int[] _jspx_push_body_count_html_005ferrors_005f0 = new int[] { 0 };
                try {
                  int _jspx_eval_html_005ferrors_005f0 = _jspx_th_html_005ferrors_005f0.doStartTag();
                  if (_jspx_th_html_005ferrors_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    return;
                  }
                } catch (java.lang.Throwable _jspx_exception) {
                  while (_jspx_push_body_count_html_005ferrors_005f0[0]-- > 0)
                    out = _jspx_page_context.popBody();
                  _jspx_th_html_005ferrors_005f0.doCatch(_jspx_exception);
                } finally {
                  _jspx_th_html_005ferrors_005f0.doFinally();
                }
                _005fjspx_005ftagPool_005fhtml_005ferrors_005fnobody.reuse(_jspx_th_html_005ferrors_005f0);
                _jspx_th_html_005ferrors_005f0_reused = true;
              } finally {
                org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_html_005ferrors_005f0, _jsp_getInstanceManager(), _jspx_th_html_005ferrors_005f0_reused);
              }
              out.write("\r\n");
              out.write("\tNAME: ");
              if (_jspx_meth_html_005finput_005f0(_jspx_th_html_005fform_005f0, _jspx_page_context, _jspx_push_body_count_html_005fform_005f0))
                return;
              out.write("\r\n");
              out.write("\tEMAIL: ");
              if (_jspx_meth_html_005finput_005f1(_jspx_th_html_005fform_005f0, _jspx_page_context, _jspx_push_body_count_html_005fform_005f0))
                return;
              out.write("\r\n");
              out.write("\t<input type=\"submit\" name=\"SUBMIT\"/> \r\n");
              out.write("</pre>\r\n");
              int evalDoAfterBody = _jspx_th_html_005fform_005f0.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_html_005fform_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            return;
          }
        } catch (java.lang.Throwable _jspx_exception) {
          while (_jspx_push_body_count_html_005fform_005f0[0]-- > 0)
            out = _jspx_page_context.popBody();
          _jspx_th_html_005fform_005f0.doCatch(_jspx_exception);
        } finally {
          _jspx_th_html_005fform_005f0.doFinally();
        }
        _005fjspx_005ftagPool_005fhtml_005fform_0026_005fcommandName.reuse(_jspx_th_html_005fform_005f0);
        _jspx_th_html_005fform_005f0_reused = true;
      } finally {
        org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_html_005fform_005f0, _jsp_getInstanceManager(), _jspx_th_html_005fform_005f0_reused);
      }
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_html_005finput_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fform_005f0, javax.servlet.jsp.PageContext _jspx_page_context, int[] _jspx_push_body_count_html_005fform_005f0)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  html:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_html_005finput_005f0 = (org.springframework.web.servlet.tags.form.InputTag) _005fjspx_005ftagPool_005fhtml_005finput_0026_005fpath_005fnobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    boolean _jspx_th_html_005finput_005f0_reused = false;
    try {
      _jspx_th_html_005finput_005f0.setPageContext(_jspx_page_context);
      _jspx_th_html_005finput_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f0);
      // /index.jsp(7,7) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_html_005finput_005f0.setPath("name");
      int[] _jspx_push_body_count_html_005finput_005f0 = new int[] { 0 };
      try {
        int _jspx_eval_html_005finput_005f0 = _jspx_th_html_005finput_005f0.doStartTag();
        if (_jspx_th_html_005finput_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return true;
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_html_005finput_005f0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_html_005finput_005f0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_html_005finput_005f0.doFinally();
      }
      _005fjspx_005ftagPool_005fhtml_005finput_0026_005fpath_005fnobody.reuse(_jspx_th_html_005finput_005f0);
      _jspx_th_html_005finput_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_html_005finput_005f0, _jsp_getInstanceManager(), _jspx_th_html_005finput_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_html_005finput_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fform_005f0, javax.servlet.jsp.PageContext _jspx_page_context, int[] _jspx_push_body_count_html_005fform_005f0)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  html:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_html_005finput_005f1 = (org.springframework.web.servlet.tags.form.InputTag) _005fjspx_005ftagPool_005fhtml_005finput_0026_005fpath_005fnobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    boolean _jspx_th_html_005finput_005f1_reused = false;
    try {
      _jspx_th_html_005finput_005f1.setPageContext(_jspx_page_context);
      _jspx_th_html_005finput_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f0);
      // /index.jsp(8,8) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_html_005finput_005f1.setPath("email");
      int[] _jspx_push_body_count_html_005finput_005f1 = new int[] { 0 };
      try {
        int _jspx_eval_html_005finput_005f1 = _jspx_th_html_005finput_005f1.doStartTag();
        if (_jspx_th_html_005finput_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return true;
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_html_005finput_005f1[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_html_005finput_005f1.doCatch(_jspx_exception);
      } finally {
        _jspx_th_html_005finput_005f1.doFinally();
      }
      _005fjspx_005ftagPool_005fhtml_005finput_0026_005fpath_005fnobody.reuse(_jspx_th_html_005finput_005f1);
      _jspx_th_html_005finput_005f1_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_html_005finput_005f1, _jsp_getInstanceManager(), _jspx_th_html_005finput_005f1_reused);
    }
    return false;
  }
}
