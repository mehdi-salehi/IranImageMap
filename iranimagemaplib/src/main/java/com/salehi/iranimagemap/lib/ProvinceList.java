package com.salehi.iranimagemap.lib;

public enum ProvinceList {
    Alborz(1, R.drawable.item_map_14),
    Ardabil(2, R.drawable.item_map_02),
    Azerbaijan_East(3, R.drawable.item_map_03),
    Azerbaijan_West(4, R.drawable.item_map_01),
    Bushehr(5, R.drawable.item_map_25),
    Chahar_Mahaal_Bakhtiari(6, R.drawable.item_map_23),
    Fars(7, R.drawable.item_map_26),
    Gilan(8, R.drawable.item_map_06),
    Golestan(9, R.drawable.item_map_20),
    Hamadan(10, R.drawable.item_map_08),
    Hormozgan(11, R.drawable.item_map_34),
    Ilam(12, R.drawable.item_map_11),
    Isfahan(13, R.drawable.item_map_17),
    Kerman(14, R.drawable.item_map_27),
    Kermanshah(15, R.drawable.item_map_07),
    Khorasan_North(16, R.drawable.item_map_21),
    Khorasan_Razavi(17, R.drawable.item_map_31),
    Khorasan_South(18, R.drawable.item_map_32),
    Khuzestan(19, R.drawable.item_map_22),
    Kohgiluyeh_Boyer_Ahmad(20, R.drawable.item_map_24),
    Kurdistan(21, R.drawable.item_map_04),
    Lorestan(22, R.drawable.item_map_12),
    Markazi(23, R.drawable.item_map_13),
    Mazandaran(24, R.drawable.item_map_10),
    Qazvin(25, R.drawable.item_map_09),
    Qom(26, R.drawable.item_map_16),
    Semnan(27, R.drawable.item_map_19),
    Sistan_Baluchestan(28, R.drawable.item_map_33),
    Tehran(29, R.drawable.item_map_15),
    Yazd(30, R.drawable.item_map_28),
    Zanjan(31, R.drawable.item_map_05),

    NONE(0, 0);

    public final int id;
    public final int name;

    ProvinceList(int id, int name) {
        this.id = id;
        this.name = name;
    }

    public static ProvinceList getImage(int id) {
        switch (id) {
            case 1:
                return Alborz;
            case 2:
                return Ardabil;
            case 3:
                return Azerbaijan_East;
            case 4:
                return Azerbaijan_West;
            case 5:
                return Bushehr;
            case 6:
                return Chahar_Mahaal_Bakhtiari;
            case 7:
                return Fars;
            case 8:
                return Gilan;
            case 9:
                return Golestan;
            case 10:
                return Hamadan;
            case 11:
                return Hormozgan;
            case 12:
                return Ilam;
            case 13:
                return Isfahan;
            case 14:
                return Kerman;
            case 15:
                return Kermanshah;
            case 16:
                return Khorasan_North;
            case 17:
                return Khorasan_Razavi;
            case 18:
                return Khorasan_South;
            case 19:
                return Khuzestan;
            case 20:
                return Kohgiluyeh_Boyer_Ahmad;
            case 21:
                return Kurdistan;
            case 22:
                return Lorestan;
            case 23:
                return Markazi;
            case 24:
                return Mazandaran;
            case 25:
                return Qazvin;
            case 26:
                return Qom;
            case 27:
                return Semnan;
            case 28:
                return Sistan_Baluchestan;
            case 29:
                return Tehran;
            case 30:
                return Yazd;
            case 31:
                return Zanjan;
        }
        return NONE;
    }
}
