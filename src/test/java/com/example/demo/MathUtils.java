package com.example.demo;

import org.junit.Test;

import javax.xml.bind.JAXBException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;
import java.util.jar.JarException;

/**
 * Created by pasha on 14.12.17.
 */
public class MathUtils {



    @Test
    public void test11() {
        Map<Integer, String> map = new Hashtable<>();
        map.put(3, "C");
        map.put(1, "A");
        map.put(2, "B");
        Iterator<Map.Entry<Integer, String>> iterator= map.entrySet().iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next()+ " ");
        }
    }


    private List<Integer> fib(int n) {
        List<Integer> res = new ArrayList<>();
        if (n<1) {
            return res;
        }
        res.add(0);
        res.add(1);
        int curr = 1;
        while(curr <= n) {
            int idx = res.size() - 1;
            curr = res.get(idx-1)+res.get(idx);
            if (curr<n)
                res.add(curr);
        }
        return res;
    }

    private Integer fib2(int n) {
        if (n<=1) {
            return 0;
        }
        if (n<=3) {
            return 1;
        }
        int val1 = 0;
        int val2 = 1;
        int curridx = 2;
        while(curridx <= n) {

            int val_next = val1 + val2;
            val1 = val2;
            val2 = val_next;
            curridx++;
        }
        return val2;
    }

    @Test
    public void testFib() {
        Integer s = fib2(45);
        System.out.println(s);
    }


/////////////////////////////

    private List<String> getAnagrams(String in) {
        List<String> res= new ArrayList<>();
        for (int i=0; i<= in.length(); ++i) {
            char c = in.charAt(i);
            StringBuilder sb= new StringBuilder();



            res.add(sb.toString());

        }


        res.add("abc");
        res.add("acb");
        res.add("bac");
        res.add("bca");
        res.add("cab");
        res.add("cba");
        return res;
    }

    @Test
    public void testAnagram() {
        String in = "abc";
        List<String> res = getAnagrams(in);
        System.out.println(res);
    }


    public static String aaa = "11111";

    @Test
    public void  rrr(){
        MathUtils a=null;
        System.out.println(a.aaa);
    }

    public static void ttt() {
        System.out.println("ttt");
    }


    private boolean isPolydrome(String s) {
        for (int i = 0; i < s.length()/2; ++i) {
            char c1 = s.charAt(i);
            char c2 = s.charAt(s.length() - i -1);
            if (c1 != c2) {
                return false;
            }
        }
        return true;
    }
    private final List<String> testList = Collections.EMPTY_LIST;

    @Test
    public void test112() {
        boolean s = testList.contains("11");
    }


    private void s(String s) {

        try {
            s1(null);

        } catch (Exception e){

        }
    }

    private void s1(StringBuilder s) throws NullPointerException {

    }

    @Test
    public void testPol() throws Throwable {
        System.out.println("start main");

        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i<10000000; ++i){
                    Object o = new Integer(1122223);
                }
                System.out.println("inner end");
            }
        });
        t.start();
        t.join();
        System.out.println("main again");

    }

    class f1 {
        void mmm() throws IOException {

        }
    }

    class f2 extends f1 {
        void mmm() throws FileNotFoundException {

        }
    }

    @Test
    public void mem() {
        List<Integer> list = new ArrayList<Integer>() ;
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        list.forEach(

                i -> { list.add(i+100); } );

    }

    /**
     *  Permutation recursion procedure
     *  O(n^2) ?
     * @param s
     * @return
     */

    public Set<String> getPerms(String s) {
        Set<String> res = new HashSet<>();
        // if length = 1 then end recursion
        if (s == null || s.length() == 1) {
            res.add(s);
            return res;
        }
        // get 1 char
        char c1 = s.charAt(0);
        // get permutations from the rest
        Set<String> restPerms = getPerms(s.substring(1));
        for (String p : restPerms) {
            for (int i=0; i<p.length(); ++i) {
                String s2 = p.substring(0, i) + c1 + p.substring(i);
                res.add(s2);
            }
            String sLast = p + c1;
            res.add(sLast);
        }
        return res;
    }


    @Test
    public void testPerms() {
        String s = "ABC";
        Set<String> r = getPerms(s);
        System.out.println(r);
        System.out.println(r.size());
    }

}
