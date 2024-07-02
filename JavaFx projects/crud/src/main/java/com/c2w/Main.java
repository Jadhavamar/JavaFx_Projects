package com.c2w;

import java.io.IOException;
import java.util.concurrent.ExecutionException;

import com.c2w.FirebaseConfig.FirebaseInit;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException, ExecutionException {
        
        FirebaseInit obj = new FirebaseInit();
        FirebaseInit.initializeFirebase();
        obj.creatRec();
        //obj.readRec();
        obj.updateRec();
    }
}