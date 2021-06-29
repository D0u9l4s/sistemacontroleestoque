package com.example.sistemacontroleestoque;

import java.util.Iterator;
import java.util.List;
import java.util.Random;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Service
@RestController
public class ItemEstoqueResource {
    @PutMapping (value = "/sisestoque/resources/itensestoque", consumes = "application/json")
    public ResponseEntity<HttpStatus> decrementarItensEstoque(@RequestBody List<ItemEstoqueDto> listaItensDto)
    {
        /**
        * Lógica da operação do serviço (abaixo).
        *
        **/
        Iterator<ItemEstoqueDto> i = listaItensDto.iterator();
        ItemEstoqueDto item;
        // Inicia a transação...
        while (i.hasNext()) {
        item = i.next();
        System.out.println("APLICAÇÃO ESTOQUE: Atualizando estoque do item de estoque com ID "+ item.getId() +"...");
        // Verifica se há estoque disponível para cada iteme (quant <= quantidade de itens no estoque)
        // Se houver estoque decrementa a quantidade e salva.
        // Se não houver estoque, retorna BADREQUEST para que acionou o serviço
        // Usando Random para simular SUCESSO ou ERRO...
        Random gerador = new Random();
        // Irá gerar um número aleatório de 0 a 5.
        int num = gerador.nextInt(6);

        // Suponha a geração de Erro
        if (num == 0) {
        System.out.println("APLICAÇÃO ESTOQUE: Erro ao atualizar estoque do item de estoque com ID "+ item.getId() +"...");
        // Retorno no caso de problema.
        return new ResponseEntity<HttpStatus>(HttpStatus.BAD_REQUEST );

        }
        }
        // Se não houve erro...
        // Finaliza e "comita" a transação...
        System.out.println("APLICAÇÃO ESTOQUE: Atualização de estoque realizada com sucesso...");
        // Retorno de sucesso
        return new ResponseEntity<HttpStatus>(HttpStatus.OK);
    }
    @PostMapping (value = "/sisestoque/resources/itensestoque", consumes = "application/json")
    public ResponseEntity<HttpStatus> incrementarItensEstoque(@RequestBody List<ItemEstoqueDto> listaItensDto)
    {
        /**
        * Lógica da operação do serviço (abaixo).
        * Não precisa implementar; é para se ter noção de como seria implementado na prática.
        */
        /**
        * Passa item por item da listaItensDto e para cada item, incrementa o quantitativo
        correspondente no estoque.
        *
        */
        System.out.println("APLICAÇÃO ESTOQUE: Incremento de estoque realizado com sucesso...");
        return new ResponseEntity<HttpStatus>(HttpStatus.OK);
    }
}
