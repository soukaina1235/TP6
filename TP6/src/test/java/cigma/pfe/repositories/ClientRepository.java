package cigma.pfe.repositories;
import cigma.pfe.models.Client;



public interface ClientRepository {
        Client save(Client c);


    public class ClientRepositoryImpl implements ClientRepository {
        @Override
        public Client save(Client c) {
            System.out.println("DAO Layer : ClientRepositoryImpl Level");
            return null;
        }
    }
}
