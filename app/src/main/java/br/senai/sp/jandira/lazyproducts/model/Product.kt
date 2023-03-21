package br.senai.sp.jandira.lazyproducts.model

import android.graphics.drawable.Drawable
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.graphics.vector.ImageVector

/*********************************************************
 * Estudar ORM -> Cria a estrtura de dados.
 *
 * Data Class -> Classe de dados usado quando quero
 * representar algo que existe na tabela do banco de dados
**********************************************************/
data class Product(

    var id: Int = 0,
    var name: String = "",
    var description: String = "Está é a descrição do produto.",
    var price: Double = 0.0,
    var image: Painter? = null // -> ? significa que esse  atributo pode ser null

)