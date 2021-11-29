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
package org.apache.sling.scripting.sightly.apps.ugams.components.content.blog__002d__teaser;

import java.io.PrintWriter;
import java.util.Collection;
import javax.script.Bindings;

import org.apache.sling.scripting.sightly.render.RenderUnit;
import org.apache.sling.scripting.sightly.render.RenderContext;

public final class blog__002d__teaser_html extends RenderUnit {

    @Override
    protected final void render(PrintWriter out,
                                Bindings bindings,
                                Bindings arguments,
                                RenderContext renderContext) {
// Main Template Body -----------------------------------------------------------------------------

Object _global_blog = null;
out.write("<section class=\"recent-blog-area section-gap pb-5 mt-3\">\r\n\t\t\t\t");
_global_blog = renderContext.call("use", "com.Ugams.core.models.Blog", obj());
out.write("<div class=\"container\">\r\n\t\t\t\t\t<div class=\"row\">\r\n<div class=\"single-recent-blog p-3\">\r\n\t\t\t\t\t\t\t<div class=\"thumb\">\t\t\t\t\r\n\t\t\t\t\t\t\t\t<img class=\"f-img img-fluid mx-auto\"");
{
    Object var_attrvalue0 = renderContext.getObjectModel().resolveProperty(_global_blog, "img");
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
out.write(" alt=\"\"/>\t\r\n\t\t\t\t\t\t\t</div>\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t<a href=\"#\">\r\n\t\t\t\t\t\t\t\t<h4>");
{
    Object var_4 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_blog, "blogTitle"), "text");
    out.write(renderContext.getObjectModel().toString(var_4));
}
out.write("</h4>\r\n\t\t\t\t\t\t\t</a>\r\n\t\t\t\t\t\t\t<p>");
{
    String var_5 = (("\r\n\t\t\t\t\t\t\t\t" + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_blog, "blogText"), "text"))) + "\r\n\t\t\t\t\t\t\t");
    out.write(renderContext.getObjectModel().toString(var_5));
}
out.write("</p>\r\n\t\t\t\t\t\t</div>\r\n                     </div>\r\n\t\t\t\t</div>\t\r\n\t\t\t</section>");


// End Of Main Template Body ----------------------------------------------------------------------
    }



    {
//Sub-Templates Initialization --------------------------------------------------------------------



//End of Sub-Templates Initialization -------------------------------------------------------------
    }

}

