package com.dependent.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.master.config.MasterConfig;

@Configuration
@Import(MasterConfig.class)
public class DependentConfig {

}
