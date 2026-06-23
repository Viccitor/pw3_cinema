package br.com.etechoracio.ingresso.dto;

import java.time.LocalTime;

public record SessoesResponseDTO(Integer id, String sala, LocalTime horario, Double preco) {
}
