package com.literatura.desafio.service;

public interface IDataConversor {
    <T> T convertData(String json, Class<T> clase);
}
