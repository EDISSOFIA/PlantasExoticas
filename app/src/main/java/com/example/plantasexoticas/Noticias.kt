package com.example.plantasexoticas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.navigation.NavigationView


class Noticias : AppCompatActivity() {
    private lateinit var appbarConfiguration: AppBarConfiguration
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_noticias)
        setSupportActionBar(findViewById(R.id.my_toolbar))
       /* if(savedInstanceState == null){
            supportFragmentManager.beginTransaction()
                .setReorderingAllowed(true)
                .add(R.id.fragment_container_view,ToDoFragment::class.java,null,"todo")
                .commit()
        }*/

        val drawerLayout: DrawerLayout = findViewById(R.id.drawer_layout)
        val navView: NavigationView = findViewById(R.id.nav_view)
        val navHostFragment = supportFragmentManager.findFragmentById(R.id.fragment_container_view) as NavHostFragment
        val navController = navHostFragment.navController
        appbarConfiguration = AppBarConfiguration(setOf(R.id.nav_todo,R.id.nav_about),drawerLayout)
        setupActionBarWithNavController(navController, appbarConfiguration)
        navView.setupWithNavController(navController)
    }

    override fun onSupportNavigateUp(): Boolean {
        val navHostFragment = supportFragmentManager.findFragmentById(R.id.fragment_container_view) as NavHostFragment
        val navController = navHostFragment.navController
        return navController.navigateUp(appbarConfiguration) || super.onSupportNavigateUp()
    }
/*
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menuprincipal,menu)
        return super.onCreateOptionsMenu(menu)

    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean = when(item.itemId) {
        R.id.action_search ->{
            Toast.makeText(this,R.string.txt_action_search, Toast.LENGTH_LONG).show()
            true
        }
        R.id.action_settings ->{
            Toast.makeText(this,R.string.txt_action_settings, Toast.LENGTH_LONG).show()
            true
        }
        R.id.action_logout ->{
            Toast.makeText(this,R.string.txt_action_logout, Toast.LENGTH_LONG).show()
            true
        }
        R.id.action_email ->{
            Toast.makeText(this,R.string.txt_action_email, Toast.LENGTH_LONG).show()
            true
        }
        else ->{
            super.onOptionsItemSelected(item)
        }
    }*/

}