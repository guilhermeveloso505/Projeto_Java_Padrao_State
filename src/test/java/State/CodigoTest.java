package State;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CodigoTest {

    Codigo codigo;

    @BeforeEach
    public void setUp() { codigo = new Codigo(); }

    // Codigo criado

    @Test
    public void naoDeveCriarCodigoCriado() {
        codigo.setEstado(CodigoEstadoCriado.getInstance());
        assertFalse(codigo.criar());
    }

    @Test
    public void deveImplementarCodigoCriado() {
        codigo.setEstado(CodigoEstadoCriado.getInstance());
        assertTrue(codigo.implementar());
        assertEquals(CodigoEstadoImplementado.getInstance(), codigo.getEstado());
    }

    @Test
    public void naoDeveAtualizarCodigoCriado() {
        codigo.setEstado(CodigoEstadoCriado.getInstance());
        assertFalse(codigo.atualizar());
    }

    @Test
    public void deveDeletarCodigoCriado() {
        codigo.setEstado(CodigoEstadoCriado.getInstance());
        assertTrue(codigo.deletar());
        assertEquals(CodigoEstadoDeletado.getInstance(), codigo.getEstado());
    }

    @Test
    public void naoDeveCompartilharCodigoCriado() {
        codigo.setEstado(CodigoEstadoCriado.getInstance());
        assertFalse(codigo.compartilhar());
    }

    // Código implementado

    @Test
    public void naoDeveCriarCodigoImplementado() {
        codigo.setEstado(CodigoEstadoImplementado.getInstance());
        assertFalse(codigo.criar());
    }

    @Test
    public void naoDeveImplementarCodigoImplementado() {
        codigo.setEstado(CodigoEstadoImplementado.getInstance());
        assertFalse(codigo.implementar());
    }

    @Test
    public void deveAtualizarCodigoImplementado() {
        codigo.setEstado(CodigoEstadoImplementado.getInstance());
        assertTrue(codigo.atualizar());
        assertEquals(CodigoEstadoAtualizado.getInstance(), codigo.getEstado());
    }

    @Test
    public void deveDeletarCodigoImplementado() {
        codigo.setEstado(CodigoEstadoImplementado.getInstance());
        assertTrue(codigo.deletar());
        assertEquals(CodigoEstadoDeletado.getInstance(), codigo.getEstado());
    }

    @Test
    public void deveCompartilharCodigoImplementado() {
        codigo.setEstado(CodigoEstadoImplementado.getInstance());
        assertTrue(codigo.compartilhar());
        assertEquals(CodigoEstadoCompartilhado.getInstance(), codigo.getEstado());
    }

    // Código atualizado

    @Test
    public void naoDeveCriarCodigoAtualizado() {
        codigo.setEstado(CodigoEstadoAtualizado.getInstance());
        assertFalse(codigo.criar());
    }

    @Test
    public void naoDeveImplementarCodigoAtualizado() {
        codigo.setEstado(CodigoEstadoAtualizado.getInstance());
        assertFalse(codigo.implementar());
    }

    @Test
    public void deveAtualizarCodigoAtualizado() {
        codigo.setEstado(CodigoEstadoAtualizado.getInstance());
        assertTrue(codigo.atualizar());
        assertEquals(CodigoEstadoAtualizado.getInstance(), codigo.getEstado());
    }

    @Test
    public void deveDeletarCodigoAtualizado() {
        codigo.setEstado(CodigoEstadoAtualizado.getInstance());
        assertTrue(codigo.deletar());
        assertEquals(CodigoEstadoDeletado.getInstance(), codigo.getEstado());
    }

    @Test
    public void deveCompartilharCodigoAtualizado() {
        codigo.setEstado(CodigoEstadoAtualizado.getInstance());
        assertTrue(codigo.compartilhar());
        assertEquals(CodigoEstadoCompartilhado.getInstance(), codigo.getEstado());
    }

    // Código deletado

    @Test
    public void naoDeveCriarCodigoDeletado() {
        codigo.setEstado(CodigoEstadoDeletado.getInstance());
        assertFalse(codigo.criar());
    }

    @Test
    public void naoDeveImplementarCodigoDeletado() {
        codigo.setEstado(CodigoEstadoDeletado.getInstance());
        assertFalse(codigo.implementar());
    }

    @Test
    public void naoDeveAtualizarCodigoDeletado() {
        codigo.setEstado(CodigoEstadoDeletado.getInstance());
        assertFalse(codigo.atualizar());
    }

    @Test
    public void naoDeveDeletarCodigoDeletado() {
        codigo.setEstado(CodigoEstadoDeletado.getInstance());
        assertFalse(codigo.deletar());
    }

    @Test
    public void naoDeveCompartilharCodigoDeletado() {
        codigo.setEstado(CodigoEstadoDeletado.getInstance());
        assertFalse(codigo.compartilhar());
    }

    // Código compartilhado

    @Test
    public void naoDeveCriarCodigoCompartilhado() {
        codigo.setEstado(CodigoEstadoCompartilhado.getInstance());
        assertFalse(codigo.criar());
    }

    @Test
    public void naoDeveImplementarCodigoCompartilhado() {
        codigo.setEstado(CodigoEstadoCompartilhado.getInstance());
        assertFalse(codigo.implementar());
    }

    @Test
    public void DeveAtualizarCodigoCompartilhado() {
        codigo.setEstado(CodigoEstadoCompartilhado.getInstance());
        assertTrue(codigo.atualizar());
    }

    @Test
    public void DeveDeletarCodigoCompartilhado() {
        codigo.setEstado(CodigoEstadoCompartilhado.getInstance());
        assertTrue(codigo.deletar());
    }

    @Test
    public void naoDeveCompartilharCodigoCompartilhado() {
        codigo.setEstado(CodigoEstadoCompartilhado.getInstance());
        assertFalse(codigo.compartilhar());
    }

}