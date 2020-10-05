package codingwithmitch.com.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import java.lang.ref.SoftReference;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    private ArrayList<String> mNames = new ArrayList<>();
    private ArrayList<String> mImageUrls = new ArrayList<>();
    private ArrayList<String> mImageDesc = new ArrayList<>();
    private ArrayList<String> mRecipe = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate: started.");

        initImageBitmaps();
    }

    private void initImageBitmaps(){
        Log.d(TAG, "initImageBitmaps: preparing bitmaps.");

        mImageUrls.add("https://imagesvc.meredithcorp.io/v3/mm/image?url=https%3A%2F%2Fimages.media-allrecipes.com%2Fuserphotos%2F253826.jpg&w=272&h=272&c=sc&poi=face&q=85");
        mNames.add("Bananas in Caramel Sauce");
        mImageDesc.add("A delicious, fast dessert. Impressive served when the sauce is still bubbling! Serve with coconut ice cream, if desired.");
        mRecipe.add("1/2 cup butter, \n1 cup superfine sugar, \n1 1/4 cups heavy cream, \n4 medium bananas");

        mImageUrls.add("https://imagesvc.meredithcorp.io/v3/mm/image?url=https%3A%2F%2Fimages.media-allrecipes.com%2Fuserphotos%2F2783679.jpg&w=272&h=272&c=sc&poi=face&q=85");
        mNames.add("Virginia Apple Pudding");
        mImageDesc.add("This is a wonderful old family recipe served warm, topped with vanilla ice cream. ");
        mRecipe.add("½ cup butter, melted \n1 cup white sugar \n1 cup all-purpose flour \n2 teaspoons baking powder \n¼ teaspoon salt \n1 cup milk \n2 cups chopped, peeled apple \n1 teaspoon ground cinnamon ");

        mImageUrls.add("https://imagesvc.meredithcorp.io/v3/mm/image?url=https%3A%2F%2Fimages.media-allrecipes.com%2Fuserphotos%2F3620748.jpg&w=272&h=272&c=sc&poi=face&q=85");
        mNames.add("Best Peanut Butter Cookies Ever");
        mImageDesc.add("This is an amazing no-flour peanut butter cookie. It is so easy, even kids like to make it.");
        mRecipe.add("2 cups peanut butter \n2 cups white sugar \n2 large eggs \n2 teaspoons baking soda \n1 pinch salt \n1 teaspoon vanilla extract ");

        mImageUrls.add("https://imagesvc.meredithcorp.io/v3/mm/image?url=https%3A%2F%2Fimages.media-allrecipes.com%2Fuserphotos%2F3037647.jpg&w=272&h=272&c=sc&poi=face&q=85");
        mNames.add("Chocolate Delight");
        mImageDesc.add("This is the most delightful chocolate dessert that you will ever taste!");
        mRecipe.add("1/2 cup butter, \n1 cup superfine sugar, \n1 1/4 cups heavy cream, \n4 medium bananas");


        mImageUrls.add("https://imagesvc.meredithcorp.io/v3/mm/image?url=https%3A%2F%2Fimages.media-allrecipes.com%2Fuserphotos%2F2078257.jpg&w=272&h=272&c=sc&poi=face&q=85");
        mNames.add("Chocolate Fudge Cookies");
        mImageDesc.add("This recipe is so easy to make, and yields delicious chocolaty cookies.");
        mRecipe.add("½ cup butter, melted \n1 cup white sugar \n1 cup all-purpose flour \n2 teaspoons baking powder \n¼ teaspoon salt \n1 cup milk \n2 cups chopped, peeled apple \n1 teaspoon ground cinnamon ");

        mImageUrls.add("https://imagesvc.meredithcorp.io/v3/mm/image?url=https%3A%2F%2Fimages.media-allrecipes.com%2Fuserphotos%2F454065.jpg&w=272&h=272&c=sc&poi=face&q=85");
        mNames.add("Five Minute Ice Cream");
        mImageDesc.add("A fast way to make delicious ice cream without compromising quality. Use any frozen fruit in place of the strawberries. This is a quick recipe to WOW company who drop by.");
        mRecipe.add("2 cups peanut butter \n2 cups white sugar \n2 large eggs \n2 teaspoons baking soda \n1 pinch salt \n1 teaspoon vanilla extract ");

        initRecyclerView();
    }

    private void initRecyclerView(){
        Log.d(TAG, "initRecyclerView: init recyclerview.");
        RecyclerView recyclerView = findViewById(R.id.recyclerv_view);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(this, mNames, mImageUrls, mImageDesc);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}






















