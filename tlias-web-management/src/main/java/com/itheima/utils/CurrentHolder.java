package com.itheima.utils;

public class CurrentHolder {

    private static final ThreadLocal<Integer> CURRENT_LOCAL = new ThreadLocal<>();
    //CURRENT_LOCAL：定义了一个 ThreadLocal 类型的静态变量，用于存储每个线程的当前用户ID。
    public static void setCurrentId(Integer employeeId) {
        CURRENT_LOCAL.set(employeeId);
    }
    //setCurrentId(Integer employeeId)：设置当前线程的用户ID。
    public static Integer getCurrentId() {
        return CURRENT_LOCAL.get();
    }
    //getCurrentId()：获取当前线程的用户ID
    public static void remove() {
        CURRENT_LOCAL.remove();
    }
    //remove()：移除当前线程的用户ID。
}
