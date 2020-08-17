package com.istekno.nusantaraindah.destinationjatim

import com.istekno.nusantaraindah.Destination
import com.istekno.nusantaraindah.R

object DestinationDataJatim {

    private val destinationName  = arrayOf(
        "Taman Nasional Baluran",
        "Gunung Bromo",
        "Coban Rondo",
        "Coban Sewu",
        "Goa Gong",
        "Gunung Penanggungan",
        "Selecta",
        "Gunung Semeru",
        "Simpang 5 Gumul",
        "Taman Safari Indonesia II",
        "Tugu Pahlawan",
        "Air Terjun Toroan"
    )

    private val destinationCity  = arrayOf(
        "Kabupaten Banyuwangi",
        "Kabupaten Lumajang",
        "Kabupaten Malang",
        "Kabupaten Malang",
        "Kabupaten Pacitan",
        "Kabupaten Mojokerto",
        "Kota Batu",
        "Kabupaten Lumajang",
        "Kota Kediri",
        "Kabupaten Pasuruan",
        "Kota Surabaya",
        "Kabupaten Sampang"
    )

    private val destiDescription = arrayOf(
        "\t\t\tTaman Nasional Baluran adalah salah satu Taman Nasional di Indonesia yang terletak di wilayah Banyuputih, Situbondo, Jawa Timur, Indonesia. Nama dari Taman Nasional ini diambil dari nama gunung yang berada di daerah ini, yaitu Gunung Baluran.\n\n\t\t\tGerbang untuk masuk ke Taman Nasional Baluran berada di 7°55\'17.76\"S dan 114°23'15.27\"E. Taman nasional ini terdiri dari tipe vegetasi sabana, hutan mangrove, hutan musim, hutan pantai, hutan pegunungan bawah, hutan rawa dan hutan yang selalu hijau sepanjang tahun. Tipe vegetasi sabana mendominasi kawasan Taman Nasional Baluran yakni sekitar 40 persen dari total luas lahan. \n\n\t\t\tBerdasarkan SK. Menteri Kehutanan No. 279/Kpts.-VI/1997 tanggal 23 Mei 1997 kawasan TN Baluran ditetapkan memiliki luas sebesar 25.000 Ha.\n" +
                "Sesuai dengan peruntukkannya luas kawasan tersebut dibagi menjadi beberapa zona berdasarkan SK. Dirjen PKA No. 187/Kpts./DJ-V/1999 tanggal 13 Desember 1999 yang terdiri dari :\n" +
                "\n1. zona inti seluas 12.000 Ha.\n" +
                "2. zona rimba seluas 5.537 ha (perairan = 1.063 Ha dan daratan = 4.574 Ha).\n" +
                "3. zona pemanfaatan intensif dengan luas 800 Ha.\n" +
                "4. zona pemanfaatan khusus dengan luas 5.780 Ha, dan zona rehabilitasi seluas 783 Ha.",

        "\t\t\tGunung Bromo atau dalam bahasa Tengger dieja \"Brama\", adalah sebuah gunung berapi aktif di Jawa Timur, Indonesia. Gunung ini memiliki ketinggian 2.329 meter di atas permukaan laut dan berada dalam empat wilayah kabupaten, yakni Kabupaten Probolinggo, Kabupaten Pasuruan, Kabupaten Lumajang, dan Kabupaten Malang. Gunung Bromo terkenal sebagai objek wisata utama di Jawa Timur. " +
                "\n\n\t\t\tSebagai sebuah objek wisata, Bromo menjadi menarik karena statusnya sebagai gunung berapi yang masih aktif. Gunung Bromo termasuk dalam kawasan Taman Nasional Bromo Tengger Semeru. Bentuk tubuh Gunung Bromo bertautan antara lembah dan ngarai dengan kaldera atau lautan pasir seluas sekitar 10 kilometer persegi. Ia mempunyai sebuah kawah dengan garis tengah ± 800 meter dan ± 600 meter. Sedangkan daerah bahayanya berupa lingkaran dengan jari-jari 4 km dari pusat kawah Bromo. ",

        "\t\t\tAir Terjun Coban Rondo merupakan air terjun yang terletak di Kecamatan Pujon, Kota Batu, Kabupaten Malang, Jawa Timur. Air terjun ini mudah dijangkau oleh kendaraan umum. Akses yang paling mudah adalah melalui jalan raya dari Malang ke Batu dari sebelah timur atau dari Kediri ke Pare menuju Malang dari arah barat." +
                "\n\n\t\t\tCoban Rondo terletak pada ketinggian 1135 m di atas permukaan laut. Air terjun ini memiliki ketinggian 84 meter dengan debit air berkisar antara 90 liter per detik pada musim kemarau sampai dengan 150 liter per detik pada musim penghujan. Coban Rondo sebenarnya merupakan bagian dari kelompok air terjun bertingkat (dimulai dengan air terjun kembar bernama Coban Manten yang bergabung menjadi satu dinamakan Coban Dudo, dan kemudian mengalir ke bawah dengan nama Coban Rondo).",

        "\t\t\tAir Terjun Tumpak Sewu atau disebut juga Coban Sewu adalah sebuah air terjun berketinggian sekira 120 meter yang berada di perbatasan Kabupaten Lumajang dan Kabupaten Malang, Provinsi Jawa Timur. Air Terjun Tumpak Sewu merupakan air terjun terindah di Pulau Jawa dan Indonesia. " +
                "\n\n\t\t\tAir Terjun Tumpak Sewu memiliki formasi unik karena memiliki aliran air yang melebar seperti tirai sehingga termasuk dalam tipe air terjun Tiered. Lokasi Air Terjun Tumpak Sewu ada di dalam sebuah lembah curam memanjang dengan elevasi 500 meter di atas permukaan air laut. Air Terjun Tumpak Sewu terbentuk di aliran Sungai Glidih yang berhulu di Gunung Semeru. ",

        "\t\t\tPacitan dianugerahi keindahan bawah tanah yang mempesona berupa gua-gua kapur yang dihiasi stalaktit dan stalakmit. Gua yang paling terkenal dan paling indah adalah Gua Gong. Keindahan Gua Gong tak tertandingi oleh gua-gua lain di Pulau Jawa, bahkan ada yang menyebutkan bahwa Gua Gong adalah Gua terindah di Asia Tenggara. Memasuki goa Gong, anda akan disambut formasi stalaktit dan stalakmit yang indah. Dibantu penerangan yang cukup anda dapat masuk lebih dalam dan menyusuri lorong gua sepanjang 256 meter. " +
                "\n\n\t\t\tDi ujung lorong, anda akan menemukan alasan kenapa Gua Gong disebut sebagai gua terindah se-Asia Tenggara. Sebuah ruangan yang membentuk kubah rakasa sepanjang 100 m, dengan lebar 15 hingga 40 meter dan tinggi antara 20-30 meter akan membuat anda berdecak kagum. Stalaktit dan stalakmit dengan aneka bentuk dan ukuran menghiasi seluruh penjuru ruangan. Beberapa diantaranya bahkan diberi nama karena untuk mengabadikan keindahannya seperti Selo Jengger Bumi, Selo Pakuan Bomo, Selo Bantaran Angin, Selo Citro Cipto Agung, Selo Adi Citro Buwono, dan lain sebagainya.",

        "\t\t\tGunung Penanggungan adalah gunung berapi kerucut dalam kondisi istirahat yang berada di Jawa Timur, Indonesia. Posisinya berada di perbatasan dua kabupaten, yaitu Kabupaten Mojokerto dan Kabupaten Pasuruan dan berjarak kurang lebih 55 km sebelah selatan kota Surabaya. Gunung Penanggungan merupakan gunung kecil yang berada pada satu kluster dengan Gunung Arjuno dan Gunung Welirang yang jauh lebih besar. " +
                "\n\n\t\t\tMeskipun kecil, gunung ini memiliki keunikan dari sisi kesejarahan, oleh karena di sekujur permukaannya, mulai dari kaki sampai mendekati puncak, dipenuhi banyak situs kepurbakalaan yang dibangun pada periode Hindu-Buddha dalam sejarah Indonesia. Gunung Penanggungan dipandang sebagai gunung keramat, suci, dan merupakaan jelmaan Mahameru, gunungnya para dewa. ",

        "\t\t\tWisata Selecta Malang merupakan salah satu dari beberapa objek wisata favorit di kota Batu, Malang. Bahkan keberadaannya sudah ada sebelum muncul wisata-wisata terkenal seperti sekarang seperti wisata Taman Kelinci, Jatim Park, museum Angkut dan masih banyak wisata terkenal lain nya. Memang keberadaan wisata sudah lama berdiri, tapi hal tersebut tidak menurunkan niat para wisatawan selalu berkunjung di wisata Selecta Batu Malang, sehingga begitu cocok bagi sobat kunjungi ketika musim liburan atau pun akhir pekan bersama keluarga. " +
                "\n\n\t\t\tDaya tarik dari taman Selecta yakni memiliki udara sejuk, pemandangan taman indah nan bersih, sehingga membuat para pengunjung betah berlama lama di lokasi wisata. Namun bagi anda yang ingin ke taman bunga Malang, lokasi taman rekreasi berada di Desa Tulungrejo, Kecamatan Bumi Aji, Kota Batu Malang, Jawa Timur. Bila dari pusat kota letaknya kurang lebih 25 KM sedangkan dari pusat pemerintahan kota Batu kurang lebih cuman 4 KM.",

        "\t\t\tGunung Semeru atau Gunung Meru adalah sebuah gunung berapi kerucut di Jawa Timur, Indonesia. Gunung Semeru merupakan gunung tertinggi di Pulau Jawa, dengan puncaknya Mahameru, 3.676 meter dari permukaan laut. Gunung Semeru juga merupakan gunung berapi tertinggi ketiga di Indonesia setelah Gunung Kerinci di Sumatra dan Gunung Rinjani di Nusa Tenggara Barat. Kawah di puncak Gunung Semeru dikenal dengan nama Jonggring Saloko. " +
                "\n\n\t\t\tGunung Semeru secara administratif termasuk dalam wilayah dua kabupaten, yakni Kabupaten Malang dan Kabupaten Lumajang, Provinsi Jawa Timur. Gunung ini termasuk dalam kawasan Taman Nasional Bromo Tengger Semeru. Semeru mempunyai kawasan hutan Dipterokarp Bukit, hutan Dipterokarp Atas, hutan Montane, dan Hutan Ericaceous atau hutan gunung. Posisi geografis Semeru terletak antara 8°06' LS dan 112°55' BT. Pada tahun 1913 dan 1946 Kawah Jonggring Saloka memiliki kubah dengan ketinggian 3.744,8 m hingga akhir November 1973.",

        "\t\t\tMonumen Simpang Lima Gumul atau biasa disingkat SLG adalah salah satu bangunan yang menjadi ikon Kabupaten Kediri yang bentuknya menyerupai Arc de Triomphe yang berada di Paris, Perancis. SLG mulai dibangun pada tahun 2003 dan diresmikan pada tahun 2008, yang digagas oleh Bupati Kediri saat itu, Sutrisno. Bangunan ini terletak di Desa Tugurejo, Kecamatan Ngasem, Kabupaten Kediri, Jawa Timur, tepatnya di pusat pertemuan lima jalan yang menuju ke Gampengrejo, Pagu, Pare, Pesantren dan Plosoklaten, Kediri." +
                "\n\n\t\t\tJika Arc de Triomphe dibangun untuk menghormati para pejuang yang bertempur dan mati bagi Perancis dalam Revolusi Perancis dan Perang Napoleon, namun belum ada kejelasan mengapa dan untuk menghormati siapa Monumen Simpang Lima Gumul Kediri ini dibangun. Dalam beberapa sumber menyebutkan, bahwa didirikannya monumen ini dikarenakan terinspirasi dari Jongko Jojoboyo, raja dari Kerajaan Kediri abad ke-12 yang ingin menyatukan lima wilayah di Kabupaten Kediri.",

        "\t\t\tTaman Safari ini berada di Desa Jatirejo Kecamatan Prigen, Provinsi Jawa Timur. Dengan ketinggian kira-kira 800 meter dpl, Taman Safari II Prigen merupakan lembaga konservasi suaka marga satwa yang menempati areal seluas 340 ha. " +
                "\n\n\t\t\tUntuk berkeliling di kawasan Taman Safari II Prigen, pengunjung diwajibkan menggunakan mobil atau bus yang disediakan, karena di Taman Safari II Prigen ini memiliki keunikan tersendiri dibandingkan dengan kebun binatang pada umumnya. Suasana yang sejuk karena berada di lereng Gunung Arjuno dengan pemandangan dan udara yang segar menjadikan para pengunjung betah untuk berlama-lama di kawasan Taman Safari II Prigen.",

        "\t\t\tTugu Pahlawan adalah sebuah monumen yang menjadi markah tanah Kota Surabaya. Tinggi monumen ini adalah 41,15 meter dan berbentuk lingga atau paku terbalik. Tubuh monumen berbentuk lengkungan-lengkungan sebanyak 10 lengkungan, dan terbagi atas 11 ruas. Tinggi, ruas dan canalures mengandung makna tanggal 10, bulan 11, tahun 1945. " +
                "\n\n\t\t\tSuatu tanggal bersejarah, bukan hanya bagi penduduk Kota Surabaya, tetapi juga bagi seluruh Rakyat Indonesia. Tugu Pahlawan dibangun untuk memperingati peristiwa Pertempuran 10 November 1945 di Surabaya, di mana arek-arek Suroboyo berjuang melawan pasukan Sekutu bersama Belanda yang hendak menjajah kembali Indonesia.",

        "\t\t\tObjek wisata air terjun torowan terletak di Desa Ketapang Daya, Kec. Ketapang, dengan jarak ± 43km dari pusat kota ke arah utara dengan akses jalan menuju lokasi di jalur transportasi umum Sampang - Ketapang – Sokobanah. Air Terjun Torowan yang merupakan satu-satunya air terjun di Kabupaten Sampang dan di Pulau Madura. " +
                "\n\n\t\t\tSumber mata Air Terjun Torowan berasal dari sungai sumber payung yang berada di kecamatan Ketapang Timur, dengan posisi tinggi mencapai lebih dari 20m dari permukaan air laut dan letak jatuh air terjun yang langsung bermuara ke laut lepas pantai utara merupakan pesona tersendiri dari air terjun ini."
        )

    private val destinationImage = intArrayOf(
        R.drawable.jatim_a,
        R.drawable.jatim_b,
        R.drawable.jatim_c,
        R.drawable.jatim_d,
        R.drawable.jatim_e,
        R.drawable.jatim_f,
        R.drawable.jatim_g,
        R.drawable.jatim_h,
        R.drawable.jatim_i,
        R.drawable.jatim_j,
        R.drawable.jatim_k,
        R.drawable.jatim_l
    )

    val listData: ArrayList<Destination>
        get() {
            val list = arrayListOf<Destination>()
            for (position in destinationName.indices) {
                val hero = Destination()
                hero.name = destinationName[position]
                hero.location = destinationCity[position]
                hero.photo = destinationImage[position]
                hero.description = destiDescription[position]
                list.add(hero)
            }
            return list
        }
}