/**
 * Copyright 2001-2016 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
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
package org.easymock.tests2;

import static org.easymock.EasyMock.*;

import org.easymock.tests.IMethods;
import org.junit.Test;

/**
 * @author OFFIS, Tammo Freese
 */
public class UsageMatchersTest {
    @Test(expected = IllegalStateException.class)
    public void additionalMatchersFailAtReplay() {

        IMethods mock = createMock(IMethods.class);
        lt(5);

        replay(mock);
    }

}
