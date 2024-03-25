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

public class Singleton {

    // The static variable that contains the single instance of the class
    private static Singleton instance;


    // Private constructor so no instances can be created outside of this class
    private Singleton() {
    }

    // Public static method that returns the instance of the class, creating it if it doesn't exist
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    // Example method to demonstrate the use of the Singleton
    public String getHelloWorldMessage() {
        return "Hello world!";
    }
}
