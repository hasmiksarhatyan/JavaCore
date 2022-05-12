package chapters.chapter3;

public class Light {
    public static void main(String args[]) {
        int lightspeed = 186000; // մոտավոր
        long days = 1000;
        long seconds;
        seconds = days * 24 * 60 * 60;
        long distance = lightspeed * seconds;
        System.out.println(days + " օրում լույսը կանցնի մոտ  " + distance + " մղոն");
    }
}
