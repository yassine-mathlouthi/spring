package client;

import com.example.demo.models.Personne;
import com.example.demo.service.PersonneService;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class client {

    @Autowired
    private static PersonneService personneService;

    
    public static void main(String[] args) {
        // Assuming you have a way to obtain an instance of PersonneService (e.g., through Spring or manual instantiation)

        // Add two clients
        Personne personne1 = new Personne();
        personne1.setNom("John");
        personne1.setPrenom("Doe");
        personne1.setNum_tel(123456789);
        personne1.setAge(30);

        Personne personne2 = new Personne();
        personne2.setNom("Jane");
        personne2.setPrenom("Doe");
        personne2.setNum_tel(987654321);
        personne2.setAge(25);

        personneService.savePer(personne1);
        personneService.savePer(personne2);

        // Retrieve clients and check if they were added
        List<Personne> allPersonne = personneService.getAllPersonne();
        for (int i = 0; i < allPersonne.size(); i++) {
            System.out.println("nom : " + allPersonne.get(i).getNom());
        }
    }
}
