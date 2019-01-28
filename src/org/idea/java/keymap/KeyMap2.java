package org.idea.java.keymap;

import java.util.ArrayList;

/**
 * 11 如何查看源码 (class) ctrl + 选中指定的结构 或 ctrl + shift + t
 * 12 万能解错/ 生成返回值变量 alt + enter
 * 13 退回到前一个编辑的页面 (back) alt + left
 * 14 进入到下一个编辑的页面( 针对于上条) (forward) alt + right
 * 15 查看继承关系(type hierarchy) F4
 * 16 格式化代码(reformat code) ctrl+shift+F
 * 17 提示方法参数类型(Parameter Info) ctrl+alt+/
 * 18 复制代码 ctrl + c
 * 19 撤销 ctrl + z
 * 20 反撤销 ctrl + y
 */
public class KeyMap2 {

    public static void main(String[] args) {
        System.out.println("Hello KeyMap2");
        //万能解错(Alt+Enter)：在(java.util.Date)还没有引入时，放在Date上使用快捷键可以提示出该引入路径
//        new Date();
        //生成返回值变量(Alt+Enter)：在(new Date();)最后一个括号与;之间，使用快捷键可以生成定义的变量(Date date)
//        Date date = new Date();
        //查看类的继承 F4
        ArrayList<String> strings = new ArrayList<>();
        //提示方法参数类型(Parameter Info) ctrl+alt+/:放在两个括号中间使用快捷键
//        strings.add();

    }
}
