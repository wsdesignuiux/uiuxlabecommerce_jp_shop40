package e.wolfsoft1.uiuxlabecommerce_jp_shop40;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

import e.wolfsoft1.uiuxlabecommerce_jp_shop40.adapter.ColorAdapter_40;
import e.wolfsoft1.uiuxlabecommerce_jp_shop40.adapter.CommentAdapter;
import e.wolfsoft1.uiuxlabecommerce_jp_shop40.adapter.Product_Adapter;
import e.wolfsoft1.uiuxlabecommerce_jp_shop40.adapter.SizeAdapter_40;
import e.wolfsoft1.uiuxlabecommerce_jp_shop40.adapter.ViewPagerAdapter_Shop40;
import e.wolfsoft1.uiuxlabecommerce_jp_shop40.model.Color_Model_40;
import e.wolfsoft1.uiuxlabecommerce_jp_shop40.model.Comment_model_Shop40;
import e.wolfsoft1.uiuxlabecommerce_jp_shop40.model.Product_model_shop40;
import e.wolfsoft1.uiuxlabecommerce_jp_shop40.model.Size_Model_40;

public class Shop_40 extends AppCompatActivity {

    ViewPager viewpager_shop40;
    RecyclerView size_recyclerview_40, color_recycler_40, product_recyclerview_40, comment_recyclerview40;

    private String size[] = {"X", "XL", "S", "XS", "XL", "XX", "L", "SL"};
    private Integer[] color = {R.drawable.ic_color40_1, R.drawable.ic_color40_2, R.drawable.ic_color40_3, R.drawable.ic_color40_4, R.drawable.ic_color40_5, R.drawable.ic_color40_6, R.drawable.ic_color40_7, R.drawable.ic_color40_8};

    private Integer[] feature_product_image = {R.drawable.panel1_shop39, R.drawable.panel_shop39,R.drawable.panel1_shop39, R.drawable.panel_shop39};
    private String[] feature_product_price = {"$500", "$786","$500", "$786"};
    private String[] feature_product_type = {"Summer dress", "Summer dress - coral summer","Summer dress", "Summer dress - coral summer"};
    private String[] feature_product_desc = {"Sometimes the scent of seasonal hand wash is all we need to rouse our holiday spirits. Available in an array of festive fragrances, our naturally derived gel hand wash.", "That’s a yeah, yeah phrase. As soon as a potential buyer reads excellent product quality he thinks, yeah, yeah, of course; that’s what everyone says. Ever heard someone ","Sometimes the scent of seasonal hand wash is all we need to rouse our holiday spirits. Available in an array of festive fragrances, our naturally derived gel hand wash.", "That’s a yeah, yeah phrase. As soon as a potential buyer reads excellent product quality he thinks, yeah, yeah, of course; that’s what everyone says. Ever heard someone "};

    private String[] commenter_name = {"Elizabeth Rolson", "Vanessa May"};
    private String[] comment_time = {"01:34 PM", "03:30 PM"};
    private String comment[] = {"When will the discount be?", "Great productю"};
    private Integer commenter_image[] = {R.drawable.commentimage1, R.drawable.commentimage2};

    ArrayList<Size_Model_40> size_modelArrayList;
    ArrayList<Color_Model_40> color_modelArrayList;
    ArrayList<Product_model_shop40> productArrayList;
    ArrayList<Comment_model_Shop40> commentArrayList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shop_40);

        viewpager_shop40 = findViewById(R.id.viewpager_shop40);
        size_recyclerview_40 = findViewById(R.id.size_recyclerview_40);
        color_recycler_40 = findViewById(R.id.color_recycler_40);
        product_recyclerview_40 = findViewById(R.id.product_recyclerview_40);
        comment_recyclerview40 = findViewById(R.id.comment_recyclerview40);


        viewpager_shop40.setPageMargin(20);
        viewpager_shop40.setClipToPadding(false);
        ViewPagerAdapter_Shop40 viewPagerAdapter = new ViewPagerAdapter_Shop40(getSupportFragmentManager(), 3);
        viewpager_shop40.setAdapter(viewPagerAdapter);

        size_modelArrayList = new ArrayList<>();

        for (int i = 0; i < size.length; i++) {
            Size_Model_40 size_model = new Size_Model_40(size[i]);
            size_modelArrayList.add(size_model);
        }
        color_modelArrayList = new ArrayList<>();
        for (int i = 0; i < color.length; i++) {
            Color_Model_40 color_model = new Color_Model_40(color[i]);
            color_modelArrayList.add(color_model);
        }
        productArrayList = new ArrayList<>();
        for (int i = 0; i < feature_product_image.length; i++) {
            Product_model_shop40 product_model = new Product_model_shop40(feature_product_image[i], feature_product_price[i], feature_product_type[i], feature_product_desc[i]);
            productArrayList.add(product_model);
        }

        commentArrayList = new ArrayList<>();
        for (int i = 0; i < commenter_image.length; i++) {
            Comment_model_Shop40 comment_model = new Comment_model_Shop40(commenter_image[i], commenter_name[i], comment[i], comment_time[i]);
            commentArrayList.add(comment_model);
        }

        size_recyclerview_40.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        SizeAdapter_40 sizeAdapter = new SizeAdapter_40(this, size_modelArrayList);
        size_recyclerview_40.setAdapter(sizeAdapter);

        color_recycler_40.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        ColorAdapter_40 adapter = new ColorAdapter_40(this, color_modelArrayList);
        color_recycler_40.setAdapter(adapter);

        product_recyclerview_40.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        Product_Adapter product_adapter = new Product_Adapter(this, productArrayList);
        product_recyclerview_40.setAdapter(product_adapter);

        comment_recyclerview40.setLayoutManager(new LinearLayoutManager(this));
        CommentAdapter commentAdapter = new CommentAdapter(this, commentArrayList);
        comment_recyclerview40.setAdapter(commentAdapter);


    }
}
