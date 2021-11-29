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
package org.apache.sling.scripting.sightly.apps.ugams.components.content.banner__002d__navigation;

import java.io.PrintWriter;
import java.util.Collection;
import javax.script.Bindings;

import org.apache.sling.scripting.sightly.render.RenderUnit;
import org.apache.sling.scripting.sightly.render.RenderContext;

public final class banner__002d__navigation_html extends RenderUnit {

    @Override
    protected final void render(PrintWriter out,
                                Bindings bindings,
                                Bindings arguments,
                                RenderContext renderContext) {
// Main Template Body -----------------------------------------------------------------------------

Object _global_bannernav = null;
Object _dynamic_currentpage = bindings.get("currentpage");
out.write("\r\n\r\n");
_global_bannernav = renderContext.call("use", "com.Ugams.core.models.BannerNav", obj());
out.write("\r\n<section class=\"about-banner\">\t\t\t\t\t\r\n\t\t\t\t<div class=\"container\">\t\t\t\t\r\n\t\t\t\t\t<div class=\"row d-flex align-items-center justify-content-center\">\r\n\t\t\t\t\t\t<div class=\"about-content col-lg-12\">\r\n\t\t\t\t\t\t\t<h1 class=\"text-white\">");
{
    String var_0 = (("\r\n\t\t\t\t\t\t\t\t" + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_currentpage, "title"), "text"))) + "\t\t\t\t\r\n\t\t\t\t\t\t\t");
    out.write(renderContext.getObjectModel().toString(var_0));
}
out.write("</h1>\t\r\n\t\t\t\t\t\t\t<p class=\"text-white link-nav\"><a");
{
    String var_attrcontent1 = (renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_bannernav, "nav1Path"), "uri")) + ".html");
    {
        Object var_shoulddisplayattr2 = ((renderContext.getObjectModel().toBoolean(var_attrcontent1) ? var_attrcontent1 : ("false".equals(var_attrcontent1))));
        if (renderContext.getObjectModel().toBoolean(var_shoulddisplayattr2)) {
            out.write(" href=\"");
            out.write(renderContext.getObjectModel().toString(var_attrcontent1));
            out.write("\"");
        }
    }
}
out.write(">");
{
    String var_3 = (renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_bannernav, "nav1"), "text")) + " ");
    out.write(renderContext.getObjectModel().toString(var_3));
}
out.write("</a>  <span class=\"lnr lnr-arrow-right\"></span>  <a");
{
    String var_attrcontent4 = (renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_currentpage, "path"), "uri")) + ".html");
    {
        Object var_shoulddisplayattr5 = ((renderContext.getObjectModel().toBoolean(var_attrcontent4) ? var_attrcontent4 : ("false".equals(var_attrcontent4))));
        if (renderContext.getObjectModel().toBoolean(var_shoulddisplayattr5)) {
            out.write(" href=\"");
            out.write(renderContext.getObjectModel().toString(var_attrcontent4));
            out.write("\"");
        }
    }
}
out.write(">");
{
    String var_6 = (" " + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_currentpage, "title"), "text")));
    out.write(renderContext.getObjectModel().toString(var_6));
}
out.write("</a></p>\r\n\t\t\t\t\t\t</div>\t\r\n\t\t\t\t\t</div>\r\n\t\t\t\t</div>\r\n\t\t\t</section>");


// End Of Main Template Body ----------------------------------------------------------------------
    }



    {
//Sub-Templates Initialization --------------------------------------------------------------------



//End of Sub-Templates Initialization -------------------------------------------------------------
    }

}

