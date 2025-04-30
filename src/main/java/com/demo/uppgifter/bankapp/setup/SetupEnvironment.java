package com.demo.uppgifter.bankapp.setup;

import com.demo.uppgifter.bankapp.Bank;
import com.demo.uppgifter.bankapp.User;

import java.util.List;

import static com.demo.uppgifter.bankapp.utils.Utils.inputScanner;

public class SetupEnvironment {

    public void initialize() {

        Bank handelsbanken = new Bank("Handelsbanken", 10000.0);
        Bank swedbank = new Bank("Swedbank", 50000.0);
        User benny = new User("Benny", "benny69@live.com", "123", handelsbanken);
        User frida = new User("Frida", "fridaLover@live.com", "321", swedbank);

        List<User> users = List.of(benny, frida);

        validation(users);
    }

    public void validation(List<User> users) {

        boolean valid = true;
        while (valid) {
            System.out.println("Välkommen till ATM!\nVar god ange e-mail och tryck enter :)");
            String userEmailInput = inputScanner();
            System.out.println("Och nu pinkod sen enter");
            String userPinCodeInput = inputScanner();

            for (User user : users) {
                if (userEmailInput.equals(user.getEmail()) && userPinCodeInput.equals(user.getPinCode())) {

                    System.out.println("Välkommen " + user.getName());
                    interact(user);
                    valid = false;
                }
            }
            System.out.println("Du har angivit fel email eller pinkod försök igen\n");
        }
    }

    public void interact(User user) {

        System.out.println("Hej " + user.getName() + "Vad vill du göra nu?");
        System.out.println("1) se aktuellt saldo");
        System.out.println("2) ta ut pengar");
        String userInput = inputScanner();
    }


};
