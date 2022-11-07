package com.example.assignment5recyclerview.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.assignment5recyclerview.R
import com.example.assignment5recyclerview.data.Product
import com.google.gson.Gson

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    private fun goToProductListActivity(productList: ArrayList<Product>) {
        val intent = Intent(this, ItemListActivity::class.java)
        intent.putExtra("productList", Gson().toJson(productList))
        startActivity(intent)
    }

    fun onElectronicClicked(view: View) {
        val electronicItemList = ArrayList<Product>()
        val product1 = Product(
            "Dell Laptop",
            1450.00,
            "White",
            "https://i.ytimg.com/vi/9yDooCTJT_s/maxresdefault.jpg",
            "Dell XPS15",
            "Dell XPS15 in White"
        )

        val product2 = Product(
            "Sony Laptop",
            1111.25,
            "Black",
            "https://www.cnet.com/a/img/resize/45ac875fc73d31e9ad1b4aa8180b8a4a2f9c9228/hub/2010/10/18/2284dc7e-cbf2-11e2-9a4a-0291187b029a/orig-vaio_f12m0e_1.jpg?auto=webp&width=768",
            "Sony Vaio 152J",
            "Sony Laptop in White."
        )

        val product3 = Product(
            "Apple Laptop",
            1950.00,
            "Grey",
            "https://www.apple.com/newsroom/images/tile-images/Apple_16-inch-MacBook-Pro_111319.jpg.landing-big_2x.jpg",
            "Apple2022",
            "Apple macbook Air Grey"
        )
        val product4 = Product(
            "Mi Laptop",
            1400.00,
            "Silver",
            "https://www.androidauthority.com/wp-content/uploads/2021/01/xiaomi-mi-notebook-14-ic.jpg",
            "Vivo1407",
            "Vivo Green Laptop."
        )

        val product5 = Product(
            "ASUS Laptop",
            1200.15,
            "Slate Purple",
            "https://m.media-amazon.com/images/I/71ehzrGUO7L.jpg",
            "ASUS1603",
            "ASUS Laptop in Slate Purple"
        )

        electronicItemList.add(product1)
        electronicItemList.add(product2)
        electronicItemList.add(product3)
        electronicItemList.add(product4)
        electronicItemList.add(product5)

        goToProductListActivity(electronicItemList)

    }

    fun onClothingClicked(view: View) {
        val clothingItemList = ArrayList<Product>()
    }

    fun onBeautyClicked(view: View) {
        val beautyItemList = ArrayList<Product>()
    }

    fun onFoodClicked(view: View) {
        val foodItemList = ArrayList<Product>()
    }


}