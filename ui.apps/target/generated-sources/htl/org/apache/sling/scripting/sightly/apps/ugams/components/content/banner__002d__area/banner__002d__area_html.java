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
package org.apache.sling.scripting.sightly.apps.ugams.components.content.banner__002d__area;

import java.io.PrintWriter;
import java.util.Collection;
import javax.script.Bindings;

import org.apache.sling.scripting.sightly.render.RenderUnit;
import org.apache.sling.scripting.sightly.render.RenderContext;

public final class banner__002d__area_html extends RenderUnit {

    @Override
    protected final void render(PrintWriter out,
                                Bindings bindings,
                                Bindings arguments,
                                RenderContext renderContext) {
// Main Template Body -----------------------------------------------------------------------------

Object _global_bannerarea = null;
out.write("\r\n");
_global_bannerarea = renderContext.call("use", "com.Ugams.core.models.BannerArea", obj());
out.write("\r\n<section class=\"banner-area\">\t\t\t\t\t\t\t\t\r\n\t\t\t\t<div class=\"container\">\r\n\t\t\t\t\t<div class=\"row fullscreen align-items-center justify-content-between\">\r\n\t\t\t\t\t\t<div class=\"col-lg-6 col-md-6 banner-left\">\r\n  \t\t\t\t\t\t  <h6>");
{
    Object var_0 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_bannerarea, "bannerAreaTitle"), "text");
    out.write(renderContext.getObjectModel().toString(var_0));
}
out.write("</h6>\r\n\t\t\t\t\t\t\t<h1>");
{
    Object var_1 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_bannerarea, "bannerAreaHeading"), "text");
    out.write(renderContext.getObjectModel().toString(var_1));
}
out.write("</h1>\r\n\t\t\t\t\t\t\t<p>");
{
    String var_2 = (("\r\n\t\t\t\t\t\t\t\t" + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_bannerarea, "bannerAreaDescription"), "text"))) + "\r\n\t\t\t\t\t\t\t");
    out.write(renderContext.getObjectModel().toString(var_2));
}
out.write("</p>\r\n\t\t\t\t\t\t\t<a");
{
    Object var_attrvalue3 = renderContext.call("uriManipulation", renderContext.getObjectModel().resolveProperty(_global_bannerarea, "pathValue"), obj().with("extension", "html"));
    {
        Object var_attrcontent4 = renderContext.call("xss", var_attrvalue3, "uri");
        {
            Object var_shoulddisplayattr6 = ((renderContext.getObjectModel().toBoolean(var_attrcontent4) ? var_attrcontent4 : ("false".equals(var_attrvalue3))));
            if (renderContext.getObjectModel().toBoolean(var_shoulddisplayattr6)) {
                out.write(" href");
                {
                    boolean var_istrueattr5 = (var_attrvalue3.equals(true));
                    if (!var_istrueattr5) {
                        out.write("=\"");
                        out.write(renderContext.getObjectModel().toString(var_attrcontent4));
                        out.write("\"");
                    }
                }
            }
        }
    }
}
out.write(" class=\"primary-btn text-uppercase\">");
{
    Object var_7 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_bannerarea, "bannerAreaButtonTitle"), "text");
    out.write(renderContext.getObjectModel().toString(var_7));
}
out.write("</a>\r\n\t\t\t\t\t\t</div>\r\n\t\t\t\t\t\t<div class=\"col-lg-6 col-md-6 banner-right d-flex align-self-end\">\r\n\t\t\t\t\t\t\t<img class=\"img-fluid\"");
{
    Object var_attrvalue8 = renderContext.getObjectModel().resolveProperty(_global_bannerarea, "img");
    {
        Object var_attrcontent9 = renderContext.call("xss", var_attrvalue8, "uri");
        {
            Object var_shoulddisplayattr11 = ((renderContext.getObjectModel().toBoolean(var_attrcontent9) ? var_attrcontent9 : ("false".equals(var_attrvalue8))));
            if (renderContext.getObjectModel().toBoolean(var_shoulddisplayattr11)) {
                out.write(" src");
                {
                    boolean var_istrueattr10 = (var_attrvalue8.equals(true));
                    if (!var_istrueattr10) {
                        out.write("=\"");
                        out.write(renderContext.getObjectModel().toString(var_attrcontent9));
                        out.write("\"");
                    }
                }
            }
        }
    }
}
out.write(" alt=\"\"/>\r\n\t\t\t\t\t\t</div>\r\n\t\t\t\t\t</div>\r\n\t\t\t\t</div>\t\t\t\t\t\r\n\t\t\t</section>");


// End Of Main Template Body ----------------------------------------------------------------------
    }



    {
//Sub-Templates Initialization --------------------------------------------------------------------



//End of Sub-Templates Initialization -------------------------------------------------------------
    }

}

