package com.example.plantasexoticas
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import android.widget.TextView


class DetailsFragment : Fragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        var tarea = requireArguments().getString("tarea")
        var hora = requireArguments().getString("hora")
        var lugar = requireArguments().getString("lugar")
        if(hora=="1"){
            val fragmento = inflater.inflate(R.layout.nuevo_especies,container, false)
            return fragmento

        } else {
            if(hora=="2"){
                val fragmento = inflater.inflate(R.layout.nueva_ficha,container, false)
                return fragmento
            }else {
                if(hora=="3"){
                   val fragmento = inflater.inflate(R.layout.regiones,container, false)
                    return fragmento
                }else {
                    val fragmento = inflater.inflate(R.layout.fragment_details,container, false)
                    var textVievTarea: TextView = fragmento.findViewById(R.id.textViewTarea)
                    var textVievHora: TextView = fragmento.findViewById(R.id.textViewHora)
                    var textVievLugar: TextView = fragmento.findViewById(R.id.textViewLugar)
                    textVievTarea.text = tarea
                    textVievHora.text = hora
                    textVievLugar.text = lugar
                    return fragmento
                }
            }
        }
    }
}