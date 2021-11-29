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
package org.apache.sling.scripting.sightly.apps.ugams.components.content.demo;

import java.io.PrintWriter;
import java.util.Collection;
import javax.script.Bindings;

import org.apache.sling.scripting.sightly.render.RenderUnit;
import org.apache.sling.scripting.sightly.render.RenderContext;

public final class demo_html extends RenderUnit {

    @Override
    protected final void render(PrintWriter out,
                                Bindings bindings,
                                Bindings arguments,
                                RenderContext renderContext) {
// Main Template Body -----------------------------------------------------------------------------

out.write("<script>\r\nfunction add(){\r\nvar num1 = $('#num1').val();\r\nvar num2 = $('#num2').val();\r\n$.ajax({\r\nurl     : '/bin/add',\r\nmethod     : 'GET',\r\ndata     : {num1 : num1,num2 : num2},\r\nsuccess    : function(resultText){\r\n$('#result').text(resultText);\r\n},\r\nerror : function(jqXHR, exception){\r\nconsole.log('Error occured!!');\r\n}\r\n});\r\n}\r\n</script>\r\n\r\n  <label for=\"num1\">First Number:</label><br/>\r\n  <input type=\"number\" id=\"num1\" name=\"num1\" placeholder=\"Enter a number\"/><br/><br/>\r\n  <label for=\"num2\">Second Number:</label><br/>\r\n  <input type=\"number\" id=\"num2\" name=\"num2\" placeholder=\"Enter a number\"/><br/><br/>\r\n  <input type=\"submit\" value=\"Submit\" onclick=\"add()\"/>\r\n\r\n<br/><br/>\r\n<h3 id=\"result\"></h3>");


// End Of Main Template Body ----------------------------------------------------------------------
    }



    {
//Sub-Templates Initialization --------------------------------------------------------------------



//End of Sub-Templates Initialization -------------------------------------------------------------
    }

}

