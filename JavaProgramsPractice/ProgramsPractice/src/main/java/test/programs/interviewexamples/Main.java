package test.programs.interviewexamples;

public class Main {
    public static void main(String[] args) {
        Areas areaOfCircle = new Areas(10);
        double result = areaOfCircle.areaOfCircle();
        System.out.println(result);

        Areas areaOfRect1 = new Areas(7, 4);
        int rectangle = areaOfRect1.areaOfRectangle();
        System.out.println(rectangle);

    }
}
