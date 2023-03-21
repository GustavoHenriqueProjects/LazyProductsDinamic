package br.senai.sp.jandira.lazyproducts

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import br.senai.sp.jandira.lazyproducts.dao.repository.ProductRepository
import br.senai.sp.jandira.lazyproducts.model.Product
import br.senai.sp.jandira.lazyproducts.ui.theme.LazyProductsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //Criar um objeto product
//        val p = Product(
//            id = 1,
//            name = "Mouse",
//            price = 123.30
//        )

        setContent {
            LazyProductsTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Greeting(ProductRepository.getProductsList())
                }
            }
        }
    }
}

@Composable
fun Greeting(products: List<Product>) {
    Surface(modifier = Modifier.fillMaxSize()) {
//       Column() {
//           //Pra cada produto na lista de produtos
//           for (product in products){
//                Text(text = "${product.id} - ${product.name}")
//           }

        //LazyColumn é composto por listas, LazyColumn nao presisa de Scrool
       Column() {
           LazyRow(){
               for (product in products){
                   //Dentro do item posso ter Column, Row, Card
                   item {
                       Card(modifier = Modifier
                           .fillMaxWidth()
                           .padding(8.dp),
                           backgroundColor = Color.Cyan
                       ){
                           Column(modifier = Modifier.padding()) {
                               Text(text = "${product.id} - ${product.name}")
                               Text(text = "${product.price}")
                           }
                       }
                   }
               }
           }
           LazyColumn(){
               //Funcao lampda, a cada interacao me devolve uma lista de produto. items -> Opeção Certa , FOR -> Opeção errada
               items(products){ product ->
                   //Dentro do item posso ter Column, Row, Card. Item é uma coleção de produtos

                       Card(modifier = Modifier
                           .fillMaxWidth()
                           .padding(8.dp),
                           backgroundColor = Color.Blue
                       ){
                           Row() {
                               Image(painter = product.image ?: painterResource(id = R.drawable.bmi), contentDescription = "",
                                   modifier = Modifier.size(100.dp),
                                   contentScale = ContentScale.FillBounds

                               )
                               Spacer(modifier = Modifier.width(100.dp))
                               Column(modifier = Modifier.padding(4.dp)) {
                                   Text(text = "${product.id} - ${product.name}")
                                   Spacer(modifier = Modifier.height(30.dp))
                                   Text(text = "${product.price}")
                                   //Elvis, verifica se é null, Se for recebe imagem padrão.

                               }
                           }
                       }
               }
           }
       }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    LazyProductsTheme {
        Greeting(ProductRepository.getProductsList())
    }
}