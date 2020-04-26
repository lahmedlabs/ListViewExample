package com.example.listviewexample;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //1. 리스트에 나열할 내용을 배열로 선언
        final String[] LIST_ITEM = {"James", "Alex", "Lucia", "Kathy", "Justine", "Paul",
                "Bob","Oliver", "Harry", "Jack", "George"};
        //2. 리스트뷰를 생성, xml 레이아웃에 대응
        ListView listView = (ListView)findViewById(R.id.listView);
        //3. ArrayAdapter형 변수 선언, 리스트 뷰 모양과 내용을 1번 배열로 채운다
        ArrayAdapter adapter = new ArrayAdapter(this,
                android.R.layout.simple_list_item_1, LIST_ITEM);
        //4. 3번에서 생성한 arrayAdapter를 2번의 리스트뷰 변수에 적용
        listView.setAdapter(adapter);
        //5. 리스트뷰 클릭 시 동작하는 이벤트리스너 정의
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String message1;
                message1 = "Name is "+ LIST_ITEM[i];
                Toast.makeText(MainActivity.this, message1, Toast.LENGTH_LONG).show();
            }
        });
    }
}
