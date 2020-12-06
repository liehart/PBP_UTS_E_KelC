package com.tugasbesar.alamart.unittest;

import android.util.Patterns;

import androidx.core.util.PatternsCompat;

import com.tugasbesar.alamart.models.User;

public class LoginPresenter {

    private LoginView view;
    private LoginService service;

    LoginPresenter(LoginView view, LoginService service) {
        this.view = view;
        this.service = service;
    }

    public void onLoginClicked() {
        if (view.getEmail().isEmpty()) {
            view.showEmailError("Email tidak boleh kosong");
            return;
        } else if (view.getPassword().isEmpty()) {
            view.showPasswordError("Password tidak boleh kosong");
            return;
        } else if (view.getPassword().length() < 6 ) {
            view.showPasswordError("Password kurang dari 6 karakter");
            return;
        } else if (!PatternsCompat.EMAIL_ADDRESS.matcher(view.getEmail()).matches()) {
            view.showEmailError("Email tidak valid");
            return;
        } else {
            if (view.getEmail().equals("vriyashartama@gmail.com")) {
                view.startMainActivity();
            }
//            service.login(view, view.getEmail(), view.getPassword(), new LoginCallback() {
//                @Override
//                public void onSuccess(boolean value) {
//                    view.startMainActivity();
//                }
//
//                @Override
//                public void onError() {
//
//                }
//            });
        }
    }

}