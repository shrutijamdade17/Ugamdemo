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
package org.apache.sling.scripting.sightly.apps.ugams.components.content.portfolio__002d__teaser;

import java.io.PrintWriter;
import java.util.Collection;
import javax.script.Bindings;

import org.apache.sling.scripting.sightly.render.RenderUnit;
import org.apache.sling.scripting.sightly.render.RenderContext;

public final class portfolio__002d__teaser_html extends RenderUnit {

    @Override
    protected final void render(PrintWriter out,
                                Bindings bindings,
                                Bindings arguments,
                                RenderContext renderContext) {
// Main Template Body -----------------------------------------------------------------------------

Object _global_portfolio = null;
out.write("<section class=\"portfolio-area section-gap col-lg-12 pt-4\" id=\"portfolio\">\t\r\n");
_global_portfolio = renderContext.call("use", "com.Ugams.core.models.Portfolio", obj());
out.write("<div class=\"filters-content\">\r\n            <div>\r\n                <div class=\"single-portfolio all vector\">\r\n                            \t<div class=\"relative p-3\">\r\n\t                            \t<div class=\"thumb\">\r\n\t                            \t\t<div class=\"overlay overlay-bg\"></div>\t\t\t\r\n\t                            \t\t <img class=\"image img-fluid\"");
{
    Object var_attrvalue0 = renderContext.getObjectModel().resolveProperty(_global_portfolio, "img");
    {
        Object var_attrcontent1 = renderContext.call("xss", var_attrvalue0, "uri");
        {
            Object var_shoulddisplayattr3 = ((renderContext.getObjectModel().toBoolean(var_attrcontent1) ? var_attrcontent1 : ("false".equals(var_attrvalue0))));
            if (renderContext.getObjectModel().toBoolean(var_shoulddisplayattr3)) {
                out.write(" src");
                {
                    boolean var_istrueattr2 = (var_attrvalue0.equals(true));
                    if (!var_istrueattr2) {
                        out.write("=\"");
                        out.write(renderContext.getObjectModel().toString(var_attrcontent1));
                        out.write("\"");
                    }
                }
            }
        }
    }
}
out.write(" alt=\"\"/>\r\n\t                            \t</div>\r\n\t\t\t\t\t\t\t\t\t<a");
{
    Object var_attrvalue4 = renderContext.getObjectModel().resolveProperty(_global_portfolio, "img");
    {
        Object var_attrcontent5 = renderContext.call("xss", var_attrvalue4, "uri");
        {
            Object var_shoulddisplayattr7 = ((renderContext.getObjectModel().toBoolean(var_attrcontent5) ? var_attrcontent5 : ("false".equals(var_attrvalue4))));
            if (renderContext.getObjectModel().toBoolean(var_shoulddisplayattr7)) {
                out.write(" href");
                {
                    boolean var_istrueattr6 = (var_attrvalue4.equals(true));
                    if (!var_istrueattr6) {
                        out.write("=\"");
                        out.write(renderContext.getObjectModel().toString(var_attrcontent5));
                        out.write("\"");
                    }
                }
            }
        }
    }
}
out.write(" class=\"img-pop-up\">\t\r\n\t\t\t\t\t\t\t\t\t  <div class=\"middle\">\r\n\t\t\t\t\t\t\t\t\t    <div class=\"text align-self-center d-flex\"><img src=\"\" alt=\"\"/></div>\r\n\t\t\t\t\t\t\t\t\t  </div>\r\n\t\t\t\t\t\t\t\t</a>                              \t\t\r\n                            \t</div>\r\n\t\t\t\t\t\t\t\t<div class=\"p-inner\">\r\n\t\t\t\t\t\t\t\t    <h4>");
{
    Object var_8 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_portfolio, "portfolioTitle"), "text");
    out.write(renderContext.getObjectModel().toString(var_8));
}
out.write("</h4>\r\n\t\t\t\t\t\t\t\t\t<div class=\"cat\">");
{
    Object var_9 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_portfolio, "portfolioText"), "text");
    out.write(renderContext.getObjectModel().toString(var_9));
}
out.write("</div>\r\n\t\t\t\t\t\t\t\t</div>\t\t\t\t\t                               \r\n                            </div>\r\n                             </div>\r\n\r\n                </div>\r\n            </section>");


// End Of Main Template Body ----------------------------------------------------------------------
    }



    {
//Sub-Templates Initialization --------------------------------------------------------------------



//End of Sub-Templates Initialization -------------------------------------------------------------
    }

}

