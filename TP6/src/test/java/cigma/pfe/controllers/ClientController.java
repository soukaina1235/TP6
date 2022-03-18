package cigma.pfe.controllers;
import cigma.pfe.services.ClientService;
import cigma.pfe.models.Client;




public class ClientController {
    ClientService clientService = new ClientService.ClientServiceImpl();
    public Client save(Client c ){
        System.out.println("ClientController level...");
        return clientService.save(c);
    }
}
