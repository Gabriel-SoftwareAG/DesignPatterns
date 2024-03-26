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
package ai.verisoft.creational.factorymethod;

public abstract class DocumentFactory {
    public enum DocumentType {
        WORD, PDF
    }


    // Should not become a DocumentCreator instance
    private DocumentFactory(){}

    public static Document createDocument(DocumentType type){
        if (type == DocumentType.WORD) {
            return new WordDocument();
        } else if (type == DocumentType.PDF) {
            return new PdfDocument();
        }

        // If we got this far, we have an unsupported document type
        return null;
    }
}

