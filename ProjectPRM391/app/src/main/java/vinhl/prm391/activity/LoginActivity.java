package vinhl.prm391.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import vinhl.prm391.R;
import vinhl.prm391.daos.UserDAO;

public class LoginActivity extends AppCompatActivity {
    EditText edtUsername, edtPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_activity);

        edtUsername = findViewById(R.id.edtUsername);
        edtPassword = findViewById(R.id.edtPassword);
    }

    public void clickToLogin(View view) {
        UserDAO userDAO = new UserDAO();
        String username = edtUsername.getText().toString();
        String password = edtPassword.getText().toString();

    }
}
