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
package org.apache.sling.scripting.sightly.apps.ugams.components.content.brands;

import java.io.PrintWriter;
import java.util.Collection;
import javax.script.Bindings;

import org.apache.sling.scripting.sightly.render.RenderUnit;
import org.apache.sling.scripting.sightly.render.RenderContext;

public final class brands_html extends RenderUnit {

    @Override
    protected final void render(PrintWriter out,
                                Bindings bindings,
                                Bindings arguments,
                                RenderContext renderContext) {
// Main Template Body -----------------------------------------------------------------------------

Object _global_brands = null;
Collection var_collectionvar0_list_coerced$ = null;
_global_brands = renderContext.call("use", "com.Ugams.core.models.Brands", obj());
out.write("\r\n<div class=\"pt-3\">\r\n<section class=\"brands-area\">\t\t\t\t\t\r\n\t\t        <div class=\"container\">\r\n\t\t            <div class=\"brand-wrap\">\r\n\t\t                ");
{
    Object var_collectionvar0 = renderContext.getObjectModel().resolveProperty(_global_brands, "imgPath");
    {
        long var_size1 = ((var_collectionvar0_list_coerced$ == null ? (var_collectionvar0_list_coerced$ = renderContext.getObjectModel().toCollection(var_collectionvar0)) : var_collectionvar0_list_coerced$).size());
        {
            boolean var_notempty2 = (var_size1 > 0);
            if (var_notempty2) {
                {
                    long var_end5 = var_size1;
                    {
                        boolean var_validstartstepend6 = (((0 < var_size1) && true) && (var_end5 > 0));
                        if (var_validstartstepend6) {
                            out.write("<div class=\"row align-items-center active-brand-carusel justify-content-start no-gutters\">");
                            if (var_collectionvar0_list_coerced$ == null) {
                                var_collectionvar0_list_coerced$ = renderContext.getObjectModel().toCollection(var_collectionvar0);
                            }
                            long var_index7 = 0;
                            for (Object items : var_collectionvar0_list_coerced$) {
                                {
                                    boolean var_traversal9 = (((var_index7 >= 0) && (var_index7 <= var_end5)) && true);
                                    if (var_traversal9) {
                                        out.write("\r\n\t\t\t\t\t\t\t<div class=\"col single-brand\">\r\n\t\t                        <a href=\"#\"><img class=\"mx-auto\"");
                                        {
                                            Object var_attrvalue10 = items;
                                            {
                                                Object var_attrcontent11 = renderContext.call("xss", var_attrvalue10, "uri");
                                                {
                                                    Object var_shoulddisplayattr13 = ((renderContext.getObjectModel().toBoolean(var_attrcontent11) ? var_attrcontent11 : ("false".equals(var_attrvalue10))));
                                                    if (renderContext.getObjectModel().toBoolean(var_shoulddisplayattr13)) {
                                                        out.write(" src");
                                                        {
                                                            boolean var_istrueattr12 = (var_attrvalue10.equals(true));
                                                            if (!var_istrueattr12) {
                                                                out.write("=\"");
                                                                out.write(renderContext.getObjectModel().toString(var_attrcontent11));
                                                                out.write("\"");
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        out.write(" alt=\"\"/></a>\r\n\t\t                    </div>\r\n                            ");
                                    }
                                }
                                var_index7++;
                            }
                            out.write("</div>");
                        }
                    }
                }
            }
        }
    }
    var_collectionvar0_list_coerced$ = null;
}
out.write("\r\n\t\t            </div>\r\n\t\t        </div>\r\n\t\t    </section>\r\n            </div>");


// End Of Main Template Body ----------------------------------------------------------------------
    }



    {
//Sub-Templates Initialization --------------------------------------------------------------------



//End of Sub-Templates Initialization -------------------------------------------------------------
    }

}

