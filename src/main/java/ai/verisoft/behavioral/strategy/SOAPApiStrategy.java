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
package ai.verisoft.behavioral.strategy;

public class SOAPApiStrategy implements ApiTestingStrategy {
    @Override
    public void sendRequest(String endpoint, String payload) {
        System.out.println("Sending SOAP API request to " + endpoint + " with payload: " + payload);
        // Code to send a SOAP request
    }

    @Override
    public void assertResponse(String expectedResponse) {
        System.out.println("Asserting SOAP API response: " + expectedResponse);
        // Code to assert the response
    }
}
