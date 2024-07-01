package com.imageapi;

import com.imageapi.Services.APIService;

import javafx.application.Application;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Application.launch(APIService.class, args);
    }
}