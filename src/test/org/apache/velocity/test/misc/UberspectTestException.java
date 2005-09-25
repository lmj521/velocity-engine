package org.apache.velocity.test.misc;

import org.apache.velocity.util.introspection.Info;

/*
 * Copyright 2001-2004 The Apache Software Foundation.
 *
 * Licensed under the Apache License, Version 2.0 (the "License")
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


/**
 * Exception that returns an Info object for testing after a introspection problem.
 * This extends Error so that it will stop parsing and allow
 * internal info to be examined.
 *
 * @author <a href="mailto:wglass@forio.com">Will Glass-Husain</a>
 * @author <a href="mailto:isidore@setgame.com">Llewellyn Falco</a>
 * @version $Id: IntrospectorTestCase.java 290983 2005-09-22 17:05:48Z henning $
 */
public class UberspectTestException extends Error
{

    Info info;

    public UberspectTestException(String string, Info i) 
    {
        super(string);
        info = i;
    }

    public Info getInfo() 
    {
        return info;
    }


}