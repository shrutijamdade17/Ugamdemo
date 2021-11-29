/*******************************************************************************
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 ******************************************************************************/
package org.apache.sling.scripting.sightly.apps.ugams.components.content.footer;

import java.io.PrintWriter;
import java.util.Collection;
import javax.script.Bindings;

import org.apache.sling.scripting.sightly.render.RenderUnit;
import org.apache.sling.scripting.sightly.render.RenderContext;

public final class footer_html extends RenderUnit {

    @Override
    protected final void render(PrintWriter out,
                                Bindings bindings,
                                Bindings arguments,
                                RenderContext renderContext) {
// Main Template Body -----------------------------------------------------------------------------

Object _global_footer = null;
_global_footer = renderContext.call("use", "com.Ugams.core.models.Footer", obj());
out.write("\r\n<footer class=\"footer-area section-gap\">\r\n                <div class=\"container\">\r\n                    <div class=\"row\">\t\t\t\t\t\r\n                        <div class=\"col-lg-5 col-md-6 col-sm-6\">\r\n                            <div class=\"single-footer-widget\">\r\n                                <h4>");
{
    Object var_0 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_footer, "title1"), "text");
    out.write(renderContext.getObjectModel().toString(var_0));
}
out.write("</h4>\r\n                                <p>");
{
    String var_1 = (("\r\n\t\t\t\t\t\t\t\t\t" + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_footer, "text1"), "text"))) + "\r\n                                ");
    out.write(renderContext.getObjectModel().toString(var_1));
}
out.write("</p>\r\n                            </div>\r\n                        </div>\r\n                        <div class=\"col-lg-5 col-md-6 col-sm-6\">\r\n                            <div class=\"single-footer-widget\">\r\n                                <h4>");
{
    Object var_2 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_footer, "title2"), "text");
    out.write(renderContext.getObjectModel().toString(var_2));
}
out.write("</h4>\r\n                                <p>");
{
    Object var_3 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_footer, "text2"), "text");
    out.write(renderContext.getObjectModel().toString(var_3));
}
out.write("</p>\r\n\t\t\t\t\t\t\t\t<div class=\"\" id=\"mc_embed_signup\">\r\n\t\t\t\t\t\t\t\t\t <form target=\"_blank\" action=\"\" method=\"get\">\r\n\t\t\t\t\t\t\t\t\t  <div class=\"input-group\">\r\n\t\t\t\t\t\t\t\t\t    <input type=\"email\" class=\"form-control\" name=\"EMAIL\" placeholder=\"Enter Email Address\" onfocus=\"this.placeholder = ''\" onblur=\"this.placeholder = 'Enter Email Address '\" required=\"\"/>\r\n\t\t\t\t\t\t\t\t\t    <div class=\"input-group-btn\">\r\n\t\t\t\t\t\t\t\t\t      <button class=\"btn btn-default\" type=\"submit\">\r\n\t\t\t\t\t\t\t\t\t        <span class=\"lnr lnr-arrow-right\"></span>\r\n\t\t\t\t\t\t\t\t\t      </button>    \r\n\t\t\t\t\t\t\t\t\t    </div>\r\n\t\t\t\t\t\t\t\t\t    \t<div class=\"info\"></div>  \r\n\t\t\t\t\t\t\t\t\t  </div>\r\n\t\t\t\t\t\t\t\t\t</form> \r\n\t\t\t\t\t\t\t\t</div>\r\n                            </div>\r\n                        </div>\r\n                        <div class=\"col-lg-2 col-md-6 col-sm-6 social-widget\">\r\n                            <div class=\"single-footer-widget\">\r\n                                <h4>");
{
    Object var_4 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_footer, "title3"), "text");
    out.write(renderContext.getObjectModel().toString(var_4));
}
out.write("</h4>\r\n                                <p>");
{
    Object var_5 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_footer, "text3"), "text");
    out.write(renderContext.getObjectModel().toString(var_5));
}
out.write("</p>\r\n                                <div class=\"footer-social d-flex align-items-center\">\r\n                                    <a href=\"#\"><i class=\"fa fa-facebook\"></i></a>\r\n                                    <a href=\"#\"><i class=\"fa fa-twitter\"></i></a>\r\n                                    <a href=\"#\"><i class=\"fa fa-dribbble\"></i></a>\r\n                                    <a href=\"#\"><i class=\"fa fa-behance\"></i></a>\r\n                                </div>\r\n                            </div>\r\n                        </div>\r\n                    </div>\r\n                </div>\r\n            </footer>  ");


// End Of Main Template Body ----------------------------------------------------------------------
    }



    {
//Sub-Templates Initialization --------------------------------------------------------------------



//End of Sub-Templates Initialization -------------------------------------------------------------
    }

}

