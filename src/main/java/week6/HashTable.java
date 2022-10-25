package week6;

import java.util.HashSet;
import java.util.Set;

public class HashTable {
    private int size = 10000;
    private int[] table = new int[size];

    public HashTable() {
    }

    public HashTable(int size) {
        this.size = size;
        this.table = new int[size];
    }

    public int hash(String key){
        //key의 각 문자 ascii 코드값을 합침
        int asciiSum = 0;
        for (int i = 0; i < key.length(); i++) {
            asciiSum += key.charAt(i);
        }
        //자료의 갯수로 나눈 나머지
        return asciiSum % size;
    }

    //데이터 저장
    public void insert(String key, Integer value){
        this.table[hash(key)] = value;
    }

    //주어진 key에 해당하는 value 리턴
    public int search(String key){
        return this.table[hash(key)];
    }

    public static void main(String[] args) {
        String[] names = new String[]{"DongyeonKang",
                "SubinKang", "KwanwunKo", "HyunseokKo", "KyoungdukKoo", "YeonjiGu", "SoyeonKown", "OhsukKwon", "GunwooKim", "KiheonKim", "NayeongKim", "DohyeonKim", "MinkyoungKim", "MinjiKim", "SanghoKim", "SolbaeKim", "YejinKim", "EungjunKim", "JaegeunKim", "JeonghyeonKim", "JunhoKim", "JisuKim", "kimjinah", "HaneulKim", "HeejungKim", "KimoonPark", "EunbinPark", "JeongHoonPark", "JeminPark", "TaegeunPark", "JiwonBae", "SeunggeunBaek", "JihwanByeon", "HeungseopByeon", "JeongHeeSeo", "TaegeonSeo", "SeeYunSeok", "SuyeonSeong", "SeyoelSon", "MinjiSong", "JinwooSong", "hyunboSim", "SominAhn", "JiyoungAhn", "ChangbumAn", "SoonminEom",
                "HyeongsangOh", "SuinWoo", "JuwanWoo", "InkyuYoon", "GahyunLee", "DaonLee", "DohyunLee", "SanghunLee", "SujinLee", "AjinLee", "YeonJae", "HyeonjuLee", "HakjunYim", "SeoyunJang", "SeohyeonJang", "JinseonJang", "SujinJeon", "SeunghwanJeon", "DaehwanJung", "JaeHyunJeung", "HeejunJeong", "GukhyeonCho", "MunjuJo", "YejiJo", "ChanminJu", "MinjunChoi", "SujeongChoi", "SeunghoChoi", "AyeongChoi", "GeonjooHan", "JinhyuckHeo", "MinwooHwang", "SieunHwang",
                "JunhaHwang"};
        HashTable hashTable = new HashTable(200);
        for(int i = 0; i < names.length; i++){
            hashTable.insert(names[i],hashTable.hash(names[i]));
        }
        System.out.println(hashTable.search("HeejungKim"));


    }
}
