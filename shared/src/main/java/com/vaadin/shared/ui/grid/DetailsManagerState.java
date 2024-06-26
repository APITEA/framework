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
package com.vaadin.shared.ui.grid;

/**
 * Shared state for DetailsManager extension.
 *
 * @since 8.0
 */
public class DetailsManagerState extends AbstractGridExtensionState {

    /**
     * For informing the connector when details handling can be skipped
     * altogether as it's not possible to have any details rows without a
     * generator.
     * 
     * @since 8.9
     */
    public boolean hasDetailsGenerator = false;
}
