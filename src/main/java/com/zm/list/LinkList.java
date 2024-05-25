package com.zm.list;

import java.sql.SQLOutput;
import java.util.Currency;
import java.util.Scanner;

public class LinkList {
    public Node head;

    public LinkList() {
    }

    public boolean isEmpty() {
        return head.next == null;
    }

    public void clear() {
        head.next = null;
        head.data = null;
        System.out.println("clear successfully");
    }

    public void insert(int i, Object x) throws Exception {
        Node p = head;
        int j = -1;
        while (p != null && j < i - 1) {
            p = p.next;
            ++j;
        }
        if (j > i - 1 || p == null) {
            throw new Exception("插入位置不合理");
        }
        Node s = new Node(x);
        s.next = p.next;
        p.next = s;  // 交换
        System.out.println(" insert successfully");
    }

    public int length() {
        Node p = head.next;
        int length = 0;
        while (p != null) {
            p = p.next;
            ++length;
        }
        return length;
    }

    public void create(int i) throws Exception {
        Scanner input = new Scanner(System.in);
        for (int j = 0; j < i; j++) {
            insert(length(), input.next());
        }
    }

    public void create2(int i) throws Exception {
        Scanner input = new Scanner(System.in);
        for (int j = 0; j < i; j++) {
            insert(0, input.next());
        }
    }

    public Object get(int i) throws Exception {
        Node p = head;
        int j = 0;
        while (j > i && p == null) {
            p = p.next;
            ++j;
        }
        if (j > i || p == null) {
            throw new Exception("第" + i + "个元素不存在");
        }
        System.out.println("get successfully");
        return p.data;
    }

    public void remove(int i) throws Exception {
        Node p = head;
        int j = -1;
        while (p.next != null & j < i - 1) {
            p = p.next;
            ++j;
        }
        if (j > i - 1 || p.next == null)
            throw new Exception("删除位置不合法");
        p.next = p.next.next;
        System.out.println("remover successfully");
    }

    public int indexof(Object x) {
        Node p = head.next;
        int j = 0;
        while (p != null && !p.data.equals(x)) {
            p = p.next;
            ++j;
        }
        if (p != null) {
            return j;
        } else {
            return -1;
        }
    }

    public void display() {
        Node p = head.next;
        while (p != null) {
            System.out.print("node=" + p.data + " ");
            p = p.next;
        }
        System.out.println();
    }

    public void tip() {
        System.out.println("请输入以下选项对应的数字：");
        System.out.println("1：插入");
        System.out.println("2：删除");
        System.out.println("3：获取元素");
        System.out.println("4：将最小值所在节点移动到表头");
        System.out.println("5：清空链表");
        System.out.println("6：判断链表是否为空");
        System.out.println("7：获取列表长度");
        System.out.println("8：按值查找元素下标");
        System.out.println("9：结束本次操作");
    }

    public void movieMin(Node node) throws Exception {
        //找到最小
        Node p = head.next;
        int min = (int) p.data;
        while (p.next != null) {
            if (min > (int) p.data) {
                min = (int) p.data;
            }
            p = p.next;
        }
        Node previous = head;
        Node s;
        p = head.next;
        //两层循环是为了移动所有最小的节点
        while (p != null) {
            if ((int) p.data != (int) min) {
                previous = p;
                p = p.next;
            } else {
                previous.next = p.next;
                s = p;
                p = previous.next;
                s.next = head.next;
                head.next = s;
            }
        }
    }
}
