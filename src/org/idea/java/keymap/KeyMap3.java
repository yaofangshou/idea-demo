package org.idea.java.keymap;

import java.util.Objects;

/**
 * 21 剪切ctrl + x
 * 22 粘贴ctrl + v
 * 23 保存 ctrl + s
 * 24 全选ctrl + a
 * 25 选中数行，整体往后移动 tab
 * 26 选中数行，整体往前移动 shift + tab
 * 27 查看类的结构：类似于 eclipse 的outline ctrl+o
 * 28 重构 ： 修改变量名与方法名(rename) alt+shift+r
 * 29 大写转小写/ 小写转大写(toggle case) ctrl+shift+y
 * 30 生成构造 器/get/set/toString alt +shift + s
 */
public class KeyMap3 {

    public static void main(String[] args) {
        System.out.println("Hello KeyMap3");
        //修改变量名与方法名(rename) alt+shift+r:放在方法名称上使用快捷键，就可以改方法名称了
        method();
    }

    public static void method() {

    }
}

class Person {
    private Integer id;
    private String name;
    private Integer age;
//生成构造 器/get/set/toString alt +shift + s

    public Person(Integer id, String name, Integer age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(id, person.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
