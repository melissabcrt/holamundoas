package edu.iest.holamundo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
   private var tvGreeting: TextView? = null ///lateinit solo para var goblar de vista

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       // var tvGreeting: TextView
        setContentView(R.layout.activity_main)
        tvGreeting = findViewById(R.id.tvSaludo)
        cambiarMensaje()
        cambiarMensaje(5)
     //   tvGreeting.text = "Bienvenidos"
    }

    private fun cambiarMensaje(){
      val mensaje_original:String
      mensaje_original = tvGreeting?.text.toString()
        Toast.makeText(this, "Tu mensaje original era $mensaje_original :)❤",Toast.LENGTH_LONG).show()
    }

    private fun cambiarMensaje(tipo: Int){
        if (tipo == 1){
            tvGreeting!!.text = getString(R.string.despedida)
        }else{
            Toast.makeText(this, "El tipo es $tipo", Toast.LENGTH_SHORT).show()
        }
    }
}