package com.lutfiadysh.bakso;

import com.lutfiadysh.bakso.config.BaksoConfig;
import lombok.extern.java.Log;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Log
public class BaksoApplication implements CommandLineRunner {
private BaksoConfig baksoConfig;

public BaksoApplication(BaksoConfig baksoConfig) {
	this.baksoConfig = baksoConfig;
}

	public static void main(String[] args) {
		SpringApplication.run(BaksoApplication.class, args);
	}

	@Override
	public void run(final String... args) {
//		final BaksoConfig baksoConfig = new BaksoConfig( "3","Acar","Sambal");

		log.info(
				String.format("Saya ingin pesan %s porsi bakso, tambah %s dan tidak pakai %s",
						baksoConfig.getPorsi(),
						baksoConfig.getTambahan(),
						baksoConfig.getKurangi()
						)
		);
	}
}
