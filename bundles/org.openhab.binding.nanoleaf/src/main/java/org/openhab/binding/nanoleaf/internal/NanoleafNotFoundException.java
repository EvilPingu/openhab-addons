/*
 * Copyright (c) 2010-2025 Contributors to the openHAB project
 *
 * See the NOTICE file(s) distributed with this work for additional
 * information.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 *
 * SPDX-License-Identifier: EPL-2.0
 */
package org.openhab.binding.nanoleaf.internal;

import org.eclipse.jdt.annotation.NonNullByDefault;

/**
 * Exception if request to Nanoleaf OpenAPI does not return any data
 *
 * @author Stefan Höhn - Initial contribution
 */
@NonNullByDefault
public class NanoleafNotFoundException extends NanoleafException {

    private static final long serialVersionUID = -6941678941424573256L;

    public NanoleafNotFoundException(String message) {
        super(message);
    }
}
