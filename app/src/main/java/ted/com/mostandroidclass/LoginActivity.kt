package ted.com.mostandroidclass

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class LoginActivity : AppCompatActivity() {
    var userEdt: EditText? = null
    var passEdt: EditText? = null
    var loginBtn: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        userEdt = findViewById(R.id.editTextUser)
        passEdt = findViewById(R.id.editTextPass)
        loginBtn = findViewById(R.id.btnLogin)

        loginBtn?.setOnClickListener{
            var username = userEdt?.text.toString()
            var password = passEdt?.text.toString()

            if (username == "user" && password == "pass") {
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)

                Toast.makeText(applicationContext, "Login Success",
                    Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(applicationContext, "Login Fail",
                    Toast.LENGTH_SHORT).show()
            }
        }
    }
}
