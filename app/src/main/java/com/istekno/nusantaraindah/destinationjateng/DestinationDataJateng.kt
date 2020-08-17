package com.istekno.nusantaraindah.destinationjateng

import com.istekno.nusantaraindah.Destination
import com.istekno.nusantaraindah.R

object DestinationDataJateng {

    private val destinationName  = arrayOf(
        "Ayanaz Gedong Songo",
        "Lokawisata Baturraden",
        "Candi Borobudur",
        "Dieng Plateau",
        "Kepulauan Karimun Jawa",
        "Kawah Sikidang",
        "Lawang Sewu",
        "Museum KA Ambarawa",
        "Gunung Merbabu",
        "Simpang Lima Semarang",
        "Umbul Ponggok",
        "Benteng Vastenburg"
    )

    private val destinationCity  = arrayOf(
        "Kabupaten Semarang",
        "Kabupaten Banyumas",
        "Kabupaten Magelang",
        "Kabupaten Banjarnegara",
        "Kabupaten Jepara",
        "Kabupaten Banjarnegara",
        "Kota Semarang",
        "Kabupaten Semarang",
        "Kabupaten Boyolali",
        "Kota Semarang",
        "Kabupaten Klaten",
        "Kota Surakarta"
    )

    private val destiDescription = arrayOf(
        "\t\t\tAyanaz Gedongsongo memiliki konsep wisata modern yang menjaga keharmonisan dengan pemandangan alam sekitarnya. Dibuka 11 Juni 2018, wisata ini semakin banyak dikunjungi karena unik dan instagramable. Pihak pengelola Ayanaz Gedongsongo menyediakan banyak spot foto keren untuk para wisatawan." +
                "\n\n\t\t\tLatar pegunungan, awan, dan langit biru membuat tempat ini sangat indah untuk berfoto. Pemandangan utama adalah Gunung Ungaran serta Gunung Sindoro dan Sumbing yang sangat indah sebagai latar foto. Berada masih satu area dengan Candi Gedong Songo menjadi keunggulan tersendiri.",

        "\t\t\tLokawisata Baturraden terletak di sebelah selatan Gunung Slamet memiliki udara sejuk dan cenderung bertambah dingin di malam hari. Selain memiliki panorama alam yang cantik, Baturraden juga memiliki banyak legenda rakyat, salah satunya cerita lutung kasarung yang terkenal. Baturraden terletak di sebelah utara kota Purwokerto tepat di lereng sebelah selatan Gunung Slamet. Baturraden karena letaknya di lereng gunung menjadikan kawasan ini memiliki hawa yang sejuk dan cenderung sangat dingin terutama di malam hari. Baturraden juga merupakan daerah wisata yang banyak dikunjungi oleh wisatawan lokal, terutama pada hari minggu dan hari libur nasional.",

        "\t\t\tCandi Borobudur adalah sebuah candi Buddha yang terletak di Borobudur, Magelang, Jawa Tengah, Indonesia. Candi ini terletak kurang lebih 100 km di sebelah barat daya Semarang, 86 km di sebelah barat Surakarta, dan 40 km di sebelah barat laut Yogyakarta. Candi berbentuk stupa ini didirikan oleh para penganut agama Buddha Mahayana sekitar tahun 800-an Masehi pada masa pemerintahan wangsa Syailendra. Borobudur adalah candi atau kuil Buddha terbesar di dunia[1][2], sekaligus salah satu monumen Buddha terbesar di dunia[3]." +
                "\n\n\t\t\tMonumen ini terdiri atas enam teras berbentuk bujur sangkar yang di atasnya terdapat tiga pelataran melingkar, pada dindingnya dihiasi dengan 2.672 panel relief dan aslinya terdapat 504 arca Buddha[4]. Borobudur memiliki koleksi relief Buddha terlengkap dan terbanyak di dunia[3]. Stupa utama terbesar teletak di tengah sekaligus memahkotai bangunan ini, dikelilingi oleh tiga barisan melingkar 72 stupa berlubang yang di dalamnya terdapat arca Buddha tengah duduk bersila dalam posisi teratai sempurna dengan mudra (sikap tangan) Dharmachakra mudra (memutar roda dharma).",

        "\t\t\tDataran Tinggi Dieng adalah kawasan vulkanik aktif di Jawa Tengah, yang masuk wilayah Kabupaten Banjarnegara dan Kabupaten Wonosobo. Letaknya berada di sebelah barat kompleks Gunung Sindoro dan Gunung Sumbing." +
                "\n\n\t\t\tDieng memiliki Ketinggian rata-rata adalah sekitar 2.000 m di atas permukaan laut. Suhu berkisar 12—20 °C di siang hari dan 6—10 °C di malam hari. Pada musim kemarau (Juli dan Agustus), suhu udara dapat mencapai 0 °C di pagi hari dan memunculkan embun beku yang oleh penduduk setempat disebut bun upas (\"embun racun\") karena menyebabkan kerusakan pada tanaman pertanian." +
                "\n\n\t\t\tSecara administrasi, Dieng merupakan wilayah Desa Dieng Kulon, Kecamatan Batur, Kabupaten Banjarnegara dan Dieng (\"Dieng Wetan\"), Kecamatan Kejajar, Kabupaten Wonosobo. Wilayah ini merupakan salah satu wilayah paling terpencil di Jawa Tengah. ",

        "\t\t\tTaman Nasional Karimunjawa merupakan gugusan kepulauan berjumlah 22 pulau yang terletak di Laut Jawa, mempunyai luas 111.625 Ha. Taman Nasional Karimunjawa ditetapkan sebagai Cagar Alam Laut melalui SK Menhut No.123/Kpts-II/1986 kemudian pada tahun 1999 melalui Keputusan Menhutbun No.78/Kpts-II/1999 Cagar Alam Karimunjawa dan perairan sekitarnya seluas 111.625 Ha diubah menjadi Taman Nasional dengan nama Taman Nasional Karimunjawa. Tahun 2001 sebagian luas kawasan TN Karimunjawa seluas 110.117,30 Ha ditetapkan sebagai Kawasan Pelestarian Alam Perairan dengan Keputusan Menhut No.74/Kpts-II/2001. ",

        "\t\t\tKawah ini dipercaya selalu berpindah-pindah tempat. Berada di dekat objek wisata Candi Arjuna membuat Kawah Sikidang yang berada di dataran tinggi Dieng ini paling ramai dikunjungi wisatawan. Kawah yang timbul akibat aktivitas gunung berapi Dieng ini memeliki keunikan tersendiri. Salah satunya lokasi kawah yang berpindah-pindah. Kawah yang berada di Desa Dieng Kulon Kecamatan Batur, Banjarnegara ini merupakan salah satu kawah di dataran tinggi Dieng." +
                "\n\n\t\t\tDi Kawah Sikidang terdapat satu kawah besar dengan suhu 80-90 derajat celcius. Selain itu juga terdapat kawah-kawah kecil di sekitar lokasi objek wisata Kawah Sikidang. Biasanya, beberapa wisatawan sengaja memasak telor rebus dengan cara memasukkan ke dalam keranjang. Wisatawan cukup menunggu sekitar 8-10 menit hingga telor tersebut matang.",

        "\t\t\tLawang Sèwu adalah gedung bersejarah di Indonesia yang berlokasi di Kota Semarang, Jawa Tengah. Gedung ini, dahulu yang merupakan kantor dari Nederlands-Indische Spoorweg Maatschappij atau NIS. Dibangun pada tahun 1904 dan selesai pada tahun 1907. Terletak di bundaran Tugu Muda yang dahulu disebut Wilhelminaplein." +
                "\n\n\t\t\tMasyarakat setempat menyebutnya Lawang Sewu karena bangunan tersebut memiliki pintu yang sangat banyak, meskipun kenyataannya, jumlah pintunya tidak mencapai seribu. Bangunan ini memiliki banyak jendela yang tinggi dan lebar, sehingga masyarakat sering menganggapnya sebagai pintu (lawang).",

        "\t\t\tMuseum Kereta Api Ambarawa adalah sebuah stasiun kereta api yang sudah dialihfungsikan menjadi sebuah museum serta merupakan museum perkeretaapian pertama di Indonesia. Museum ini memiliki koleksi kereta api yang pernah berjaya pada zamannya. Museum ini secara administratif berada di Desa Panjang, Ambarawa, Semarang. Museum yang terletak pada ketinggian +474,40 meter ini termasuk dalam Daerah Operasi IV Semarang dan dikelola oleh Unit Pusat Pelestarian dan Desain Arsitektur PT Kereta Api Indonesia bekerja sama dengan Pemerintah Provinsi Jawa Tengah. ",

        "\t\t\tGunung Merbabu adalah gunung api yang bertipe Strato yang terletak secara geografis pada 7,5° LS dan 110,4° BT. Secara administratif gunung ini berada di wilayah Kabupaten Magelang di lereng sebelah barat dan Kabupaten Boyolali di lereng sebelah timur dan selatan, Kabupaten Semarang di lereng sebelah utara, Provinsi Jawa Tengah. Gunung Merbabu dikenal melalui naskah-naskah masa pra-Islam sebagai Gunung Damalung atau Gunung Pamrihan. " +
                "\n\n\t\t\tDi lerengnya pernah terdapat pertapaan terkenal dan pernah disinggahi oleh Bujangga Manik pada abad ke-15. Menurut etimologi, \"merbabu\" berasal dari gabungan kata \"meru\" dan \"abu\". Nama ini baru muncul pada catatan-catatan Belanda. Gunung ini pernah meletus pada tahun 1560 dan 1797. Dilaporkan juga pada tahun 1570 pernah meletus, akan tetapi belum dilakukan konfirmasi dan penelitian lebih lanjut. Puncak gunung Merbabu berada pada ketinggian 3.145 meter di atas permukaan air laut.",

        "\t\t\tSimpang Lima Semarang adalah sebuah lapangan yang berada di pusat kota Semarang. Lapangan ini disebut juga Lapangan Pancasila. Simpang lima merupakan pertemuan dari lima jalan yang menyatu, yaitu Jalan Pahlawan, Jalan Pandanaran, Jalan Ahmad Yani, Jalan Gajah Mada dan Jalan Ahmad Dahlan. Di sekitarnya berdiri hotel-hotel berbintang dan pusat perbelanjaan. Di antaranya Hotel Ciputra, Hotel Horison, Hotel Graha Santika, Mall Ciputra, E Plaza, Plaza Simpang Lima, Living Plaza, @Hom Hotel, Holiday Inn Expres, Warhol Apartemen dan Condotel. Lapangan ini merupakan pusat keramaian warga Semarang setiap hari Sabtu-Minggu.",

        "\t\t\tUmbul Ponggok merupakan wisata air yang terletak di desa Ponggok, Klaten, Jawa Tengah. Umbul Ponggok merupakan mata air yang dimanfaatkan menjadi objek wisata, pemandian dan snorkeling. Kolam Umbul Ponggok berukuran panjang 70 m dan lebar 40 m, mata air terletak pada dasar kolam dan terus mengalirkan air sehingga kolam Umbul Ponggok cenderung jernih. Pada dasar kolam terdapat ikan dan batu-batuan sehingga kolam Umbul Ponggok kerap digunakan sebagai lokasi foto dibawah air. ",

        "\t\t\tBenteng Vastenburg adalah benteng peninggalan Belanda yang terletak di kawasan Gladak, Surakarta. Benteng ini dibangun tahun 1745 atas perintah Gubernur Jenderal Baron Van Imhoff. Sebagai bagian dari pengawasan Belanda terhadap penguasa Surakarta, khususnya terhadap keraton Surakarta, benteng ini dibangun, sekaligus sebagai pusat garnisun. Di seberangnya terletak kediaman gubernur Belanda (sekarang kantor Balai Kota Surakarta) di kawasan Gladak." +
                "\n\n\t\t\tBentuk tembok benteng berupa bujur sangkar yang ujung-ujungnya terdapat penonjolan ruang yang disebut selekoh (bastion). Di sekeliling tembok benteng terdapat parit yang berfungsi sebagai perlindungan dengan jembatan di pintu depan dan belakang. Bangunan terdiri dari beberapa barak yang terpisah dengan fungsi masing-masing dalam militer. Di tengahnya terdapat lahan terbuka untuk persiapan pasukan atau apel bendera." +
                "\n\n\t\t\tSetelah kemerdekaan, benteng ini digunakan sebagai markas TNI untuk mempertahankan kemerdekaan. Pada masa 1970-1980-an bangunan ini digunakan sebagai tempat pelatihan keprajuritan dan pusat Brigade Infanteri 6/Trisakti Baladaya Kostrad untuk wilayah Karesidenan Surakarta dan sekitarnya."
    )

    private val destinationImage = intArrayOf(
        R.drawable.jateng_a,
        R.drawable.jateng_b,
        R.drawable.jateng_c,
        R.drawable.jateng_d,
        R.drawable.jateng_e,
        R.drawable.jateng_f,
        R.drawable.jateng_g,
        R.drawable.jateng_h,
        R.drawable.jateng_i,
        R.drawable.jateng_j,
        R.drawable.jateng_k,
        R.drawable.jateng_l
    )

    val listData: ArrayList<Destination>
        get() {
            val list = arrayListOf<Destination>()
            for (position in destinationName.indices) {
                val desti = Destination()
                desti.name = destinationName[position]
                desti.location = destinationCity[position]
                desti.photo = destinationImage[position]
                desti.description = destiDescription[position]
                list.add(desti)
            }
            return list
        }
}