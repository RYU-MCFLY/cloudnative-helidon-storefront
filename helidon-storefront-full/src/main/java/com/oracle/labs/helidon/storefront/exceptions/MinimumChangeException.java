/*
 * Copyright (c) 2019, 2020 Oracle and/or its affiliates.
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
package com.oracle.labs.helidon.storefront.exceptions;

public class MinimumChangeException extends StorefrontException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3616309606463858985L;

	public MinimumChangeException() {
		super();
	}

	public MinimumChangeException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public MinimumChangeException(String message, Throwable cause) {
		super(message, cause);
	}

	public MinimumChangeException(String message) {
		super(message);
	}

	public MinimumChangeException(Throwable cause) {
		super(cause);
	}
}
