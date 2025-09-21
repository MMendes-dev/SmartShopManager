package app;

import dao.ClienteDAO;
import dao.ProdutoDAO;

public class AppContext {
    public static final ClienteDAO clienteDAO = new ClienteDAO();
    public static final ProdutoDAO produtoDAO = new ProdutoDAO();
}
