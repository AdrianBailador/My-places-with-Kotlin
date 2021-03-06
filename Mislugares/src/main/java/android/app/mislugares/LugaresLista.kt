package android.app.mislugares

import com.example.mislugares.Lugar


class LugaresLista : RepositorioLugares {
    val listaLugares= mutableListOf<Lugar>()

    override fun elemento(id: Int): Lugar {
        return listaLugares[id]
    }

    override fun añade(lugar: Lugar) {
        listaLugares.add(lugar)
    }

    override fun nuevo(): Int {
        val lugar = Lugar("Nuevo lugar", "", GeoPunto.SIN_POSICION, TipoLugar.EDUCACION, "", 666666666,"", "", System.currentTimeMillis(),3.5F)
        listaLugares.add(lugar)
        return listaLugares.size - 1
    }

    override fun borrar(id: Int) {
        listaLugares.removeAt(id)
    }

    override fun tamaño(): Int {
        return listaLugares.size
    }

    override fun actualiza(id: Int, lugar: Lugar) {
        listaLugares[id] = lugar
    }
}