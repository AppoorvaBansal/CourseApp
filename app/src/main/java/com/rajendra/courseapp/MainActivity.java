package com.rajendra.courseapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;

import com.rajendra.courseapp.adapter.CategoryAdapter;
import com.rajendra.courseapp.model.Category;
import com.rajendra.courseapp.retrofit.ApiInterface;
import com.rajendra.courseapp.retrofit.RetrofitClient;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class MainActivity extends AppCompatActivity {

    RecyclerView categoryRecyclerView;
    CategoryAdapter categoryAdapter;
    List<Category> categoryList;
    ApiInterface apiInterface;
    EditText ed;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_main);
        categoryRecyclerView = findViewById(R.id.course_recycler);
        ed = findViewById(R.id.editText);
        //apiInterface = RetrofitClient.getRetrofitClient().create(ApiInterface.class);
        categoryList=new ArrayList<Category>();

        categoryList.add(new Category("c1","JAVA","100",R.drawable.i1));
        categoryList.add(new Category("c2","Python","100",R.drawable.i1));
        categoryList.add(new Category("c3","C++","100",R.drawable.i1));
        categoryList.add(new Category("c4","C","100",R.drawable.i1));
        categoryList.add(new Category("c5","Flutter","100",R.drawable.i1));
        categoryList.add(new Category("c6","Kotlin","100",R.drawable.i1));
        categoryList.add(new Category("c7","C#","100",R.drawable.i1));
        categoryList.add(new Category("c8","Networking","100",R.drawable.i1));

        getAllCategory(categoryList);
//        //Call<List<Category>> call = apiInterface.getAllCategory();
//
////        call.enqueue(new Callback<List<Category>>() {
////            @Override
////            public void onResponse(Call<List<Category>> call, Response<List<Category>> response) {
//
//                List<Category> categoryList = response.body();
//
//                getAllCategory(categoryList);
//
//                //lets run it
//            }

//            @Override
//            public void onFailure(Call<List<Category>> call, Throwable t) {
//                Toast.makeText(MainActivity.this, "No response from server", Toast.LENGTH_SHORT).show();
//            }
//        });

        //lets run this app and check server is responding or not.
        // we have successfully fetched data from api.
        // now we will setup this json response to recyclerview.


    }


    // welcome to all of you.
    // first of all i am goinf to import some assets

    // now we will setup Retrofit for network call fetching data from server.
    // lets import retrofit dependency

    private void getAllCategory(List<Category> categoryList){

        RecyclerView.LayoutManager layoutManager = new StaggeredGridLayoutManager(1, 1);
        categoryRecyclerView.setLayoutManager(layoutManager);
        categoryAdapter = new CategoryAdapter(this, categoryList);
        categoryRecyclerView.setAdapter(categoryAdapter);
        categoryAdapter.notifyDataSetChanged();

    }

    // now again we need to create a model class for data and adapter class for recycler view
    // lest have a look on json data
    // this data comming from server having course content details
    // lets do it fast.

    // tutorial has benn complited see you the next tutorial.

}
