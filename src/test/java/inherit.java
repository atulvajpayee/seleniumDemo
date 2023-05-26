public class inherit {
    public static void main(String[] args) {
        Volume v = new Volume();
        v.volumeUp();
        v.remote();
    }
}

class tvRemote {
    void remote ()
    {
        System.out.println("Remote is working");
    }
}
class Volume extends tvRemote
{
    void volumeUp ()
    {
        System.out.println("Your TV volume is full");
    }

    public void remote() {
    }
}

class channel extends tvRemote
{
    void channelChange ()
    {
        System.out.println("Your channel is changed");
    }
}