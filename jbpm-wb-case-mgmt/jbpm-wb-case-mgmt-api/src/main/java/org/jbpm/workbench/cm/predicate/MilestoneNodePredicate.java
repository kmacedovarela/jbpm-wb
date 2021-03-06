/*
 * Copyright 2018 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jbpm.workbench.cm.predicate;

import java.util.function.Predicate;

public class MilestoneNodePredicate implements Predicate<String> {

    public static final String NODE_TYPE_MILESTONE = "MilestoneNode";

    @Override
    public boolean test(final String nodeType) {
        return NODE_TYPE_MILESTONE.equals(nodeType);
    }
}
