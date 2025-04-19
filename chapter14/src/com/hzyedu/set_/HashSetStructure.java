package com.hzyedu.set_;

@SuppressWarnings("all")
public class HashSetStructure {
    public static void main(String[] args) {

        //模拟一个HashSet的底层（HashMap的底层结构）

        //1.创建一个数组，数组类型是 Node[]
        //2.有些人直接把Node[]数组称为表
        Node[] table = new Node[16];

        //3.创建结点
        Node john = new Node("john", null);
        table[2] = john;
        Node jack = new Node("jack", null);
        john.next = jack; //将jack结点挂载到john
        Node rose = new Node("rose", null);
        jack.next = rose; //将rose结点挂载到jack
        System.out.println("table = " + table);

        Node lucy = new Node("lucy", null);
        table[3] = lucy; //把lucy放到table表的索引为3的位置

        System.out.println("table = " + table);

        for (Node node : table) {
            Node current = node;
            while (current != null) {
                System.out.println(current.item);
                current = current.next;
            }
        }

    }
}

class Node{ //结点，存储数据，可以指向下一个结点，从而形成链表
    Object item;//存放数据
    Node next;//指向下一个结点

    public Node(Object item, Node next) {
        this.item = item;
        this.next = next;
    }
}