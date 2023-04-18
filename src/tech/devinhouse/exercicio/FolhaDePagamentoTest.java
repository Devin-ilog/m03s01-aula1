package tech.devinhouse.exercicio;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FolhaDePagamentoTest {

    private FolhaDePagamento folha;

    @BeforeEach
    void setup() {
        folha = new FolhaDePagamento();
    }

    @Test
    @DisplayName("Quando tem gratificacao, deve adicionar gratificacao no salario")
    void calcularSalarioBruto_comGratificacao() {
        // given
        Double salarioBase = 1000.0;
        Double gratificacao = 200.0;
        String funcao = "dev";
        // when
        Double resultado = folha.calcularSalarioBruto(salarioBase, gratificacao, funcao);
        // then
        assertNotNull(resultado);
        assertEquals(1200.0, resultado);
    }

    @Test
    @DisplayName("Quando nao tem gratificacao, nao deve adicionar gratificacao no salario")
    void calcularSalarioBruto_semGratificacao() {


    }