package com.company;

public class Main {

    public static void main(String[] args) {

        //1
        System.out.println("-----1-----");
        System.out.println("Конструктор!");
        Vector test1 = new Vector(12,11,6);
        System.out.printf("Вид вектора: %s\n",test1.toString());

        //2
        System.out.println("-----2-----");
        System.out.println("Длина вектора!");
        Vector test2 = new Vector(13,15,8);
        System.out.printf("Входящий вектор: %s\n", test2.toString());
        System.out.printf("Длина вектора: %s\n", test2.length());

        //3
        System.out.println("-----3-----");
        System.out.println("Скалярное произведение вектроров!");
        double scalarProduct = test1.scalar(test2);
        System.out.printf("Произведение: %s\n",scalarProduct);

        //4
        System.out.println("-----4-----");
        System.out.println("Векторное произведение!");
        Vector vectorProduct = test1.cross(test2);
        System.out.printf("Произведение: %s\n",vectorProduct);

        //5
        System.out.println("-----5-----");
        System.out.println("Косинус угла!");
        double cos =  Vector.cosine(test1,test2);
        System.out.printf("Угол: %s\n",cos);

        //6
        System.out.println("-----6-----");
        System.out.println("Сумма векторов!");
        Vector amount = test1.add(test2);
        System.out.println("Разность векторов!");
        Vector difference = test1.sub(test2);
        System.out.printf("Сумма векторов: %s\nРазность векторов: %s\n",amount,difference);

        //7
        System.out.println("-----7-----");
        System.out.println("Рандомный массив векторов");
        Vector[] random = Vector.randomMasVector(5);

    }

}

