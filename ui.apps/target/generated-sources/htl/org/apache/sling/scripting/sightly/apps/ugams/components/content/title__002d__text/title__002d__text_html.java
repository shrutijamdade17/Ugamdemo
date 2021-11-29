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
package org.apache.sling.scripting.sightly.apps.ugams.components.content.title__002d__text;

import java.io.PrintWriter;
import java.util.Collection;
import javax.script.Bindings;

import org.apache.sling.scripting.sightly.render.RenderUnit;
import org.apache.sling.scripting.sightly.render.RenderContext;

public final class title__002d__text_html extends RenderUnit {

    @Override
    protected final void render(PrintWriter out,
                                Bindings bindings,
                                Bindings arguments,
                                RenderContext renderContext) {
// Main Template Body -----------------------------------------------------------------------------

Object _global_titletext = null;
_global_titletext = renderContext.call("use", "com.Ugams.core.models.TitleText", obj());
out.write("\r\n<section");
{
    String var_attrcontent0 = ("section-gap p-0 " + renderContext.getObjectModel().toString(renderContext.call("xss", (renderContext.getObjectModel().toBoolean(renderContext.getObjectModel().resolveProperty(_global_titletext, "background")) ? "testimonial-area" : ""), "attribute")));
    {
        Object var_shoulddisplayattr1 = ((renderContext.getObjectModel().toBoolean(var_attrcontent0) ? var_attrcontent0 : ("false".equals(var_attrcontent0))));
        if (renderContext.getObjectModel().toBoolean(var_shoulddisplayattr1)) {
            out.write(" class=\"");
            out.write(renderContext.getObjectModel().toString(var_attrcontent0));
            out.write("\"");
        }
    }
}
out.write(">\r\n    <div class=\"container\">\r\n        <div class=\"row d-flex justify-content-center\">\r\n            <div");
{
    String var_attrcontent2 = ((("menu-content  col-lg-7 " + renderContext.getObjectModel().toString(renderContext.call("xss", (renderContext.getObjectModel().toBoolean(renderContext.getObjectModel().resolveProperty(_global_titletext, "bottomPadding")) ? "pb-70" : ""), "attribute"))) + " || ") + renderContext.getObjectModel().toString(renderContext.call("xss", (renderContext.getObjectModel().toBoolean(renderContext.getObjectModel().resolveProperty(_global_titletext, "sectionGap")) ? "pt-120" : ""), "attribute")));
    {
        Object var_shoulddisplayattr3 = ((renderContext.getObjectModel().toBoolean(var_attrcontent2) ? var_attrcontent2 : ("false".equals(var_attrcontent2))));
        if (renderContext.getObjectModel().toBoolean(var_shoulddisplayattr3)) {
            out.write(" class=\"");
            out.write(renderContext.getObjectModel().toString(var_attrcontent2));
            out.write("\"");
        }
    }
}
out.write(">\r\n                <div class=\"title text-center\">\r\n                    <h1 class=\"mb-10\">");
{
    Object var_4 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_titletext, "title"), "text");
    out.write(renderContext.getObjectModel().toString(var_4));
}
out.write("</h1>\r\n                    <p>");
{
    Object var_5 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_titletext, "text"), "text");
    out.write(renderContext.getObjectModel().toString(var_5));
}
out.write("</p>\r\n                </div>\r\n            </div>\r\n        </div>\r\n    </div>\r\n</section>\r\n\r\n\r\n");


// End Of Main Template Body ----------------------------------------------------------------------
    }



    {
//Sub-Templates Initialization --------------------------------------------------------------------



//End of Sub-Templates Initialization -------------------------------------------------------------
    }

}

