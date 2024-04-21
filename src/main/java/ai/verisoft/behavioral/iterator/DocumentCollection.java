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
package ai.verisoft.behavioral.iterator;

import org.jetbrains.annotations.NotNull;

import java.util.Iterator;

// Define a custom collection to store documents
public class DocumentCollection implements Iterable<Document> {
    private final Document[] documents;
    private int size;

    public DocumentCollection(int capacity) {
        documents = new Document[capacity];
        size = 0;
    }

    public void addDocument(Document document) {
        if (size < documents.length) {
            documents[size++] = document;
        } else {
            // Handle full capacity scenario
            System.out.println("Document collection is full.");
        }
    }


    // Implement iterator method to provide an iterator for the collection
    @Override
    @NotNull
    public Iterator<Document> iterator() {
        return new DocumentIterator();
    }


    // Define a custom iterator to iterate over the documents
    private class DocumentIterator implements Iterator<Document> {
        private int index;

        public DocumentIterator() {
            index = 0;
        }

        @Override
        public boolean hasNext() {
            return index < size;
        }

        @Override
        public Document next() {
            if (hasNext()) {
                return documents[index++];
            } else {
                // Handle NoSuchElementException
                throw new java.util.NoSuchElementException("No more documents.");
            }
        }
    }
}
