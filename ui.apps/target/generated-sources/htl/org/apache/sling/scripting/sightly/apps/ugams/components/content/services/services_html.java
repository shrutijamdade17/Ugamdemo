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
package org.apache.sling.scripting.sightly.apps.ugams.components.content.services;

import java.io.PrintWriter;
import java.util.Collection;
import javax.script.Bindings;

import org.apache.sling.scripting.sightly.render.RenderUnit;
import org.apache.sling.scripting.sightly.render.RenderContext;

public final class services_html extends RenderUnit {

    @Override
    protected final void render(PrintWriter out,
                                Bindings bindings,
                                Bindings arguments,
                                RenderContext renderContext) {
// Main Template Body -----------------------------------------------------------------------------

Object _global_services = null;
out.write("\r\n<section class=\"services-area section-gap pt-0 pb-2\">\t\t\t\t\r\n\t\t\t\t");
_global_services = renderContext.call("use", "com.Ugams.core.models.Services", obj());
out.write("<div class=\"container\">\r\n               \t\t <div class=\"row\">\r\n\t\t\t\t\t\t<div class=\"pl-2\">\r\n\t\t\t\t\t\t\t<div class=\"single-services\">\r\n\t\t\t\t\t\t\t\t<span class=\"lnr lnr-pie-chart\"></span>\r\n\t\t\t\t\t\t\t\t<a href=\"#\"><h4>");
{
    String var_0 = (renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_services, "serviceTitle"), "text")) + " ");
    out.write(renderContext.getObjectModel().toString(var_0));
}
out.write("</h4></a> \t\t\t\r\n\t\t\t\t\t\t\t\t<p>");
{
    String var_1 = (("\r\n\t\t\t\t\t\t\t\t" + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_services, "serviceText"), "text"))) + " \r\n\r\n\t\t\t\t\t\t\t\t");
    out.write(renderContext.getObjectModel().toString(var_1));
}
out.write("</p>\r\n\t\t\t\t\t\t\t</div>\r\n\t\t\t\t\t  </div>\r\n                   </div>\r\n                 </div>\r\n</section>\r\n");


// End Of Main Template Body ----------------------------------------------------------------------
    }



    {
//Sub-Templates Initialization --------------------------------------------------------------------



//End of Sub-Templates Initialization -------------------------------------------------------------
    }

}

