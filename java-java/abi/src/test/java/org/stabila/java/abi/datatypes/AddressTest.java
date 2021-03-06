/*
 * Copyright 2019 Web3 Labs Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */
package org.stabila.java.abi.datatypes;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class AddressTest {
    @Test
    public void testToString() {
        assertEquals(
            new Address("3f9c1e9ea06d4cd88e1a4c775120fc98529ad901b8").toString(), ("SbXV8Frb3hALjtkApw3UaJRk61URvhvAXb"));
        assertEquals(
            new Address("SbXV8Frb3hALjtkApw3UaJRk61URvhvAXb").toString(), ("SbXV8Frb3hALjtkApw3UaJRk61URvhvAXb"));
        assertEquals(
            new Address("0x52b08330e05d731e38c856c1043288f7d9744").toString(), ("SMJ7DvjdP9124hynGmxgBTnRsSxdP4ym9y"));
        assertEquals(new Address("0x00052b08330e05d731e38c856c1043288f7d9744").toString(),
            ("SMJ7DvjdP9124hynGmxgBTnRsSxdP4ym9y"));
    }
}
