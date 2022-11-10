package com.example.plantasexoticas
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment

class ToDoFragment : Fragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val fragmento = inflater.inflate(R.layout.fragment_to_do, container, false)

        val detail1: Button = fragmento.findViewById(R.id.btn_detail_1)
        val detail2: Button = fragmento.findViewById(R.id.btn_detail_2)
        val detail3: Button = fragmento.findViewById(R.id.btn_detail_3)
        detail1.setOnClickListener(View.OnClickListener {
            val datos = Bundle()
            datos.putString("tarea", resources.getString(R.string.txt_tarea1))
            datos.putString("hora", "1")
            datos.putString("lugar", "Florencia")
            activity?.getSupportFragmentManager()?.beginTransaction()
                ?.setReorderingAllowed(true)
                ?.replace(R.id.fragment_container_view,DetailsFragment::class.java,datos,"detail")
                ?.addToBackStack("")
                ?.commit()
        })
        detail2.setOnClickListener(View.OnClickListener {
            val datos = Bundle()
            datos.putString("tarea", resources.getString(R.string.txt_tarea2))
            datos.putString("hora", "2")
            datos.putString("lugar", "Neiva")
            activity?.getSupportFragmentManager()?.beginTransaction()
                ?.setReorderingAllowed(true)
                ?.replace(
                    R.id.fragment_container_view,
                    DetailsFragment::class.java,
                    datos,
                    "detail"
                )
                ?.addToBackStack("")
                ?.commit()
        })
        detail3.setOnClickListener(View.OnClickListener {
            val datos = Bundle()
            datos.putString("tarea", resources.getString(R.string.txt_tarea3))
            datos.putString("hora", "3")
            datos.putString("lugar", "Pitalito")
            activity?.getSupportFragmentManager()?.beginTransaction()
                ?.setReorderingAllowed(true)
                ?.replace(
                    R.id.fragment_container_view,
                    DetailsFragment::class.java,
                    datos,
                    "detail"
                )
                ?.addToBackStack("")
                ?.commit()
        })

        return fragmento
    }
}