package br.senai.sp.jandira.lazyproducts.dao.repository

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import br.senai.sp.jandira.lazyproducts.R
import br.senai.sp.jandira.lazyproducts.model.Product
/*Criando uma função que me retorna uma lista de produtos*/
class ProductRepository {

    companion object{
        @Composable
        fun getProductsList(): List<Product>{
            return listOf<Product>(
                Product(id = 1, name = "Mouse"),
                Product(id = 2, name = "Teclado"),
                Product(
                    id = 3,
                    name = "Impressora",
                    price = 897.93,
                    image = painterResource(id = R.drawable.cadastro)
                ),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
            )
        }
    }
}