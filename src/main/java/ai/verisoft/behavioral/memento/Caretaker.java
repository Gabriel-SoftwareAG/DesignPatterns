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
package ai.verisoft.behavioral.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * The Caretaker class keeps a list of mementos but doesn't modify them.
 * It can request a new memento from the Originator and restore the Originator's state from a memento.
 */
public class Caretaker {
    private final List<ApplicationMemento> mementoList = new ArrayList<>();

    public void addMemento(ApplicationMemento memento) {
        mementoList.add(memento);
    }

    public ApplicationMemento getMemento(int index) {
        return mementoList.get(index);
    }
}
