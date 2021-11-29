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
package org.apache.sling.scripting.sightly.apps.ugams.components.content.price;

import java.io.PrintWriter;
import java.util.Collection;
import javax.script.Bindings;

import org.apache.sling.scripting.sightly.render.RenderUnit;
import org.apache.sling.scripting.sightly.render.RenderContext;

public final class price_html extends RenderUnit {

    @Override
    protected final void render(PrintWriter out,
                                Bindings bindings,
                                Bindings arguments,
                                RenderContext renderContext) {
// Main Template Body -----------------------------------------------------------------------------

Object _global_price = null;
_global_price = renderContext.call("use", "com.Ugams.core.models.Price", obj());
out.write("\r\n<section class=\"price-area section-gap pb-5\">\r\n\t\t\t\t<div class=\"container\">\r\n\t\t\t\t\t<div class=\"row\">\r\n\t\t\t\t\t<div class=\" single-price col-md-12\">\r\n\t\t\t\t\t\t\t<div class=\"top-part\">\t\t\t\r\n    \t\t\t\t\t\t\t<h1 class=\"package-no\">");
{
    Object var_0 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_price, "priceNumber"), "text");
    out.write(renderContext.getObjectModel().toString(var_0));
}
out.write("</h1>\r\n\t\t\t\t\t\t\t\t<h4>");
{
    Object var_1 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_price, "priceType"), "text");
    out.write(renderContext.getObjectModel().toString(var_1));
}
out.write("</h4>\r\n\t\t\t\t\t\t\t\t<p class=\"mt-10\">");
{
    Object var_2 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_price, "priceTitle"), "text");
    out.write(renderContext.getObjectModel().toString(var_2));
}
out.write("</p>\r\n\t\t\t\t\t\t\t</div>\r\n\t\t\t\t\t\t\t<div class=\"package-list\">\r\n\t\t\t\t\t\t\t\t<ul>\r\n\t\t\t\t\t\t\t\t\t<li>");
{
    Object var_3 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_price, "priceText1"), "text");
    out.write(renderContext.getObjectModel().toString(var_3));
}
out.write("</li>\r\n\t\t\t\t\t\t\t\t\t<li>");
{
    Object var_4 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_price, "priceText2"), "text");
    out.write(renderContext.getObjectModel().toString(var_4));
}
out.write("</li>\r\n\t\t\t\t\t\t\t\t\t<li>");
{
    Object var_5 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_price, "priceText3"), "text");
    out.write(renderContext.getObjectModel().toString(var_5));
}
out.write("</li>\r\n\t\t\t\t\t\t\t\t</ul>\r\n\t\t\t\t\t\t\t</div>\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t</div>\r\n                    </div>\r\n\t\t\t\t</div>\t\r\n\t\t\t</section>");


// End Of Main Template Body ----------------------------------------------------------------------
    }



    {
//Sub-Templates Initialization --------------------------------------------------------------------



//End of Sub-Templates Initialization -------------------------------------------------------------
    }

}

