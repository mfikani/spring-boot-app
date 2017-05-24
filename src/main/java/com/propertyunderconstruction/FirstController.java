package com.propertyunderconstruction;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.propertyunderconstruction.user.model.Client;
import com.propertyunderconstruction.user.service.ClientInterface;

@RestController
public class FirstController {

	@Autowired
	private ClientInterface ClientInterface;

	@RequestMapping("/hello")
	public String hello() {
		List<Client> clients = ClientInterface.getClients();
		StringBuilder builder = new StringBuilder();
		for (Client client : clients) {
			builder.append(client.toString());
		}
		return builder.toString();
	}

}
