package com.lutfiadysh.bakso.config;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "bakso")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class BaksoConfig {
    private String porsi;
    private String tambahan;
    private String kurangi;
}
