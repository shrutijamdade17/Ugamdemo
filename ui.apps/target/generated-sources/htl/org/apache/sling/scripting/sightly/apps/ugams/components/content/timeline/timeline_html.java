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
package org.apache.sling.scripting.sightly.apps.ugams.components.content.timeline;

import java.io.PrintWriter;
import java.util.Collection;
import javax.script.Bindings;

import org.apache.sling.scripting.sightly.render.RenderUnit;
import org.apache.sling.scripting.sightly.render.RenderContext;

public final class timeline_html extends RenderUnit {

    @Override
    protected final void render(PrintWriter out,
                                Bindings bindings,
                                Bindings arguments,
                                RenderContext renderContext) {
// Main Template Body -----------------------------------------------------------------------------

Object _global_timeline = null;
Collection var_collectionvar0_list_coerced$ = null;
out.write("\r\n\r\n");
_global_timeline = renderContext.call("use", "com.Ugams.core.models.Timeline", obj());
out.write("\r\n<section class=\"timeline pb-120 \">\r\n");
{
    Object var_collectionvar0 = renderContext.getObjectModel().resolveProperty(_global_timeline, "timelineDetails");
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
                            out.write("<ul>");
                            if (var_collectionvar0_list_coerced$ == null) {
                                var_collectionvar0_list_coerced$ = renderContext.getObjectModel().toCollection(var_collectionvar0);
                            }
                            long var_index7 = 0;
                            for (Object items : var_collectionvar0_list_coerced$) {
                                {
                                    boolean var_traversal9 = (((var_index7 >= 0) && (var_index7 <= var_end5)) && true);
                                    if (var_traversal9) {
                                        out.write("\r\n\t\t\t    <li>\r\n\t\t\t      <div class=\"content\">\r\n\t\t\t        <h4>\r\n\t\t\t          <time>");
                                        {
                                            Object var_10 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(items, "title"), "text");
                                            out.write(renderContext.getObjectModel().toString(var_10));
                                        }
                                        out.write("</time>\r\n\t\t\t        </h4>\r\n\t\t\t        <p>");
                                        {
                                            Object var_11 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(items, "text1"), "text");
                                            out.write(renderContext.getObjectModel().toString(var_11));
                                        }
                                        out.write("</p>\r\n\t\t\t        <p>");
                                        {
                                            Object var_12 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(items, "text2"), "text");
                                            out.write(renderContext.getObjectModel().toString(var_12));
                                        }
                                        out.write("</p>\r\n\t\t\t      </div>\r\n\t\t\t    </li>\r\n");
                                    }
                                }
                                var_index7++;
                            }
                        }
                    }
                }
            }
        }
    }
    var_collectionvar0_list_coerced$ = null;
}
out.write("</section>");


// End Of Main Template Body ----------------------------------------------------------------------
    }



    {
//Sub-Templates Initialization --------------------------------------------------------------------



//End of Sub-Templates Initialization -------------------------------------------------------------
    }

}

