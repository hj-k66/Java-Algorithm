package week6;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashTable {
    class Node {
        private String key;
        private Integer value;

        public Node(String key, Integer value) {
            this.key = key;
            this.value = value;
        }

        public String getKey() {
            return key;
        }

        public Integer getValue() {
            return value;
        }
    }

    private int size = 10000;
    private List<Node>[] table = new ArrayList[size];

    public HashTable() {
    }

    public HashTable(int size) {
        this.size = size;
        this.table = new ArrayList[size];
    }

    public int hash(String key) {
        //key의 각 문자 ascii 코드값을 합침
        int asciiSum = 0;
        for (int i = 0; i < key.length(); i++) {
            asciiSum += key.charAt(i);
        }
        //자료의 갯수로 나눈 나머지
        return asciiSum % size;
    }

    //데이터 저장
    public void insert(String key, Integer value) {
        int hashIdx = hash(key);
        if (this.table[hashIdx] == null) {
            this.table[hashIdx] = new ArrayList<>();
        }
        this.table[hashIdx].add(new Node(key, value));
    }


    //주어진 key에 해당하는 value 리턴
    public Integer search(String key) {
        List<Node> nodes = this.table[hash(key)];
        for (Node node : nodes) {
            if (key.equals(node.getKey())) {
                return node.getValue();
            }
        }
        return null;
    }

    public static void main(String[] args) {
        String[] names = new String[]{"DongyeonKang",
                "SubinKang", "KwanwunKo", "HyunseokKo", "KyoungdukKoo", "YeonjiGu", "SoyeonKown", "OhsukKwon", "GunwooKim", "KiheonKim", "NayeongKim", "DohyeonKim", "MinkyoungKim", "MinjiKim", "SanghoKim", "SolbaeKim", "YejinKim", "EungjunKim", "JaegeunKim", "JeonghyeonKim", "JunhoKim", "JisuKim", "kimjinah", "HaneulKim", "HeejungKim", "KimoonPark", "EunbinPark", "JeongHoonPark", "JeminPark", "TaegeunPark", "JiwonBae", "SeunggeunBaek", "JihwanByeon", "HeungseopByeon", "JeongHeeSeo", "TaegeonSeo", "SeeYunSeok", "SuyeonSeong", "SeyoelSon", "MinjiSong", "JinwooSong", "hyunboSim", "SominAhn", "JiyoungAhn", "ChangbumAn", "SoonminEom",
                "HyeongsangOh", "SuinWoo", "JuwanWoo", "InkyuYoon", "GahyunLee", "DaonLee", "DohyunLee", "SanghunLee", "SujinLee", "AjinLee", "YeonJae", "HyeonjuLee", "HakjunYim", "SeoyunJang", "SeohyeonJang", "JinseonJang", "SujinJeon", "SeunghwanJeon", "DaehwanJung", "JaeHyunJeung", "HeejunJeong", "GukhyeonCho", "MunjuJo", "YejiJo", "ChanminJu", "MinjunChoi", "SujeongChoi", "SeunghoChoi", "AyeongChoi", "GeonjooHan", "JinhyuckHeo", "MinwooHwang", "SieunHwang",
                "JunhaHwang"};

        HashTable ht = new HashTable();
        for (int i = 0; i < names.length; i++) {
            ht.insert(names[i], ht.hash(names[i]));
        }
        ht.insert("Yoonseo", 1);
        ht.insert("Seoyoon", 2);

        int result = ht.search("Yoonseo");
        if (result == 1) {
            System.out.println("테스트 성공");
        } else {
            System.out.printf("테스트 실패 value:%d", result);
        }

        result = ht.search("Seoyoon");
        if (result == 2) {
            System.out.println("테스트 성공");
        } else {
            System.out.printf("테스트 실패 value:%d", result);
        }

    }


}
