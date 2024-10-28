package quantumleap.dominio;

import java.util.ArrayList;

public interface RepositorioCliente {


    void adicionarCliente(Cliente cliente);
    ArrayList<Cliente> listarClientes();
    Cliente buscarClientePorId(Long id);
    void atualizarCliente(long idCliente, Cliente cliente);
    void removerCliente(Long idCliente);
    void fecharConexao();
}
