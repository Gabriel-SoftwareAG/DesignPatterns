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
package ai.verisoft.stuctural;

import ai.verisoft.structural.proxy.Document;
import ai.verisoft.structural.proxy.DocumentProxy;
import org.junit.jupiter.api.Test;

public class ProxyTest {

    @Test
    public void testProxy() {
        Document document = new DocumentProxy("testDocument.pdf");
        System.out.println("Document Proxy initialized. Document will be loaded upon display.");
        System.out.println("Displaying document for the first time:");
        document.displayDocument(); // This will load and then display the document
        System.out.println("Displaying document for the second time:");
        document.displayDocument(); // This will only display the document without loading it again
    }
}
