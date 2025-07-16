package com.example.projetobd.controller;

import com.example.projetobd.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    private UsuarioService usuarioService;
    @Autowired
    private EventoService eventoService;
    @Autowired
    private PalestraService palestraService;
    @Autowired
    private InscricaoService inscricaoService;
    @Autowired
    private CertificadoService certificadoService;
    @Autowired
    private PagamentoService pagamentoService;

    @GetMapping("/dashboard")
    public String dashboard(Model model) {
        model.addAttribute("conteudo", "dashboard");
        return "admin";
    }
    @GetMapping("/usuarios")
    public String usuarios(Model model) {
        model.addAttribute("usuarios", usuarioService.listarTodos());
        model.addAttribute("conteudo", "usuario-dashboard");
        return "admin";
    }

    @GetMapping("/eventos")
    public String eventos(Model model) {
        model.addAttribute("eventos", eventoService.listarTodos());
        model.addAttribute("conteudo", "evento-dashboard");
        return "admin";
    }

    @GetMapping("/palestras")
    public String palestras(Model model) {
        model.addAttribute("palestras", palestraService.listarTodos());
        model.addAttribute("conteudo", "palestra-dashboard");
        return "admin";
    }

    @GetMapping("/inscricoes")
    public String inscricoes(Model model) {
        model.addAttribute("inscricoes", inscricaoService.listarTodos());
        model.addAttribute("conteudo", "inscricao-dashboard");
        return "admin";
    }

    @GetMapping("/certificados")
    public String certificados(Model model) {
        model.addAttribute("certificados", certificadoService.listarTodos());
        model.addAttribute("conteudo", "certificado-dashboard");
        return "admin";
    }

    @GetMapping("/pagamentos")
    public String pagamentos(Model model) {
        model.addAttribute("pagamentos", pagamentoService.listarTodos());
        model.addAttribute("conteudo", "pagamento-dashboard");
        return "admin";
    }
}
