import java.lang.*;

//class for phone
class Phone
{
    public void call(){
        System.out.println("Phone call");
    }
    public void sms(){
        System.out.println("sms from phone");
    }
}

//Interface Camera
interface ICamera
{
    void click();
    void record();
}

//Interface Musicplayer
interface IMusicPlayer
{
    void play();
    void stop();
}

//class which will be used for implementing interfaces and inheriting phone class
class Smartphone extends Phone implements ICamera,IMusicPlayer
{
    public void videoCall(){
        System.out.println("Video calling from SmartPhone");
    }

    public void call()
    {
        System.out.println("Smartphone calling");
    }
    public void sms()
    {
        System.out.println("Smartphone sms");
    }
    public void click()
    {
        System.out.println("Smartphone click picture");

    }
    public void record()
    {
        System.out.println("Smartphone recording");

    }
    public void play()
    {
        System.out.println("Smartphone music playing");
    }
    public void stop()
    {
        System.out.println("Smartphone stop music");
    }
}
public class InterfaceParctice2 {
    public static void main(String[] args)
    {
        Smartphone obj=new Smartphone();

        obj.videoCall();;
        obj.record();
    }
}
