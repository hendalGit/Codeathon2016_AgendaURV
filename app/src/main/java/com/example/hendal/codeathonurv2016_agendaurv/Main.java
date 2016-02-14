package com.example.hendal.codeathonurv2016_agendaurv;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.FragmentTransaction;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.widget.Toast;

public class Main extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        final Activity act = this;
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(act, "Característica no disponbile", Toast.LENGTH_SHORT).show();
            }
        });
        //registerForContextMenu(fab);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.fragment, new Horari());
        toolbar.setTitle(R.string.title_activity_horari);
        ft.addToBackStack("tag_back");
        ft.commit();
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();


        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        int id = item.getItemId();
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        if (id == R.id.nav_horari) {
            fab.setVisibility(View.VISIBLE);
            ft.replace(R.id.fragment, new Horari());
            toolbar.setTitle(R.string.title_activity_horari);
        } else if (id == R.id.nav_calendari) {
            fab.setVisibility(View.VISIBLE);
            ft.replace(R.id.fragment, new Calendari());
            toolbar.setTitle(R.string.title_activity_calendari);
        } else if (id == R.id.nav_professors) {
            fab.setVisibility(View.VISIBLE);
            ft.replace(R.id.fragment, new Professors());
            toolbar.setTitle(R.string.title_activity_professors);
        } else if (id == R.id.nav_qualificacions) {
            fab.setVisibility(View.GONE);
            ft.replace(R.id.fragment, new Qualificacions());
            toolbar.setTitle(R.string.title_activity_qualficacions);
        } else if (id == R.id.nav_sales) {
            fab.setVisibility(View.GONE);
            ft.replace(R.id.fragment, new Crai());
            toolbar.setTitle(R.string.title_activity_crai);
        }
        ft.addToBackStack("tag_back");
        ft.commit();

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

}
