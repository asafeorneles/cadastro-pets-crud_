package com.asafeorneles.cadastro_pets_crud.enums;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TipoTest {
    @Test
    void shouldReturnTrueWhenSexoEnumFromValueIsOperatedWithSuccess() {

        assertEquals(Tipo.GATO, Tipo.fromValue("Gato"));
        assertEquals(Tipo.GATO, Tipo.fromValue("gato"));
        assertEquals(Tipo.GATO, Tipo.fromValue("gáto"));

        assertEquals(Tipo.CACHORRO, Tipo.fromValue("Cachorro"));
        assertEquals(Tipo.CACHORRO, Tipo.fromValue("cachorro"));
        assertEquals(Tipo.CACHORRO, Tipo.fromValue("cachôrro"));
    }

    @Test
    void shouldThrowExceptionForInvalidValue() {
        assertThrows(IllegalArgumentException.class, () -> Sexo.fromValue(null));
        assertThrows(IllegalArgumentException.class, () -> Sexo.fromValue(""));
        assertThrows(IllegalArgumentException.class, () -> Sexo.fromValue("gatu"));
        assertThrows(IllegalArgumentException.class, () -> Sexo.fromValue("cachorru"));
    }
}