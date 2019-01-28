package org.idea.java.template;

import java.util.ArrayList;

/**
 * Live Templates 可以自定义，而 Postfix Completion 不可以
 * Live Templates下面的常用模版：iterations, other, output
 *
 *
 */
public class Template1 {

    //模版1：psvm
    public static void main(String[] args) {

    }

    //模版2：sout
    public static void soutTemplate() {
//        System.out.println();
        //模版2变形：
//        System.out.println("args = " + args);//soutv
//        System.out.println("args = [" + args + "]");//soutp
//        System.out.println("Template1.main");//soutm
        int num = 0;
        System.out.println("num = " + num);//soutv
        System.out.println(num);// num.sout
    }

    public static void method(String[] args) {
        System.out.println("Template1.method");//soutm
    }

    //模版3：fori
    public static void forTemplate() {
        Integer[] nums = new Integer[]{1, 2, 3, 4, 5, 6};
        //fori
//        for (int i = 0; i < ; i++) {
//
//        }
        //iter
        for (Integer num : nums) {
            
        }
        // itar
        for (int i = 0; i < nums.length; i++) {
            Integer num = nums[i];
            
        }


    }

    //模版4：list.for
    public static void listForTemplate(){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        //list.for
        for (Integer integer : list) {
            
        }
        //list.fori
        for (int i = 0; i < list.size(); i++) {

        }
        //list.forr
        for (int i = list.size() - 1; i >= 0; i--) {
            
        }
    }

    //模版5：ifn
    public static void ifTemplate(){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        //ifn
        if (list == null) {
            
        }
        //inn
        if (list != null) {
            
        }
        //list.null
        if (list == null) {

        }
        //list.notnull
        if (list != null) {

        }
    }

    //模版6：prsf
//    private static final
//    变形：psf
//    public static final
//    变形：psfi
//    public static final int
//    变形：psfs
//    public static final String

}
