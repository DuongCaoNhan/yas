package com.yas.product.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.security.*;

@OpenAPIDefinition(info = @Info(title = "Product Service API", description = "Product API documentation", version = "1.0"), security = @SecurityRequirement(name = "oauth2_bearer"))
@SecurityScheme(name = "oauth2_bearer", type = SecuritySchemeType.OAUTH2,
        flows = @OAuthFlows(authorizationCode = @OAuthFlow(authorizationUrl = "${springdoc.oauthflow.authorization-url}", tokenUrl = "${springdoc.oauthflow.token-url}", scopes = {
                @OAuthScope(name = "openid", description = "openid")
        })))
public class SwaggerConfig {
}
