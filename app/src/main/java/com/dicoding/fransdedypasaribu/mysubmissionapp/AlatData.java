package com.dicoding.fransdedypasaribu.mysubmissionapp;

import java.util.ArrayList;

public class AlatData {
    public static String[][] data = new String[][]{
            {"Garantung", "Garantung dipukul dengan menggunakan 2 buah stik pemukul. Masing-masing tangan memegang 1 buah. Teknik memainkannya berbeda-beda tergantung dari si pemain.", "https://berbudaya.id/wp-content/uploads/2019/08/batak-garantung-630x380.png"},
            {"Gondang", "Gondan berupa sebuah gendang yang memiliki ukuran lebih besar dari Taganing (alat musik Batak lain yang berisi 5 buah gendang).", "https://berbudaya.id/wp-content/uploads/2019/08/batak-gondang-630x380.png"},
            {"Hesek", " Hesek merupakan alat musik yang digunakan sebagai instrumen penentu tempo (sebagai ketukan dasar). Hesek terbuat dari pecahan logam besi.", "https://upload.wikimedia.org/wikipedia/id/thumb/b/ba/Hesek.gif/120px-Hesek.gif"},
            {"Ihutan", "Ogung ihutan memiliki tugas sebagai pengiring nada dari ogung oloan, Ihutan memiliki nada yang lebih tinggi dibandingkan dengan ogung tersebut. Ukuran ogung bervariasi tergantung dari fungsi & penggunaannya.", "https://berbudaya.id/wp-content/uploads/2019/08/batak-ihutan-630x380.png"},
            {"Odap", "Odap merupakan sebuah gendang yang memiliki dua sisi yang berperan sebagai pembawa ritme, odap biasanya digunakan untuk memainkan lagu-lagu tertentu dalam Gondang Sabangungan atau ketika pawai.","https://berbudaya.id/wp-content/uploads/2019/08/batak-odap-630x380.png"},
            {"Oloan", "Oloan merupakan salah satu alat musik tradisional suku Batak jenis ogung. Alat musik tradisional Oloan dimainkan dengan cara dipukul pada bagian tengahnya.", "https://upload.wikimedia.org/wikipedia/id/thumb/3/36/Ogung.JPG/440px-Ogung.JPG"},
            {"Panggora", "Panggora adalah salah satu jenis Ogung yang dimainkan di sana. Bunyi yang dihasilkan cukup keras menggelegar dan bisa mengalahkan suara Ogung lainnya.", "https://2.bp.blogspot.com/-uHLDcHydf7E/V93dp9MdN_I/AAAAAAAAQ2c/cRiADbZMvtkgkpfktFI7GTDtr2WoIuN0wCLcB/s320/Faritia.png"},
            {"Sarune Bolon", "Sarune Bolon biasanya terbuat dari logam. alat musik ini memiliki 6 lubang nada di bagian atas tubuhnya. iya juga masih termasuk bagian dari perangkat musik kesenian Gondang Sabangunan", "https://berbudaya.id/wp-content/uploads/2019/08/batak-sarune-bolon-630x380.png"},
            {"Sarune Esek", "Sarune bulu adalah alat musik yang terbuat dari satu ruas bambu dan kedua ujungnya berlubang. Panjang dari alat musik ini sekitar 10 – 12 cm dengan diameter sekitar 1 – 2 cm.", "https://berbudaya.id/wp-content/uploads/2019/08/batak-sarune-etek-630x380.png"},
            {"Sulim", "Alat musik tradisional Batak ini masih termasuk keluarga flute atau suling. Sulim memiliki panjang berbeda-beda tergantung nada dasar yang diinginkan. Sulim umumnya memiliki 6 lubang nada dengan jarak yang simetris.", "https://berbudaya.id/wp-content/uploads/2019/08/batak-sulim-630x380.png"},
            {"Taganing", "Taganing adalah salah satu alat musik tradisional yang fungsinya adalah sebagai pembawa melodi dan ritme pada lagu yang dibawakan. Taganing dipukul pada bagian membran menggunakan stik pemukul.", "https://berbudaya.id/wp-content/uploads/2019/08/batak-taganing-630x380.png"}
    };
    public static ArrayList<Alat> getListData(){
        ArrayList<Alat> list = new ArrayList<>();
        for (String[] aData : data) {
            Alat alat = new Alat();
            alat.setName(aData[0]);
            alat.setFrom(aData[1]);
            alat.setPhoto(aData[2]);
            list.add(alat);
        }
        return list;
    }
}
