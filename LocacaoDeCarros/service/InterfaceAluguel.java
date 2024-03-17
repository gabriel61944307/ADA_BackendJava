package service;

import java.time.LocalDateTime;

public interface InterfaceAluguel{
    void realizarAluguel(String CPF_CNPJ, String placa, String local, LocalDateTime momentoRetirada);
    void finalizarAluguel(String codigoAluguel, LocalDateTime dataDevolucao);
    void listar();
}
