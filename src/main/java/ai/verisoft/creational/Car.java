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

public class Car {
    // Required parameters
    private final String engine;
    private final int seats;

    // Optional parameters
    private int airbags;
    private boolean sunroof;
    private String entertainmentSystem;

    // Private constructor
    private Car(CarBuilder builder) {
        this.engine = builder.engine;
        this.seats = builder.seats;
        this.airbags = builder.airbags;
        this.sunroof = builder.sunroof;
        this.entertainmentSystem = builder.entertainmentSystem;
    }

    public int getAirbags() {
        return airbags;
    }

    public boolean hasSunroof() {
        return sunroof;
    }

    public String getEntertainmentSystem() {
        return entertainmentSystem;
    }

    public String getEngine() {
        return engine;
    }


    // Static Builder class
    public static class CarBuilder {
        // Required parameters
        private final String engine;
        private final int seats;

        // Optional parameters initialized to default values
        private int airbags = 0;
        private boolean sunroof = false;
        private String entertainmentSystem = "Basic";

        public CarBuilder(String engine, int seats) {
            this.engine = engine;
            this.seats = seats;
        }

        public CarBuilder airbags(int value) {
            airbags = value;
            return this;
        }

        public CarBuilder sunroof(boolean value) {
            sunroof = value;
            return this;
        }

        public CarBuilder entertainmentSystem(String value) {
            entertainmentSystem = value;
            return this;
        }

        public Car build() {
            return new Car(this);
        }
    }
}

