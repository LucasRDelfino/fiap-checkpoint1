package br.com.fiap.checkpoint1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import br.com.fiap.checkpoint1.model.Pedido;
import br.com.fiap.checkpoint1.service.PedidoService;

import java.util.List;

@RestController
@RequestMapping("/pedidos")
public class PedidoController {
    @Autowired
    private PedidoService service;

    @GetMapping
    public List<Pedido> listarPedidos() { return service.listarPedidos(); }

    @GetMapping("/{id}")
    public Pedido buscarPedido(@PathVariable Long id) {
        return service.buscarPedido(id).orElseThrow(() -> new RuntimeException("Pedido não encontrado"));
    }

    @PostMapping
    public Pedido criarPedido(@RequestBody Pedido pedido) {
        return service.salvarPedido(pedido);
    }

    @PutMapping("/{id}")
    public Pedido atualizarPedido(@PathVariable Long id, @RequestBody Pedido pedido) {
        pedido.setId(id);
        return service.salvarPedido(pedido);
    }

    @DeleteMapping("/{id}")
    public void deletarPedido(@PathVariable Long id) {
        service.deletarPedido(id);
    }
}

