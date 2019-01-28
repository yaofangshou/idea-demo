package org.idea.java.keymap;

import java.text.DateFormat;
import java.util.Date;

/**
 * 31 查看文档说明(quick documentation) F2
 * 32 收起所有的方法(collapse all) alt + shift + c
 * 33 打开所有方法(expand all) alt+shift+x
 * 34 打开代码所在硬盘文件夹(show in explorer) ctrl+shift+x
 * 35 生成 try-catch 等(surround with) alt+shift+z
 * 36 局部变量抽取为成员变量(introduce field) alt+shift+f
 * 37 查找/ 替换( 当前) ctrl+f
 * 38 查找( 全局) ctrl+h
 * 39 查找文件 double Shift
 * 40 查看类的继承结构图(Show UML Diagram) ctrl + shift + u
 */
public class KeyMap4 {

    public static void main(String[] args) {
        System.out.println("Hello KeyMap3");

        try {
            DateFormat dateFormat = DateFormat.getInstance();
            final String format = dateFormat.format(new Date());
            System.out.println(format);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
        }
    }
}

