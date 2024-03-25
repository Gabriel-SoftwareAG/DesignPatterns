/*
 * (C) Copyright 2022 VeriSoft (http://www.verisoft.co)
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

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SingeltonTest {

    @Test
    public void shouldHaveTheSameMessage(){
        Singleton instance1 = Singleton.getInstance();
        instance1.getHelloWorldMessage();
        Assertions.assertEquals("Hello world!", instance1.getHelloWorldMessage());

        Singleton instance2 = Singleton.getInstance();
        Assertions.assertEquals("Hello world!", instance2.getHelloWorldMessage());
    }


    @Test
    public void shouldBeTheSameOnject() {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        Assertions.assertEquals(instance1, instance2);
    }
}
