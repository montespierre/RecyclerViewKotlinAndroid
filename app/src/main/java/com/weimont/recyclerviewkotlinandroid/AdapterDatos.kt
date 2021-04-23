package com.weimont.recyclerviewkotlinandroid

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class AdapterDatos(private val listDatos: ArrayList<String>): RecyclerView.Adapter<AdapterDatos.ViewHolder>(){

    //var listDatos: ArrayList<String>? = null

    //constructor(listDatos: ArrayList<String>?) : super() {
    //    this.listDatos = listDatos
    //}


    // Cuando se requiera una nueva vista
    override fun onCreateViewHolder( parent: ViewGroup, viewType: Int ): AdapterDatos.ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_list, parent, false)
        return ViewHolder(view)
    }

    // numero de elementos de una vista
    //override fun getItemCount(): Int = this.listDatos.size
    override fun getItemCount(): Int { // OK
        return listDatos.size
    }
    // Para recuperar la lista y pasarle a view holder
    override fun onBindViewHolder(holder: AdapterDatos.ViewHolder, position: Int) {
        val listDato = listDatos.get(position)
        holder.asignarDatos(listDato);
    }

    class ViewHolder(val view: View): RecyclerView.ViewHolder(view) { //OK

        // elementos del layout item_list (Recyclerviewq)
        private val dato = view.findViewById<TextView>(R.id.idDato)
        //init {
        //    val dato = view.findViewById<TextView>(R.id.idDato)
        //}



        fun asignarDatos(datos: String) {

           dato.setText(datos)
           // dato.text = datos
        }

    }

}
