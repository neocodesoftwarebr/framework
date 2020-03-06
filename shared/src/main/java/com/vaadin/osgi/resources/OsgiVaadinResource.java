/*
 * Copyright 2000-2018 Vaadin Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.vaadin.osgi.resources;

/**
 * Used to declare a Vaadin Resource for use in OSGi. The resource is expected
 * to be in the same OSGi bundle as the class implementing this interface, under
 * the path "/VAADIN/{resourceName}" where {resourceName} is what is returned by
 * {@link OsgiVaadinResource#getName()}.
 * <p>
 * To publish a resource, an implementation of this interface needs to be
 * registered as an OSGi service, which makes
 * <code>VaadinResourceTrackerComponent</code> automatically publish the
 * resource with the given name.
 *
 * @since 8.6.0
 */
public interface OsgiVaadinResource {
    /**
     * Return the theme name to publish for OSGi.
     *
     * @return theme name, not null
     */
    String getName();

    public static OsgiVaadinResource create(final String name) {
        return new OsgiVaadinResource() {
            @Override
            public String getName() {
                return name;
            }
        };
    }
}
