package cigma.pfe.services;
import cigma.pfe.models.Client;
import cigma.pfe.repositories.ClientRepository;


public interface ClientService {
    Client save(Client c);
    public class ClientServiceImpl implements ClientService{
        ClientRepository clientRepository = new ClientRepository.ClientRepositoryImpl();
        @Override
        public Client save(Client c) {
            System.out.println("Service Layer : ClientServiceImpl Level... ");
            return clientRepository.save(c);
        }
    }

}
