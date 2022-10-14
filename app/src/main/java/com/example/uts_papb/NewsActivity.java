package com.example.uts_papb;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.SearchView;

import java.util.ArrayList;

public class NewsActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ArrayList<News> news = new ArrayList<>();
    private NewsAdapter newsAdapter;
    private ArrayList<News> filteredNews = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news);

        Intent intent = getIntent();
        int age = Integer.parseInt(intent.getStringExtra(DetailUserActivity.AGE_EXTRA));
        String category = intent.getStringExtra(DetailUserActivity.CATEGORY_EXTRA);

        addData();
        filterList(age, category);

        newsAdapter = new NewsAdapter(this, filteredNews);
        recyclerView = findViewById(R.id.rv_news);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(newsAdapter);
    }

    public void addData() {
//        Sport
        news.add(new News("13-Oktober-2022 | 15:42", "3 Penyebab Mbappe Mau Cabut ke PSG Akhirnya Terbongkar", "Sports", R.drawable.news1, "Ahmad Fikri Adzhani", "Jakarta, News - Saga transfer bintang muda Paris Saint-Germain, Kylian Mbappe, kian liar berkembang. Setelah sempat reda, Mbappe kembali disebut bakal cabut dari PSG karena beberapa faktor.\n" +
                "\n" +
                "Bukan kondisi yang ideal buat PSG, karena sudah sempat mengamankan jasa Mbappe selama beberapa tahun ke depan lewat perpanjangan kontrak. Namun, karena satu detail saja, Mbappe merasa terkhianati dan hendak cabut.\n" +
                "\n" +
                "1. Merasa dibohongi Mbappe\n" +
                "Marca melansir, Mbappe merasa PSG telah ingkar janji. Dia menilai sampai sekarang PSG tak menjadikannya sebagai core alias sentral dari permainannya.\n" +
                "\n" +
                "Dalam skema pelatih Christoph Galtier, eks AS Monaco itu tak dijadikan fokus serangan seperti yang diembannya bersama Timnas Prancis. Memang, dia dijadikan striker tengah, tapi dengan adanya Lionel Messi dan Neymar di belakang, peluangnya mencetak gol jadi kurang besar.", 13 ));
        news.add(new News("14-Oktober-2002 | 12:38", "Shin Tae Yong: Indonesia Jangan Takut Tim-Tim Eropa", "Sports", R.drawable.news2, "Har", "Jakarta, News - Shin Tae Yong mengungkapkan target yang diinginkan Timnas Indonesia U-20 saat menjalani pemusatan latihan (TC) di Turki dan Spanyol.\n" +
                "\n" +
                "Para pemain Timnas Indonesia U-20 akan menjalani TC di Eropa hingga Desember 2022. Ini adalah bagian dari persiapan sebelum Timnas U-20 menghadapi Piala Asia U-20 dan Piala Dunia U-20 tahun depan.\n" +
                "\n" +
                "Shin Tae Yong mengatakan salah satu target utama tim pelatih Timnas Indonesia U-20 saat menjalani TC di Turki dan Spanyol adalah meningkatkan kepercayaan diri para pemain Garuda Nusantara saat melawan tim-tim Eropa.\n" +
                "\n" +
                "Target TC kali ini untuk mendapatkan kepercayaan diri. Kita akan melakukan uji coba dengan tim-tim bagus. Jadi pemain tidak harus takut untuk menghadapi tim-tim Eropa, ujar Shin Tae Yong melalui Youtube PSSI", 13 ));
        news.add(new News("14-Oktober-2022 | 11:32", "Arsenal Masih Menggila Musim Ini", "Sports", R.drawable.news3, "Sandy Firdaus", "Jakarta, News - Di awal musim 2022/23, sama sekali tidak ada yang menjagokan Arsenal akan jadi hebat. Kendati banyak belanja pemain apik, 'Meriam London' masih diragukan lantaran mereka acap inkonsisten.\n" +
                "\n" +
                "Akan tetapi, hingga Oktober 2022 ini, Arsenal justru menorehkan prestasi ciamik. Selain jadi pemuncak klasemen sementara Premier League, mereka juga menjadi pemuncak klasemen grup Liga Europa. Seperti apa catatan yang mereka torehkan?\n" +
                "\n" +
                "1. Arsenal sudah menang 11 kali\n" +
                "Dari laga-laga yang Arsenal ikuti sejauh ini di semua ajang, mereka menorehkan catatan yang sangat baik. Total, dari 12 laga di semua kompetisi, Arsenal mampu mencatatkan 11 kemenangan.\n" +
                "\n" +
                "Hanya sekali Arsenal mengecap kekalahan musim ini, yakni ketika mereka berhadapan dengan Manchester United di Premier League. Sisanya, mereka tidak mengenal hasil imbang. Mereka selalu meraih kemenangan.", 17));
        news.add(new News("14-Oktober-2022 | 12:43", "Alasan Ketua PSSI Iwan Bule Hindari Media: Lelah Dihujat Netizen", "Sports", R.drawable.news4, "Tino Satrio", "Jakarta, News - Ketua Umum PSSI, Mochamad Iriawan, selalu berusaha kabur ketika dimintai keterangan soal tragedi Kanjuruhan dan desakan mundur. Dia enggan menghampiri awak media sejak mendapati situasi tersebut.\n" +
                "\n" +
                "Bahkan, dalam konferensi pers, pria yang karib disapa Iwan Bule itu enggan menjawab soal pertanyaan tersebut. Atas tingkah Iwan Bule, Sekjen PSSI, Yunus Nusi, memberikan klarifikasi.\n" +
                "\n" +
                "1. Iwan Bule lelah dihujat netizen\n" +
                "Menurut Yunus, Iwan Bule lelah mendapat komentar buruk dari warganet. Maka dari itu, dia memilih untuk tak tampil terlebih dahulu di hadapan media.\n" +
                "\n" +
                "Beliau, di Malang delapan hari. Berhadapan dengan para korban dan keluarganya. Dalam keadaan seperti ini, Anda lihat sendiri dia malah dihujat, kata Yunus.", 17));
        news.add(new News("14-Oktober-2002 | 07:38", "Francesco Bagnaia akan Mengikuti Wejangan Casey Stoner, Siap Kudeta!", "Sports", R.drawable.news5, "Rizki P. Zuwandono", "Jakarta, News - Francesco Bagnaia berhasil memangkas jarak poinnya dengan Fabio Quartararo menjadi 2 poin usai berhasil meraih podium ketiga di Sirkuit Buriram (2/10/2022), Thailand, pada balapan ke-17 MotoGP 2022. Dengan tiga balapan tersisa musim ini, kans Bagnaia meraih gelar juara dunia pembalap terbuka lebar. \n" +
                "\n" +
                "Menatap hal tersebut, Francesco Bagnaia datang dengan determinasi yang begitu tinggi. Meskipun demikian, ia tak menutupi bahwa ia sangat berharap mendapat kisi-kisi dari Casey Stoner.\n" +
                "\n" +
                "1. Ducati dan Sirkuit Phillip Island\n" +
                "Semenjak era MotoGP, hanya ada enam nama pembalap Ducati yang pernah naik ke atas podium Sirkuit Phillip Island. Loris Capirossi tercatat dua kali meraih podium, yakni tahun 2003 dan 2004. Hasil impresif itu dilanjutkan oleh Carlos Checa yang meraih podium ketiga tahun 2005.\n" +
                "\n" +
                "Selain itu, ada tiga nama, yakni Andrea Iannone (2015), Andrea Dovizioso (2018), dan Jack Miller (2019), yang pernah naik ke atas podium di sana. Namun, hanya Casey Stoner satu-satunya pembalap Ducati yang pernah meraih kemenangan di sana.", 17));
        news.add(new News("13-Oktober-2022 | 16:22", "Jack Miller Senang Bisa Kembali Balapan di GP Australia Bersama Ducati", "Sports", R.drawable.news6, "Dewan Putu Ardita", "Jack Miller merasa semringah pada akhir pekan ini. Pasalnya, ia kembali balapan di hadapan publik negaranya sendiri, yaitu Australia.\n" +
                "\n" +
                "GP Australia yang sudah absen dua musim beruntun lantaran pandemi COVID-19 tentu sangat dinantikan oleh Jack Miller. Ia mengaku merasa senang dan bangga bisa membalap di Phillip Island pada 14--16 Oktober 2022 bersama Ducati.\n" +
                "\n" +
                "Lantas, apa target Jack Miller pada balapan MotoGP 2022 Austrialia ini? Lalu, seperti catatan yang dibukukan pembalap berusia 27 tahun itu saat beradu cepat di Phillip Island?\n" +
                "\n" +
                "1. Jack Miller datang ke Phillip Island dengan modal hasil bagus dalam dua balapan terakhir\n" +
                "Jack Miller datang ke Phillip Island bermodalkan hasil bagus pada dua balapan terakhir. Pembalap bernomor motor 43 itu naik podium beruntun pada GP Jepang dan Thailand.\n" +
                "\n" +
                "Jack Miller finis sebagai pemenang pada GP Jepang dan menuntaskan balapan di posisi runner-up pada GP Thailand. Kini, ia menempel ketat Enea Bastianini di klasemen pembalap. Kedua pembalap hanya terpisah satu poin saja.", 13));
        news.add(new News("13-Oktober-2022 | 16:43", "Apriyani/Fadia Pasang Target Tembus 15 Besar di Akhir Tahun", "Sports", R.drawable.news7, "Margith Juita D.", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Eget nunc scelerisque viverra mauris in aliquam sem fringilla ut. Magna fermentum iaculis eu non diam phasellus vestibulum lorem. Ullamcorper dignissim cras tincidunt lobortis. Nisl nunc mi ipsum faucibus vitae aliquet nec ullamcorper sit. Lectus sit amet est placerat in. Posuere sollicitudin aliquam ultrices sagittis orci. Ultrices tincidunt arcu non sodales neque. Nam libero justo laoreet sit amet cursus sit. Sapien eget mi proin sed. Posuere morbi leo urna molestie at. Egestas diam in arcu cursus. In est ante in nibh.\n" +
                "\n" +
                "Eget nulla facilisi etiam dignissim diam. Adipiscing tristique risus nec feugiat in. Nulla at volutpat diam ut. Neque laoreet suspendisse interdum consectetur libero id faucibus nisl. Quis risus sed vulputate odio ut. Massa sed elementum tempus egestas sed sed risus. Condimentum vitae sapien pellentesque habitant morbi. At elementum eu facilisis sed odio morbi quis commodo. Sagittis purus sit amet volutpat consequat mauris nunc congue nisi. Tempor nec feugiat nisl pretium fusce. Vulputate eu scelerisque felis imperdiet proin fermentum leo vel orci. Dictum sit amet justo donec enim diam vulputate ut pharetra. At volutpat diam ut venenatis tellus. Placerat in egestas erat imperdiet sed euismod.", 13));
//        Politics
        news.add(new News("14-Oktober-2022 | 14:14", "KPK Umumkan Daftar 18 Partai Lolos Verifikasi Pemilu 2024", "Politics", R.drawable.news8, "Aditya Pradana P.", "Jakarta, News - Komisi Pemilihan Umum (KPU) menyatakan 18 partai politik (parpol) memenuhi syarat verifikasi administrasi Pemilu 2024. Keputusan itu tertuang dalam surat pengumuman nomor 9/PL.01.1-Pu/05/2022. Salinan surat itu telah dipublikasi di situs resmi KPU.\n" +
                "Berdasarkan surat tersebut, partai-parti yang lolos adalah Partai Demokrasi Indonesia Perjuangan (PDIP), Partai Keadilan Sejahtera (PKS), Partai Perindo, Partai NasDem, Partai Bulan Bintang (PBB), dan Partai Kebangkitan Nusantara (PKN).\n" +
                "\n" +
                "Selanjutnya ada Partai Garda Perubahan Indonesia, Partai Demokrat, Partai Gelombang Rakyat Indonesia (Gelora), Partai Hati Nurani Rakyat (Hanura), Partai Gerakan Indonesia Raya (Gerindra), Partai Kebangkitan Bangsa (PKB), dan Partai Solidaritas Indonesia (PSI).\n" +
                "\n" +
                "Ada pula Partai Amanat Nasional (PAN), Partai Golkar, Partai Persatuan Pembangunan (PPP), Partai Buruh, dan Partai Ummat.\n" +
                "\n" +
                "Dengan demikian, ada enam parpol yang tak lolos verifikasi administrasi. Mereka adalah Partai Swara Rakyat Indonesia, Partai Republik, Partai Republik Satu, Partai Republik Indonesia, Partai Rakyat Adil Makmur (Prima), dan Partai Keadilan dan Persatuan.\n" +
                "\n" +
                "\"Ya mas (enam parpol tidak lolos verifikasi administrasi). Kita lanjut untuk verifikasi faktual parpol yang memenuhi syarat untuk verifikasi administrasi perbaikan,\" ujar Komisioner KPU Betty Idroos kepada CNNIndonesia.com, Jumat (14/10).\n" +
                "\n" +
                "KPU akan melakukan verifikasi faktual dengan mengecek kepengurusan parpol di 100 persen provinsi, 75 persen kabupaten/kot, dan 50 persen kecamatan yang ada di Indonesia.\n", 13));
        news.add(new News("14-Oktober-2022 | 12:54", "Kemendagri Sektor Data Penduduk 275 Juta Jiwa ke KPU untuk Pemilu", "Politics", R.drawable.news9, "Andy Novelino", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Sed libero enim sed faucibus turpis in eu mi. Amet consectetur adipiscing elit pellentesque habitant morbi tristique senectus. Sit amet porttitor eget dolor. Vitae justo eget magna fermentum iaculis. Sit amet tellus cras adipiscing enim eu turpis egestas. Duis tristique sollicitudin nibh sit amet commodo. Ante metus dictum at tempor commodo ullamcorper a lacus vestibulum. Mi ipsum faucibus vitae aliquet nec ullamcorper sit. Ultrices eros in cursus turpis massa tincidunt dui. Cras tincidunt lobortis feugiat vivamus at. Feugiat nisl pretium fusce id velit ut tortor pretium viverra. Enim ut tellus elementum sagittis vitae et leo duis. Mauris ultrices eros in cursus turpis massa tincidunt dui ut. Amet facilisis magna etiam tempor orci. Nec sagittis aliquam malesuada bibendum arcu vitae. Facilisi etiam dignissim diam quis enim lobortis scelerisque fermentum. Egestas tellus rutrum tellus pellentesque. Sagittis orci a scelerisque purus semper eget duis at.\n" +
                "\n" +
                "Nunc vel risus commodo viverra maecenas accumsan lacus vel. Ut tristique et egestas quis ipsum suspendisse ultrices. Libero justo laoreet sit amet cursus sit amet dictum. Quis ipsum suspendisse ultrices gravida dictum fusce. Scelerisque eu ultrices vitae auctor. Et malesuada fames ac turpis egestas integer eget. Iaculis nunc sed augue lacus viverra vitae. Mauris ultrices eros in cursus turpis massa. Amet risus nullam eget felis eget nunc. Tempus iaculis urna id volutpat lacus laoreet non. Id porta nibh venenatis cras sed felis eget velit aliquet. Aenean vel elit scelerisque mauris pellentesque pulvinar pellentesque habitant morbi. Sit amet purus gravida quis. Urna duis convallis convallis tellus id interdum velit. Faucibus et molestie ac feugiat sed lectus vestibulum mattis ullamcorper. Adipiscing bibendum est ultricies integer quis auctor.\n" +
                "\n" +
                "Velit egestas dui id ornare arcu odio. Sed vulputate odio ut enim blandit volutpat maecenas volutpat. Eget dolor morbi non arcu risus quis varius quam quisque. Aliquet risus feugiat in ante metus dictum. Faucibus interdum posuere lorem ipsum. Sit amet mattis vulputate enim nulla aliquet. Venenatis lectus magna fringilla urna. Sit amet consectetur adipiscing elit pellentesque habitant. Pharetra et ultrices neque ornare aenean euismod elementum nisi. Placerat vestibulum lectus mauris ultrices eros in cursus. Eget velit aliquet sagittis id consectetur purus ut faucibus pulvinar. Lectus nulla at volutpat diam ut. Vitae congue eu consequat ac felis. Malesuada fames ac turpis egestas maecenas. Consectetur lorem donec massa sapien faucibus et. Nulla aliquet enim tortor at. Ultricies leo integer malesuada nunc vel. Convallis convallis tellus id interdum velit laoreet.", 13));
        news.add(new News("14-Oktober-2022 | 11:22", "NasDem Instruksikan Pengurus Daerah Pasang Spanduk, Anies Capres", "Politics", R.drawable.news10, "Adi Ibrahim", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Eget nunc scelerisque viverra mauris in aliquam sem fringilla ut. Magna fermentum iaculis eu non diam phasellus vestibulum lorem. Ullamcorper dignissim cras tincidunt lobortis. Nisl nunc mi ipsum faucibus vitae aliquet nec ullamcorper sit. Lectus sit amet est placerat in. Posuere sollicitudin aliquam ultrices sagittis orci. Ultrices tincidunt arcu non sodales neque. Nam libero justo laoreet sit amet cursus sit. Sapien eget mi proin sed. Posuere morbi leo urna molestie at. Egestas diam in arcu cursus. In est ante in nibh.\n" +
                "\n" +
                "Eget nulla facilisi etiam dignissim diam. Adipiscing tristique risus nec feugiat in. Nulla at volutpat diam ut. Neque laoreet suspendisse interdum consectetur libero id faucibus nisl. Quis risus sed vulputate odio ut. Massa sed elementum tempus egestas sed sed risus. Condimentum vitae sapien pellentesque habitant morbi. At elementum eu facilisis sed odio morbi quis commodo. Sagittis purus sit amet volutpat consequat mauris nunc congue nisi. Tempor nec feugiat nisl pretium fusce. Vulputate eu scelerisque felis imperdiet proin fermentum leo vel orci. Dictum sit amet justo donec enim diam vulputate ut pharetra. At volutpat diam ut venenatis tellus. Placerat in egestas erat imperdiet sed euismod.", 17));
        news.add(new News("14-Oktober-2022 | 13:38", "DPR Soal Elite Polri Dikumpulkan Presiden: Sejarah Baru, Kondisi Urgen", "Politics", R.drawable.news11, "Ramadhan Rizki S.", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Eget nunc scelerisque viverra mauris in aliquam sem fringilla ut. Magna fermentum iaculis eu non diam phasellus vestibulum lorem. Ullamcorper dignissim cras tincidunt lobortis. Nisl nunc mi ipsum faucibus vitae aliquet nec ullamcorper sit. Lectus sit amet est placerat in. Posuere sollicitudin aliquam ultrices sagittis orci. Ultrices tincidunt arcu non sodales neque. Nam libero justo laoreet sit amet cursus sit. Sapien eget mi proin sed. Posuere morbi leo urna molestie at. Egestas diam in arcu cursus. In est ante in nibh.\n" +
                "\n" +
                "Eget nulla facilisi etiam dignissim diam. Adipiscing tristique risus nec feugiat in. Nulla at volutpat diam ut. Neque laoreet suspendisse interdum consectetur libero id faucibus nisl. Quis risus sed vulputate odio ut. Massa sed elementum tempus egestas sed sed risus. Condimentum vitae sapien pellentesque habitant morbi. At elementum eu facilisis sed odio morbi quis commodo. Sagittis purus sit amet volutpat consequat mauris nunc congue nisi. Tempor nec feugiat nisl pretium fusce. Vulputate eu scelerisque felis imperdiet proin fermentum leo vel orci. Dictum sit amet justo donec enim diam vulputate ut pharetra. At volutpat diam ut venenatis tellus. Placerat in egestas erat imperdiet sed euismod.", 17));
        news.add(new News("14-Oktober-2022 | 12:22", "Walkot Surabaya Eri Cahyadi Usul Kepala Daerah Ditunjuk Presiden", "Politics", R.drawable.news12, "Farid", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Eget nunc scelerisque viverra mauris in aliquam sem fringilla ut. Magna fermentum iaculis eu non diam phasellus vestibulum lorem. Ullamcorper dignissim cras tincidunt lobortis. Nisl nunc mi ipsum faucibus vitae aliquet nec ullamcorper sit. Lectus sit amet est placerat in. Posuere sollicitudin aliquam ultrices sagittis orci. Ultrices tincidunt arcu non sodales neque. Nam libero justo laoreet sit amet cursus sit. Sapien eget mi proin sed. Posuere morbi leo urna molestie at. Egestas diam in arcu cursus. In est ante in nibh.\n" +
                "\n" +
                "Eget nulla facilisi etiam dignissim diam. Adipiscing tristique risus nec feugiat in. Nulla at volutpat diam ut. Neque laoreet suspendisse interdum consectetur libero id faucibus nisl. Quis risus sed vulputate odio ut. Massa sed elementum tempus egestas sed sed risus. Condimentum vitae sapien pellentesque habitant morbi. At elementum eu facilisis sed odio morbi quis commodo. Sagittis purus sit amet volutpat consequat mauris nunc congue nisi. Tempor nec feugiat nisl pretium fusce. Vulputate eu scelerisque felis imperdiet proin fermentum leo vel orci. Dictum sit amet justo donec enim diam vulputate ut pharetra. At volutpat diam ut venenatis tellus. Placerat in egestas erat imperdiet sed euismod.", 17));
        news.add(new News("14-Oktober-2022 | 09:50", "Wantimpres Jokowi Minta Pemilu 2024 Tak Coblos Caleg, Hanya Partai", "Politics", R.drawable.news13, "Feri Agus S.", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Eget nunc scelerisque viverra mauris in aliquam sem fringilla ut. Magna fermentum iaculis eu non diam phasellus vestibulum lorem. Ullamcorper dignissim cras tincidunt lobortis. Nisl nunc mi ipsum faucibus vitae aliquet nec ullamcorper sit. Lectus sit amet est placerat in. Posuere sollicitudin aliquam ultrices sagittis orci. Ultrices tincidunt arcu non sodales neque. Nam libero justo laoreet sit amet cursus sit. Sapien eget mi proin sed. Posuere morbi leo urna molestie at. Egestas diam in arcu cursus. In est ante in nibh.\n" +
                "\n" +
                "Eget nulla facilisi etiam dignissim diam. Adipiscing tristique risus nec feugiat in. Nulla at volutpat diam ut. Neque laoreet suspendisse interdum consectetur libero id faucibus nisl. Quis risus sed vulputate odio ut. Massa sed elementum tempus egestas sed sed risus. Condimentum vitae sapien pellentesque habitant morbi. At elementum eu facilisis sed odio morbi quis commodo. Sagittis purus sit amet volutpat consequat mauris nunc congue nisi. Tempor nec feugiat nisl pretium fusce. Vulputate eu scelerisque felis imperdiet proin fermentum leo vel orci. Dictum sit amet justo donec enim diam vulputate ut pharetra. At volutpat diam ut venenatis tellus. Placerat in egestas erat imperdiet sed euismod.", 17));
        news.add(new News("14-Oktober-2022 | 09:38", "Momen Jokowi Kembali Lempar Sinyal Reshuffle Kabinet", "Politics", R.drawable.news14, "Sekretariat", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Eget nunc scelerisque viverra mauris in aliquam sem fringilla ut. Magna fermentum iaculis eu non diam phasellus vestibulum lorem. Ullamcorper dignissim cras tincidunt lobortis. Nisl nunc mi ipsum faucibus vitae aliquet nec ullamcorper sit. Lectus sit amet est placerat in. Posuere sollicitudin aliquam ultrices sagittis orci. Ultrices tincidunt arcu non sodales neque. Nam libero justo laoreet sit amet cursus sit. Sapien eget mi proin sed. Posuere morbi leo urna molestie at. Egestas diam in arcu cursus. In est ante in nibh.\n" +
                "\n" +
                "Eget nulla facilisi etiam dignissim diam. Adipiscing tristique risus nec feugiat in. Nulla at volutpat diam ut. Neque laoreet suspendisse interdum consectetur libero id faucibus nisl. Quis risus sed vulputate odio ut. Massa sed elementum tempus egestas sed sed risus. Condimentum vitae sapien pellentesque habitant morbi. At elementum eu facilisis sed odio morbi quis commodo. Sagittis purus sit amet volutpat consequat mauris nunc congue nisi. Tempor nec feugiat nisl pretium fusce. Vulputate eu scelerisque felis imperdiet proin fermentum leo vel orci. Dictum sit amet justo donec enim diam vulputate ut pharetra. At volutpat diam ut venenatis tellus. Placerat in egestas erat imperdiet sed euismod.", 13));

//        Entertainment
        news.add(new News("14-Oktober-2022 | 10:20", "Daftar Lengkap Pemenang AMI Awards 2022", "Entertainment", R.drawable.news15, "TulusCompany", "Jakarta, News - Ajang penghargaan Anugerah Musik Indonesia (AMI) Awards 2022 telah diselenggarakan pada Kamis (13/10) malam. Tulus menjadi musisi yang mendominasi dengan membawa pulang beberapa piala.\n" +
                "Piala kategori utama, seperti Album Terbaik Terbaik (Manusia) dan Karya Produksi Terbaik Terbaik (Hati-Hati di Jalan) diborong Tulus dalam AMI Awards 2022. \n" +
                "\n" +
                "Solois itu juga terpilih sebagai Artis Solo Pria Pop Terbaik dan memenangkan kategori Album Pop Terbaik (Manusia). Sementara itu, kategori Artis Solo Wanita Pop Terbaik tahun ini dimenangkan oleh Yura Yunita.\n" +
                "\n" +
                "AMI Awards tahun ini juga menganugerahkan penghargaan spesial kepada musisi Indonesia legendaris. Penata musik Donny Hardono menerima piala untuk kategori Penghargaan Khusus.\n" +
                "\n" +
                "Pedangdut Elvy Sukaesih juga mendapat piala spesial kategori Legend Award. Sedangkan, kategori Lifetime Achievement Award tahun ini diberikan kepada mendiang Glenn Fredly.\n" +
                "\n" +
                "Berikut daftar lengkap pemenang AMI Awards 2022:\n" +
                "Bidang Umum\n" +
                "Pendatang Baru Terbaik Terbaik:\n" +
                "\n" +
                "Fabio Asher - Bertahan Terluka\n" +
                "\n" +
                "Album Terbaik Terbaik:\n" +
                "\n" +
                "Manusia - Tulus (TulusCompany)\n" +
                "\n" +
                "Karya Produksi Terbaik Terbaik:\n" +
                "\n" +
                "Hati-Hati di Jalan - Tulus (TulusCompany)", 13));
        news.add(new News("14-Oktober-2022 | 14:26", "Arie Untung Buka Suara Usai Hijrahfest Surabaya Batal Digelar", "Entertainment", R.drawable.news16, "Tri Wahyuni", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Eget nunc scelerisque viverra mauris in aliquam sem fringilla ut. Magna fermentum iaculis eu non diam phasellus vestibulum lorem. Ullamcorper dignissim cras tincidunt lobortis. Nisl nunc mi ipsum faucibus vitae aliquet nec ullamcorper sit. Lectus sit amet est placerat in. Posuere sollicitudin aliquam ultrices sagittis orci. Ultrices tincidunt arcu non sodales neque. Nam libero justo laoreet sit amet cursus sit. Sapien eget mi proin sed. Posuere morbi leo urna molestie at. Egestas diam in arcu cursus. In est ante in nibh.\n" +
                "\n" +
                "Eget nulla facilisi etiam dignissim diam. Adipiscing tristique risus nec feugiat in. Nulla at volutpat diam ut. Neque laoreet suspendisse interdum consectetur libero id faucibus nisl. Quis risus sed vulputate odio ut. Massa sed elementum tempus egestas sed sed risus. Condimentum vitae sapien pellentesque habitant morbi. At elementum eu facilisis sed odio morbi quis commodo. Sagittis purus sit amet volutpat consequat mauris nunc congue nisi. Tempor nec feugiat nisl pretium fusce. Vulputate eu scelerisque felis imperdiet proin fermentum leo vel orci. Dictum sit amet justo donec enim diam vulputate ut pharetra. At volutpat diam ut venenatis tellus. Placerat in egestas erat imperdiet sed euismod.", 13));
        news.add(new News("14-Oktober-2022 | 05:10", "Colin Farrell Bocorkan Episode Pertama Serial The Penguin", "Entertainment", R.drawable.news17, "Warner Bros", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Eget nunc scelerisque viverra mauris in aliquam sem fringilla ut. Magna fermentum iaculis eu non diam phasellus vestibulum lorem. Ullamcorper dignissim cras tincidunt lobortis. Nisl nunc mi ipsum faucibus vitae aliquet nec ullamcorper sit. Lectus sit amet est placerat in. Posuere sollicitudin aliquam ultrices sagittis orci. Ultrices tincidunt arcu non sodales neque. Nam libero justo laoreet sit amet cursus sit. Sapien eget mi proin sed. Posuere morbi leo urna molestie at. Egestas diam in arcu cursus. In est ante in nibh.\n" +
                "\n" +
                "Eget nulla facilisi etiam dignissim diam. Adipiscing tristique risus nec feugiat in. Nulla at volutpat diam ut. Neque laoreet suspendisse interdum consectetur libero id faucibus nisl. Quis risus sed vulputate odio ut. Massa sed elementum tempus egestas sed sed risus. Condimentum vitae sapien pellentesque habitant morbi. At elementum eu facilisis sed odio morbi quis commodo. Sagittis purus sit amet volutpat consequat mauris nunc congue nisi. Tempor nec feugiat nisl pretium fusce. Vulputate eu scelerisque felis imperdiet proin fermentum leo vel orci. Dictum sit amet justo donec enim diam vulputate ut pharetra. At volutpat diam ut venenatis tellus. Placerat in egestas erat imperdiet sed euismod.", 17));
        news.add(new News("14-Oktober-2022 | 16:46", "Iwan Fals Beri Siasat Hadapi 'Badai Hebat' Tahun Depan", "Entertainment", R.drawable.news18, "Agniya Khoiri", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Eget nunc scelerisque viverra mauris in aliquam sem fringilla ut. Magna fermentum iaculis eu non diam phasellus vestibulum lorem. Ullamcorper dignissim cras tincidunt lobortis. Nisl nunc mi ipsum faucibus vitae aliquet nec ullamcorper sit. Lectus sit amet est placerat in. Posuere sollicitudin aliquam ultrices sagittis orci. Ultrices tincidunt arcu non sodales neque. Nam libero justo laoreet sit amet cursus sit. Sapien eget mi proin sed. Posuere morbi leo urna molestie at. Egestas diam in arcu cursus. In est ante in nibh.\n" +
                "\n" +
                "Eget nulla facilisi etiam dignissim diam. Adipiscing tristique risus nec feugiat in. Nulla at volutpat diam ut. Neque laoreet suspendisse interdum consectetur libero id faucibus nisl. Quis risus sed vulputate odio ut. Massa sed elementum tempus egestas sed sed risus. Condimentum vitae sapien pellentesque habitant morbi. At elementum eu facilisis sed odio morbi quis commodo. Sagittis purus sit amet volutpat consequat mauris nunc congue nisi. Tempor nec feugiat nisl pretium fusce. Vulputate eu scelerisque felis imperdiet proin fermentum leo vel orci. Dictum sit amet justo donec enim diam vulputate ut pharetra. At volutpat diam ut venenatis tellus. Placerat in egestas erat imperdiet sed euismod.", 13));
        news.add(new News("14-Oktober-2022 | 15:30", "Kreator Yu-Gi-Oh! Tewas Tenggelam Usai Coba Selamatkan 3 Orang", "Entertainment", R.drawable.news19, "Shueisha", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Eget nunc scelerisque viverra mauris in aliquam sem fringilla ut. Magna fermentum iaculis eu non diam phasellus vestibulum lorem. Ullamcorper dignissim cras tincidunt lobortis. Nisl nunc mi ipsum faucibus vitae aliquet nec ullamcorper sit. Lectus sit amet est placerat in. Posuere sollicitudin aliquam ultrices sagittis orci. Ultrices tincidunt arcu non sodales neque. Nam libero justo laoreet sit amet cursus sit. Sapien eget mi proin sed. Posuere morbi leo urna molestie at. Egestas diam in arcu cursus. In est ante in nibh.\n" +
                "\n" +
                "Eget nulla facilisi etiam dignissim diam. Adipiscing tristique risus nec feugiat in. Nulla at volutpat diam ut. Neque laoreet suspendisse interdum consectetur libero id faucibus nisl. Quis risus sed vulputate odio ut. Massa sed elementum tempus egestas sed sed risus. Condimentum vitae sapien pellentesque habitant morbi. At elementum eu facilisis sed odio morbi quis commodo. Sagittis purus sit amet volutpat consequat mauris nunc congue nisi. Tempor nec feugiat nisl pretium fusce. Vulputate eu scelerisque felis imperdiet proin fermentum leo vel orci. Dictum sit amet justo donec enim diam vulputate ut pharetra. At volutpat diam ut venenatis tellus. Placerat in egestas erat imperdiet sed euismod.", 17));
        news.add(new News("13-Oktober-2022 | 11:45", "Deretan Aktor Pemeran Dahmer, Evan Peters Hingga Jeremy Renner", "Entertainment", R.drawable.news20, "NETFLIX", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Eget nunc scelerisque viverra mauris in aliquam sem fringilla ut. Magna fermentum iaculis eu non diam phasellus vestibulum lorem. Ullamcorper dignissim cras tincidunt lobortis. Nisl nunc mi ipsum faucibus vitae aliquet nec ullamcorper sit. Lectus sit amet est placerat in. Posuere sollicitudin aliquam ultrices sagittis orci. Ultrices tincidunt arcu non sodales neque. Nam libero justo laoreet sit amet cursus sit. Sapien eget mi proin sed. Posuere morbi leo urna molestie at. Egestas diam in arcu cursus. In est ante in nibh.\n" +
                "\n" +
                "Eget nulla facilisi etiam dignissim diam. Adipiscing tristique risus nec feugiat in. Nulla at volutpat diam ut. Neque laoreet suspendisse interdum consectetur libero id faucibus nisl. Quis risus sed vulputate odio ut. Massa sed elementum tempus egestas sed sed risus. Condimentum vitae sapien pellentesque habitant morbi. At elementum eu facilisis sed odio morbi quis commodo. Sagittis purus sit amet volutpat consequat mauris nunc congue nisi. Tempor nec feugiat nisl pretium fusce. Vulputate eu scelerisque felis imperdiet proin fermentum leo vel orci. Dictum sit amet justo donec enim diam vulputate ut pharetra. At volutpat diam ut venenatis tellus. Placerat in egestas erat imperdiet sed euismod.", 17));
        news.add(new News("13-Oktober-2022 | 03:50", "Jonathan Majors Besarkan Otot demi Jadi Kang The Conqueror", "Entertainment", R.drawable.news21, "Frazzer Harrison", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Eget nunc scelerisque viverra mauris in aliquam sem fringilla ut. Magna fermentum iaculis eu non diam phasellus vestibulum lorem. Ullamcorper dignissim cras tincidunt lobortis. Nisl nunc mi ipsum faucibus vitae aliquet nec ullamcorper sit. Lectus sit amet est placerat in. Posuere sollicitudin aliquam ultrices sagittis orci. Ultrices tincidunt arcu non sodales neque. Nam libero justo laoreet sit amet cursus sit. Sapien eget mi proin sed. Posuere morbi leo urna molestie at. Egestas diam in arcu cursus. In est ante in nibh.\n" +
                "\n" +
                "Eget nulla facilisi etiam dignissim diam. Adipiscing tristique risus nec feugiat in. Nulla at volutpat diam ut. Neque laoreet suspendisse interdum consectetur libero id faucibus nisl. Quis risus sed vulputate odio ut. Massa sed elementum tempus egestas sed sed risus. Condimentum vitae sapien pellentesque habitant morbi. At elementum eu facilisis sed odio morbi quis commodo. Sagittis purus sit amet volutpat consequat mauris nunc congue nisi. Tempor nec feugiat nisl pretium fusce. Vulputate eu scelerisque felis imperdiet proin fermentum leo vel orci. Dictum sit amet justo donec enim diam vulputate ut pharetra. At volutpat diam ut venenatis tellus. Placerat in egestas erat imperdiet sed euismod.", 13));
    }

    public void filterList(int age, String category) {
        for (News news : news) {
            if (news.minimumAge<=age && news.category.equals(category)) {
                filteredNews.add(news);
            }
        }
    }
}