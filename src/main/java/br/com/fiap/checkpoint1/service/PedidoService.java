package br.com.fiap.checkpoint1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.fiap.checkpoint1.model.Pedido;
import br.com.fiap.checkpoint1.repository.PedidoRepository;

import java.util.List;
import java.util.Optional;

@Service
public class PedidoService {
    @Autowired
    private PedidoRepository repository;

    public Pedido salvarPedido(Pedido pedido) {
        if (pedido.getClienteNome() == null || pedido.getClienteNome().trim().isEmpty()) {
            throw new IllegalArgumentException("O nome do cliente é obrigatório");
        }
        if (pedido.getValorTotal() < 0) {
            throw new IllegalArgumentException("O valor total do pedido não pode ser negativo");
        }
        return repository.save(pedido);
    }

    public List<Pedido> listarPedidos() { return repository.findAll(); }
    public Optional<Pedido> buscarPedido(Long id) { return repository.findById(id); }
    public void deletarPedido(Long id) { repository.deleteById(id); }
}

