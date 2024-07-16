package com.literaturaJonathan.literaturaJonathan.service;

public interface IConvierteDatos {
    <T> T obtenerDatos(String json, Class<T> clase);
}