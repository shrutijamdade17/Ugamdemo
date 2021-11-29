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
package org.apache.sling.scripting.sightly.apps.ugams.components.content.header;

import java.io.PrintWriter;
import java.util.Collection;
import javax.script.Bindings;

import org.apache.sling.scripting.sightly.render.RenderUnit;
import org.apache.sling.scripting.sightly.render.RenderContext;

public final class header_html extends RenderUnit {

    @Override
    protected final void render(PrintWriter out,
                                Bindings bindings,
                                Bindings arguments,
                                RenderContext renderContext) {
// Main Template Body -----------------------------------------------------------------------------

Object _dynamic_properties = bindings.get("properties");
out.write("\r\n\r\n<header id=\"header\">\r\n            <div class=\"container main-menu\">\r\n                <div class=\"row align-items-center justify-content-between d-flex\">\r\n                  <div id=\"logo\">\r\n                      <a");
{
    String var_attrcontent0 = (renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_properties, "home"), "uri")) + ".html");
    {
        Object var_shoulddisplayattr1 = ((renderContext.getObjectModel().toBoolean(var_attrcontent0) ? var_attrcontent0 : ("false".equals(var_attrcontent0))));
        if (renderContext.getObjectModel().toBoolean(var_shoulddisplayattr1)) {
            out.write(" href=\"");
            out.write(renderContext.getObjectModel().toString(var_attrcontent0));
            out.write("\"");
        }
    }
}
out.write(">");
{
    Object var_resourcecontent2 = renderContext.call("includeResource", "logo", obj().with("resourceType", "/apps/ugams/components/image"));
    out.write(renderContext.getObjectModel().toString(var_resourcecontent2));
}
out.write("</a>\r\n                  </div>\r\n                  ");
{
    Object var_resourcecontent3 = renderContext.call("includeResource", "navigation", obj().with("resourceType", "/apps/ugams/components/navigation"));
    out.write(renderContext.getObjectModel().toString(var_resourcecontent3));
}
out.write("               \r\n                </div>\r\n            </div>\r\n          </header>\r\n");


// End Of Main Template Body ----------------------------------------------------------------------
    }



    {
//Sub-Templates Initialization --------------------------------------------------------------------



//End of Sub-Templates Initialization -------------------------------------------------------------
    }

}

