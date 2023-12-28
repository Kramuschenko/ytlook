package com.company.ytlook.backend;

import lombok.Data;

@Data
public class ClientData {

    private String client_id;
    private String project_id;
    private String auth_uri;
    private String token_uri;
    private String auth_provider_x509_cert_url;
    private String client_secret;
    private String api_key;
}