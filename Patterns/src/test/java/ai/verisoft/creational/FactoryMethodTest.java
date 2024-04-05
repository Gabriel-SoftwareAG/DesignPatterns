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
package ai.verisoft.creational;

import ai.verisoft.creational.factorymethod.example1.Document;
import ai.verisoft.creational.factorymethod.example1.DocumentFactory;
import ai.verisoft.creational.factorymethod.example2.Checkbox;
import ai.verisoft.creational.factorymethod.example2.CheckboxFactory;
import org.junit.jupiter.api.Test;

public class FactoryMethodTest {

    @Test
    public void documentFactoryMethodExample() {

        // Given
        Document wordDocument = DocumentFactory.createDocument(DocumentFactory.DocumentType.WORD);
        Document pdfDocument = DocumentFactory.createDocument(DocumentFactory.DocumentType.PDF);

        // Then
        assert wordDocument != null;
        wordDocument.open();
        wordDocument.save();
        wordDocument.close();

        assert pdfDocument != null;
        pdfDocument.open();
        pdfDocument.save();
        pdfDocument.close();
    }

    @Test
    public void checkboxFactoryMethodExample() {
        // Given
        Checkbox lightCheckbox = CheckboxFactory.createCheckbox(CheckboxFactory.Theme.LIGHT);
        Checkbox darkCheckbox = CheckboxFactory.createCheckbox(CheckboxFactory.Theme.DARK);


        // Then
        assert lightCheckbox != null;
        lightCheckbox.paint();

        assert darkCheckbox != null;
        darkCheckbox.paint();
    }
}
