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
package org.apache.sling.scripting.sightly.apps.ugams.components.content.OsgiConfigComp;

import java.io.PrintWriter;
import java.util.Collection;
import javax.script.Bindings;

import org.apache.sling.scripting.sightly.render.RenderUnit;
import org.apache.sling.scripting.sightly.render.RenderContext;

public final class OsgiConfigComp_html extends RenderUnit {

    @Override
    protected final void render(PrintWriter out,
                                Bindings bindings,
                                Bindings arguments,
                                RenderContext renderContext) {
// Main Template Body -----------------------------------------------------------------------------

Object _global_osgiconfig = null;
Collection var_collectionvar4_list_coerced$ = null;
out.write("<h1>OSGi Configuration Service</h1>\n");
_global_osgiconfig = renderContext.call("use", "com.Ugams.core.models.OSGiConfigModel", obj());
out.write("\n   <div>\n       <p> Service Name : <b>");
{
    Object var_0 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_osgiconfig, "serviceName"), "text");
    out.write(renderContext.getObjectModel().toString(var_0));
}
out.write("</b></p>\n   </div>\n   <div>\n       <p> Service ID : <b>");
{
    Object var_1 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_osgiconfig, "serviceID"), "text");
    out.write(renderContext.getObjectModel().toString(var_1));
}
out.write("</b></p>\n   </div>\n   <div>\n       <p> Service : <b>");
{
    Object var_2 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_osgiconfig, "isService"), "text");
    out.write(renderContext.getObjectModel().toString(var_2));
}
out.write("</b></p>\n   </div>\n   <div>\n       <p> Run Mode : <b>");
{
    Object var_3 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_osgiconfig, "runModes"), "text");
    out.write(renderContext.getObjectModel().toString(var_3));
}
out.write("</b></p>\n   </div>\n   <div><b>Service Countries</b>\n   </div>\n   ");
{
    Object var_collectionvar4 = renderContext.getObjectModel().resolveProperty(_global_osgiconfig, "countries");
    {
        long var_size5 = ((var_collectionvar4_list_coerced$ == null ? (var_collectionvar4_list_coerced$ = renderContext.getObjectModel().toCollection(var_collectionvar4)) : var_collectionvar4_list_coerced$).size());
        {
            boolean var_notempty6 = (var_size5 > 0);
            if (var_notempty6) {
                {
                    long var_end9 = var_size5;
                    {
                        boolean var_validstartstepend10 = (((0 < var_size5) && true) && (var_end9 > 0));
                        if (var_validstartstepend10) {
                            out.write("<ul>");
                            if (var_collectionvar4_list_coerced$ == null) {
                                var_collectionvar4_list_coerced$ = renderContext.getObjectModel().toCollection(var_collectionvar4);
                            }
                            long var_index11 = 0;
                            for (Object item : var_collectionvar4_list_coerced$) {
                                {
                                    boolean var_traversal13 = (((var_index11 >= 0) && (var_index11 <= var_end9)) && true);
                                    if (var_traversal13) {
                                        out.write("\n      <li>");
                                        {
                                            Object var_14 = renderContext.call("xss", item, "text");
                                            out.write(renderContext.getObjectModel().toString(var_14));
                                        }
                                        out.write("</li>\n   ");
                                    }
                                }
                                var_index11++;
                            }
                            out.write("</ul>");
                        }
                    }
                }
            }
        }
    }
    var_collectionvar4_list_coerced$ = null;
}


// End Of Main Template Body ----------------------------------------------------------------------
    }



    {
//Sub-Templates Initialization --------------------------------------------------------------------



//End of Sub-Templates Initialization -------------------------------------------------------------
    }

}

