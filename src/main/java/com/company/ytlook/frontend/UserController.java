package com.company.ytlook.frontend;

import ch.qos.logback.core.net.server.Client;
import com.company.ytlook.backend.ClientData;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.Objects;

@RestController
@Log4j2
@RequiredArgsConstructor(onConstructor_ = {@Autowired})
public class UserController {

    @GetMapping("/user/{name}")
    private String getAllProject(@PathVariable(name = "name") String name) throws IOException {
        ObjectMapper mapper = new ObjectMapper();

        File file = new File("src/main/resources/client_secret.json");

        return name + " " + mapper.readValue(file, ClientData.class).getClient_id();
    }

}