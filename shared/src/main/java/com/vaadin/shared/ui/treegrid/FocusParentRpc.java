/*
 * Copyright 2000-2022 Vaadin Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.vaadin.shared.ui.treegrid;

import com.vaadin.shared.communication.ServerRpc;

/**
 * RPC to handle client originated parent focusing in TreeGrid.
 *
 * @author Vaadin Ltd
 * @since 8.1
 */
public interface FocusParentRpc extends ServerRpc {

    /**
     * Focuses cell in the row parent.
     *
     * @param rowKey
     *            the row key
     * @param cellIndex
     *            the cell index
     */
    void focusParent(String rowKey, int cellIndex);
}
