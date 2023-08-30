package com.zcedu.interface_;

public class InterFace  {
    public static void main(String[] args) {
        Phone phone = new Phone();
        Camera camera = new Camera();
        Computer computer = new Computer();
        computer.work(phone);
        computer.work(camera);
    }
}