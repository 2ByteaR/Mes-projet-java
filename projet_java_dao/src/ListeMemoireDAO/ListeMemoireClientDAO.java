package ListeMemoireDAO;

import IDAO.ClientDAO;
import Métier.Client;

import java.util.List;

public class ListeMemoireClientDAO implements ClientDAO<Client> {

    private static ListeMemoireClientDAO instance;

    private ListeMemoireClientDAO() {}

    public static ListeMemoireClientDAO getInstance() {
        if (instance == null) {
            instance = new ListeMemoireClientDAO();
        }
        return instance;
    }

    @Override
    public Client getById(int id) {
        return null;
    }

    @Override
    public boolean create(Client objet) {
        return false;
    }

    @Override
    public boolean update(Client objet) {
        return false;
    }

    @Override
    public boolean delete(Client objet) {
        return false;
    }



    @Override
    public List<Client> getByCodePostal(String code_postal) {
        return null;
    }

    @Override
    public List<Client> getByNom(String nom) {
        return null;
    }

    @Override
    public List<Client> getByNoRue(String no_rue) {
        return null;
    }

    @Override
    public List<Client> getByPrenom(String prenom) {
        return null;
    }

    @Override
    public List<Client> getByVille(String ville) {
        return null;
    }

    @Override
    public List<Client> getByVoie(String voie) {
        return null;
    }

    @Override
    public List<Client> getByPays(String pays) {
        return null;
    }
}