/*
 * Copyright (c) 2016, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * you may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.wso2.carbon.identity.oauth.dcr.util;

import java.util.regex.Pattern;

/**
 * This class holds the constants used by DynamicClientRegistration component.
 */
@Deprecated
public final class DCRConstants {

    public static final String DCR_OPERATION_CONTEXT = "OPERATION_CONTEXT";
    public static final Pattern DCR_ENDPOINT_URL_PATTERN = Pattern.compile(".+/register/?");
    public static final Pattern DCR_ENDPOINT_REGISTER_URL_PATTERN = Pattern.compile("(.*)/identity/register/?");
    public static final Pattern DCR_ENDPOINT_UNREGISTER_URL_PATTERN = Pattern.compile("(.*)/identity/register/(.+)");
    public static final String DCR_ID = "identity/register";
    public static final String DCR_VERSION = "";
    // Regex for validating application name.
    public static final String APP_NAME_VALIDATING_REGEX = "^[a-zA-Z0-9._-]*$";
    public static final String UNSUPPORTED_CHARACTERS_IN_REGISTRY = "[\\\\/:*?\"`,~!@#$&;%^*()+=<{}>'|]";

    /**
     * Contains the constants related to DCR operations.
     */
    public static class DCROperation {

        public static final String DCR_OPERATION_REGISTER = "REGISTER";
        public static final String DCR_OPERATION_UNREGISTER = "UNREGISTER";
        public static final String DCR_OPERATION_UPDATE = "UPDATE";
        public static final String DCR_OPERATION_READ = "READ";
    }

    /**
     * Contains the constants related to client metadata.
     */
    public static class ClientMetadata {

        public static final String OAUTH_CLIENT_ID = "client_id";
        public static final String OAUTH_CLIENT_SECRET = "client_secret";
        public static final String OAUTH_REDIRECT_URIS = "redirect_uris";
        public static final String OAUTH_CALLBACK_URIS = "callback_url";
        public static final String OAUTH_CLIENT_NAME = "client_name";
        public static final String OAUTH_CLIENT_TYPE = "client_type";
        public static final String APP_KEY_TYPE = "key_type";
        public static final String APP_CALLBACK_URL = "callback_url";
        public static final String APP_HOME_PAGE = "homepage";
        public static final String OAUTH_CLIENT_CONTACT = "contact";
        public static final String APP_LOGO_URI = "logo_uri";
        public static final String OAUTH_CLIENT_SCOPE = "scope";
        public static final String OAUTH_CLIENT_GRANT = "grant_types";
        public static final String OAUTH_CLIENT_RESPONSETYPE = "response_types";
        public static final String OAUTH_CLIENT_AUTHMETHOD = "token_endpoint_auth_method";
        public static final String OAUTH_CLIENT_REGISTRATION_CLIENT_URI = "registration_client_uri";
        public static final String OAUTH_CLIENT_REGISTRATION_ACCESSTOKEN = "registration_access_token";
        public static final String OAUTH_CLIENT_CONTACTS = "contacts";
        public static final String OAUTH_CLIENT_MANUAL = "MANUAL";
        public static final String OAUTH_CLIENT_PRODUCTION = "PRODUCTION";
        public static final String OAUTH_CLIENT_SANDBOX = "SANDBOX";
        public static final String OAUTH_CLIENT_NOACCESSTOKEN = "NO ACCESS TOKEN";
        public static final String OAUTH_CLIENT_JSONPARAMSTRING = "jsonParams";
        public static final String OAUTH_CLIENT_USERNAME = "username";
        public static final String OAUTH_CLIENT_APPLICATION = "application";
        public static final String VALIDITY_PERIOD = "validityPeriod";

        private ClientMetadata() {

            throw new AssertionError();
        }
    }

    /**
     * Contains the grant types used in OAuth DCR component.
     */
    public static class GrantTypes {

        public static final String IMPLICIT = "implicit";
        public static final String AUTHORIZATION_CODE = "authorization_code";
    }
}
