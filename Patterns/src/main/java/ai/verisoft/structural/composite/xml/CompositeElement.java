/*
 * (C) Copyright 2024 VeriSoft (http://www.verisoft.co)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * See the NOTICE file distributed with this work for additional
 * information regarding copyright ownership.
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
package ai.verisoft.structural.composite.xml;

import java.util.ArrayList;
import java.util.List;

public class CompositeElement implements XmlElement {
    private final String tagName;
    private final List<XmlElement> children = new ArrayList<>();

    public CompositeElement(String tagName) {
        this.tagName = tagName;
    }

    public void addElement(XmlElement element) {
        children.add(element);
    }

    @Override
    public void printStructure(String indent) {
        System.out.println(indent + "<" + tagName + ">");
        for (XmlElement element : children) {
            element.printStructure(indent + "    ");
        }
        System.out.println(indent + "</" + tagName + ">");
    }
}
