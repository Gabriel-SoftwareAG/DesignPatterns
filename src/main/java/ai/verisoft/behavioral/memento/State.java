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

public class State {
    private final List<String> cartItems;
    private final String discountCode;

    public State(List<String> cartItems, String discountCode) {
        this.cartItems = new ArrayList<>(cartItems);
        this.discountCode = discountCode;
    }

    public List<String> getCartItems() {
        return cartItems;
    }

    public String getDiscountCode() {
        return discountCode;
    }

    @Override
    public String toString() {
        return "Cart Items: " + String.join(", ", cartItems) + "; Discount Code: " + discountCode;
    }
}
