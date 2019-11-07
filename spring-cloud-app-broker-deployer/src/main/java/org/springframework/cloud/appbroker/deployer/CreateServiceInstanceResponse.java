/*
 * Copyright 2002-2019 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.cloud.appbroker.deployer;

public class CreateServiceInstanceResponse {

	private final String name;

	protected CreateServiceInstanceResponse(String name) {
		this.name = name;
	}

	public static CreateServiceInstanceResponseBuilder builder() {
		return new CreateServiceInstanceResponseBuilder();
	}

	public String getName() {
		return name;
	}

	public static final class CreateServiceInstanceResponseBuilder {

		private String name;

		private CreateServiceInstanceResponseBuilder() {
		}

		public CreateServiceInstanceResponseBuilder name(String name) {
			this.name = name;
			return this;
		}

		public CreateServiceInstanceResponse build() {
			return new CreateServiceInstanceResponse(name);
		}

	}

}
