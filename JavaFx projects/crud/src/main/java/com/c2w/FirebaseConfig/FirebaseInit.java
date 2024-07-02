package com.c2w.FirebaseConfig;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;

import com.google.api.core.ApiFuture;
import com.google.auth.oauth2.GoogleCredentials;
import com.google.cloud.firestore.DocumentReference;
import com.google.cloud.firestore.DocumentSnapshot;
import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.SetOptions;
import com.google.cloud.firestore.WriteResult;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.cloud.FirestoreClient;

public class FirebaseInit {
    private static Firestore db;

    public static void initializeFirebase() throws IOException {
        FileInputStream serviceAccount = new FileInputStream("src\\main\\resources\\fx-firebase-store.json");

        FirebaseOptions options = new FirebaseOptions.Builder()
                .setCredentials(GoogleCredentials.fromStream(serviceAccount))
                .build();

        FirebaseApp.initializeApp(options);

        db = FirestoreClient.getFirestore();    

    }
    public void creatRec() throws IOException, InterruptedException, ExecutionException{
        Map<String,Object>teamData = new HashMap<>();
        teamData.put("team","India");
        teamData.put("captain","Rohit Sharma");
        teamData.put("manOfMatch", "Virat Kohli");

        ApiFuture<WriteResult> future = 
        db.collection("T20WCC").document("winner").set(teamData);
        System.out.println("Update time: "+future.get().getUpdateTime());
    }
    public void readRec() throws IOException, InterruptedException, ExecutionException{
        DocumentReference docRef = db.collection("T20WCC").document("winner");
        ApiFuture<DocumentSnapshot> snapShot = docRef.get();
        DocumentSnapshot docSnap = snapShot.get();

        if(docSnap.exists()){
            System.out.println("team");
            System.out.println("captain");
            System.out.println("manOfMatch");
        }else{
            System.out.println("Document not found");
        }
    }

    public void updateRec(){
        Map<String,Object>updateData = new HashMap<>();
        updateData.put("manOfSeries", "J.Bumrah");
        ApiFuture<WriteResult> future = db.collection("T20WCC")
            .document("winner").set(updateData,SetOptions.merge());
    }    
}
